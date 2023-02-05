

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class K59A02 extends JFrame implements ActionListener{
	
	public K59A02(String title) {
		
		super(title);
		
		JButton button = new JButton("Ich bin ein Button");
		button.setActionCommand("true");
		
		button.addActionListener(this);
		
		setLayout(new FlowLayout());
		add(button);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	int i = 0;
	
	public void actionPerformed(ActionEvent evt) {
		
		if(evt.getActionCommand().equals("true")) {
			if(i==0) {
				getContentPane().setBackground(Color.red);
				i++;
			}
			else if(i==1) {
				getContentPane().setBackground(Color.green);
				i++;
			}
			else if(i==2) {
				getContentPane().setBackground(Color.blue);
				i++;
			}
			else if(i==3) {
				getContentPane().setBackground(Color.gray);
				i=0;
			}
		}
	}
	
	public static void main(String[] args) {

		K59A02 demo = new K59A02("draeck");
		
		demo.setSize(500,500);
		demo.setVisible(true);
	}
}
