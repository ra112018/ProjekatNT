package dialogs;

import javax.swing.*;

import java.awt.Color;
import java.awt.GridBagLayout;
public class DialogAbout extends JFrame{
	
		private static final long serialVersionUID = 1L;
		
		public DialogAbout() {
			super("About");
			this.setLayout(new GridBagLayout());
			setSize(500,300);
			JTextArea AboutText = new JTextArea("Aplikacija rađena na Eclipse 2020-09.\n\n "
					+ "Studentska služba u kojoj je moguće upravljati podacima studenata , \nnjihovih ocena, "
					+ "kao i podacima o zaposlenima na fakultetu. \n\n"
					+ "Aplikaciju radile: \n\n"
					+ "1) Nataša Vasić RA10/2018, redovni student Fakulteta tehničkih nauka.\r\n "
					+ "Rođena 07.05.1999. u Novom Sadu. Osnovnu školu Đorđe Natošević \ni Gimnaziju Jovan Jovanović Zmaj "
					+ "završila kao nosilac Vukove diplome.\n\n "
					+ "2) Tatjana Dukovski RA11/2018, student Fakulteta tehničkih nauka. Završila Gimnaziju Jovan Jovanović "
					+ "Zmaj, posle čega upisuje Fakultet \ntehničkih nauka, smer Računarstvo i automatika.\n");

			AboutText.setFont(new java.awt.Font("Times New Roman", 5, 15));
			AboutText.setSize(500,300);
	        AboutText.setLineWrap(true);
			AboutText.setVisible(true);
			this.add(AboutText);
			AboutText.setEditable(false);
			AboutText.setOpaque(true);
			getContentPane().setBackground(Color.WHITE);  
			AboutText.setBorder(BorderFactory.createEmptyBorder());
	        this.setBackground(Color.WHITE);

	}
}
