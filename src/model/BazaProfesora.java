package model;

import java.util.ArrayList;
import java.util.List;



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
		this.profesori = new ArrayList<Profesor>();
		profesori.add(new Profesor("Mika", "Mikic", "2.5.1987.", "Njegoseva 2", "021 556 748", "mika.mikic@gmail.com", "DO 6", "938204826", "Dr", "Redovni profesor"));
		profesori.add(new Profesor("Ana", "Anic", "6.7.1978.", "Njegoseva 7", "021 376 768", "ana.anic@gmail.com", "DO 6", "37843257", "Dr", "Redovni profesor"));
		//profesori.add(new Profesor(generateId(), "Zika", "Zikic", "FMP"));
		//profesori.add(new Profesor(generateId(), "Pera", "Peric", "OKK Sabac"));
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
			return profesori.getDatumRodjenjaProf();
		case 3:
			return profesori.getAdresaStanovanjaProf();
		case 4:
			return profesori.getKontaktTelefonProf();	
		case 5:
			return profesori.geteMailAdresaProf();	
		case 6:
			return profesori.getAdresaKancelarijeProf();
		case 7:
			return profesori.getBrojLicneKarteProf();	
		case 8:
			return profesori.getTitulaProf();		
		case 9:
			return profesori.getZvanjeProf();
	    default:
	    	return null;
		}
	}
	
	public void dodajProfesora(String ime, String prezime, String datumRodjenja, String adresaStanovanja, 
			String kontaktTelefon, String emailAdresa, String adresaKancelarije, String brojLicneKarte, 
			String titula, String zvanje) {
		
		this.profesori.add(new Profesor(ime, prezime, datumRodjenja, adresaStanovanja, kontaktTelefon, emailAdresa,
				adresaKancelarije, brojLicneKarte, titula, zvanje));
	}
	
	public void izmeniProfesora(int row, String ime, String prezime, String datumRodjenja, String adresaStanovanja, 
			String kontaktTelefon, String emailAdresa, String adresaKancelarije, String brojLicneKarte, 
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
	
	
}
