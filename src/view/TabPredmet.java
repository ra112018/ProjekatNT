package view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.TableRowSorter;

public class TabPredmet extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static TabPredmet instance = null;
	
	public static TabPredmet getInstance() {
		if(instance == null) {
			instance = new TabPredmet();
		}
		return instance;
	}
	
	
	private JTablePredmet tablePredmet;
	private TableRowSorter<AbstractTableModelPredmeti> sorter;
	
	private TabPredmet() {
		this.setLayout(new BorderLayout());
		tablePredmet = new JTablePredmet();
		
		tablePredmet.setPreferredSize(new Dimension(1000,800));
		JScrollPane scrollProf = new JScrollPane(tablePredmet);
		add(scrollProf, BorderLayout.CENTER);
		
		inicijalizujSortiranje();
		
	}
	
	public int getSelectedRow() {
		return tablePredmet.getSelectedRow();
	}
	
	
	public void azurirajPrikaz() {
		AbstractTableModelPredmeti model = (AbstractTableModelPredmeti) tablePredmet.getModel();	
		model.fireTableDataChanged();
		validate();
	}

	public void inicijalizujSortiranje() {
		this.sorter = new TableRowSorter<AbstractTableModelPredmeti>((AbstractTableModelPredmeti) tablePredmet.getModel());
		tablePredmet.setRowSorter(this.sorter);
	}
}
