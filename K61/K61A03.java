

import java.awt.* ;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;

public class K61A03 extends JFrame implements ActionListener
{
  JLabel heading   = new JLabel("Percent of Calories from Fat");
  JLabel fatLabel  = new JLabel("Enter grams of fat:   ");
  JLabel calLabel  = new JLabel("Enter total calories: ");
  JLabel perLabel  = new JLabel("Percent calories from fat: ");

  JTextField inFat  = new JTextField( 7 );
  JTextField inCal  = new JTextField( 7 );
  JTextField outPer = new JTextField( 7 );

  JButton    doit   = new JButton("Do It!");

  double calories;  // Input: Gesamtkalorien pro Packung
  double fatGrams;  // Input: Gramm Fett pro Packung
  double percent;   // Ergebnis in Prozent

  public K61A03()
  {
    setTitle( "Calories from Fat" );
    setLayout( new FlowLayout() );

    add( heading );
    add( fatLabel );
    add( inFat );
    add( calLabel );
    add( inCal );
    add( perLabel );
    add( outPer );
    outPer.setEditable( false );

    add( doit );
    doit.addActionListener( this );
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }

  // die Applikation
  public void calcPercent( )
  {
    percent = ((fatGrams * 9) / calories) * 100 ;
  }

  public void actionPerformed( ActionEvent evt)
  {
    String userIn ;
    boolean error = false;

    userIn    = inFat.getText()  ;
    try{
        fatGrams  = Double.parseDouble( userIn ) ;
    }
    catch(Exception ex){
        inFat.setText("Re-enter");
        error = true;
    }

    userIn    = inCal.getText()  ;
    try{
        calories  = Double.parseDouble( userIn ) ;
    }
    catch (Exception ex){
        inCal.setText("Re-renter");
        error = true;
    }

    if(error == false){
        calcPercent();
    }

    // die Prozente in einen hübschen String konvertieren und im Ergebnisfeld ausgeben
    outPer.setText( new DecimalFormat("#0.0##").format(percent) + "%" );
    repaint();
  }

  public static void main ( String[] args )
  {
    K61A03 fatApp  = new K61A03() ;
    fatApp.setSize( 280, 200 );
    fatApp.setVisible( true );
  }
}
