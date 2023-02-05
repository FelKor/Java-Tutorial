
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;

public class K59A05 extends JFrame implements ActionListener{
	
	public K59A05(String title) {
		
		super(title);
		
		JButton button0 = new JButton("0");
		button0.setActionCommand("0");
		JButton button1 = new JButton("1");
		button1.setActionCommand("1");
		JButton button2 = new JButton("2");
		button2.setActionCommand("2");
		JButton button3 = new JButton("3");
		button3.setActionCommand("3");
		JButton button4 = new JButton("4");
		button4.setActionCommand("4");
		JButton button5 = new JButton("5");
		button5.setActionCommand("5");
		JButton button6 = new JButton("6");
		button6.setActionCommand("6");
		JButton button7 = new JButton("7");
		button7.setActionCommand("7");
		JButton button8 = new JButton("8");
		button8.setActionCommand("8");
		JButton button9 = new JButton("9");
		button9.setActionCommand("9");
		
		button0.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button8.addActionListener(this);
		
		setLayout(new FlowLayout());
		add(button0);
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		add(button7);
		add(button8);
		add(button9);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	Scanner scan = new Scanner(System.in);
	int[] code;
	
	public void abfrage() {
		
		System.out.println("Wie viele Zahlen soll ihr Code besitzen?");
		int x = scan.nextInt();
		
		code = new int[x];
		System.out.println();
		
		for(int y = 0; y<x; y++) {
			System.out.println("geben Sie ihre " + (y+1) + ". Zahl ein");
			code[y] = scan.nextInt();
		}
		System.out.print("Ihr Code lautet: ");
		for(int y=0; y<x; y++) {
			System.out.print(code[y] + " ");
		}
		scan.close();
	}

	int j = 0;
	int i = 0;
	
	public void actionPerformed(ActionEvent evt) {
		
		getContentPane().setBackground(Color.red);
		
		if(Integer.parseInt(evt.getActionCommand()) == code[i]) {
			i++;
			j = 0;
		}
		else {
			i = 0;
			j++;
		}
		
		if((i+1)%(code.length+1)==0) {
			getContentPane().setBackground(Color.green);
			i = 0;
		}
		if((j+1)%(code.length+1)==0) {
			getContentPane().setBackground(Color.red);
			j = 0;	
		}
	}
		
	
	public static void main(String[] args) {
		
		K59A05 demo = new K59A05("Lutz gay");
		
		demo.setSize(500,500);
		demo.setVisible(true);
		demo.abfrage();
	}
}
