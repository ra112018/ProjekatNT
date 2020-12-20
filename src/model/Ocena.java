package model;

import java.util.Date;
import java.time.*; 
import java.time.temporal.*; 

public class Ocena {
	private Student student;
	private String predmet;
	private int ocena;
	private LocalDate date;
	
	public Ocena(Student student, String predmet, int ocena, LocalDate date) {
		super();
		this.student = student;
		this.predmet = predmet;
		this.ocena = ocena;
		this.date = date;
	}
	public Ocena(String imest, String prezst,String nazivPredmeta,int ocena,LocalDate date) {
		super();
		this.student= new Student(imest,prezst);
		this.predmet=nazivPredmeta;
		this.ocena=ocena;
		this.date=date;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	public void setStudent(String imeSt,String prezSt) {
		this.student = new Student(imeSt,prezSt);
	}

	public String getPredmet() {
		return predmet;
	}

	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	

}
