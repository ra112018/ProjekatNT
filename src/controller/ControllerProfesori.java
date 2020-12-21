package controller;

import java.util.Date;

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
	
		
	public boolean daLiProfesorPostojiProvera(String licnaKarta) {
           try {
        	   return BazaProfesora.getInstance().daLiProfPostojiPoLicnojKarti(Integer.parseInt(licnaKarta));
           }catch(Exception e) {
        	   return false;
           }
		}
	
	
	public void dodajProfesora(String ime, String prezime, Date datumRodjenja, String adresaStanovanja, 
			String kontaktTelefon, String emailAdresa, String adresaKancelarije, Integer brojLicneKarte, 
			String titula, String zvanje) {
		
		BazaProfesora.getInstance().dodajProfesora(ime, prezime, datumRodjenja, adresaStanovanja, kontaktTelefon, emailAdresa, adresaKancelarije, brojLicneKarte, titula, zvanje);
		
	}
	
	public void izmeniProfesora(int row, String ime, String prezime, Date datumRodjenja, String adresaStanovanja, 
			String kontaktTelefon, String emailAdresa, String adresaKancelarije, Integer brojLicneKarte, 
			String titula, String zvanje) {
		
		BazaProfesora.getInstance().izmeniProfesora(row, ime, prezime, datumRodjenja, adresaStanovanja, kontaktTelefon, emailAdresa, adresaKancelarije, brojLicneKarte, titula, zvanje);
		
	}
	
}
