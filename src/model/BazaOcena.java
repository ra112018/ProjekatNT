package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.time.*; 
import java.time.temporal.*; 

public class BazaOcena {

		public static BazaOcena instance = null;
		
		public static BazaOcena getInstance() {
			if(instance==null) {
				instance=new BazaOcena();
			}
			return instance;
		}
		
		
		private List<Ocena> ocene;
		private List<String> kolone;
		
		private BazaOcena() {

		
			initOcene();

			this.kolone = new ArrayList<String>();
			this.kolone.add("Student");
			this.kolone.add("Predmet");
			this.kolone.add("Ocena");
			this.kolone.add("Datum");

		}
		
		private void initOcene() {
			this.ocene = new ArrayList<Ocena>();
			ocene.add(new Ocena("Milica", "Milić", "OISISI", 7, LocalDate.of(2020,12,1)));
			ocene.add(new Ocena("Dušan", "Dušković", "NANS", 8, LocalDate.of(2019,4,4)));

		}
		
		public List<Ocena> getOcena() {
			return ocene;
		}

		public void setOcena(List<Ocena> ocene) {
			this.ocene = ocene;
		}

		public int getColumnCount() {
			return kolone.size();
		}

		public String getColumnName(int index) {
			return this.kolone.get(index);
		}

		public Ocena getRow(int rowIndex) {
			return this.ocene.get(rowIndex);
		}
		
		public String getValueAt(int row, int column) {
			Ocena ocena = this.ocene.get(row);
			switch (column) {
			case 0:
				return (ocena.getStudent()).getImeSt() +" "+ (ocena.getStudent()).getPrezimeSt();
			case 1:
				return ocena.getPredmet();
			case 2:
				return String.valueOf(ocena.getOcena());
			case 3:
				return String.valueOf(ocena.getDate());
			default:
				return null;
			}
		}

		public void dodajOcenu(String imeSt, String prezst,String nazivPredmeta, int ocena, LocalDate datum) {
			
			this.ocene.add(new Ocena(imeSt, prezst,nazivPredmeta, ocena, datum));
		}
		
		public void izmeniOcenu(int row, String imeSt, String prezst,String nazivPredmeta, int ocena, LocalDate datum) {
			
			Ocena ocena1 = BazaOcena.getInstance().getRow(row);
			
			ocena1.setStudent(imeSt,prezst);
			ocena1.setPredmet(nazivPredmeta);
			ocena1.setOcena(ocena);
			ocena1.setDate(datum);
		}
	

}