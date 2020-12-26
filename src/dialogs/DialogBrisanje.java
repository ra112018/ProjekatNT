package dialogs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import controller.ControllerPredmeti;
import controller.ControllerStudenti;
import view.TabPredmet;
import view.TabStudent;

public class DialogBrisanje extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final JPanel panel = new JPanel();
	
	public DialogBrisanje(final int index, final String brisemo) {
		
		getContentPane().setFocusable(false);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setModal(true);
		
		if(brisemo.equals("predmet")) {
			setTitle("Brisanje predmeta");
		}
		else if(brisemo.equals("student")) {
			setTitle("Brisanje studenta");
			JTextArea txtArea = new JTextArea();
			txtArea.setEditable(false);
			txtArea.setText("Da li ste  sigurni da zelite da obrisete ovog studenta?");
			txtArea.setFocusable(false);
			panel.add(txtArea);
		}
		
		setBounds(100,100,450,120);
		
		getContentPane().setLayout(new BorderLayout());
		panel.setBackground(Color.WHITE);
		panel.setLayout(new FlowLayout());
		panel.setBorder(new EmptyBorder(7,7,7,7));
		getContentPane().add(panel, BorderLayout.CENTER);
		
		if(brisemo.equals("predmet")) {
			
			JTextArea txtArea = new JTextArea();
			txtArea.setEditable(false);
			txtArea.setText("Da li ste  sigurni da zelite da obrisete ovaj predmet?");
			txtArea.setFocusable(false);
			panel.add(txtArea);
			
		}
		
		
		JPanel buttonsPane = new JPanel();
		buttonsPane.setBackground(Color.WHITE);
		buttonsPane.setLayout(new FlowLayout(FlowLayout.CENTER));
		getContentPane().add(buttonsPane, BorderLayout.SOUTH);
		
		JButton odustanak = new JButton("Ne");
		
		odustanak.addKeyListener(new KeyAdapter() {
			
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					dispose();
				}
			}
		});
		
		odustanak.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		
		odustanak.setActionCommand("Ne");
		buttonsPane.add(odustanak);
		getRootPane().setDefaultButton(odustanak);
		
		JButton potvrda = new JButton("Da");
		potvrda.addKeyListener(new KeyAdapter() {
			
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
				   if(brisemo.equals("predmet")) {
				      ControllerPredmeti.getInstance().obrisiPredmet(index);
				
				      TabPredmet.getInstance().azurirajPrikaz();
				      dispose();
				   }
				   else if(brisemo.equals("student")) {
					   ControllerStudenti.getInstance().obrisiStudenta(index);
					   TabStudent.getInstance().azurirajPrikaz();
					   dispose();
				   }
				}
			}
		});
		
		
		potvrda.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				if(brisemo.equals("predmet")) {
					ControllerPredmeti.getInstance().obrisiPredmet(index);
					
					TabPredmet.getInstance().azurirajPrikaz();
					dispose();
				}
				else if(brisemo.equals("student")) {
					ControllerStudenti.getInstance().obrisiStudenta(index);
					TabStudent.getInstance().azurirajPrikaz();
					dispose();
				}
			}
		});
		
		
		
		potvrda.setActionCommand("Da");
		buttonsPane.add(potvrda);
		
	}

	
}
