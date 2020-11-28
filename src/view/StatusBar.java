package view;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.Color;
import javax.swing.BorderFactory;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class StatusBar extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	JLabel naziv;
    JLabel vreme;
    
    
	
    public StatusBar() {
    	
    	GridBagConstraints gbc = new GridBagConstraints();  
    	
    	GridBagLayout grid=new GridBagLayout();		/* https://docs.oracle.com/javase/tutorial/uiswing/layout/gridbag.html*/
    	this.setOpaque(true);
        this.setBackground(Color.WHITE);
        this.setLayout(grid) ;
        this.setBorder(BorderFactory.createLineBorder(Color.black)); /*https://docs.oracle.com/javase/8/docs/api/javax/swing/BorderFactory.html*/
        //this.set
        naziv = new JLabel(" Studentska služba");
        naziv.setFont(new Font("Calibri", Font.PLAIN, 14));
        this.add(naziv,gbc);       
        
        vreme = new JLabel();
        
        LocalDateTime myDateObj = LocalDateTime.now();   
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm   dd.MM.yyyy.");  
        
        String formattedDate = myDateObj.format(myFormatObj);  
        
        vreme.setText(formattedDate);
        vreme.setFont(new Font("Calibri", Font.PLAIN, 14));
        gbc.weightx=1.0;
        gbc.anchor=GridBagConstraints.EAST;
        this.add(vreme,gbc);
        
    }
		
    

}