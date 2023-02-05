

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class K60A02 extends JFrame implements ActionListener
{
	
	JLabel inLabel     = new JLabel( "Geben Sie Ihren Namen ein:  " ) ;
	JTextField inText  = new JTextField( 15 );
	
	JLabel outLabel    = new JLabel( "Hier kommt dann Ihr Name:" ) ;
	JTextField outText = new JTextField( 15 );
	
	public K60A02( String titel)      // Konstruktor
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
		String name = inText.getText();
		outText.setText( name );
	}
	
	public void actionPerformed( ActionEvent evt)
	{
		if(evt.getActionCommand().equals(inText.getText())) {
			copyText();			
		}
		else {
			outText.setText("Geben Sie Text im oberen Feld ein!");
		}
		repaint();
	}
	
	public static void main ( String[] args )
	{
		K60A02 echo  = new K60A02( "K60A02" ) ;
		echo.setSize( 400, 100 );
		echo.setVisible( true );
	}
}


