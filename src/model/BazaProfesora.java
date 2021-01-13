package model;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import controller.Serijalizacija;



/**REFERENCA: Radjeno po uzoru na Vezbe, JTableMVCSimple, JTableMVCAdvanced */

public class BazaProfesora {

	private static BazaProfesora instance = null;
	
	public static BazaProfesora getInstance() {
		if (instance == null) {
			instance = new BazaProfesora();
		}
		return instance;
	}

	
	private List<Profesor> profesori;
	private List<String> kolone;
	
	private BazaProfesora() {
	
		initProfesori();

		this.kolone = new ArrayList<String>();
		this.kolone.add("Ime");
		this.kolone.add("Prezime");
		this.kolone.add("Titula");
		this.kolone.add("Zvanje");

	}
	
	
	private void initProfesori() {
		//this.profesori = new ArrayList<Profesor>();
		this.profesori = Serijalizacija.getInstance().ucitajProfesore();
		
		if(profesori == null) {
			this.profesori = new ArrayList<Profesor>();
			
		profesori.add(new Profesor("Milos", "Nikolic", "PROF_DR", "REDOVNI_PROFESOR"));
		profesori.add(new Profesor("Nikola", "Mirkovic", "PROF_DR", "REDOVNI_PROFESOR"));
		profesori.add(new Profesor("Ilija", "Petkovic", "DR", "VANREDNI_PROFESOR"));
		profesori.add(new Profesor("Mitar", "Petrovic", "DR", "VANREDNI_PROFESOR"));
		profesori.add(new Profesor("Vasa", "Micic", "DR", "DOCENT"));
		profesori.add(new Profesor("Srdjan", "Miletic", "DR", "DOCENT"));
		profesori.add(new Profesor("Branislav", "Mihajlovic", "PROF_DR", "REDOVNI_PROFESOR"));
		profesori.add(new Profesor("Marko", "Markovic", "PROF_DR", "REDOVNI_PROFESOR"));
		profesori.add(new Profesor("Milos", "Milakovic", "PROF_DR", "VANREDNI_PROFESOR"));
		profesori.add(new Profesor("Lazar", "Bratic", "PROF_DR", "VANREDNI_PROFESOR"));
		profesori.add(new Profesor("Ljeposava", "Drazic", "PROF_DR", "DOCENT"));
		profesori.add(new Profesor("Miroljub", "Dragic", "PROF_DR", "DOCENT"));
		profesori.add(new Profesor("Bogdan", "Rekavic", "PROF_DR", "VANREDNI_PROFESOR"));
		profesori.add(new Profesor("Stanka", "Milic", "PROF_DR", "DOCENT"));
		profesori.add(new Profesor("Milica", "Vukovic", "PROF_DR", "VANREDNI_PROFESOR"));
		profesori.add(new Profesor("Misa", "Misic", "PROF_DR", "DOCENT"));
		profesori.add(new Profesor("Branko", "Maricic", "PROF_DR", "DOCENT"));
		profesori.add(new Profesor("Branislav", "Lukovic", "PROF_DR", "REDOVNI_PROFESOR"));
		profesori.add(new Profesor("Branimir", "Obradovic", "PROF_DR", "DOCENT"));
		
		
		String date1 = "12-12-1965";
		Date Ddate1 = null;
		try {
			Ddate1 = new SimpleDateFormat("dd-MM-yyyy").parse(date1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		profesori.add(new Profesor("Milos", "Nikolic", Ddate1, "Temerinska 15, Novi Sad", "021/356-785", "milos.nikolic@mailinator.com", "Dositeja Obradovica 6, Novi Sad, NTP 600", 123123123, "PROF_DR", "REDOVNI_PROFESOR"));
		
		
		}
	}
	
	
	public List<Profesor> getProfesor() {
		return profesori;
	}

	public void setProfesor(List<Profesor> profesori) {
		this.profesori = profesori;
	}
	
	public int getColumnCount() {
		return kolone.size();
	}

	public String getColumnName(int index) {
		return this.kolone.get(index);
	}

	public Profesor getRow(int rowIndex) {
		return this.profesori.get(rowIndex);
	}

	public String getValueAt(int row, int column) {
		Profesor profesori = this.profesori.get(row);
		switch (column) {
		case 0:
			return profesori.getImeProf();
		case 1:
			return profesori.getPrezimeProf();
		case 2:
			return profesori.getTitulaProf();		
		case 3:
			return profesori.getZvanjeProf();
	    default:
	    	return null;
		}
	}
	
	public void dodajProfesora(String ime, String prezime, Date datumRodjenja, String adresaStanovanja, 
			String kontaktTelefon, String emailAdresa, String adresaKancelarije, Integer brojLicneKarte, 
			String titula, String zvanje) {
		
		this.profesori.add(new Profesor(ime, prezime, datumRodjenja, adresaStanovanja, kontaktTelefon, emailAdresa,
				adresaKancelarije, brojLicneKarte, titula, zvanje));
	}
	
	public void izmeniProfesora(int row, String ime, String prezime, Date datumRodjenja, String adresaStanovanja, 
			String kontaktTelefon, String emailAdresa, String adresaKancelarije, Integer brojLicneKarte, 
			String titula, String zvanje) {
		
		Profesor profesor = BazaProfesora.getInstance().getRow(row);
		
		profesor.setImeProf(ime);
		profesor.setPrezimeProf(prezime);
		profesor.setDatumRodjenjaProf(datumRodjenja);
		profesor.setAdresaStanovanjaProf(adresaStanovanja);
		profesor.setKontaktTelefonProf(kontaktTelefon);
		profesor.seteMailAdresaProf(emailAdresa);
		profesor.setAdresaKancelarijeProf(adresaKancelarije);
		profesor.setBrojLicneKarteProf(brojLicneKarte);
		profesor.setTitulaProf(titula);
		profesor.setZvanjeProf(zvanje);
		
	}

	public void obrisiProfesora(Profesor profesor) {
		
		
		Iterator<Profesor> iter = this.profesori.listIterator();
		
		while(iter.hasNext()) {
			Profesor p = iter.next();
			if(p == profesor) {
				iter.remove();
			}
		}
		
	}
	
}