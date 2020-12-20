package view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class TabOcene extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static TabOcene instance = null;
	
	public static TabOcene getInstance() {
		if(instance == null) {
			instance = new TabOcene();
		}
		return instance;
	}
	
	
	private JTableOcena tableOcena;
	
	private TabOcene() {
		this.setLayout(new BorderLayout());
		tableOcena = new JTableOcena();
		
		tableOcena.setPreferredSize(new Dimension(1000,800));
		JScrollPane scrollProf = new JScrollPane(tableOcena);
		add(scrollProf, BorderLayout.CENTER);
		
	}
	
	public int getSelectedRow() {
		return tableOcena.getSelectedRow();
	}
	
	
	public void azurirajPrikaz() {
		AbstractTableModelOcene model = (AbstractTableModelOcene) tableOcena.getModel();	
		model.fireTableDataChanged();
		validate();
	}

	
}
