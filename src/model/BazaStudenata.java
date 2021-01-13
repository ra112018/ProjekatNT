package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.JTable;

import controller.Serijalizacija;
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
		//this.studenti = new ArrayList<Student>();
		this.studenti = Serijalizacija.getInstance().ucitajStudente();
		
		if(studenti == null) {

			this.studenti = new ArrayList<Student>();
			
		studenti.add(new Student("Marko", "Milosević", "RA 2/2020", "prva", "B", 0));
		studenti.add(new Student("Marija", "Milić", "RA 3/2019", "druga", "S", 10.00));
		studenti.add(new Student("Nikola", "Nikolić", "RA 3/2017", "prva", "B", 9.00));
		studenti.add(new Student("Pera","Peric","RA 134/2015","treća","S",0));
		studenti.add(new Student("Sofija","Ilic","RA 5/2015","treća","B",0));
		studenti.add(new Student("Martina","Lukic","RA 8/2018","treća","S",0));
		studenti.add(new Student("Stojan","Stojakovic","RA 10/2017","prva","B",0));
		studenti.add(new Student("Milan","Milanovic","RA 12/2017","druga","S",0));
		studenti.add(new Student("Miroslav","Milic","RA 16/2019","druga","B",0));
		studenti.add(new Student("Stefan","Gojic","RA 21/2015","treća","S",0));
		studenti.add(new Student("Anastasija","Jokic","RA 9/2020","treća","B",0));
		studenti.add(new Student("Bogdan","Bogdanovic","RA 4/2017","treća","S",0));
		studenti.add(new Student("Ana","Dabovic","RA 30/2019","prva","B",0));
		studenti.add(new Student("Mika","Mikic","RA 1/2020","prva","S",0));
		studenti.add(new Student("Jovan","Deretic","RA 11/2018","četvrta","B",9.50));
		studenti.add(new Student("Nikola","Miskovic","RA 12/2018","četvrta","S",9.00));
		studenti.add(new Student("Martin","Stojanovic","RA 13/2018","četvrta","S",0));
		studenti.add(new Student("Tomislav","Novakovic","RA 14/2018","četvrta","B",0));
		studenti.add(new Student("Lena","Ivic","RA 154/2016","četvrta","B",0));
		studenti.add(new Student("Jovan","Lazic","RA 23/2020","prva","B",0));
		studenti.add(new Student("Isidora","Mikic","RA 1/2019","druga","B",0));
		studenti.add(new Student("Vladimir","Ilic","SW 4/2014","četvrta","B",0));
		studenti.add(new Student("Mirko","Alicic","SW 17/2015","četvrta","S",0));
		studenti.add(new Student("Milisav","Perkovic","SW 17/2016","četvrta","S",0));
		studenti.add(new Student("Purisa","Djordjevic","SW 27/2018","druga","B",0));
		studenti.add(new Student("Mikica","Kovacevic","RA 226/2017","treća","S",0));
		studenti.add(new Student("Miloš","Milić","SW 12/2020","prva","S",0));


		}
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
			return studenti.getBrIndeksa();	
		case 1:
			return studenti.getImeSt();
		case 2:
			return studenti.getPrezimeSt();	
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

	public void izmeniStudenta(int row,String prezimeSt, String imeSt, Date datumRodjenjaSt, String adresaStanovanjaSt,
			String kontaktTelefonSt, String eMailAdresaSt, String brIndeksa, String godinaUpisa, String godinaStudija,
			String string, double prOcena, List<Ocena> polozeniIspiti, List<Predmet> nepolozeniIspiti)  {
		
		Student student = BazaStudenata.getInstance().getRow(row);
		
		student.setBrIndeksa(brIndeksa);
		student.setImeSt(imeSt);
		student.setPrezimeSt(prezimeSt);
		student.setDatumRodjenjaSt(datumRodjenjaSt);
		student.setAdresaStanovanjaSt(adresaStanovanjaSt);
		student.setKontaktTelefonSt(kontaktTelefonSt);
		student.seteMailAdresaSt(eMailAdresaSt);
		student.setGodinaUpisa(godinaUpisa);
		student.setGodinaStudija(godinaStudija);
		student.setStatus(Status.valueOf(string));
		student.setPrOcena(prOcena);
		student.setPolozeniIspiti(polozeniIspiti);
		student.setNepolozeniIspiti(nepolozeniIspiti);
	}

	public void izmeniStudenta(int row, String indeks,String imeSt, String przSt, Date datumRodjenjaSt, String adresaStanovanjaSt,
			String kontaktTelefonSt, String eMailAdresaSt, String godStudija, String status, String godUpisa) {
		// TODO Auto-generated method stub
		
		Student student = BazaStudenata.getInstance().getRow(row);
		student.setBrIndeksa(indeks);
		student.setImeSt(imeSt);
		student.setPrezimeSt(przSt);
		student.setDatumRodjenjaSt(datumRodjenjaSt);
		student.setAdresaStanovanjaSt(adresaStanovanjaSt);
		student.setKontaktTelefonSt(kontaktTelefonSt);
		student.seteMailAdresaSt(eMailAdresaSt);
		student.setGodinaUpisa(godUpisa);
		student.setGodinaStudija(godStudija);
		student.setStatus(Status.valueOf(status));
	}


	public void dodajStudenta(String indeks, String ime,  String prz,Date datumRodjenja, String adresa, String telefon,
			String email, String godStudija, String status, String godUpisa) {
		// TODO Auto-generated method stub
		this.studenti.add(new Student( indeks,  ime,  prz,  datumRodjenja,
				adresa, telefon ,  email, godStudija,
				status,godUpisa) );
		
	}
	public void obrisiStudenta(Student student) {
		
		
		Iterator<Student> iter = this.studenti.listIterator();
		
		while(iter.hasNext()) {
			Student s = iter.next();
			if(s == student) {
				iter.remove();
			}
		}
		
	}
	
	
}
