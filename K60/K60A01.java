

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class K60A01 extends JFrame implements ActionListener
{
	final String pass = "Adrian";
	int versuch;

   JLabel inLabel     = new JLabel( "Geben Sie Ihren Namen ein:  " ) ;
   JTextField inText  = new JTextField( 15 );

   JLabel outLabel    = new JLabel( "Hier kommt dann Ihr Name:" ) ;
   JTextField outText = new JTextField( 15 );

   public K60A01( String titel)      // Konstruktor
   {
      super( titel );
      setLayout( new FlowLayout() );
      add( inLabel  ) ;
      add( inText   ) ;
      add( outLabel ) ;
      add( outText  ) ;

      inText.addActionListener( this );
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

  // Der Applikationscode.
  void checkText()
  {
    String passwort = inText.getText();
    if(passwort.equals(pass)) {
    	getContentPane().setBackground(Color.green);
    }
    else {
    	getContentPane().setBackground(Color.red);
    	versuch++;
    }
  }

  public void actionPerformed( ActionEvent evt)
  {
    checkText();
    if(versuch==3) {
    	System.exit(0);
    }
    repaint();
  }

  public static void main ( String[] args )
  {
    K60A01 echo  = new K60A01( "Wiederholer" ) ;
    echo.setSize( 400, 100 );
    echo.setVisible( true );
  }
}