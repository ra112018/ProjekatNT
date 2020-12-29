package listeners;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


import dialogs.DialogIzmeniProfesora;
import view.GlavniProzor;
import view.TabProfesor;



/**REFERENCA: Radjeno po uzoru na Vezbe Dogadjaji */

public class IzmeniProfesoraListener implements ActionListener {
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		int row = TabProfesor.getInstance().getSelectedRow();
		
		if(row != -1) {
			
			DialogIzmeniProfesora diagIzmeniProfesora = new DialogIzmeniProfesora(row);
			diagIzmeniProfesora.setVisible(true);
			
		}else if(row == -1) {
			JOptionPane.showMessageDialog(GlavniProzor.getInstance(), "Morate izabrati profesora u tabeli!");
		}
		
		
	}
	
	

}

