

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class K60A03 extends JFrame implements ActionListener
{
	int i;
	
	JLabel inLabel     = new JLabel( "Geben Sie Ihren Namen ein:  " ) ;
	JTextField inText  = new JTextField( 15 );
	
	JLabel outLabel    = new JLabel( "Hier kommt dann Ihr Name:" ) ;
	JTextField outText = new JTextField( 15 );
	
	public K60A03( String titel)      // Konstruktor
	{
		super( titel );
		setLayout( new FlowLayout() );
		add( inLabel  ) ;
		add( inText   ) ;
		add( outLabel ) ;
		add( outText  ) ;
		
		inText.addActionListener( this );
		outText.addActionListener(this);
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
	
	// Der Applikationscode.
	void copyText()
	{
		if(i==0) {
			String name = inText.getText();
			outText.setText( name );	
		}
		else {
			String name = outText.getText();
			inText.setText(name);
		}
	}
	
	public void actionPerformed( ActionEvent evt)
	{
		if(evt.getActionCommand().equals(inText.getText())) {
			i = 0;
		}
		else {
			i = 1;
		}
		copyText();
		repaint();
	}
	
	public static void main ( String[] args )
	{
		K60A03 echo  = new K60A03( "K60A03" ) ;
		echo.setSize( 400, 100 );
		echo.setVisible( true );
	}
}

