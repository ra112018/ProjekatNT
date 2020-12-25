package listeners;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


import dialogs.DialogIzmeniStudenta;
import view.GlavniProzor;
import view.TabStudent;


/**REFERENCA: Radjeno po uzoru na Vezbe Dogadjaji */

public class IzmeniStudentaListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		int row = TabStudent.getInstance().getSelectedRow();
		
		if(row != -1) {
			
			DialogIzmeniStudenta diagIzmeniStudenta = new DialogIzmeniStudenta(row);
			diagIzmeniStudenta.setVisible(true);
			
		}else if(row == -1) {
			JOptionPane.showMessageDialog(GlavniProzor.getInstance(), "Morate izabrati studenta u tabeli!");
		}
		
	}
	

	
	

}
