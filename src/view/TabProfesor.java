package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.RowFilter;
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
	

	

	/**REFERENCA: https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html */
	
	/*
	public void pretrazi(String pronadji) {
		
		String[] delovi = pronadji.split("");
		Map<String,String> map = new HashMap<String, String>();
		
		map.put("ime", "");
		map.put("prezime", "");
		map.put("titula", "");
		map.put("zvanje", "");
		
		for(int i = 0; i < delovi.length; i++) {
			String[] razdvojeni = delovi[i].split("");
			if(razdvojeni.length > 1) {
				map.put(razdvojeni[0].toLowerCase(), razdvojeni[1]);
			}
		}
		
		List<RowFilter<Object,Object>> rowFilter = new ArrayList<RowFilter<Object,Object>>();
		
		rowFilter.add(RowFilter.regexFilter(".*" + map.get("ime") + ".*", 0));
		rowFilter.add(RowFilter.regexFilter(".*" + map.get("prezime") + ".*", 1));
		rowFilter.add(RowFilter.regexFilter(".*" + map.get("titula") + ".*", 2));
		rowFilter.add(RowFilter.regexFilter(".*" + map.get("zvanje") + ".*", 3));
		
		this.sorter.setRowFilter(RowFilter.andFilter(rowFilter));
	}
	
	*/
	
	public void inicijalizujSortiranje() {
		this.sorter = new TableRowSorter<AbstractTableModelProfesor>((AbstractTableModelProfesor) tableProfesor.getModel());
		tableProfesor.setRowSorter(this.sorter);
	}

}
