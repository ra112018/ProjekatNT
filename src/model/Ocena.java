package model;

import java.util.Date;
import java.util.*; 

public class Ocena {
	private Student student;
	private Predmet predmet;
	private int ocena;
	private Date date;
	
	public Ocena(Student student, Predmet predmet, int ocena, Date date) {
		super();
		this.student = student;
		this.predmet = predmet;
		this.ocena = ocena;
		this.date = date;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Predmet getPredmet() {
		return predmet;
	}

	public void setPredmet(Predmet predmet) {
		this.predmet = predmet;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	

}
