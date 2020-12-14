package model;

import java.util.ArrayList;
import java.util.List;


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
		this.kolone.add("Broj ESP bodova");
		this.kolone.add("Godina studija");
		this.kolone.add("Semestar");

		

	}
	
	private void initPredmeti() {
		this.predmeti = new ArrayList<Predmet>();
		predmeti.add(new Predmet("20", "OISISI", "8", "3", "5"));
		predmeti.add(new Predmet("10", "NANS", "4", "3", "5"));

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
			return predmet.getGodinaStudija();
		case 4:
			return predmet.getSemestar();
		default:
			return null;
		}
	}

	public void dodajPredmet(String sifraPredmeta, String nazivPredmeta, String semestar, String godinaStudija,
			String predmetniProfesor, String brojESPBodova) {
		
		this.predmeti.add(new Predmet(sifraPredmeta, nazivPredmeta, semestar, godinaStudija, predmetniProfesor, brojESPBodova));
	}
	
	public void izmeniPredmet(int row, String sifraPredmeta, String nazivPredmeta, String semestar, String godinaStudija,
			String predmetniProfesor, String brojESPBodova) {
		
		Predmet predmet = BazaPredmeta.getInstance().getRow(row);
		
		predmet.setSifraPredmeta(sifraPredmeta);
		predmet.setNazivPredmeta(nazivPredmeta);
		predmet.setSemestar(semestar);
		predmet.setGodinaStudija(godinaStudija);
		predmet.setPredmetniProfesor(predmetniProfesor);
		predmet.setBrojESPB(brojESPBodova);
	}
}
