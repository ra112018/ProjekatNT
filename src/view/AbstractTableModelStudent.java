package view;

import javax.swing.table.AbstractTableModel;

import model.BazaStudenata;

/**REFERENCA: Radjeno po uzoru na https://docs.oracle.com/javase/7/docs/api/javax/swing/table/AbstractTableModel.html */

public class AbstractTableModelStudent extends AbstractTableModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public AbstractTableModelStudent() {}

	//vraca broj profesora koji se trenutno imamo
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return BazaStudenata.getInstance().getStudent().size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return BazaStudenata.getInstance().getColumnCount();
	}
	
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return BazaStudenata.getInstance().getColumnName(column);
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		if (columnIndex < BazaStudenata.getInstance().getColumnCount()) {
			return BazaStudenata.getInstance().getValueAt(rowIndex, columnIndex);
		}
		return null;
	}
	
	//postavlja odredjenu vrednost na mesto u tabeli
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		super.setValueAt(aValue, rowIndex, columnIndex);
		
	}
	
	//omogucuje da kazemo koje kolone moze da modifikuje korisnik
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return columnIndex >= BazaStudenata.getInstance().getColumnCount();
	}
    

	
}
