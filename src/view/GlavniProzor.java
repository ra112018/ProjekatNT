package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;




public class GlavniProzor extends JFrame{
		

	public GlavniProzor() {
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		setSize(screenWidth *3/4, screenHeight *3/4);
		setTitle("Studentska služba");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		MyMenuBar menu = new MyMenuBar();
		this.setJMenuBar(menu);
		
		ToolBar toolbar = new ToolBar();
		add(toolbar, BorderLayout.NORTH);
		
		StatusBar statusBar = new StatusBar();
		getContentPane().add(statusBar,BorderLayout.SOUTH);
	}
}
