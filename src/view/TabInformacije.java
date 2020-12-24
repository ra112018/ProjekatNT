package view;

import javax.swing.JPanel;

import dialogs.DialogIzmeniProfesora;

public class TabInformacije extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static TabInformacije instance = null;
	
	public static TabInformacije getInstance() {
		if(instance == null) {
			instance = new TabInformacije();
		}
		return instance;
	}
	
	private TabInformacije() {
		
		int row = TabProfesor.getInstance().getSelectedRow();
		
		DialogIzmeniProfesora diagIzmeniProfesora = new DialogIzmeniProfesora(row);
		diagIzmeniProfesora.setVisible(true);
	}
}
