package dialogs;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JComboBox;

import controller.ControllerStudenti;
import view.GlavniProzor;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;


public class DialogDodajStudenta extends JDialog {

	private static final long serialVersionUID = 1L;
	
	public DialogDodajStudenta() {
		super(GlavniProzor.getInstance(), "Dodaj studenta", true);
		this.setLayout(new GridBagLayout());
		setSize(500,500);
		
		final JButton potvrdi = new JButton("Potvrdi");
		potvrdi.setEnabled(false);
		potvrdi.setPreferredSize(new Dimension(120, 40));
		potvrdi.setMnemonic('p'); 

		JLabel ime = new JLabel("Ime: ");
		JLabel prezime = new JLabel("Prezime: ");
		JLabel datumRodjenja = new JLabel("Datum rodjenja: ");
		JLabel adresaStanovanja = new JLabel("Adresa stanovanja: ");
		JLabel brTelefona = new JLabel("Kontakt telefon: ");
		JLabel eMail = new JLabel("Email: ");
		JLabel brIndeksa = new JLabel("Broj indeksa: ");
		JLabel godinaUpisa = new JLabel("Godina upisa: ");
		JLabel godinaStudija = new JLabel("Godina studija: ");
		JLabel status = new JLabel("Status: ");

		//Insets(int top, int left, int bottom, int right)
		Insets insets = new Insets(10,0,0,0);
		
		addComponent(this, ime, 0, 0, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 0.1, 1.0);
		addComponent(this, prezime, 0, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 0.1, 1.0);
		addComponent(this, datumRodjenja, 0, 2, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 0.1, 1.0);
		addComponent(this, adresaStanovanja, 0, 3, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 0.1, 1.0);
		addComponent(this, brTelefona, 0, 4, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 0.1, 1.0);
		addComponent(this, eMail, 0, 5, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 0.1, 1.0);
		addComponent(this, brIndeksa, 0, 6, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 0.1, 1.0);
		addComponent(this, godinaUpisa, 0, 7, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 0.1, 1.0);
		addComponent(this, godinaStudija, 0, 8, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 0.1, 1.0);
		addComponent(this, status, 0, 9, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 0.1, 1.0);


		String[] combo = { "B", "S"};
		String[] godina= {"prva","druga","treća","četvrta"};
		
		final JTextField txtFieldIme = new JTextField();
		final JTextField txtFieldPrezime = new JTextField();
		final JFormattedTextField txtFieldDatumRodjenja = new JFormattedTextField(getMaskFormatter("##-##-####"));
		final JTextField txtFieldAdresaStanovanja = new JTextField();
		final JTextField txtFieldBrTelefona = new JTextField();
		final JTextField txtFieldEmail = new JTextField();
		final JTextField txtFieldBrIndeksa = new JTextField();
		final JTextField txtFieldGodinaUpisa = new JTextField();
		final JComboBox comboStatus = new JComboBox(combo);
		final JComboBox GodinaStudija=new JComboBox(godina);
		

		comboStatus.setBackground(Color.WHITE);
		GodinaStudija.setBackground(Color.WHITE);
		KeyListener myKeyListenerBrIndeksa = new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				if (arg0.isActionKey() || arg0.getKeyCode() == KeyEvent.VK_ENTER
						|| arg0.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
					return;
				}
				
				JTextField txt = (JTextField) arg0.getComponent();
				if (txt.getText().length() == 9) {
					
					JOptionPane.showMessageDialog(null, "Možete uneti maksimalno 9 karaktera!");
					txt.setText(txt.getText().substring(0, 9));
				}
				
				
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				if (arg0.isActionKey() || arg0.getKeyCode() == KeyEvent.VK_ENTER
						|| arg0.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
					return;
				}
				char c = arg0.getKeyChar();
				if (c != '0' && c != '1' && c != '2' && c != '3' && c != '4' && c != '5' && c != '6' && c != '7' && c != '8'
						&& c != '9') {
					JOptionPane.showMessageDialog(null, "Dozvoljen je unos samo brojeva!");
					JTextField txt = (JTextField) arg0.getComponent();
					txt.setText(txt.getText().substring(0, txt.getText().length() - 1));

				}
				
			}
			
		};
		FocusListener myFocusListener = new FocusListener() {

			@Override
			public void focusGained(FocusEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void focusLost(FocusEvent arg0) {
				// TODO Auto-generated method stub
				if(!(txtFieldIme.getText().isEmpty() || txtFieldPrezime.getText().isEmpty() || 
						txtFieldAdresaStanovanja.getText().isEmpty() || txtFieldBrTelefona.getText().isEmpty() || txtFieldEmail.getText().isEmpty() || 
						txtFieldBrIndeksa.getText().isEmpty() || txtFieldGodinaUpisa.getText().isEmpty() || ((String)GodinaStudija.getSelectedItem()).isEmpty() ||
						((String)comboStatus.getSelectedItem()).isEmpty())) 
				{
					
					potvrdi.setEnabled(true);
				}
					
			}
		};
		
		txtFieldIme.addFocusListener(myFocusListener);
		txtFieldPrezime.addFocusListener(myFocusListener);
		txtFieldDatumRodjenja.addFocusListener(myFocusListener);
		txtFieldAdresaStanovanja.addFocusListener(myFocusListener);
		txtFieldBrTelefona.addFocusListener(myFocusListener);
		txtFieldEmail.addFocusListener(myFocusListener);
		txtFieldBrIndeksa.addFocusListener(myFocusListener);
		txtFieldGodinaUpisa.addFocusListener(myFocusListener);
		GodinaStudija.addFocusListener(myFocusListener);
		comboStatus.addFocusListener(myFocusListener);
		

		DocumentListener myDocumentListener = new DocumentListener() {

			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				boolean valid = isValid(txtFieldEmail.getText());
				if(!valid) {
					JOptionPane.showMessageDialog(null, "Niste dobro uneli email!");
				}
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}
		};
		addComponent(this, txtFieldIme, 1, 0, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldPrezime, 1, 1, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldDatumRodjenja, 1, 2, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldAdresaStanovanja, 1, 3, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldBrTelefona, 1, 4, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldEmail, 1, 5, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldBrIndeksa, 1, 6, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldGodinaUpisa, 1, 7, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, GodinaStudija, 1, 8, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, comboStatus, 1, 9, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);

		JPanel panel = new JPanel();
		
		JButton odustani = new JButton("Odustani");
		odustani.setPreferredSize(new Dimension(100, 40));
		
		odustani.setMnemonic('o'); 

		odustani.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
				
			}
			
		});
		
	potvrdi.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
			
			Date DatumRodjenja = new Date();
			try {
				DatumRodjenja = formatter.parse(txtFieldDatumRodjenja.getText());
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			ControllerStudenti.getInstance().dodajStudenta(txtFieldBrIndeksa.getText(),txtFieldIme.getText(), txtFieldPrezime.getText(), DatumRodjenja, txtFieldAdresaStanovanja.getText(), 
					txtFieldBrTelefona.getText(), txtFieldEmail.getText(), (GodinaStudija.getSelectedItem()).toString(), 
					(comboStatus.getSelectedItem()).toString(),txtFieldGodinaUpisa.getText());
			
			dispose();
		}
		
	});
	
	panel.add(odustani);
	panel.add(potvrdi);
	
	addComponent(this, panel, 1, 13, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 0.0, 1.0);
	setLocationRelativeTo(GlavniProzor.getInstance());
	
}
	private MaskFormatter getMaskFormatter(String format) {
		MaskFormatter mask = null;
		try {
			mask = new MaskFormatter(format);
			mask.setPlaceholderCharacter('0');
		}catch (ParseException ex) {
			ex.printStackTrace();
		}
		return mask;
	}
	
	private void addComponent(Container container, Component component, int x, int y, int width, int height, 
			int anchor, int fill, Insets insets, Double weightx, Double weighty) {
		GridBagConstraints g = new GridBagConstraints(x, y, width, height, weightx, weighty, anchor, fill, insets, 0, 0);
		container.add(component, g);	
	}


	public static boolean isValid(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 
	


/**REFERENCA: Radjeno po uzoru na Vezbe Dogadjaji, https://docs.oracle.com/javase/7/docs/api/java/awt/Dialog.html
 *https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html 
 *https://www.geeksforgeeks.org/check-email-address-valid-not-java/
 *https://docs.oracle.com/javase/tutorial/uiswing/components/combobox.html
 **/

	
}

