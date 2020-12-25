package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dialogs.DialogAbout;

public class AboutListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		DialogAbout digAbout = new DialogAbout();
		digAbout.setVisible(true);

	}
}
