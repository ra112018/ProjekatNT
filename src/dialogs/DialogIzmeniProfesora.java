package dialogs;

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

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.MaskFormatter;

import controller.ControllerProfesori;
import model.BazaProfesora;
import model.Profesor;
import view.GlavniProzor;

public class DialogIzmeniProfesora extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DialogIzmeniProfesora(final int row) {
		
		super(GlavniProzor.getInstance(), "Izmeni profesora", true);
		this.setLayout(new GridBagLayout());
		Profesor profesor = BazaProfesora.getInstance().getRow(row);
		setSize(500,500);
		
		final JButton potvrdi = new JButton("Potvrdi");
		potvrdi.setEnabled(false);
		potvrdi.setPreferredSize(new Dimension(100, 40));
		potvrdi.setMnemonic('p');
		
		JLabel ime = new JLabel("Ime: ");
		JLabel prezime = new JLabel("Prezime: ");
		JLabel datumRodjenja = new JLabel("Datum rodjenja: ");
		JLabel adresaStanovanja = new JLabel("Adresa stanovanja: ");
		JLabel brTelefona = new JLabel("Broj telefona: ");
		JLabel eMail = new JLabel("Email: ");
		JLabel adresaKancelarije = new JLabel("Adresa kancelarije: ");
		JLabel licnaKarta = new JLabel("Licna karta: ");
		JLabel titula = new JLabel("Titula: ");
		JLabel zvanje = new JLabel("Zvanje: ");
		
		Insets insets = new Insets(10,0,0,0);
		
		addComponent(this, ime, 0, 0, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 0.1, 1.0);
		addComponent(this, prezime, 0, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 0.1, 1.0);
		addComponent(this, datumRodjenja, 0, 2, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 0.1, 1.0);
		addComponent(this, adresaStanovanja, 0, 3, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 0.1, 1.0);
		addComponent(this, brTelefona, 0, 4, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 0.1, 1.0);
		addComponent(this, eMail, 0, 5, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 0.1, 1.0);
		addComponent(this, adresaKancelarije, 0, 6, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 0.1, 1.0);
		addComponent(this, licnaKarta, 0, 7, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 0.1, 1.0);
		addComponent(this, titula, 0, 8, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 0.1, 1.0);
		addComponent(this, zvanje, 0, 9, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 0.1, 1.0);
		
		
		String[] comboT = {"PROF_DR", "DR"};
		String[] comboZ = {"REDOVNI_PROFESOR", "VANREDNI_PROFESOR", "DOCENT"};
		
		final JTextField txtFieldIme = new JTextField(profesor.getImeProf());
		final JTextField txtFieldPrezime = new JTextField(profesor.getPrezimeProf());
		final JFormattedTextField txtFieldDatumRodjenja = new JFormattedTextField(getMaskFormatterDate("##-##-####"));
		final JTextField txtFieldAdresaStanovanja = new JTextField(profesor.getAdresaStanovanjaProf());
		final JTextField txtFieldBrTelefona = new JTextField(profesor.getKontaktTelefonProf());
		final JTextField txtFieldEmail = new JTextField(profesor.geteMailAdresaProf());
		final JTextField txtFieldAdresaKancelarije = new JTextField(profesor.getAdresaKancelarijeProf());
		final JTextField txtFieldLicnaKarta = new JTextField(profesor.getBrojLicneKarteProf().toString());
		final JComboBox comboTitula = new JComboBox(comboT);
		final JComboBox comboZvanje = new JComboBox(comboZ);
		
		comboTitula.setBackground(Color.WHITE);
		comboZvanje.setBackground(Color.WHITE);
		
		txtFieldDatumRodjenja.setValue(profesor.getDatumRodjenjaProf());
		
		KeyListener myKeyListener = new KeyListener() {

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
					
					JOptionPane.showMessageDialog(null, "Mo�ete uneti maksimalno 9 karaktera!");
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
						txtFieldAdresaKancelarije.getText().isEmpty() || txtFieldLicnaKarta.getText().isEmpty() || ((String)comboTitula.getSelectedItem()).isEmpty() ||
						((String)comboZvanje.getSelectedItem()).isEmpty())) 
				{
					
					potvrdi.setEnabled(true);
				}
				
			}
		};
		
		
		txtFieldIme.addFocusListener(myFocusListener);
		txtFieldPrezime.addFocusListener(myFocusListener);
		txtFieldAdresaStanovanja.addFocusListener(myFocusListener);
		txtFieldBrTelefona.addFocusListener(myFocusListener);
		txtFieldEmail.addFocusListener(myFocusListener);
		txtFieldAdresaKancelarije.addFocusListener(myFocusListener);
		txtFieldLicnaKarta.addFocusListener(myFocusListener);
		comboTitula.addFocusListener(myFocusListener);
		comboZvanje.addFocusListener(myFocusListener);
		
		
		
		txtFieldLicnaKarta.addKeyListener(myKeyListener);
		
		
		
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
		
		//txtFieldEmail.getDocument().addDocumentListener(myDocumentListener);
		
		
		
		addComponent(this, txtFieldIme, 1, 0, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldPrezime, 1, 1, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldDatumRodjenja, 1, 2, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldAdresaStanovanja, 1, 3, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldBrTelefona, 1, 4, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldEmail, 1, 5, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldAdresaKancelarije, 1, 6, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldLicnaKarta, 1, 7, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, comboTitula, 1, 8, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, comboZvanje, 1, 9, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		
		
		
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
				
				
				int brojLicneKarte = Integer.parseInt(txtFieldLicnaKarta.getText());
				
					
					ControllerProfesori.getInstance().izmeniProfesora(row, txtFieldIme.getText(), txtFieldPrezime.getText(), DatumRodjenja, txtFieldAdresaStanovanja.getText(), 
							txtFieldBrTelefona.getText(), txtFieldEmail.getText(), txtFieldAdresaKancelarije.getText(), brojLicneKarte, (comboTitula.getSelectedItem()).toString(), (comboZvanje.getSelectedItem()).toString());
					
					//TabProfesor.getInstance().azurirajPrikaz();
					
					dispose();
				
				

			}
			
		});
		
		
		panel.add(odustani);
		panel.add(potvrdi);
		
		addComponent(this, panel, 2, 10, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 0.0, 1.0);
		setLocationRelativeTo(GlavniProzor.getInstance());
		
		
	}
	
	private void addComponent(Container container, Component component, int gridx, int gridy, int gridwidth, int gridheight, int anchor, int fill, Insets insets, Double weightx, Double weighty) {
		GridBagConstraints gbc = new GridBagConstraints(gridx, gridy, gridwidth, gridheight, weightx, weighty,
	    anchor, fill, insets, 0, 0);
	    container.add(component, gbc);
	}
	
	private MaskFormatter getMaskFormatterDate(String format) {
		MaskFormatter mask = null;
		try {
			mask = new MaskFormatter(format);
			mask.setPlaceholderCharacter('0');
		}catch (ParseException ex) {
			ex.printStackTrace();
		}
		return mask;
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
	

	
}
