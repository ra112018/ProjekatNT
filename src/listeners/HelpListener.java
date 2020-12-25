package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dialogs.DialogHelp;

public class HelpListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		DialogHelp digAbout = new DialogHelp();
		digAbout.setVisible(true);

	}
}
