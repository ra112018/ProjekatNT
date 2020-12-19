package dialogs;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import controller.ControllerProfesori;
import view.GlavniProzor;
import view.TabProfesor;

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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



/**REFERENCA: Radjeno po uzoru na Vezbe Dogadjaji, https://docs.oracle.com/javase/7/docs/api/java/awt/Dialog.html
 *https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html */

public class DialogDodajProfesora extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DialogDodajProfesora() {
		super(GlavniProzor.getInstance(), "Dodaj profesora", true);
		this.setLayout(new GridBagLayout());
		setSize(500,500);
		
		final JButton potvrdi = new JButton("Potvrdi");
		potvrdi.setEnabled(false);
		potvrdi.setPreferredSize(new Dimension(100, 40));
		
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
		
		//Insets(int top, int left, int bottom, int right)
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
		
		final JTextField txtFieldIme = new JTextField();
		final JTextField txtFieldPrezime = new JTextField();
		final JFormattedTextField txtFieldDatumRodjenja = new JFormattedTextField(getMaskFormatter("##-##-####"));
		final JTextField txtFieldAdresaStanovanja = new JTextField();
		final JTextField txtFieldBrTelefona = new JTextField();
		final JTextField txtFieldEmail = new JTextField();
		final JTextField txtFieldAdresaKancelarije = new JTextField();
		final JTextField txtFieldLicnaKarta = new JTextField();
		final JTextField txtFieldTitula = new JTextField();
		final JTextField txtFieldZvanje = new JTextField();
		

		
		FocusListener myFocusListener = new FocusListener() {

			@Override
			public void focusGained(FocusEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			

			@Override
			public void focusLost(FocusEvent arg0) {
				// TODO Auto-generated method stub
				if(!(txtFieldIme.getText().isEmpty() || txtFieldPrezime.getText().isEmpty() || txtFieldDatumRodjenja.getText().isEmpty() || 
						txtFieldAdresaStanovanja.getText().isEmpty() || txtFieldBrTelefona.getText().isEmpty() || txtFieldEmail.getText().isEmpty() || 
						txtFieldAdresaKancelarije.getText().isEmpty() || txtFieldLicnaKarta.getText().isEmpty() || txtFieldTitula.getText().isEmpty() || 
						txtFieldZvanje.getText().isEmpty())) 
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
		txtFieldAdresaKancelarije.addFocusListener(myFocusListener);
		txtFieldLicnaKarta.addFocusListener(myFocusListener);
		txtFieldTitula.addFocusListener(myFocusListener);
		txtFieldZvanje.addFocusListener(myFocusListener);
		
		
		
		addComponent(this, txtFieldIme, 1, 0, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldPrezime, 1, 1, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldDatumRodjenja, 1, 2, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldAdresaStanovanja, 1, 3, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldBrTelefona, 1, 4, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldEmail, 1, 5, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldAdresaKancelarije, 1, 6, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldLicnaKarta, 1, 7, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldTitula, 1, 8, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldZvanje, 1, 9, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		
		
		JPanel panel = new JPanel();
		
		JButton odustani = new JButton("Odustani");
		odustani.setPreferredSize(new Dimension(100, 40));
		
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
				
				ControllerProfesori.getInstance().dodajProfesora(txtFieldIme.getText(), txtFieldPrezime.getText(), txtFieldDatumRodjenja.getText(), txtFieldAdresaStanovanja.getText(), 
						txtFieldBrTelefona.getText(), txtFieldEmail.getText(), txtFieldAdresaKancelarije.getText(), txtFieldLicnaKarta.getText(), txtFieldTitula.getText(), txtFieldZvanje.getText());
				
				TabProfesor.getInstance().azurirajPrikaz();
				
				dispose();
			}
			
		});
		
		
		
		panel.add(odustani);
		panel.add(potvrdi);
		
		addComponent(this, panel, 2, 11, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 0.0, 1.0);
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
	
	
}