package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dialogs.DialogDodajPredmet;

public class DodajPredmetListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		DialogDodajPredmet digDodajPred = new DialogDodajPredmet();
		digDodajPred.setVisible(true);
	}

}
