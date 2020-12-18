package model;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private String prezimeSt;
	private String imeSt;
	private String datumRodjenjaSt;
	private String adresaStanovanjaSt;
	private String kontaktTelefonSt;
	private String eMailAdresaSt;
	private int brIndeksa;
	private int godinaUpisa;
	private int godinaStudija;
	enum status{B,S};
	private int prOcena;
	private List<Ocena> polozeniIspiti ;
	private List<Predmet> nepolozeniIspiti;

	

}
