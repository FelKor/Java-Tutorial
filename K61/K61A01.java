

import java.awt.*;
import java.awt.event.*;
import javax.swing.* ;

public class K61A01 extends JFrame implements ActionListener
{
  JLabel heading  = new JLabel("Convert Celcius to Fahrenheit");
  JLabel inLabel  = new JLabel("Celsius    ");
  JLabel outLabel = new JLabel("Fahrenheit ");

  JTextField inCel = new JTextField( 7 );
  JTextField outFar = new JTextField( 7 );

  int fahrTemp ;
  int celsTemp ;
  
  K61A01( String title ){
    
      super( title );
      setLayout( new FlowLayout() );
 
      inCel.addActionListener( this );
      outFar.setEditable( false );
 
      add( heading );
      add( inLabel );
      add( outLabel );
      add( inCel );
      add( outFar );
 
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }

  // Die Applikation
  public int convert( int C )
  {
      return C*9/5 + 32;
  }

  public void actionPerformed( ActionEvent evt)
  {
    String userIn = inCel.getText() ;
    celsTemp = Integer.parseInt( userIn ) ;

    fahrTemp = convert( celsTemp ) ;

    outFar.setText( fahrTemp+"" );
    repaint();
  }

  public static void main ( String[] args )
  {
    K61A01   fahr  = new K61A01( "C to F" ) ;

    fahr.setSize( 200, 150 );
    fahr.setVisible( true );
  }

}
