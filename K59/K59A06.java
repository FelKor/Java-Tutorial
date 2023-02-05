

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class K59A06 extends JFrame implements ActionListener{
	
	public K59A06(String title) {
		
		super(title);
		
		JButton button0 = new JButton("vergraeaeern");
		button0.setActionCommand("0");
		JButton button1 = new JButton("verkleinern");
		button1.setActionCommand("1");
		
		button0.addActionListener(this);
		button1.addActionListener(this);
		
		setLayout(new FlowLayout());
		add(button0);
		add(button1);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	static int y = 500;
	static int x = 500;
	
	
	public void actionPerformed(ActionEvent evt) {
		if(evt.getActionCommand().equals("0")) {
			y = (y+(y*10/100));
			x = (x+(x*10/100));
		}
		else {
			y = (y-(y*10/100));
			x = (x-(x*10/100));
		}
		setSize(x,y);
		repaint();
	}
	
	public static void main(String[] args) {
		
		K59A06 demo = new K59A06("Lutz gay");
		
		demo.setSize(x,y);
		demo.setVisible(true);
	}
}
