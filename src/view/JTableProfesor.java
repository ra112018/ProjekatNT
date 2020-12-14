package view;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableCellRenderer;

import model.BazaProfesora;

/**REFERENCA: Radjeno po uzoru na https://www.javatpoint.com/java-jtable 
 * https://docs.oracle.com/javase/tutorial/uiswing/components/table.html*/

public class JTableProfesor extends JTable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static JTableProfesor instance = null;
	public static JTableProfesor getInstance() {
		if(instance==null) {
			instance = new JTableProfesor();
		}
		
		return instance;
	}

	public JTableProfesor() {
		this.setRowSelectionAllowed(true);
		this.setColumnSelectionAllowed(true);
		this.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.setModel(new AbstractTableModelProfesor());
		
	}
	
	//kada kliknemo na neki red on ce biti obojen plavom bojom
	@Override
	public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
     
		Component comp = super.prepareRenderer(renderer, row, column);
		
		if(isRowSelected(row)) {
			comp.setBackground(Color.CYAN);
		}else {
			comp.setBackground(Color.WHITE);
		}
		
		return comp;
	}
	
	
	
}