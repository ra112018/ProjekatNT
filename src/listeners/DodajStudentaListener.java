package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dialogs.DialogDodajStudenta;

public class DodajStudentaListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {			/* REFERENCA: https://docs.oracle.com/javase/tutorial/uiswing/events/actionlistener.html */
		// TODO Auto-generated method stub
		DialogDodajStudenta digDodajStudenta = new DialogDodajStudenta();
		digDodajStudenta.setVisible(true);
	}
}
