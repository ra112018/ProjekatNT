package controller;


import java.util.Date;

import model.BazaProfesora;
import model.BazaStudenata;
import model.Student;
import model.Profesor;
import view.TabProfesor;
import view.TabStudent;

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
	
	
	public void dodajProfesora(String ime, String prezime, Date datumRodjenja, String adresaStanovanja, 
			String kontaktTelefon, String emailAdresa, String adresaKancelarije, Integer brojLicneKarte, 
			String titula, String zvanje) {
		
		BazaProfesora.getInstance().dodajProfesora(ime, prezime, datumRodjenja, adresaStanovanja, kontaktTelefon, emailAdresa, adresaKancelarije, brojLicneKarte, titula, zvanje);
		
		TabProfesor.getInstance().azurirajPrikaz();
	}
	
	public void izmeniProfesora(int row, String ime, String prezime, Date datumRodjenja, String adresaStanovanja, 
			String kontaktTelefon, String emailAdresa, String adresaKancelarije, int brojLicneKarte, 
			String titula, String zvanje) {
		
		BazaProfesora.getInstance().izmeniProfesora(row, ime, prezime, datumRodjenja, adresaStanovanja, kontaktTelefon, emailAdresa, adresaKancelarije, brojLicneKarte, titula, zvanje);
		
		TabProfesor.getInstance().azurirajPrikaz();
		
	}

	public void obrisiProfesora(int selectedRow) {
		Profesor profesor = BazaProfesora.getInstance().getRow(selectedRow);
		BazaProfesora.getInstance().obrisiProfesora(profesor);
		
		TabProfesor.getInstance().azurirajPrikaz();
		
	}
	
}
