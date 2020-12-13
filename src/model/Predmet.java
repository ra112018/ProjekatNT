package model;

public class Predmet {
	
	private String sifraPredmeta;
	private String nazivPredmeta;
	private String semestar;
	private Integer godinaStudija;			
	private Profesor predmetniProfesor;
	private Integer brojESPB;
	//lista studenata koji su polozili predmet
	//lista studenata koji nisu polozili predmet
	
	public Predmet(String sifraPredmeta, String nazivPredmeta, String semestar, Integer godinaStudija,
			Profesor predmetniProfesor, Integer brojESPB) {
		
		super();
		this.sifraPredmeta = sifraPredmeta;
		this.nazivPredmeta = nazivPredmeta;
		this.semestar = semestar;
		this.godinaStudija = godinaStudija;
		this.predmetniProfesor = predmetniProfesor;
		this.brojESPB = brojESPB;
	}

	public String getSifraPredmeta() {
		return sifraPredmeta;
	}

	public void setSifraPredmeta(String sifraPredmeta) {
		this.sifraPredmeta = sifraPredmeta;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public String getSemestar() {
		return semestar;
	}

	public void setSemestar(String semestar) {
		this.semestar = semestar;
	}

	public Integer getGodinaStudija() {
		return godinaStudija;
	}

	public void setGodinaStudija(Integer godinaStudija) {
		this.godinaStudija = godinaStudija;
	}

	public Profesor getPredmetniProfesor() {
		return predmetniProfesor;
	}

	public void setPredmetniProfesor(Profesor predmetniProfesor) {
		this.predmetniProfesor = predmetniProfesor;
	}

	public Integer getBrojESPB() {
		return brojESPB;
	}

	public void setBrojESPB(Integer brojESPB) {
		this.brojESPB = brojESPB;
	}
	
	
}
