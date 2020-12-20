package view;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableCellRenderer;

/**REFERENCA: Radjeno po uzoru na https://www.javatpoint.com/java-jtable 
 * https://docs.oracle.com/javase/tutorial/uiswing/components/table.html*/

public class JTableOcena extends JTable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public JTableOcena() {
		this.setRowSelectionAllowed(true);
		this.setColumnSelectionAllowed(true);
		this.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.setModel(new AbstractTableModelOcene());
		
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
