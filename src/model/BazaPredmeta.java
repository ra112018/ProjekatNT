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
	
	private long generator;
	
	private List<Predmet> predmeti;
	private List<String> kolone;
	
	private BazaPredmeta() {
		generator = 0;
	
		initPredmeti();

		this.kolone = new ArrayList<String>();
		this.kolone.add("Sifra predmeta");
		this.kolone.add("Naziv predmeta");
		this.kolone.add("Semestar");
		this.kolone.add("Godina studija");
		this.kolone.add("Predmetni profesor");
		this.kolone.add("Broj ESP bodova");

	}
	
	private void initPredmeti() {
		this.predmeti = new ArrayList<Predmet>();
		//igraci.add(new Igrac(generateId(), "Mika", "Mikic", "Crvena Zvezda"));
		//igraci.add(new Igrac(generateId(), "Zika", "Zikic", "FMP"));
		//igraci.add(new Igrac(generateId(), "Pera", "Peric", "OKK Sabac"));
	}
	
	public List<Predmet> getPredmet() {
		return predmeti;
	}

	public void setPredmet(List<Predmet> predmeti) {
		this.predmeti = predmeti;
	}

	private long generateId() {
		return ++generator;
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
			return predmet.getSemestar();
		case 3:
			return Integer.toString(predmet.getGodinaStudija());
		case 4:
			Profesor prof = predmet.getPredmetniProfesor();
			if(prof==null) {
				return "Profesor nije dodat";
			}
			return prof.getImeProf() + " " + prof.getPrezimeProf();
		case 5:
			return Integer.toString(predmet.getBrojESPB());
		default:
			return null;
		}
	}

	public void dodajPredmet(String sifraPredmeta, String nazivPredmeta, String semestar, Integer godinaStudija,
			Profesor predmetniProfesor, Integer brojESPBodova) {
		
		this.predmeti.add(new Predmet(sifraPredmeta, nazivPredmeta, semestar, godinaStudija, predmetniProfesor, brojESPBodova));
	}
	
	public void izmeniPredmet(int row, String sifraPredmeta, String nazivPredmeta, String semestar, Integer godinaStudija,
			Profesor predmetniProfesor, Integer brojESPBodova) {
		
		Predmet predmet = BazaPredmeta.getInstance().getRow(row);
		
		predmet.setSifraPredmeta(sifraPredmeta);
		predmet.setNazivPredmeta(nazivPredmeta);
		predmet.setSemestar(semestar);
		predmet.setGodinaStudija(godinaStudija);
		predmet.setPredmetniProfesor(predmetniProfesor);
		predmet.setBrojESPB(brojESPBodova);
	}
}
