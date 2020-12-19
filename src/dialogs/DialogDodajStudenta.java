package dialogs;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import controller.ControllerStudenti;
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


public class DialogDodajStudenta extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DialogDodajStudenta() {
		super(GlavniProzor.getInstance(), "Dodaj studenta", true);
		this.setLayout(new GridBagLayout());
		setSize(500,500);
		
		final JButton potvrdi = new JButton("Potvrdi");
		potvrdi.setEnabled(false);
		potvrdi.setPreferredSize(new Dimension(100, 40));
		
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
		JLabel prOcena = new JLabel("Prosečna ocena: ");
		JLabel polozeniIspiti = new JLabel("Polozeni ispiti: ");
		JLabel nepolozeniIspiti = new JLabel("Nepolozeni ispiti: ");

		
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
		addComponent(this, prOcena, 0, 10, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 0.1, 1.0);
		addComponent(this, polozeniIspiti, 0, 11, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 0.1, 1.0);
		addComponent(this, nepolozeniIspiti, 0, 12, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 0.1, 1.0);

		final JTextField txtFieldIme = new JTextField();
		final JTextField txtFieldPrezime = new JTextField();
		final JFormattedTextField txtFieldDatumRodjenja = new JFormattedTextField(getMaskFormatter("##-##-####"));
		final JTextField txtFieldAdresaStanovanja = new JTextField();
		final JTextField txtFieldBrTelefona = new JTextField();
		final JTextField txtFieldEmail = new JTextField();
		final JTextField txtFieldBrIndeksa = new JTextField();
		final JTextField txtFieldGodinaUpisa = new JTextField();
		final JTextField txtFieldGodinaStudija = new JTextField();
		final JTextField txtFieldstatus = new JTextField();
		final JTextField txtFieldprOcena = new JTextField();
		final JTextField txtFieldpolozeniIspiti = new JTextField();
		final JTextField txtFieldnepolozeniIspiti = new JTextField();


		
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
						txtFieldBrIndeksa.getText().isEmpty() || txtFieldGodinaUpisa.getText().isEmpty() || txtFieldGodinaStudija.getText().isEmpty() || 
						txtFieldstatus.getText().isEmpty() || txtFieldprOcena.getText().isEmpty() ||txtFieldpolozeniIspiti.getText().isEmpty() || txtFieldnepolozeniIspiti.getText().isEmpty() )) 
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
		txtFieldGodinaStudija.addFocusListener(myFocusListener);
		txtFieldstatus.addFocusListener(myFocusListener);
		txtFieldprOcena.addFocusListener(myFocusListener);
		txtFieldpolozeniIspiti.addFocusListener(myFocusListener);
		txtFieldnepolozeniIspiti.addFocusListener(myFocusListener);

		
		
		
		addComponent(this, txtFieldIme, 1, 0, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldPrezime, 1, 1, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldDatumRodjenja, 1, 2, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldAdresaStanovanja, 1, 3, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldBrTelefona, 1, 4, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldEmail, 1, 5, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldBrIndeksa, 1, 6, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldGodinaUpisa, 1, 7, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldGodinaStudija, 1, 8, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldstatus, 1, 9, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldprOcena, 1, 10, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldpolozeniIspiti, 1, 11, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldnepolozeniIspiti, 1, 12, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);

		
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
