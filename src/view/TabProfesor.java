package view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

public class TabProfesor extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static TabProfesor instance = null;
	
	public static TabProfesor getInstance() {
		if(instance == null) {
			instance = new TabProfesor();
		}
		return instance;
	}
	
	private JTableProfesor tableProfesor;
	
	private TabProfesor() {
		this.setLayout(new BorderLayout());
		tableProfesor = new JTableProfesor();
		
		tableProfesor.setPreferredSize(new Dimension(1000,800));
		JScrollPane scrollProf = new JScrollPane(tableProfesor);
		add(scrollProf, BorderLayout.CENTER);
		
	}
	
	public int getSelectedRow() {
		return tableProfesor.getSelectedRow();
	}
	
	public void azurirajPrikaz() {
		AbstractTableModelProfesor model = (AbstractTableModelProfesor) tableProfesor.getModel();	
		model.fireTableDataChanged();
		validate();
	}
}
