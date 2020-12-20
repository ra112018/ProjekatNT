package view;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

import model.BazaOcena;

public class AbstractTableModelOcene extends AbstractTableModel implements TableModel{ 

	private static final long serialVersionUID = 1L;
	
	public AbstractTableModelOcene() {}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return BazaOcena.getInstance().getOcena().size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return BazaOcena.getInstance().getColumnCount();
	}
	
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return BazaOcena.getInstance().getColumnName(column);
	}
	
	//omogucuje da kazemo koje kolone moze da modifikuje korisnik
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return columnIndex >= BazaOcena.getInstance().getColumnCount();
	}
    

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		if (columnIndex < BazaOcena.getInstance().getColumnCount()) {
			return BazaOcena.getInstance().getValueAt(rowIndex, columnIndex);
		}
		return null;
	}
	
	//postavlja odredjenu vrednost na mesto u tabeli
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		super.setValueAt(aValue, rowIndex, columnIndex);
		if (columnIndex != BazaOcena.getInstance().getColumnCount()) {
			return;
		}
		
	}

}
