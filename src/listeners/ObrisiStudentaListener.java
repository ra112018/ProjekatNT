package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import dialogs.DialogBrisanje;
import view.GlavniProzor;
import view.TabStudent;

public class ObrisiStudentaListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		int selektovanRed = TabStudent.getInstance().getSelectedRow();
		
		if(selektovanRed == -1) {
			JOptionPane.showMessageDialog(GlavniProzor.getInstance(), "Morate izabrati studenta u tabeli!");
		}else {
			
			DialogBrisanje dialog = new DialogBrisanje(selektovanRed, "student");
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setLocationRelativeTo(GlavniProzor.getInstance());
			dialog.setVisible(true);
			
		}
		
	}

	
}
