package controller;

import model.BazaPredmeta;
import model.Predmet;


public class ControllerPredmeti {

	private static ControllerPredmeti instance = null;

	public static ControllerPredmeti getInstance() {
		if (instance == null) {
			instance = new ControllerPredmeti();
		}
		return instance;
	}
	
	private ControllerPredmeti() {}
	
	
	public void obrisiPredmet(int selektovanRed) {
		
		Predmet predmet = BazaPredmeta.getInstance().getRow(selektovanRed);
		BazaPredmeta.getInstance().brisanjePredmeta(predmet);
		
	}
}
