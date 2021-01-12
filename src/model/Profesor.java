package model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Profesor implements Serializable{
	
	
	private String prezimeProf;
	private String imeProf;
	private Date datumRodjenjaProf;
	private String adresaStanovanjaProf;
	private String kontaktTelefonProf;
	private String eMailAdresaProf;
	private String adresaKancelarijeProf;
	private Integer brojLicneKarteProf;
	private String titulaProf;
	private String zvanjeProf; 
	private List<Predmet> predmetiProf = null;
	
	public Profesor (String imeProf, String prezimeProf, String titulaProf, String zvanjeProf) {
		
		super();
		
		this.imeProf = imeProf;
		this.prezimeProf = prezimeProf;
		this.titulaProf = titulaProf;
		this.zvanjeProf = zvanjeProf;

	}
	
	public Profesor (String imeProf, String prezimeProf, Date datumRodjenjaProf, String adresaStanovanjaProf,
			String kontaktTelefonProf, String eMailAdresaProf, String adresaKancelarijeProf, Integer brojLicneKarteProf,
			String titulaProf, String zvanjeProf, List<Predmet> predmetiProf) {
		
		super();
		
		this.imeProf = imeProf;
		this.prezimeProf = prezimeProf;
		this.datumRodjenjaProf = datumRodjenjaProf;
		this.adresaStanovanjaProf = adresaStanovanjaProf;
		this.kontaktTelefonProf = kontaktTelefonProf;
		this.eMailAdresaProf = eMailAdresaProf;
		this.adresaKancelarijeProf = adresaKancelarijeProf;
		this.brojLicneKarteProf = brojLicneKarteProf;
		this.titulaProf = titulaProf;
		this.zvanjeProf = zvanjeProf;
		this.predmetiProf = predmetiProf;
	}
	
	
	public Profesor (String imeProf, String prezimeProf, Date datumRodjenjaProf, String adresaStanovanjaProf,
			String kontaktTelefonProf, String eMailAdresaProf, String adresaKancelarijeProf, Integer brojLicneKarteProf,
			String titulaProf, String zvanjeProf) {
		
		super();
		
		this.imeProf = imeProf;
		this.prezimeProf = prezimeProf;
		this.datumRodjenjaProf = datumRodjenjaProf;
		this.adresaStanovanjaProf = adresaStanovanjaProf;
		this.kontaktTelefonProf = kontaktTelefonProf;
		this.eMailAdresaProf = eMailAdresaProf;
		this.adresaKancelarijeProf = adresaKancelarijeProf;
		this.brojLicneKarteProf = brojLicneKarteProf;
		this.titulaProf = titulaProf;
		this.zvanjeProf = zvanjeProf;
		predmetiProf = new ArrayList<Predmet>();
	}

	public String getPrezimeProf() {
		return prezimeProf;
	}

	public void setPrezimeProf(String prezimeProf) {
		this.prezimeProf = prezimeProf;
	}

	public String getImeProf() {
		return imeProf;
	}

	public void setImeProf(String imeProf) {
		this.imeProf = imeProf;
	}

	public Date getDatumRodjenjaProf() {
		return datumRodjenjaProf;
	}

	public void setDatumRodjenjaProf(Date datumRodjenjaProf) {
		this.datumRodjenjaProf = datumRodjenjaProf;
	}

	public String getAdresaStanovanjaProf() {
		return adresaStanovanjaProf;
	}

	public void setAdresaStanovanjaProf(String adresaStanovanjaProf) {
		this.adresaStanovanjaProf = adresaStanovanjaProf;
	}

	public String getKontaktTelefonProf() {
		return kontaktTelefonProf;
	}

	public void setKontaktTelefonProf(String kontaktTelefonProf) {
		this.kontaktTelefonProf = kontaktTelefonProf;
	}

	public String geteMailAdresaProf() {
		return eMailAdresaProf;
	}

	public void seteMailAdresaProf(String eMailAdresaProf) {
		this.eMailAdresaProf = eMailAdresaProf;
	}

	public String getAdresaKancelarijeProf() {
		return adresaKancelarijeProf;
	}

	public void setAdresaKancelarijeProf(String adresaKancelarijeProf) {
		this.adresaKancelarijeProf = adresaKancelarijeProf;
	}

	public Integer getBrojLicneKarteProf() {
		return brojLicneKarteProf;
	}

	public void setBrojLicneKarteProf(Integer brojLicneKarteProf) {
		this.brojLicneKarteProf = brojLicneKarteProf;
	}

	public String getTitulaProf() {
		return titulaProf;
	}

	public void setTitulaProf(String titulaProf) {
		this.titulaProf = titulaProf;
	}

	public String getZvanjeProf() {
		return zvanjeProf;
	}

	public void setZvanjeProf(String zvanjeProf) {
		this.zvanjeProf = zvanjeProf;
	}

	public List<Predmet> getPredmeti() {
		return predmetiProf;
	}

	public void setPredmeti(List<Predmet> predmetiProf) {
		this.predmetiProf = predmetiProf;
	}
	
	
}