package controller;

import java.util.Date;

import model.BazaStudenata;

import model.Student;
import view.TabStudent;

/**REFERENCA: Radjeno po uzoru na Vezbe Dogadjaji JTableMVCSimple */
/**REFERENCA: https://www.youtube.com/watch?v=dTVVa2gfht8 */
public class ControllerStudenti {

	private static ControllerStudenti instance = null;

	public static ControllerStudenti getInstance() {
		if (instance == null) {
			instance = new ControllerStudenti();
		}
		return instance;
	}
	
	private ControllerStudenti() {}
	
		
	public boolean daLiStudentPostojiProvera(String brIndeksa) {
			for(Student s : BazaStudenata.getInstance().getStudent()) {
				if(s.getBrIndeksa()==brIndeksa) {
					return true;
				}
			}
			return false;
		}
	
	
	public void izmeniStudenta(int row, String prezimeSt, String imeSt, Date datumRodjenjaSt, String adresaStanovanjaSt,
			String kontaktTelefonSt, String eMailAdresaSt, String string, String string2, String string3,
			String status, String string4, String string5, String string6) {
		
		BazaStudenata.getInstance().izmeniStudenta(row, prezimeSt,  imeSt,  datumRodjenjaSt,  adresaStanovanjaSt,
				kontaktTelefonSt, eMailAdresaSt, string, string2,  string3, status,
				string4, string5, string6);
		
	}

	public void dodajStudenta(String indeks, String ime, String prz, Date datumRodjenja, String adresa, String telefon,
			String email, String godStudija, String status, String godUpisa) {
		// TODO Auto-generated method stub
		BazaStudenata.getInstance().dodajStudenta( indeks,  ime, prz, datumRodjenja, 
		adresa, telefon, email, godStudija,
		status,godUpisa) ;
		TabStudent.getInstance().azurirajPrikaz();

	}
	public void obrisiStudenta(int selectedRow) {
		Student student = BazaStudenata.getInstance().getRow(selectedRow);
		BazaStudenata.getInstance().obrisiStudenta(student);
		
		TabStudent.getInstance().azurirajPrikaz();
		
	}

}
