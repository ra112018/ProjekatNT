package view;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Calendar;
import java.util.GregorianCalendar;
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
    	
    	GridBagLayout grid=new GridBagLayout();		/**REFERENCA: ...  https://docs.oracle.com/javase/tutorial/uiswing/layout/gridbag.html*/
    	this.setOpaque(true);
        this.setBackground(Color.WHITE);
        this.setLayout(grid) ;
        this.setBorder(BorderFactory.createLineBorder(Color.black)); /**REFERENCA: ... https://docs.oracle.com/javase/8/docs/api/javax/swing/BorderFactory.html*/
        //this.set
        naziv = new JLabel(" Studentska služba");
        naziv.setFont(new Font("Calibri", Font.PLAIN, 14));
        this.add(naziv,gbc);       
        
        vreme = new JLabel();
        clock();
         
        
        vreme.setFont(new Font("Calibri", Font.PLAIN, 14));
        gbc.weightx=1.0;
        gbc.anchor=GridBagConstraints.EAST;
        this.add(vreme,gbc);
        
        
        }
    public void clock() {
    	Thread clock=new Thread() {
    		public void run() {
    			try {						 /**REFERENCA: ... https://www.youtube.com/watch?v=tpQAslXjNKU*/
    				while(true) {
    					Calendar cal=new GregorianCalendar();
    					int day=cal.get(Calendar.DAY_OF_MONTH);
    					int month=cal.get(Calendar.MONTH);
    					int year=cal.get(Calendar.YEAR);
    					int minute=cal.get(Calendar.MINUTE);
    					int hour=cal.get(Calendar.HOUR);
    					vreme.setText(hour+":"+minute+"     "+day+"."+month+"."+year+". ");
    					sleep(1000);
    				}
    			}
    			catch(InterruptedException e) {
    				e.printStackTrace();
    			}
    		}
    	};
    	clock.start();
        
    }
		
    

}