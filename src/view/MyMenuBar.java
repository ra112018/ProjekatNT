package view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;

public class MyMenuBar extends JMenuBar {

	private static final long serialVersionUID = -7863806568418316202L;

	public MyMenuBar() {

		JMenu file = new JMenu("File");
		file.setMnemonic('f');
		add(file);

		JMenuItem miNew = new JMenuItem("New", 'n');
		miNew.setIcon(new ImageIcon("images/new.png"));
		file.add(miNew);

		JMenuItem miClose = new JMenuItem("Close",'c');
		miClose.setIcon(new ImageIcon("images/x.png"));
		file.add(miClose);
		
		JMenu edit = new JMenu("Edit");
		edit.setMnemonic('e');
		add(edit);

		JMenuItem miEdit=new JMenuItem("Edit",'e');
		miEdit.setIcon(new ImageIcon("images/edit.png"));
		edit.add(miEdit);

		JMenuItem miDelete=new JMenuItem("Delete",'d');
		miDelete.setIcon(new ImageIcon("images/delete.png"));
		edit.add(miDelete);

		JMenu help = new JMenu("Help");
		help.setMnemonic('h');
		add(help);

		JMenuItem miHelp=new JMenuItem("Help",'h');
		miHelp.setIcon(new ImageIcon("images/help.png"));
		help.add(miHelp);

		JMenuItem miAbout=new JMenuItem("About",'a');
		miAbout.setIcon(new ImageIcon("images/about.png"));
		help.add(miAbout);


	}

}
