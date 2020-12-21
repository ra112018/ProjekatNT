package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dialogs.DialogDodajProfesora;


/**REFERENCA: Radjeno po uzoru na Vezbe Dogadjaji */

public class DodajProfesoraListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		DialogDodajProfesora digDodajProf = new DialogDodajProfesora();
		digDodajProf.setVisible(true);
	}

	
}
