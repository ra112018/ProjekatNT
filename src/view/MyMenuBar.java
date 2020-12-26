package view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;


import listeners.*;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class MyMenuBar extends JMenuBar {

	private static final long serialVersionUID = 1L;

	public MyMenuBar(Integer trenutniTab) {

		JMenu file = new JMenu("File");
		file.setMnemonic(KeyEvent.VK_F);		//Zato što je stavka menija potrebno je pritisnuti alt+f na tastaturi 
		add(file);

		JMenuItem miNew = new JMenuItem("New", KeyEvent.VK_N);
		miNew.setIcon(new ImageIcon("images/new.jpg"));
		file.add(miNew);
		miNew.setMnemonic('n');
		KeyStroke ctrlNKeyStroke = KeyStroke.getKeyStroke("control N");
	    miNew.setAccelerator(ctrlNKeyStroke);

		JMenuItem miClose = new JMenuItem("Close",KeyEvent.VK_C);
		miClose.setIcon(new ImageIcon("images/x.jpg"));
		file.add(miClose);
		miClose.setMnemonic('c');
		KeyStroke ctrlCKeyStroke = KeyStroke.getKeyStroke("control C");
	    miClose.setAccelerator(ctrlCKeyStroke);
		
		JMenu edit = new JMenu("Edit");
		edit.setMnemonic('e');
		add(edit);

		JMenuItem miEdit=new JMenuItem("Edit",KeyEvent.VK_E);
		miEdit.setIcon(new ImageIcon("images/edit.jpg"));
		edit.add(miEdit);
		miEdit.setMnemonic('e');

	    KeyStroke ctrlEKeyStroke = KeyStroke.getKeyStroke("control E");
	    miEdit.setAccelerator(ctrlEKeyStroke);							//deo koda preuzet sa http://www.java2s.com/Tutorials/Java/Swing/Menu/Set_Accelerator_key_for_JMenuItem_in_Java.htm


		JMenuItem miDelete=new JMenuItem("Delete",KeyEvent.VK_D);
		miDelete.setIcon(new ImageIcon("images/deletemb.jpg"));
		edit.add(miDelete);
		miDelete.setMnemonic('d');
		KeyStroke ctrlDKeyStroke = KeyStroke.getKeyStroke("control D");
	    miDelete.setAccelerator(ctrlDKeyStroke);	
	    
		JMenu help = new JMenu("Help");
		help.setMnemonic('h');
		add(help);

		JMenuItem miHelp=new JMenuItem("Help",KeyEvent.VK_H);
		miHelp.setIcon(new ImageIcon("images/help.jpg"));
		help.add(miHelp);
		miHelp.setMnemonic('h');
		KeyStroke ctrlHKeyStroke = KeyStroke.getKeyStroke("control H");
	    miHelp.setAccelerator(ctrlHKeyStroke);	
	    miHelp.addActionListener(new HelpListener());

		JMenuItem miAbout=new JMenuItem("About",KeyEvent.VK_A);
		miAbout.setIcon(new ImageIcon("images/aboutmb.jpg"));
		help.add(miAbout);
		miAbout.setMnemonic('a');
		KeyStroke ctrlAKeyStroke = KeyStroke.getKeyStroke("control A");
	    miAbout.setAccelerator(ctrlAKeyStroke);	
	    miAbout.addActionListener(new AboutListener());


		if(trenutniTab==1) {
			miNew.addActionListener(new DodajProfesoraListener());
			miEdit.addActionListener(new IzmeniProfesoraListener());
		}else if(trenutniTab==2) {
			miDelete.addActionListener(new ObrisiPredmetListener());
		}
		else if(trenutniTab==0) {
			miNew.addActionListener(new DodajStudentaListener());
			miEdit.addActionListener(new IzmeniStudentaListener());
		}
	}

}
