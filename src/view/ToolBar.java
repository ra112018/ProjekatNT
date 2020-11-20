package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

public class ToolBar extends JToolBar {
		
	public ToolBar() {
		
		super(SwingConstants.HORIZONTAL);
		
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
        
  
        addSeparator(new Dimension(690,10));
        
		JTextField searchInput = new JTextField(15);
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
		

	}
}