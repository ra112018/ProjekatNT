package controller;


import model.BazaPredmeta;
import model.Predmet;
import view.TabPredmet;


public class ControllerPredmeti {

	private static ControllerPredmeti instance = null;

	public static ControllerPredmeti getInstance() {
		if (instance == null) {
			instance = new ControllerPredmeti();
		}
		return instance;
	}
	
	private ControllerPredmeti() {}

	public void dodajPredmet(String sifra, String naziv, String brojBodova, int godinaStudija, 
			String semestar) {
		
		BazaPredmeta.getInstance().dodajPredmet(sifra, naziv, brojBodova, godinaStudija, semestar);
		
		TabPredmet.getInstance().azurirajPrikaz();
	}
	
	public void izmeniPredmet(int row, String sifra, String naziv, String brojBodova, int godinaStudija, 
			String semestar) {
		
		BazaPredmeta.getInstance().izmeniPredmet(row, sifra, naziv, brojBodova, godinaStudija, semestar);
		
		TabPredmet.getInstance().azurirajPrikaz();
		
	}
	public void obrisiPredmet(int selectedRow) {
		
		Predmet predmet = BazaPredmeta.getInstance().getRow(selectedRow);
		BazaPredmeta.getInstance().brisanjePredmeta(predmet);
	}

}
