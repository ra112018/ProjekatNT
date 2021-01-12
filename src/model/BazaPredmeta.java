package model;

import java.util.ArrayList;
import java.util.List;

import controller.Serijalizacija;


/**REFERENCA: Radjeno po uzoru na Vezbe, JTableMVCSimple, JTableMVCAdvanced */

public class BazaPredmeta {
	
	public static BazaPredmeta instance = null;
	
	public static BazaPredmeta getInstance() {
		if(instance==null) {
			instance=new BazaPredmeta();
		}
		return instance;
	}
	
	
	private List<Predmet> predmeti;
	private List<String> kolone;
	
	private BazaPredmeta() {

	
		initPredmeti();

		this.kolone = new ArrayList<String>();
		this.kolone.add("Sifra predmeta");
		this.kolone.add("Naziv predmeta");
		this.kolone.add("Broj ESPB bodova");
		this.kolone.add("Godina studija");
		this.kolone.add("Semestar");

		

	}
	
	private void initPredmeti() {
		//this.predmeti = new ArrayList<Predmet>();
		this.predmeti = Serijalizacija.getInstance().ucitajPredmete();
		
		if(predmeti == null) {
			this.predmeti = new ArrayList<Predmet>();
		predmeti.add(new Predmet("p1", "osnove programiranja", "7", 1, "ZIMSKI"));
		predmeti.add(new Predmet("p2", "statistika", "8", 3, "LETNJI"));
		predmeti.add(new Predmet("p3", "algoritmi i strukture podataka", "9", 2, "LETNJI"));
		predmeti.add(new Predmet("p4", "LPRS", "7", 3, "ZIMSKI"));
		predmeti.add(new Predmet("p5", "matematika", "11", 1, "LETNJI"));
		predmeti.add(new Predmet("p6", "xml i web servisi", "6", 4, "LETNJI"));
		predmeti.add(new Predmet("p7", "Metode optimizacije", "6", 3, "ZIMSKI"));
		predmeti.add(new Predmet("p8", "osnove elektrotehnike", "11", 1, "LETNJI"));
		predmeti.add(new Predmet("p9", "Sociologija", "10", 1, "ZIMSKI"));
		predmeti.add(new Predmet("p10", "Filozofija", "4", 1, "ZIMSKI"));
		predmeti.add(new Predmet("p11", "ORT", "7", 2, "LETNJI"));
		predmeti.add(new Predmet("p12", "NANS", "5", 2, "LETNJI"));
		predmeti.add(new Predmet("p13", "Organizacija podataka", "7", 2, "ZIMSKI"));
		predmeti.add(new Predmet("p14", "Baze podataka", "6", 2, "ZIMSKI"));
		predmeti.add(new Predmet("p15", "paralelno programiranje", "8", 2, "ZIMSKI"));
		predmeti.add(new Predmet("p16", "konkurento programiranje", "9", 2, "LETNJI"));
		predmeti.add(new Predmet("p17", "Operativni sistemi", "8", 2, "LETNJI"));
		predmeti.add(new Predmet("p18", "Algebra", "15", 1, "ZIMSKI"));
		predmeti.add(new Predmet("p19", "Verovatnoca", "14", 3, "LETNJI"));
		predmeti.add(new Predmet("ps20", "Upravljacki sistemi", "8", 3, "LETNJI"));
		predmeti.add(new Predmet("ps21", "Osnovi elektronike", "7", 2, "ZIMSKI"));
		predmeti.add(new Predmet("ps22", "Slucajni procesi", "9", 4, "LETNJI"));
		predmeti.add(new Predmet("ps23", "Racunarstvo visokih performansi", "10", 4, "LETNJI"));
		predmeti.add(new Predmet("p24", "Analiza 1", "20", 1, "ZIMSKI"));
		predmeti.add(new Predmet("it25", "Informaciona bezbednost", "9",4, "LETNJI"));
		predmeti.add(new Predmet("it26", "Elektronsko placanje", "8", 3, "ZIMSKI"));
		predmeti.add(new Predmet("it27", "Distribuirani sistemi", "6", 4, "ZIMSKI"));
		predmeti.add(new Predmet("p28", "Projektovanje softvera", "5", 3, "ZIMSKI"));
		predmeti.add(new Predmet("p29", "Informacioni sistemi", "6", 4, "ZIMSKI"));
		predmeti.add(new Predmet("p30", "Masinsko ucenje", "7", 4, "LETNJI"));

		}else {}
	}
	
	public List<Predmet> getPredmet() {
		return predmeti;
	}

	public void setPredmet(List<Predmet> predmeti) {
		this.predmeti = predmeti;
	}

	public int getColumnCount() {
		return kolone.size();
	}

	public String getColumnName(int index) {
		return this.kolone.get(index);
	}

	public Predmet getRow(int rowIndex) {
		return this.predmeti.get(rowIndex);
	}
	
	public String getValueAt(int row, int column) {
		Predmet predmet = this.predmeti.get(row);
		switch (column) {
		case 0:
			return predmet.getSifraPredmeta();
		case 1:
			return predmet.getNazivPredmeta();
		case 2:
			return predmet.getBrojESPB();
		case 3:
			return Integer.toString(predmet.getGodinaStudija());
		case 4:
			return predmet.getSemestar();
		default:
			return null;
		}
	}
	
	public void brisanjePredmeta(Predmet predmet) {
		
		for(int i = 0; i < predmeti.size(); i++) {
			if(predmeti.get(i).getSifraPredmeta().equals(predmet.getSifraPredmeta())) {
				predmeti.remove(i);
				break;
			}
		}
		

	}


}