package controller;

import model.BazaProfesora;
import model.Profesor;

/**REFERENCA: Radjeno po uzoru na Vezbe Dogadjaji JTableMVCSimple */

public class ControllerProfesori {

	private static ControllerProfesori instance = null;

	public static ControllerProfesori getInstance() {
		if (instance == null) {
			instance = new ControllerProfesori();
		}
		return instance;
	}
	
	private ControllerProfesori() {}
	
		
	public boolean daLiProfesorPostojiProvera(String brojLicneKarte) {
			for(Profesor p : BazaProfesora.getInstance().getProfesor()) {
				if(p.getBrojLicneKarteProf().trim().equals(brojLicneKarte)) {
					return true;
				}
			}
			return false;
		}
	
	
	public void dodajProfesora(String ime, String prezime, String datumRodjenja, String adresaStanovanja, 
			String kontaktTelefon, String emailAdresa, String adresaKancelarije, String brojLicneKarte, 
			String titula, String zvanje) {
		
		BazaProfesora.getInstance().dodajProfesora(ime, prezime, datumRodjenja, adresaStanovanja, kontaktTelefon, emailAdresa, adresaKancelarije, brojLicneKarte, titula, zvanje);
		
	}
	
	public void izmeniProfesora(int row, String ime, String prezime, String datumRodjenja, String adresaStanovanja, 
			String kontaktTelefon, String emailAdresa, String adresaKancelarije, String brojLicneKarte, 
			String titula, String zvanje) {
		
		BazaProfesora.getInstance().izmeniProfesora(row, ime, prezime, datumRodjenja, adresaStanovanja, kontaktTelefon, emailAdresa, adresaKancelarije, brojLicneKarte, titula, zvanje);
		
	}
	
}
