package view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

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
	
	private TabStudent() {
		this.setLayout(new BorderLayout());
		tableStudent = new JTableStudent();
		
		tableStudent.setPreferredSize(new Dimension(1000,800));
		JScrollPane scrollProf = new JScrollPane(tableStudent);
		add(scrollProf, BorderLayout.CENTER);
		
	}
	
	public int getSelectedRow() {
		return tableStudent.getSelectedRow();
	}
	
	public void azurirajPrikaz() {
		AbstractTableModelStudent model = (AbstractTableModelStudent) tableStudent.getModel();	
		model.fireTableDataChanged();
		validate();
	}
}
