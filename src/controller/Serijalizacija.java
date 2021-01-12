package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.Student;
import view.GlavniProzor;
import model.Profesor;
import model.Predmet;

/**REFERENCA: Radjeno po uzoru na https://www.geeksforgeeks.org/serialization-in-java/ */

public class Serijalizacija {

	private static Serijalizacija instance = null;
	
	private boolean uspesnoUcitano;
	
	public static Serijalizacija getInstance() {
		if(instance==null) {
			instance=new Serijalizacija();
		}
		return instance; 
	}
	
	private Serijalizacija() {
		try	{
			FileInputStream ulazniFajlStudent = new FileInputStream("studentiPodaci");
            FileInputStream ulazniFajlProfesori = new FileInputStream("profesoriPodaci");
            FileInputStream ulazniFajlPredmeti = new FileInputStream("predmetiPodaci");
            ulazniFajlStudent.close();
            ulazniFajlProfesori.close();
            ulazniFajlPredmeti.close();
            uspesnoUcitano=true;
        } 
        catch (IOException ioe) {
        	uspesnoUcitano=false;
        }
	}
	
	//@SuppressWarnings("unchecked")
	public ArrayList<Student> ucitajStudente() {
		ArrayList<Student> studenti = new ArrayList<Student>();
		try
        {
            FileInputStream ulazniFajlStudent = new FileInputStream("studentiPodaci");
            ObjectInputStream ulazniObjekat = new ObjectInputStream(ulazniFajlStudent);
 
            studenti = (ArrayList<Student>) ulazniObjekat.readObject();
 
            ulazniObjekat.close();
            ulazniFajlStudent.close();
            if(uspesnoUcitano==true) {
            	return studenti;
            }
            else {
            	return null;
            }
            
        } 
        catch (IOException ioe) 
        {
            return null;
        } 
        catch (ClassNotFoundException c) 
        {
            return null;
        }
	}
	
	//@SuppressWarnings("unchecked")
	public ArrayList<Profesor> ucitajProfesore() {
		ArrayList<Profesor> profesori = new ArrayList<Profesor>();
		try
        {
            FileInputStream ulazniFajlProfesori = new FileInputStream("profesoriPodaci");
            ObjectInputStream ulazniObjekat = new ObjectInputStream(ulazniFajlProfesori);
 
            profesori = (ArrayList<Profesor>) ulazniObjekat.readObject();
 
            ulazniObjekat.close();
            ulazniFajlProfesori.close();
            if(uspesnoUcitano==true) {
            	return profesori;
            }
            else {
            	return null;
            }
        } 
        catch (IOException ioe) 
        {
            return null;
        } 
        catch (ClassNotFoundException c) 
        {
            return null;
        }
	}
	
	//@SuppressWarnings("unchecked")
	public ArrayList<Predmet> ucitajPredmete() {
		ArrayList<Predmet> predmeti = new ArrayList<Predmet>();
		try
        {
            FileInputStream ulazniFajlPredmeti = new FileInputStream("predmetiPodaci");
            ObjectInputStream ulazniObjekat = new ObjectInputStream(ulazniFajlPredmeti);
 
            predmeti = (ArrayList<Predmet>) ulazniObjekat.readObject();
 
            ulazniObjekat.close();
            ulazniFajlPredmeti.close();
            if(uspesnoUcitano==true) {
            	return predmeti;
            }
            else {
            	return null;
            }
        } 
        catch (IOException ioe) 
        {
            return null;
        } 
        catch (ClassNotFoundException c) 
        {
            return null;
        }
	}

	public void sacuvajPodatke(List<Student> studenti,List<Profesor> profesori, List<Predmet> predmeti) {
		try	{
			
			FileOutputStream izlazniFajlStudenti = new FileOutputStream("studentiPodaci");
			ObjectOutputStream izlazniObjekatStudenti = new ObjectOutputStream(izlazniFajlStudenti);
            izlazniObjekatStudenti.writeObject(studenti);
            izlazniObjekatStudenti.close();
            izlazniFajlStudenti.close();
            
			FileOutputStream izlazniFajlProfesori = new FileOutputStream("profesoriPodaci");
			ObjectOutputStream izlazniObjekatProfesori = new ObjectOutputStream(izlazniFajlProfesori);
            izlazniObjekatProfesori.writeObject(profesori);
            izlazniObjekatProfesori.close();
            izlazniFajlProfesori.close();
            
            FileOutputStream izlazniFajlPredmeti = new FileOutputStream("predmetiPodaci");
			ObjectOutputStream izlazniObjekatPredmeti = new ObjectOutputStream(izlazniFajlPredmeti);
            izlazniObjekatPredmeti.writeObject(predmeti);
            izlazniObjekatPredmeti.close();
            izlazniFajlPredmeti.close();
        } 
        catch (IOException ioe) 
        {
        	JOptionPane.showMessageDialog(null, "Nije moguce sacuvati neke podatke!");
        	GlavniProzor.getInstance().setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
	}

	public boolean getDetektorUspesnogUcitavanja() {
		return uspesnoUcitano;
	}
	
	
}
