package L6HW.Q2;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//import L6HW.Q1.Main.ButtonListner;

public class Colors extends JFrame implements ActionListener{
	JButton red=new JButton();
	JButton orange=new JButton();
	JButton yellow=new JButton();
	JButton green=new JButton();
	JButton blue=new JButton();
	JButton indigo=new JButton();
	JButton violate=new JButton();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new Colors();
	}
	public Colors() {
		
		this.setSize(550,120);
		this.setTitle("Rainbow colors Frame");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		JPanel panel=new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel.setLocation(0, 0);
		panel.setSize(520,120);
		this.add(panel);
		
		red.setBackground(Color.red);
		red.setPreferredSize(new Dimension(70,70));
		yellow.setBackground(Color.yellow);
		yellow.setPreferredSize(new Dimension(70,70));
		green.setBackground(Color.green);
		green.setPreferredSize(new Dimension(70,70));
		orange.setBackground(Color.orange);
		orange.setPreferredSize(new Dimension(70,70));
		blue.setBackground(Color.blue);
		blue.setPreferredSize(new Dimension(70,70));
		indigo.setBackground(new Color(75,0,130));
		indigo.setPreferredSize(new Dimension(70,70));
		violate.setBackground(new Color(148,0,211));
		violate.setPreferredSize(new Dimension(70,70));
		
		
		panel.add(red);
		panel.add(orange);
		panel.add(green);
		panel.add(blue);
		panel.add(yellow);
		panel.add(indigo);
		panel.add(violate);
		ButtonListner listener=new ButtonListner();
		red.addActionListener((e)->		JOptionPane.showMessageDialog(red, "Red signifies passion, vitality, enthusiasm and security", "Color Meaning", JOptionPane.INFORMATION_MESSAGE)
		);
		orange.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {	JOptionPane.showMessageDialog(orange, "Orange is the color of joy and creativity", "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
		}});
		green.addActionListener(this);
		blue.addActionListener(listener);
		yellow.addActionListener(listener);
		indigo.addActionListener(listener);
		violate.addActionListener(listener);
		
		
	//
	}
	private class ButtonListner implements ActionListener{
		 
		 

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			
			if(e.getSource()==yellow) {
				JOptionPane.showMessageDialog(yellow, "stands for freshness, happiness, positivity, clarity, energy, optimism, enlightenment, remembrance, intellect, honor, loyalty, and joy,", "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
				
			}
			if(e.getSource()==indigo) {
				
				JOptionPane.showMessageDialog(indigo, "indigo reflects great devotion, wisdom and justice along with fairness and impartiality", "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
			}
			if(e.getSource()==blue) {
				JOptionPane.showMessageDialog(blue, "blue is associated with open spaces, freedom, intuition, imagination, expansiveness, inspiration, and sensitivity","Color Meaning", JOptionPane.INFORMATION_MESSAGE);
					
			}
			if(e.getSource()==violate) {
				JOptionPane.showMessageDialog(violate, " violet represent the future, the imagination and dreams, while spiritually calming the emotions.", "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
				
			}
			
		}

		
		 
		 
	 }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==green) {
			JOptionPane.showMessageDialog(green, " growth, harmony, freshness, safety, fertility, and environment", "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
				
		}
	}

}
