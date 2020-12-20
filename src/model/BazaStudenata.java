package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Student.Status;


/**REFERENCA: Rađeno po uzoru na vezbe, JTableMVCSimple, JTableMVCAdvanced, koleginicinu bazu */

public class BazaStudenata {
public static BazaStudenata instance = null;
	
	public static BazaStudenata getInstance() {
		if(instance==null) {
			instance=new BazaStudenata();
		}
		return instance;
	}
	
	
	private List<Student> studenti;
	private List<String> kolone;
	
	private BazaStudenata() {

		initStudenti();
		this.kolone = new ArrayList<String>();
		this.kolone.add("Indeks studenta");
		this.kolone.add("Ime");
		this.kolone.add("Prezime");
		this.kolone.add("Godina studija");
		this.kolone.add("Status");
		this.kolone.add("Prosek");

	}

	
	private void initStudenti() {
		this.studenti = new ArrayList<Student>();
		studenti.add(new Student(1,"Perić", "Pera", 1, "B", 8.16));
		studenti.add(new Student(2,"Marković", "Marko", 4, "S" , 7.17));

	}
	
	
	public List<Student> getStudent() {
		return studenti;
	}

	public void setStudent(List<Student> studenti) {
		this.studenti = studenti;
	}
	
	public int getColumnCount() {
		return kolone.size();
	}

	public String getColumnName(int index) {
		return this.kolone.get(index);
	}

	public Student getRow(int rowIndex) {
		return this.studenti.get(rowIndex);
	}

	public String getValueAt(int row, int column) {
		Student studenti = this.studenti.get(row);
		switch (column) {

		case 0:
			return String.valueOf(studenti.getBrIndeksa());	
		case 1:
			return studenti.getPrezimeSt();
		case 2:
			return studenti.getImeSt();	
		case 3:
			return String.valueOf(studenti.getGodinaStudija());
		case 4:
			return String.valueOf(studenti.getStatus());
		case 5:
			return String.valueOf(studenti.getPrOcena());


	    default:
	    	return null;
		}
	
	}

	public void dodajStudenta(String prezimeSt, String imeSt, Date datumRodjenjaSt, String adresaStanovanjaSt,
			String kontaktTelefonSt, String eMailAdresaSt, int brIndeksa, int godinaUpisa, int godinaStudija,
			String string, double prOcena, List<Ocena> polozeniIspiti, List<Predmet> nepolozeniIspiti)  {
		
		this.studenti.add(new Student( prezimeSt,  imeSt,  datumRodjenjaSt,  adresaStanovanjaSt,
				kontaktTelefonSt, eMailAdresaSt, brIndeksa, godinaUpisa,  godinaStudija, string,
				prOcena, polozeniIspiti, nepolozeniIspiti) );
	}
	
	public void izmeniStudenta(int row,String prezimeSt, String imeSt, Date datumRodjenjaSt, String adresaStanovanjaSt,
			String kontaktTelefonSt, String eMailAdresaSt, int brIndeksa, int godinaUpisa, int godinaStudija,
			String string, double prOcena, List<Ocena> polozeniIspiti, List<Predmet> nepolozeniIspiti)  {
		
		Student student = BazaStudenata.getInstance().getRow(row);
		
		student.setImeSt(imeSt);
		student.setPrezimeSt(prezimeSt);
		student.setDatumRodjenjaSt(datumRodjenjaSt);
		student.setAdresaStanovanjaSt(adresaStanovanjaSt);
		student.setKontaktTelefonSt(kontaktTelefonSt);
		student.seteMailAdresaSt(eMailAdresaSt);
		student.setBrIndeksa(brIndeksa);
		student.setGodinaUpisa(godinaUpisa);
		student.setGodinaStudija(godinaStudija);
		student.setStatus(Status.valueOf(string));
		student.setPrOcena(prOcena);
		student.setPolozeniIspiti(polozeniIspiti);
		student.setNepolozeniIspiti(nepolozeniIspiti);
	}
	
	
}
