package view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.TableRowSorter;

public class TabStudent extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static TabStudent instance = null;
	
	public static TabStudent getInstance() {
		if(instance == null) {
			instance = new TabStudent();
		}
		return instance;
	}
	
	private JTableStudent tableStudent;
	private TableRowSorter<AbstractTableModelStudent> sorter;
	
	private TabStudent() {
		this.setLayout(new BorderLayout());
		tableStudent = new JTableStudent();
		
		tableStudent.setPreferredSize(new Dimension(1000,800));
		JScrollPane scrollStud = new JScrollPane(tableStudent);
		add(scrollStud, BorderLayout.CENTER);
		
		inicijalizujSortiranje();
		
	}
	
	public int getSelectedRow() {
		return tableStudent.getSelectedRow();
	}
	
	public void azurirajPrikaz() {
		AbstractTableModelStudent model = (AbstractTableModelStudent) tableStudent.getModel();	
		model.fireTableDataChanged();
		validate();
	}
	
	
	public void inicijalizujSortiranje() {
		this.sorter = new TableRowSorter<AbstractTableModelStudent>((AbstractTableModelStudent) tableStudent.getModel());
		tableStudent.setRowSorter(this.sorter);
	}

}
