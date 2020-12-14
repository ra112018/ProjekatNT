package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;





public class GlavniProzor extends JFrame{
		
	/**REFERENCA: Radjeno po uzoru na Vezbe, Termin3, JTableMVCSimple */
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static GlavniProzor instance = null;

	public static GlavniProzor getInstance() {
		if (instance == null) {
			instance = new GlavniProzor();
		}
		return instance;
	}
	
	private JTable tabelaProfesori;

	public GlavniProzor() {
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		setSize(screenWidth *3/4, screenHeight *3/4);
		setTitle("Studentska služba");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		getContentPane().setLayout(new BorderLayout(0,0));
		
		prikaziTabove();
		
		
		MyMenuBar menu = new MyMenuBar();
		this.setJMenuBar(menu);
		
		ToolBar toolbar = new ToolBar();
		add(toolbar, BorderLayout.NORTH);
		
		StatusBar statusBar = new StatusBar();
		getContentPane().add(statusBar,BorderLayout.SOUTH);
	}
	
	/**REFERENCA: Radjeno po uzoru na https://www.tutorialspoint.com/how-to-add-a-tab-in-jtabbedpane-with-java
	 * https://docs.oracle.com/javase/7/docs/api/javax/swing/JTabbedPane.html*/
	private void prikaziTabove() {
		JTabbedPane tab = new JTabbedPane(JTabbedPane.TOP);
		tab.setBackground(Color.WHITE);
		getContentPane().add(tab, BorderLayout.CENTER);
		
		tabelaProfesori = new JTableProfesor();
		tabelaProfesori.getTableHeader().setReorderingAllowed(false);
		tabelaProfesori.setAutoCreateRowSorter(true);
		JScrollPane scrollProfesori = new JScrollPane(tabelaProfesori);
		tab.addTab("Profesori", null, scrollProfesori, null);
		
	    
		
		
		
		
	}
}
