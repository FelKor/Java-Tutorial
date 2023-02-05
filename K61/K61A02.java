

import java.awt.*;
import java.awt.event.*;
import javax.swing.* ;

public class K61A02 extends JFrame implements ActionListener
{
  JLabel CelLable  = new JLabel("Celsius    ");
  JLabel FarLable = new JLabel("Fahrenheit ");
  
  JButton celButton = new JButton("Convert to Fahrenheit");
  JButton farButton = new JButton("Convert to Celcius");
  JButton resetButton = new JButton("reset");

  JTextField Cel = new JTextField( 7 );
  JTextField Far = new JTextField( 7 );

  int fahrTemp ;
  int celsTemp ;
  
  K61A02( String title ){
    
      super( title );
      setLayout( new FlowLayout() );
      
      celButton.addActionListener(this);
      celButton.setActionCommand("F");
      farButton.addActionListener(this);
      farButton.setActionCommand("C");
      resetButton.addActionListener(this);
      resetButton.setActionCommand("R");

      add( CelLable );
      add( FarLable );
      add( Cel );
      add( Far );
      add(celButton);
      add(farButton);
      add(resetButton);
 
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }

  // Die Applikation
  public int convertCtoF( int C )
  {
      return C*9/5 + 32;
  }
  public int convertFtoC(int F){
    return ((F-32)*5)/9;
  }

  public void actionPerformed( ActionEvent evt){

    String userin;

    if(evt.getActionCommand().equals("F")){
        userin = Cel.getText();
        celsTemp = Integer.parseInt(userin);
        
        fahrTemp = convertCtoF(celsTemp);
        
        Far.setText(fahrTemp + "");
    }
    
    if(evt.getActionCommand().equals("C")){
        userin = Far.getText();
        fahrTemp = Integer.parseInt(userin);

        celsTemp = convertFtoC(fahrTemp);

        Cel.setText(celsTemp + "");
    }

    if(evt.getActionCommand().equals("R")){
        Far.setText("");
        Cel.setText("");
    }

    repaint();
  }

  public static void main ( String[] args )
  {
    K61A02   fahr  = new K61A02( "Zwei Wege Konverter" ) ;

    fahr.setSize( 200, 200 );
    fahr.setVisible( true );
  }

}
