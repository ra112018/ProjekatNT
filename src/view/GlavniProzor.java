package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;




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
	
	private ToolBar toolbar;
	
	private int trenutniTab=0;

	private TabbedPane tabbedPane;
	

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
		
		ToolbarInicijalizacija();
		
		MenuBarInicijalizacija();
		
		StatusBar statusBar = new StatusBar();
		getContentPane().add(statusBar,BorderLayout.SOUTH);
	}
	
	private void MenuBarInicijalizacija() {
		this.setJMenuBar(new MyMenuBar(trenutniTab));
	}
	
	private void ToolbarInicijalizacija() {
		this.toolbar = new ToolBar(trenutniTab);
		add(toolbar, BorderLayout.NORTH);
	}
	
	/**REFERENCA: Radjeno po uzoru na https://www.tutorialspoint.com/how-to-add-a-tab-in-jtabbedpane-with-java
	 * https://docs.oracle.com/javase/7/docs/api/javax/swing/JTabbedPane.html*/
	
	private void prikaziTabove() {
		this.tabbedPane = new TabbedPane();
		
		tabbedPane.addTab("Studenti", TabStudent.getInstance());
		tabbedPane.addTab("Profesori", TabProfesor.getInstance());
		tabbedPane.addTab("Predmeti", TabPredmet.getInstance());
		tabbedPane.addTab("Ocene", TabOcene.getInstance());
		
		
		tabbedPane.addChangeListener(new ChangeListener() {
	        public void stateChanged(ChangeEvent e) {
	        	trenutniTab = tabbedPane.getSelectedIndex();
	        	ToolbarReInicijalizacija();
	        	MenuBarReInicijalizacija();

	        }
	    });
	 
	
		
		this.add(this.tabbedPane, BorderLayout.CENTER);
	}
	
	private void ToolbarReInicijalizacija() {
		this.remove(toolbar);
		this.toolbar = new ToolBar(trenutniTab);
		add(toolbar, BorderLayout.NORTH);
	}
	
	private void MenuBarReInicijalizacija() {
		this.remove(this.getMenuBar());
		this.setJMenuBar(new MyMenuBar(trenutniTab));
	}
	
		

}
