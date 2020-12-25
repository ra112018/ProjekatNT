package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import controller.PretragaTable;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

import listeners.DodajProfesoraListener;
import listeners.IzmeniProfesoraListener;
import listeners.IzmeniStudentaListener;
import listeners.ObrisiPredmetListener;
import listeners.DodajStudentaListener;

public class ToolBar extends JToolBar {
		
	/**REFERENCA: Radjeno po uzoru na Vezbe,Termin3 */
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ToolBar(final Integer trenutniTab) {
		
		
		super(SwingConstants.HORIZONTAL);
		
		final JTableProfesor tabelaProf = new JTableProfesor();
		final JTableStudent tabelaStudenata = new JTableStudent();

		
		JButton btnDodaj = new JButton();
		btnDodaj.setToolTipText("Dodaj");
		btnDodaj.setIcon(new ImageIcon("images/add.jpg"));
		add(btnDodaj);
		btnDodaj.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		addSeparator();

		JButton btnIzmena = new JButton();
		btnIzmena.setToolTipText("Izmeni");
		btnIzmena.setIcon(new ImageIcon("images/edit.jpg"));
		add(btnIzmena);
		btnIzmena.setCursor(new Cursor(Cursor.HAND_CURSOR));

		addSeparator();
		
		JToggleButton btnBrisanje = new JToggleButton();
		btnBrisanje.setToolTipText("Obrisi");
		btnBrisanje.setIcon(new ImageIcon("images/delete.jpg"));
		add(btnBrisanje);
        btnBrisanje.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
  
        add(Box.createHorizontalGlue());
        
		final JTextField searchInput = new JTextField(15);
		searchInput.setMaximumSize(searchInput.getPreferredSize());
		add(searchInput);
		
		addSeparator();
		
		JButton pretrazi = new JButton();
		pretrazi.setToolTipText("Pretrazi");
		pretrazi.setIcon(new ImageIcon("images/search.jpg"));
		add(pretrazi);
		pretrazi.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
		setFloatable(false);
		setBackground(new Color(192, 192, 192));
		
		if(trenutniTab ==0) {
			btnDodaj.addActionListener(new DodajStudentaListener());
			btnIzmena.addActionListener(new IzmeniStudentaListener());
			
			
			searchInput.addKeyListener(new KeyAdapter() {
				
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode() == KeyEvent.VK_ENTER) {
						PretragaTable pretraga = new PretragaTable(tabelaStudenata, trenutniTab);
						pretraga.pretragaStudenata(searchInput.getText());
					}}});}
		else if(trenutniTab==1) {
			btnDodaj.addActionListener(new DodajProfesoraListener());
			btnIzmena.addActionListener(new IzmeniProfesoraListener());
			
			
			
			searchInput.addKeyListener(new KeyAdapter() {
				
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode() == KeyEvent.VK_ENTER) {
						PretragaTable pretraga = new PretragaTable(tabelaProf, trenutniTab);
						pretraga.pretragaProfesora(searchInput.getText());
					}
				}
			});
			
			pretrazi.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					PretragaTable pretraga = new PretragaTable(tabelaProf, trenutniTab);
					pretraga.pretragaProfesora(searchInput.getText());
				}
			});
			
			
			searchInput.getDocument().addDocumentListener(new DocumentListener() {

				@Override
				public void insertUpdate(DocumentEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void removeUpdate(DocumentEvent e) {
					// TODO Auto-generated method stub
					if(searchInput.getText().equals("")) {
						PretragaTable azurirajProfesori = new PretragaTable(tabelaProf, 1);
						azurirajProfesori.osProfesori("");
					}
				}

				@Override
				public void changedUpdate(DocumentEvent e) {
					// TODO Auto-generated method stub
					
				}
				
			});
		}else if (trenutniTab==0) {
			btnDodaj.addActionListener(new DodajStudentaListener());
			//btnIzmena.addActionListener(new IzmeniStudentaListener());
			
			
			
			searchInput.addKeyListener(new KeyAdapter() {
				
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode() == KeyEvent.VK_ENTER) {
						PretragaTable pretraga = new PretragaTable(tabelaStudenata, trenutniTab);
						//pretraga.pretragaStudenata(searchInput.getText());
					}
				}
			});
			
			pretrazi.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					PretragaTable pretraga = new PretragaTable(tabelaProf, trenutniTab);
					//pretraga.pretragaStudenata(searchInput.getText());
				}
			});
			
			
			searchInput.getDocument().addDocumentListener(new DocumentListener() {

				@Override
				public void insertUpdate(DocumentEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void removeUpdate(DocumentEvent e) {
					// TODO Auto-generated method stub
					if(searchInput.getText().equals("")) {
						PretragaTable azurirajStudenti = new PretragaTable(tabelaStudenata, 1);
						azurirajStudenti.osStudenti("");
					}
				}

				@Override
				public void changedUpdate(DocumentEvent e) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			
			
		}else if (trenutniTab==2) {
		//	btnBrisanje.addActionListener(new ObrisiPredmetListener());
		}
		

	}
}
