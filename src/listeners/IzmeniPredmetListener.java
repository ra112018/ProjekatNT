package listeners;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;

import dialogs.DialogIzmeniPredmet;
import view.GlavniProzor;
import view.TabPredmet;

public class IzmeniPredmetListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		int row = TabPredmet.getInstance().getSelectedRow();
		
		if(row != -1) {
			
			DialogIzmeniPredmet diagIzmeniPredmet = new DialogIzmeniPredmet(row);
			diagIzmeniPredmet.setVisible(true);
			
		}else if(row == -1) {
			JOptionPane.showMessageDialog(GlavniProzor.getInstance(), "Morate izabrati predmet u tabeli!");
		}
	}
}
