package L6HW.Q1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main extends JFrame{
			JLabel input=new JLabel("input");
			JLabel output=new JLabel("output");
			JButton count=new JButton("count letters");
			JButton reverse=new JButton("reverse letters");
			JButton remove=new JButton("Remove dipulicate");
			JTextField inputtext =new JTextField();
			JTextField outputtext =new JTextField();
			
			JPanel panel=new JPanel();// create a panel
			
			JPanel panel2=new JPanel();// create a panel
			JPanel panelMain=new JPanel();// create a panel
			
			
			Main(){
				
			this.setSize(400,200);
			this.setTitle("String Utility");
			this.setLocationRelativeTo(null);
			this.setResizable(false);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setVisible(true);
		//	this.setLayout(new FlowLayout(FlowLayout.LEFT,10,0));
		//	panelMain.setLayout(new FlowLayout(FlowLayout.LEFT,10,0));
			panel.setBackground(Color.black);
			panel.setPreferredSize(new Dimension(180,180));
			panel2.setBackground(Color.yellow);
			panel2.setPreferredSize(new Dimension(180,180));
				panel.setLocation(0, 0);
		//	panel2.setLocation(400, 310);
		//	panel2.setSize(180, 300);
			inputtext.setColumns(10);
			outputtext.setColumns(10);
			this.add(panelMain);//add it to frame
			panelMain.add(panel);//add it to frame
			panelMain.add(panel2);//add it to frame
			panel.add(count);
			panel2.add(input);
			panel.add(reverse);
			panel2.add(inputtext);
			
			panel.add(remove);
			panel2.add(output);
			panel2.add(outputtext);
			
			ButtonListner listener=new ButtonListner();
			count.addActionListener((e)->count());
			reverse.addActionListener(listener);
			remove.addActionListener(listener);
			}
			
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new Main();
			
	}
	public int Length(String s) {
		if(s==null || s.equals("")) return 0;
		else return 1+ Length(s.substring(1));
		
		
	}
	public String Reversing(String s) {
		if(s==null || s.equals("")) return "";
		else return s.charAt(s.length()-1) + Reversing(s.substring(0,s.length()-1));
		
		
	}
	public void count() {
		int x=Length(inputtext.getText());
		String input=String.valueOf(x);
		outputtext.setText(input);
	}
	public void reverse() {
		String x=Reversing(inputtext.getText());
		outputtext.setText(x);
	}
	
	public String removeDups(String s) {
		   if ( s.length() <= 1 ) return s;
		    if( s.substring(1).contains(s.substring(0,1)) ) return removeDups(s.substring(1));
		    else return s.substring(0,1) + removeDups(s.substring(1));

			
		
	}
	
	public void remove() {
		String x=removeDups(inputtext.getText());
		outputtext.setText(x);
		
	}
 private class ButtonListner implements ActionListener{
	 
	 

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==reverse) {
			reverse();
		}
		if(e.getSource()==remove) {
			remove();
		}
	}

	
	 
	 
 }
}
