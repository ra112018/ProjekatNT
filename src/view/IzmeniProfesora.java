package view;

import java.awt.BorderLayout;

import javax.swing.JPanel;


public class IzmeniProfesora extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static IzmeniProfesora instance = null;
	
	public static IzmeniProfesora getInstance() {
		if(instance == null) {
			instance = new IzmeniProfesora();
		}
		return instance;
	}
	
	public IzmeniProfesora() {
	}
	
	private TabbedPane tabbedPane;
	
	public void prikaziTabove() {
		this.tabbedPane = new TabbedPane();
		
		tabbedPane.addTab("Info", TabInformacije.getInstance());
		tabbedPane.addTab("Predmeti", TabPredmet.getInstance());

		this.add(this.tabbedPane, BorderLayout.CENTER);
	}
	

}
