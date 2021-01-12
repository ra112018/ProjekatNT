package model;

import java.util.List;
import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable{

	private String brIndeksa;
	private String prezimeSt;
	private String imeSt;
	private Date datumRodjenjaSt;
	private String adresaStanovanjaSt;
	private String kontaktTelefonSt;
	private String eMailAdresaSt;
	private String godinaUpisa;
	private String godinaStudija;
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
	
	
	
	public Student(String prezimeSt, String imeSt, String brIndeksa) {
		super();
		this.prezimeSt = prezimeSt;
		this.imeSt = imeSt;
		this.brIndeksa = brIndeksa;
	}


	public Student(String imeSt, String prezimeSt, String brIndeksa, String godinaStudija, String string, double prOcena) {
		super();
		this.prezimeSt = prezimeSt;
		this.imeSt = imeSt;
		this.brIndeksa = brIndeksa;
		this.godinaStudija = godinaStudija;
		
		this.status = extracted(string);
		this.prOcena = prOcena;
	}


	private Status extracted(String string) {
		Status status;
		if(string=="B") {
			status=Status.B;
		}
		else  {
			status= Status.S;
		}
		return status;
		
	}




	public Student(String prezimeSt,String imeSt) {
		super();
		this.prezimeSt=prezimeSt;
		this.imeSt=imeSt;
	}


	public Student(String indeks, String ime, String prz, Date datumRodjenja,String adresa, String telefon,
			String email, String godStudija, String status, String godUpisa) {
		// TODO Auto-generated constructor stub
		super();
		this.prezimeSt = prz;
		this.imeSt = ime;
		this.datumRodjenjaSt = datumRodjenja;
		this.adresaStanovanjaSt = adresa;
		this.kontaktTelefonSt = telefon;
		this.eMailAdresaSt = email;
		this.brIndeksa = indeks;
		this.godinaUpisa = godUpisa;
		this.status = extracted(status);
		this.godinaStudija = godStudija;
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


	public String getBrIndeksa() {
		return brIndeksa;
	}


	public void setBrIndeksa(String brIndeksa) {
		this.brIndeksa = brIndeksa;
	}


	public String getGodinaUpisa() {
		return godinaUpisa;
	}


	public void setGodinaUpisa(String godinaUpisa) {
		this.godinaUpisa = godinaUpisa;
	}


	public String getGodinaStudija() {
		return godinaStudija;
	}


	public void setGodinaStudija(String godinaStudija) {
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
