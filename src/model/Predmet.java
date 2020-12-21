package model;

import java.util.ArrayList;
import java.util.List;

public class Predmet {
	
	private String sifraPredmeta;
	private String nazivPredmeta;
	private String semestar;
	private Integer godinaStudija;			
	private Profesor predmetniProfesor;
	private String brojESPB;
	private List<Student> studentiPolozili = new ArrayList<Student>();   //lista studenata koji su polozili predmet
	private List<Student> studentiNisuPolozili = new ArrayList<Student>();  //lista studenata koji nisu polozili predmet
	
	
	public Predmet (String sifraPredmeta, String nazivPredmeta, String brojESPB, Integer godinaStudija,
			String semestar) {
		
		super();
		this.sifraPredmeta = sifraPredmeta;
		this.nazivPredmeta = nazivPredmeta;
		this.brojESPB = brojESPB;
		this.godinaStudija = godinaStudija;
		this.semestar = semestar;
			
	}
	
	public Predmet (String sifraPredmeta, String nazivPredmeta, String semestar, Integer godinaStudija,
			Profesor predmetniProfesor, String brojESPB) {
		
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

	public List<Student> getStudentiPolozili() {
		return studentiPolozili;
	}

	public void setStudentiPolozili(List<Student> studentiPolozili) {
		this.studentiPolozili = studentiPolozili;
	}

	public List<Student> getStudentiNisuPolozili() {
		return studentiNisuPolozili;
	}

	public void setStudentiNisuPolozili(List<Student> studentiNisuPolozili) {
		this.studentiNisuPolozili = studentiNisuPolozili;
	}

	public String getBrojESPB() {
		return brojESPB;
	}

	public void setBrojESPB(String brojESPB) {
		this.brojESPB = brojESPB;
	}
	
	
}
