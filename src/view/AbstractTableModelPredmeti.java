package view;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

import model.BazaPredmeta;

public class AbstractTableModelPredmeti extends AbstractTableModel implements TableModel{
	
	/**REFERENCA: Radjeno po uzoru na https://docs.oracle.com/javase/7/docs/api/javax/swing/table/AbstractTableModel.html */

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public AbstractTableModelPredmeti() {}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return BazaPredmeta.getInstance().getPredmet().size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return BazaPredmeta.getInstance().getColumnCount();
	}
	
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return BazaPredmeta.getInstance().getColumnName(column);
	}
	
	//omogucuje da kazemo koje kolone moze da modifikuje korisnik
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return columnIndex >= BazaPredmeta.getInstance().getColumnCount();
	}
    

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		if (columnIndex < BazaPredmeta.getInstance().getColumnCount()) {
			return BazaPredmeta.getInstance().getValueAt(rowIndex, columnIndex);
		}
		return null;
	}
	
	//postavlja odredjenu vrednost na mesto u tabeli
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		super.setValueAt(aValue, rowIndex, columnIndex);
		if (columnIndex != BazaPredmeta.getInstance().getColumnCount()) {
			return;
		}
		
	}

	
	
}
