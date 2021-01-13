package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import dialogs.DialogBrisanje;
import view.GlavniProzor;
import view.TabProfesor;

public class ObrisiProfesoraListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		int selektovanRed = TabProfesor.getInstance().getSelectedRow();
		
		if(selektovanRed == -1) {
			JOptionPane.showMessageDialog(GlavniProzor.getInstance(), "Morate izabrati profesora u tabeli!");
		}else {
			
			DialogBrisanje dialog = new DialogBrisanje(selektovanRed, "profesor");
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setLocationRelativeTo(GlavniProzor.getInstance());
			dialog.setVisible(true);
			
		}
		
	}

}
