
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class K59A04 extends JFrame implements ActionListener{
	
	public K59A04(String title) {
		
		super(title);
		
		JButton button1 = new JButton("1");
		button1.setActionCommand("1");
		JButton button2 = new JButton("2");
		button2.setActionCommand("2");
		JButton button3 = new JButton("3");
		button3.setActionCommand("3");
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		setLayout(new FlowLayout());
		add(button1);
		add(button2);
		add(button3);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	Random rand = new Random();
	
	public void actionPerformed(ActionEvent evt) {
		
		int zufallszahl = rand.nextInt(3);
		
		if(zufallszahl == 0) {
			System.exit(0);
		}
		else {
			getContentPane().setBackground(Color.green);
			
			repaint();
		}
	}
	
	public static void main(String[] args) {
		
		K59A04 demo = new K59A04("Lutz gay");
		
		demo.setSize(500,500);
		demo.setVisible(true);
	}
	
	
	
	

}
