package model;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
	
	
	private String prezimeProf;
	private String imeProf;
	private String datumRodjenjaProf;
	private String adresaStanovanjaProf;
	private String kontaktTelefonProf;
	private String eMailAdresaProf;
	private String adresaKancelarijeProf;
	private String brojLicneKarteProf;
	private String titulaProf;
	private String zvanjeProf; 
	private List<Predmet> predmetiProf = null;
	
	public Profesor (String prezimeProf, String imeProf, String datumRodjenjaProf, String adresaStanovanjaProf,
			String kontaktTelefonProf, String eMailAdresaProf, String adresaKancelarijeProf, String brojLicneKarteProf,
			String titulaProf, String zvanjeProf, List<Predmet> predmetiProf) {
		
		super();
		
		this.prezimeProf = prezimeProf;
		this.imeProf = imeProf;
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
	
	
	public Profesor (String prezimeProf, String imeProf, String datumRodjenjaProf, String adresaStanovanjaProf,
			String kontaktTelefonProf, String eMailAdresaProf, String adresaKancelarijeProf, String brojLicneKarteProf,
			String titulaProf, String zvanjeProf) {
		
		super();
		
		this.prezimeProf = prezimeProf;
		this.imeProf = imeProf;
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

	public String getDatumRodjenjaProf() {
		return datumRodjenjaProf;
	}

	public void setDatumRodjenjaProf(String datumRodjenjaProf) {
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

	public String getBrojLicneKarteProf() {
		return brojLicneKarteProf;
	}

	public void setBrojLicneKarteProf(String brojLicneKarteProf) {
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
