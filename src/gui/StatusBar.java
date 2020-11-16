package gui;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.JComponent;
public class StatusBar extends JPanel {

		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenWidth = screenSize.width;
        protected JPanel leftPanel;
        protected JPanel rightPanel;

        public StatusBar() {
            createPartControl();
        }

        protected void createPartControl() {    
            setLayout(new BorderLayout());
            super.setPreferredSize(new Dimension(screenWidth /4*3, 30));

            leftPanel = new JPanel(new FlowLayout(FlowLayout.LEADING, 5, 3));
            leftPanel.setOpaque(false);
            add(leftPanel, BorderLayout.WEST);

            rightPanel = new JPanel(new FlowLayout(FlowLayout.TRAILING, 5, 3));
            rightPanel.setOpaque(false);
            add(rightPanel, BorderLayout.EAST);
        }
        public void setLeftComponent(JComponent component) {
            leftPanel.add(component);
    }
        public void addRightComponent(JComponent component) {
            JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEADING, 5, 0));
            panel.add(component);
            rightPanel.add(panel);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            int y = 0;
            g.setColor(new Color(156, 154, 140));
            g.drawLine(0, y, getWidth(), y);
            y++;

            g.setColor(new Color(196, 194, 183));
            g.drawLine(0, y, getWidth(), y);
            y++;

            g.setColor(new Color(218, 215, 201));
            g.drawLine(0, y, getWidth(), y);
            y++;

            g.setColor(new Color(233, 231, 217));
            g.drawLine(0, y, getWidth(), y);

            y = getHeight() - 3;
            g.setColor(new Color(233, 232, 218));
            g.drawLine(0, y, getWidth(), y);
            y++;

            g.setColor(new Color(233, 231, 216));
            g.drawLine(0, y, getWidth(), y);
            y++;

            g.setColor(new Color(221, 221, 220));
            g.drawLine(0, y, getWidth(), y);
        }
        
        
      

       
}
