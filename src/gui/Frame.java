package gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.*;

public class Frame extends JFrame {

	
	private static final long serialVersionUID = 3084952518416882189L;

	public Frame() {

		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		setSize(screenWidth /4*3, screenHeight /4*3);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setBackground(new java.awt.Color(250, 250, 250));

		MyMenuBar menu = new MyMenuBar();
		this.setJMenuBar(menu);
		StatusBar statusBar = new StatusBar();
		getContentPane().add(statusBar, java.awt.BorderLayout.SOUTH);
		

	}

}
