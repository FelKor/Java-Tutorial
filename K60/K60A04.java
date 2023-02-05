

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class K60A04 extends JFrame implements ActionListener
{
	JLabel inLabel     = new JLabel( "Geben Sie Ihren Namen ein:  " ) ;
	JTextField inText  = new JTextField( 15 );
	
	JLabel outLabel    = new JLabel( "Hier kommt dann Ihr Name:" ) ;
	JTextField outText = new JTextField( 15 );
	
	JButton button = new JButton("Text Tauschen");
	
	public K60A04( String titel)      // Konstruktor
	{
		super( titel );
		setLayout( new FlowLayout() );
		add( inLabel  ) ;
		add( inText   ) ;
		add( outLabel ) ;
		add( outText  ) ;
		add( button   ) ;
		
		inText.addActionListener( this );
		outText.addActionListener(this);
		button.addActionListener(this);
		button.setActionCommand("tauschen");
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
	
	// Der Applikationscode.
	private void copyText()
	{
		String name1 = inText.getText();
		String name2 = outText.getText();
		inText.setText(name2);
		outText.setText(name1);
	}
	
	public void actionPerformed( ActionEvent evt)
	{
		if(evt.getActionCommand().equals("tauschen")) {
			copyText();
			repaint();
		}
	}
	
	public static void main ( String[] args )
	{
		K60A04 echo  = new K60A04( "K60A04" ) ;
		echo.setSize( 400, 200 );
		echo.setVisible( true );
	}
}

