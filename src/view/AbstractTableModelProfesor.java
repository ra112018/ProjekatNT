package view;

import javax.swing.table.AbstractTableModel;

import model.BazaProfesora;

/**REFERENCA: Radjeno po uzoru na https://docs.oracle.com/javase/7/docs/api/javax/swing/table/AbstractTableModel.html */

public class AbstractTableModelProfesor extends AbstractTableModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public AbstractTableModelProfesor() {}

	//vraca broj profesora koji se trenutno imamo
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return BazaProfesora.getInstance().getProfesor().size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return BazaProfesora.getInstance().getColumnCount();
	}
	
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return BazaProfesora.getInstance().getColumnName(column);
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		if (columnIndex < BazaProfesora.getInstance().getColumnCount()) {
			return BazaProfesora.getInstance().getValueAt(rowIndex, columnIndex);
		}
		return null;
	}
	
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		super.setValueAt(aValue, rowIndex, columnIndex);
		if (columnIndex != BazaProfesora.getInstance().getColumnCount()) {
			return;
		}
		
	}
	
	//omogucuje da kazemo koje kolone moze da modifikuje korisnik
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return columnIndex >= BazaProfesora.getInstance().getColumnCount();
	}
    

	
}
