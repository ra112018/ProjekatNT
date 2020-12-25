package dialogs;

import javax.swing.*;

import java.awt.Color;
import java.awt.GridBagLayout;
public class DialogHelp extends JFrame{
	
		private static final long serialVersionUID = 1L;
		
		public DialogHelp() {
			super("About");
			this.setLayout(new GridBagLayout());
			setSize(600,300);
			JTextArea HelpText = new JTextArea("Za pregled tabela studenata, profesora, predmeta ili ocena, izabrati odgovarajući tab.\n "
					+ "Za dodavanje studenta, profesora, predmeta ili ocene, u odgovarajućem tabu kliknuti na plus. \n"
					+ "Za brisanje entiteta, kliknuti na kantu.");

			HelpText.setFont(new java.awt.Font("Times New Roman", 5, 15));
			HelpText.setSize(600,500);
	        HelpText.setLineWrap(true);
			HelpText.setVisible(true);
			this.add(HelpText);
			HelpText.setEditable(false);
			HelpText.setOpaque(true);
			getContentPane().setBackground(Color.WHITE);  
			HelpText.setBorder(BorderFactory.createEmptyBorder());
	        this.setBackground(Color.WHITE);

	}
}
