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
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.MaskFormatter;

import controller.ControllerPredmeti;
import controller.ControllerProfesori;
import view.GlavniProzor;

public class DialogDodajPredmet extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public DialogDodajPredmet() {
		super(GlavniProzor.getInstance(), "Dodaj predmet", true);
		this.setLayout(new GridBagLayout());
		setSize(500,500);
		 
		
		final JButton potvrdi = new JButton("Potvrdi");
		potvrdi.setEnabled(false);
		potvrdi.setPreferredSize(new Dimension(100, 40));
		potvrdi.setMnemonic('p');
		
		JLabel sifra = new JLabel("Sifra predmeta: ");
		JLabel naziv = new JLabel("Naziv predmeta: ");
		JLabel brojBodova = new JLabel("Broj ESPB bodova: ");
		JLabel godinaStudija = new JLabel("Godina studija: ");
		JLabel semestar = new JLabel("Semestar: ");
		
		
		//Insets(int top, int left, int bottom, int right)
		Insets insets = new Insets(5,0,0,0);
		
		addComponent(this, sifra, 0, 0, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 0.1, 1.0);
		addComponent(this, naziv, 0, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 0.1, 1.0);
		addComponent(this, brojBodova, 0, 2, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 0.1, 1.0);
		addComponent(this, godinaStudija, 0, 3, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 0.1, 1.0);
		addComponent(this, semestar, 0, 4, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 0.1, 1.0);
		
		final JTextField txtFieldSifra = new JTextField();
		final JTextField txtFieldNaziv = new JTextField();
		final JTextField txtFieldbrojBodova = new JTextField();
		final JTextField txtFieldgodinaStudija = new JTextField();
		final JTextField txtFieldSemestar = new JTextField();
		
		
		
		

			
		
		FocusListener myFocusListener = new FocusListener() {

			@Override
			public void focusGained(FocusEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			

			@Override
			public void focusLost(FocusEvent arg0) {
				// TODO Auto-generated method stub
				if(!(txtFieldSifra.getText().isEmpty() || txtFieldNaziv.getText().isEmpty() || 
						txtFieldbrojBodova.getText().isEmpty() || txtFieldgodinaStudija.getText().isEmpty() || txtFieldSemestar.getText().isEmpty() 
						)) 
				{
					
					potvrdi.setEnabled(true);
				}
				
			}
		};
		

		txtFieldSifra.addFocusListener(myFocusListener);
		txtFieldNaziv.addFocusListener(myFocusListener);
		txtFieldbrojBodova.addFocusListener(myFocusListener);
		txtFieldgodinaStudija.addFocusListener(myFocusListener);
		txtFieldSemestar.addFocusListener(myFocusListener);
		
		addComponent(this, txtFieldSifra, 1, 0, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldNaziv, 1, 1, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldbrojBodova, 1, 2, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldgodinaStudija, 1, 3, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		addComponent(this, txtFieldSemestar, 1, 4, 2, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, insets, 100.0, 1.0);
		
		
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

				ControllerPredmeti.getInstance().dodajPredmet( txtFieldSifra.getText(), txtFieldNaziv.getText(),  txtFieldbrojBodova.getText(), 
						Integer.parseInt(txtFieldgodinaStudija.getText()), txtFieldSemestar.getText());
				
				
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
