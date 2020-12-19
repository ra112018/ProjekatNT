package controller;

import java.util.Date;
import java.util.List;

import model.BazaStudenata;
import model.Ocena;
import model.Predmet;
import model.Student;

/**REFERENCA: Radjeno po uzoru na Vezbe Dogadjaji JTableMVCSimple */

public class ControllerStudenti {

	private static ControllerStudenti instance = null;

	public static ControllerStudenti getInstance() {
		if (instance == null) {
			instance = new ControllerStudenti();
		}
		return instance;
	}
	
	private ControllerStudenti() {}
	
		
	public boolean daLiProfesorPostojiProvera(int brIndeksa) {
			for(Student s : BazaStudenata.getInstance().getStudent()) {
				if(s.getBrIndeksa()==brIndeksa) {
					return true;
				}
			}
			return false;
		}
	
	
	public void dodajStudenta(String prezimeSt, String imeSt, Date datumRodjenjaSt, String adresaStanovanjaSt,
			String kontaktTelefonSt, String eMailAdresaSt, int brIndeksa, int godinaUpisa, int godinaStudija,
			String status, double prOcena, List<Ocena> polozeniIspiti, List<Predmet> nepolozeniIspiti)  {
		 {
		
		BazaStudenata.getInstance().dodajStudenta( prezimeSt,  imeSt,  datumRodjenjaSt,  adresaStanovanjaSt,
				kontaktTelefonSt, eMailAdresaSt, brIndeksa, godinaUpisa,  godinaStudija, status,
				prOcena, polozeniIspiti, nepolozeniIspiti) ;
		 }
	}
	
	public void izmeniStudenta(int row, String prezimeSt, String imeSt, Date datumRodjenjaSt, String adresaStanovanjaSt,
			String kontaktTelefonSt, String eMailAdresaSt, int brIndeksa, int godinaUpisa, int godinaStudija,
			String status, double prOcena, List<Ocena> polozeniIspiti, List<Predmet> nepolozeniIspiti) {
		
		BazaStudenata.getInstance().izmeniStudenta(row, prezimeSt,  imeSt,  datumRodjenjaSt,  adresaStanovanjaSt,
				kontaktTelefonSt, eMailAdresaSt, brIndeksa, godinaUpisa,  godinaStudija, status,
				prOcena, polozeniIspiti, nepolozeniIspiti);
		
	}
}
