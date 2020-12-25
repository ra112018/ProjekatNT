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
	
		
	public boolean daLiProfesorPostojiProvera(String brIndeksa) {
			for(Student s : BazaStudenata.getInstance().getStudent()) {
				if(s.getBrIndeksa()==brIndeksa) {
					return true;
				}
			}
			return false;
		}
	
	
	public void dodajStudenta(String prezimeSt, String imeSt, Date datumRodjenjaSt, String adresaStanovanjaSt,
			String kontaktTelefonSt, String eMailAdresaSt, String brIndeksa, String godinaUpisa, String godinaStudija,
			String status, double prOcena, List<Ocena> polozeniIspiti, List<Predmet> nepolozeniIspiti)  {
		 {
		
		BazaStudenata.getInstance().dodajStudenta( prezimeSt,  imeSt,  datumRodjenjaSt,  adresaStanovanjaSt,
				kontaktTelefonSt, eMailAdresaSt, brIndeksa, godinaUpisa,  godinaStudija, status,
				prOcena, polozeniIspiti, nepolozeniIspiti) ;
		 }
	}
	
	public void izmeniStudenta(int row, String prezimeSt, String imeSt, Date datumRodjenjaSt, String adresaStanovanjaSt,
			String kontaktTelefonSt, String eMailAdresaSt, String string, String string2, String string3,
			String status, String string4, String string5, String string6) {
		
		BazaStudenata.getInstance().izmeniStudenta(row, prezimeSt,  imeSt,  datumRodjenjaSt,  adresaStanovanjaSt,
				kontaktTelefonSt, eMailAdresaSt, string, string2,  string3, status,
				string4, string5, string6);
		
	}

	public void dodajStudenta(String text, String text2, Date datumRodjenja, String text3, String text4, String text5,
			String parseInt, String text8, String text9, String text10) {
		// TODO Auto-generated method stub
		BazaStudenata.getInstance().dodajStudenta( text,  text2,  datumRodjenja,  text3,
		text4, text5, parseInt, text8,
		text9,text10) ;
		
	}

}
