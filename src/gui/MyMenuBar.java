package gui;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/*
 * klasa nasleđuje JMenuBar i predstavlja kontejner
 * za komponente JMenu. Instanca ove klase će se 
 * smeštati u glavni prozor aplikacije
 * 
 */
public class MyMenuBar extends JMenuBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7863806568418316202L;

	public MyMenuBar() {

		JMenu file = new JMenu("File");
		JMenuItem miNew = new JMenuItem("New");

		JMenuItem miClose = new JMenuItem("Close");

		file.add(miNew);
		file.add(miClose);


		JMenu edit = new JMenu("Edit");
		JMenuItem miEdit=new JMenuItem("Edit");
		JMenuItem miDelete=new JMenuItem("Delete");
		JMenu help = new JMenu("Help");
		JMenuItem miHelp=new JMenuItem("Help");
		JMenuItem miAbout=new JMenuItem("About");
		add(file);
		add(edit);
		add(help);
		
		edit.add(miEdit);
		edit.add(miDelete);
		help.add(miHelp);
		help.add(miAbout);

	}

}
