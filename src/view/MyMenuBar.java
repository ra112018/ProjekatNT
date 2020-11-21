package view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import java.awt.event.KeyEvent;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;

public class MyMenuBar extends JMenuBar {

	private static final long serialVersionUID = 1L;

	public MyMenuBar() {

		JMenu file = new JMenu("File");
		file.setMnemonic('f');
		add(file);

		JMenuItem miNew = new JMenuItem("New", KeyEvent.VK_N);
		miNew.setIcon(new ImageIcon("images/new.jpg"));
		file.add(miNew);
		KeyStroke ctrlNKeyStroke = KeyStroke.getKeyStroke("control N");
	    miNew.setAccelerator(ctrlNKeyStroke);

		JMenuItem miClose = new JMenuItem("Close",KeyEvent.VK_C);
		miClose.setIcon(new ImageIcon("images/x.jpg"));
		file.add(miClose);
		KeyStroke ctrlCKeyStroke = KeyStroke.getKeyStroke("control C");
	    miClose.setAccelerator(ctrlCKeyStroke);
		
		JMenu edit = new JMenu("Edit");
		edit.setMnemonic('e');
		add(edit);

		JMenuItem miEdit=new JMenuItem("Edit",KeyEvent.VK_E);
		miEdit.setIcon(new ImageIcon("images/edit.jpg"));
		edit.add(miEdit);
	    KeyStroke ctrlEKeyStroke = KeyStroke.getKeyStroke("control E");
	    miEdit.setAccelerator(ctrlEKeyStroke);							//deo koda preuzet sa http://www.java2s.com/Tutorials/Java/Swing/Menu/Set_Accelerator_key_for_JMenuItem_in_Java.htm


		JMenuItem miDelete=new JMenuItem("Delete",KeyEvent.VK_D);
		miDelete.setIcon(new ImageIcon("images/deletemb.jpg"));
		edit.add(miDelete);
		KeyStroke ctrlDKeyStroke = KeyStroke.getKeyStroke("control D");
	    miDelete.setAccelerator(ctrlDKeyStroke);	
	    
		JMenu help = new JMenu("Help");
		help.setMnemonic('h');
		add(help);

		JMenuItem miHelp=new JMenuItem("Help",KeyEvent.VK_H);
		miHelp.setIcon(new ImageIcon("images/help.jpg"));
		help.add(miHelp);
		KeyStroke ctrlHKeyStroke = KeyStroke.getKeyStroke("control H");
	    miHelp.setAccelerator(ctrlHKeyStroke);	

		JMenuItem miAbout=new JMenuItem("About",KeyEvent.VK_A);
		miAbout.setIcon(new ImageIcon("images/aboutmb.jpg"));
		help.add(miAbout);
		KeyStroke ctrlAKeyStroke = KeyStroke.getKeyStroke("control A");
	    miAbout.setAccelerator(ctrlAKeyStroke);	


	}

}
