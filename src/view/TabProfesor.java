package view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.TableRowSorter;

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
	private TableRowSorter<AbstractTableModelProfesor> sorter;
	
	private TabProfesor() {
		this.setLayout(new BorderLayout());
		tableProfesor = new JTableProfesor();
		
		tableProfesor.setPreferredSize(new Dimension(1000,800));
		JScrollPane scrollProf = new JScrollPane(tableProfesor);
		add(scrollProf, BorderLayout.CENTER);
		
		inicijalizujSortiranje();
		
	}
	
	public int getSelectedRow() {
		return tableProfesor.getSelectedRow();
	}
	
	public void azurirajPrikaz() {
		AbstractTableModelProfesor model = (AbstractTableModelProfesor) tableProfesor.getModel();	
		model.fireTableDataChanged();
		validate();
	}
	
	
	public void inicijalizujSortiranje() {
		this.sorter = new TableRowSorter<AbstractTableModelProfesor>((AbstractTableModelProfesor) tableProfesor.getModel());
		tableProfesor.setRowSorter(this.sorter);
	}

}
