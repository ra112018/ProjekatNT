package view;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import dialogs.DialogIzmeniProfesora;

public class TabInfoProfesor extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private static TabInfoProfesor instance = null;
	
	public static TabInfoProfesor getInstance() {
		if(instance == null) {
			instance = new TabInfoProfesor();
		}
		return instance;
	}
	
	
	private TabInfoProfesor() {
		
		int row = TabProfesor.getInstance().getSelectedRow();
		DialogIzmeniProfesora diagIzmeniProfesora = new DialogIzmeniProfesora(row);

		diagIzmeniProfesora.setVisible(true);
	}
	


}
