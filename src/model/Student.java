package model;

import java.util.List;
import java.util.Date;

public class Student {

	private String prezimeSt;
	private String imeSt;
	private Date datumRodjenjaSt;
	private String adresaStanovanjaSt;
	private String kontaktTelefonSt;
	private String eMailAdresaSt;
	private int brIndeksa;
	private int godinaUpisa;
	private int godinaStudija;
	enum Status {B("B"),S("S");
		public final String label;
		private Status(String label) {
			this.label=label;
		}
		};
	private Status status;
	private double prOcena;
	private List<Ocena> polozeniIspiti ;
	private List<Predmet> nepolozeniIspiti;
	
	
	
	public Student(String prezimeSt, String imeSt, int brIndeksa) {
		super();
		this.prezimeSt = prezimeSt;
		this.imeSt = imeSt;
		this.brIndeksa = brIndeksa;
	}


	public Student(String prezimeSt, String imeSt, int brIndeksa, int godinaStudija, String string, double prOcena) {
		super();
		this.prezimeSt = prezimeSt;
		this.imeSt = imeSt;
		this.brIndeksa = brIndeksa;
		this.godinaStudija = godinaStudija;
		
		this.status = extracted(string);
		this.prOcena = prOcena;
	}
	public Student(int brIndeksa,String prezimeSt, String imeSt, int godinaStudija, String string, double prOcena) {
		super();
		this.prezimeSt = prezimeSt;
		this.imeSt = imeSt;
		this.brIndeksa = brIndeksa;
		this.godinaStudija = godinaStudija;
		
		this.status = extracted(string);
		this.prOcena = prOcena;
	}


	private Status extracted(String string) {
		return Status.valueOf(string);
	}


	public Student(String prezimeSt, String imeSt, Date datumRodjenjaSt, String adresaStanovanjaSt,
			String kontaktTelefonSt, String eMailAdresaSt, int brIndeksa, int godinaUpisa, int godinaStudija,
			double prOcena, List<Ocena> polozeniIspiti, List<Predmet> nepolozeniIspiti) {
		super();
		this.prezimeSt = prezimeSt;
		this.imeSt = imeSt;
		this.datumRodjenjaSt = datumRodjenjaSt;
		this.adresaStanovanjaSt = adresaStanovanjaSt;
		this.kontaktTelefonSt = kontaktTelefonSt;
		this.eMailAdresaSt = eMailAdresaSt;
		this.brIndeksa = brIndeksa;
		this.godinaUpisa = godinaUpisa;
		this.godinaStudija = godinaStudija;
		this.prOcena = prOcena;
		this.polozeniIspiti = polozeniIspiti;
		this.nepolozeniIspiti = nepolozeniIspiti;
	}


	public Student(String prezimeSt, String imeSt, Date datumRodjenjaSt, String adresaStanovanjaSt,
			String kontaktTelefonSt, String eMailAdresaSt, int brIndeksa, int godinaUpisa, int godinaStudija,
			String string, double prOcena, List<Ocena> polozeniIspiti, List<Predmet> nepolozeniIspiti) {
		super();
		this.prezimeSt = prezimeSt;
		this.imeSt = imeSt;
		this.datumRodjenjaSt = datumRodjenjaSt;
		this.adresaStanovanjaSt = adresaStanovanjaSt;
		this.kontaktTelefonSt = kontaktTelefonSt;
		this.eMailAdresaSt = eMailAdresaSt;
		this.brIndeksa = brIndeksa;
		this.godinaUpisa = godinaUpisa;
		this.godinaStudija = godinaStudija;
		this.status = extracted(string);
		this.prOcena = prOcena;
		this.polozeniIspiti = polozeniIspiti;
		this.nepolozeniIspiti = nepolozeniIspiti;
	}


	public Student(String prezimeSt,String imeSt) {
		super();
		this.prezimeSt=prezimeSt;
		this.imeSt=imeSt;
	}

	public Student(String text, String text2, Date datumRodjenja, String text3, String text4, String text5,
			String text6, String text7, int parseInt, String text8, String text9, String text10) {
		// TODO Auto-generated constructor stub
		super();
		this.prezimeSt = text;
		this.imeSt = text2;
		this.datumRodjenjaSt = datumRodjenja;
		this.adresaStanovanjaSt = text3;
		this.kontaktTelefonSt = text4;
		this.eMailAdresaSt = text5;
		this.brIndeksa = Integer.parseInt(text6);
		this.godinaUpisa = Integer.parseInt(text7);
		this.godinaStudija = Integer.parseInt(text8);
		this.status = extracted(text9);
		this.prOcena = Integer.parseInt(text10);
	}


	public String getPrezimeSt() {
		return prezimeSt;
	}


	public void setPrezimeSt(String prezimeSt) {
		this.prezimeSt = prezimeSt;
	}


	public String getImeSt() {
		return imeSt;
	}


	public void setImeSt(String imeSt) {
		this.imeSt = imeSt;
	}


	public Date getDatumRodjenjaSt() {
		return datumRodjenjaSt;
	}


	public void setDatumRodjenjaSt(Date datumRodjenjaSt) {
		this.datumRodjenjaSt = datumRodjenjaSt;
	}


	public String getAdresaStanovanjaSt() {
		return adresaStanovanjaSt;
	}


	public void setAdresaStanovanjaSt(String adresaStanovanjaSt) {
		this.adresaStanovanjaSt = adresaStanovanjaSt;
	}


	public String getKontaktTelefonSt() {
		return kontaktTelefonSt;
	}


	public void setKontaktTelefonSt(String kontaktTelefonSt) {
		this.kontaktTelefonSt = kontaktTelefonSt;
	}


	public String geteMailAdresaSt() {
		return eMailAdresaSt;
	}


	public void seteMailAdresaSt(String eMailAdresaSt) {
		this.eMailAdresaSt = eMailAdresaSt;
	}


	public int getBrIndeksa() {
		return brIndeksa;
	}


	public void setBrIndeksa(int brIndeksa) {
		this.brIndeksa = brIndeksa;
	}


	public int getGodinaUpisa() {
		return godinaUpisa;
	}


	public void setGodinaUpisa(int godinaUpisa) {
		this.godinaUpisa = godinaUpisa;
	}


	public int getGodinaStudija() {
		return godinaStudija;
	}


	public void setGodinaStudija(int godinaStudija) {
		this.godinaStudija = godinaStudija;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	public double getPrOcena() {
		return prOcena;
	}


	public void setPrOcena(double prOcena) {
		this.prOcena = prOcena;
	}


	public List<Ocena> getPolozeniIspiti() {
		return polozeniIspiti;
	}


	public void setPolozeniIspiti(List<Ocena> polozeniIspiti) {
		this.polozeniIspiti = polozeniIspiti;
	}


	public List<Predmet> getNepolozeniIspiti() {
		return nepolozeniIspiti;
	}


	public void setNepolozeniIspiti(List<Predmet> nepolozeniIspiti) {
		this.nepolozeniIspiti = nepolozeniIspiti;
	}
	
	
	

}
