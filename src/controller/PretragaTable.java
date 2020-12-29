package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

import view.AbstractTableModelPredmeti;
import view.AbstractTableModelProfesor;
import view.AbstractTableModelStudent;
import view.GlavniProzor;

public class PretragaTable {

	private TableRowSorter<AbstractTableModelProfesor> rowSorterProfesor;
	private TableRowSorter<AbstractTableModelStudent> rowSorterStudent;
	private TableRowSorter<AbstractTableModelPredmeti> rowSorterPredmeti;

	private JTable tabelaPretrage;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public PretragaTable(JTable tabela, Integer kojaTabela) {
		this.tabelaPretrage = tabela;
		if(kojaTabela == 1) {
			rowSorterProfesor = new TableRowSorter(tabelaPretrage.getModel());
		}
		else if (kojaTabela == 0) {
			rowSorterStudent =new TableRowSorter(tabelaPretrage.getModel());
		}else if(kojaTabela == 2) {
			rowSorterPredmeti = new TableRowSorter(tabelaPretrage.getModel());
		}
	}
	

	private Map<Integer,String> izdvoj(String tipPretr, String tekstPretrage){
		Map<Integer,String>  map = new HashMap<Integer,String> ();
		
		if(tipPretr.equals("profesor")) {
			String[] splitTackaZ = tekstPretrage.split(";");
			String[] splitDvotacka = null;
			for(int i = 0; i < splitTackaZ.length; i++) {
				splitDvotacka = splitTackaZ[i].split(":");
				if(splitDvotacka.length==2) {
					if(splitDvotacka[1].trim().equals("")) {
						map.clear();
						return map;
					}
					if(splitDvotacka[0].toLowerCase().trim().equals("ime")) {
						map.put(0, splitDvotacka[1].trim());
					}else if(splitDvotacka[0].toLowerCase().trim().equals("prezime")) {
						map.put(1, splitDvotacka[1].trim());
					}
				}else {
					if(splitDvotacka[0].trim().equals("") == false) {
						map.clear();
						return map;
					}
				}
			}
			return map;
		} else if(tipPretr.equals("predmet")) {
			String[] splitTackaZ = tekstPretrage.split(";");
			String[] splitDvotacka = null;
			for(int i = 0; i < splitTackaZ.length; i++) {
				splitDvotacka = splitTackaZ[i].split(":");
				if(splitDvotacka.length==2) {
					if(splitDvotacka[1].trim().equals("")) {
						map.clear();
						return map;
					}
					if(splitDvotacka[0].toLowerCase().trim().equals("sifra predmeta")) {
						map.put(0, splitDvotacka[1].trim());
				}else {
					if(splitDvotacka[0].trim().equals("") == false) {
						map.clear();
						return map;
					}
				}
			}
				
		}
			return map;
		}
			
			else	return null;
		}
	
	
	public void pretragaProfesora(String tekstPretrage) {
		Map<Integer,String>  map = izdvoj("profesor", tekstPretrage);
		
		if(map.isEmpty() == false) {
			tabelaPretrage.setRowSorter(rowSorterProfesor);
			List<RowFilter<Object,Object>> filteri = new ArrayList<RowFilter<Object,Object>>(map.size());
			
			for(Entry<Integer,String> e : map.entrySet()) {
				filteri.add(RowFilter.regexFilter("(?i)" + e.getValue(), e.getKey()));
				
			}
			
			RowFilter<Object,Object> servisFilter = RowFilter.andFilter(filteri);
			rowSorterProfesor.setRowFilter(servisFilter);
		}else {
			JOptionPane.showMessageDialog(GlavniProzor.getInstance(), "Kriterijum za pretragu nije dobro unesen!");
		}
	}
	
	
	public void pretragaPredmeta(String tekstPretrage) {
		Map<Integer,String>  map = izdvoj("predmet", tekstPretrage);
		
		if(map.isEmpty() == false) {
			tabelaPretrage.setRowSorter(rowSorterPredmeti);
			List<RowFilter<Object,Object>> filteri = new ArrayList<RowFilter<Object,Object>>(map.size());
			
			for(Entry<Integer,String> e : map.entrySet()) {
				filteri.add(RowFilter.regexFilter("(?i)" + e.getValue(), e.getKey()));
				
			}
			
			RowFilter<Object,Object> servisFilter = RowFilter.andFilter(filteri);
			rowSorterProfesor.setRowFilter(servisFilter);
		}else {
			JOptionPane.showMessageDialog(GlavniProzor.getInstance(), "Kriterijum za pretragu nije dobro unesen!");
		}
	}
	
	public void osProfesori(String tekstPretrage) {
		tabelaPretrage.setRowSorter(rowSorterProfesor);
		
		if(tekstPretrage.trim().length() == 0) {
			rowSorterProfesor.setRowFilter(null);
		}else {
			rowSorterProfesor.setRowFilter(RowFilter.regexFilter("(?i)" + tekstPretrage));
		}
	}
	
	public void pretragaStudenata(String tekstPretrage) {
		Map<Integer,String>  map = izdvoj("student", tekstPretrage);
		
		if(map.isEmpty() == false) {
			tabelaPretrage.setRowSorter(rowSorterStudent);
			List<RowFilter<Object,Object>> filteri = new ArrayList<RowFilter<Object,Object>>(map.size());
			
			for(Entry<Integer,String> e : map.entrySet()) {
				filteri.add(RowFilter.regexFilter("(?i)" + e.getValue(), e.getKey()));
				
			}
			
			RowFilter<Object,Object> servisFilter = RowFilter.andFilter(filteri);
			rowSorterStudent.setRowFilter(servisFilter);
		}else {
			JOptionPane.showMessageDialog(GlavniProzor.getInstance(), "Kriterijum za pretragu nije dobro unesen!");
		}
	}
	
	public void osStudenti(String tekstPretrage) {
		tabelaPretrage.setRowSorter(rowSorterStudent);
		
		if(tekstPretrage.trim().length() == 0) {
			rowSorterStudent.setRowFilter(null);
		}else {
			rowSorterStudent.setRowFilter(RowFilter.regexFilter("(?i)" + tekstPretrage));
		}
	}
}
