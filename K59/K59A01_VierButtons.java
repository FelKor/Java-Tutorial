

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class K59A01_VierButtons extends JFrame implements ActionListener
{
  JButton rotButton ;
  JButton gruenButton ;
  JButton blauButton;
  JButton grauButton;

  // Konstruktor faer ZweiButtons
  public K59A01_VierButtons(String title)
  {
    super( title );

    rotButton = new JButton("Rot");
    gruenButton = new JButton("Graen");
    blauButton = new JButton("Blau");
    grauButton = new JButton("Grau");
    rotButton.setActionCommand( "rot" );   // Befehl setzen
    gruenButton.setActionCommand( "gruen" ); // Befehl setzen
    blauButton.setActionCommand("blau");
    grauButton.setActionCommand("grau");

    // den Frame als Listener
    // faer beide Buttons registrieren
    rotButton.addActionListener( this );
    gruenButton.addActionListener( this );
    blauButton.addActionListener(this);
    grauButton.addActionListener(this);

    setLayout( new FlowLayout() );
    add( rotButton );
    add( gruenButton );
    add( blauButton );
    add( grauButton );

    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }

  public void actionPerformed( ActionEvent evt)
  {
    // aeberpraefen, welcher Befehlsstring gesendet wurde
    if ( evt.getActionCommand().equals( "rot" ) )
      getContentPane().setBackground(  Color.red  ) ;
    else if(evt.getActionCommand().equals( "gruen"))
    	getContentPane().setBackground( Color.green ) ;
    else if(evt.getActionCommand().equals("blau"))
    	getContentPane().setBackground( Color.blue);
    else
    	getContentPane().setBackground(Color.gray);

    repaint();
  }

  public static void main ( String[] args )
  {
    K59A01_VierButtons demo  = new K59A01_VierButtons( "Klicken Sie auf einen Button" ) ;

    demo.setSize( 200, 150 );
    demo.setVisible( true );
  }
}
