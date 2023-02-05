

import java.awt.* ;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;

public class K61A04 extends JFrame implements ActionListener
{
  //Designe
  JLabel heading   = new JLabel("Percent of Calories from Fat");
  JLabel fatLabel  = new JLabel("Enter grams of fat:   ");
  JLabel calLabel  = new JLabel("Enter total calories: ");
  JLabel perLabel  = new JLabel("Percent calories from fat: ");

  JTextField inFat  = new JTextField( 7 );
  JTextField inCal  = new JTextField( 7 );
  JTextField outPer = new JTextField( 7 );
  JTextField outReference = new JTextField(15);

  JButton    doit   = new JButton("Do It!");

  double calories;  // Input: Gesamtkalorien pro Packung
  double fatGrams;  // Input: Gramm Fett pro Packung
  double percent;   // Ergebnis in Prozent

  //Konstruktor
  public K61A04()
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
    
    add( outReference );
    outReference.setEditable(false);
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
    // check if percent over 30
    if(percent > 30){
        outReference.setText("Zu viele Fettkalorien!");
    }
    else{
        outReference.setText("Fettanteil OK!");
    }

    repaint();
  }

  public static void main ( String[] args )
  {
    K61A04 fatApp  = new K61A04() ;
    fatApp.setSize( 280, 200 );
    fatApp.setVisible( true );
  }
}

