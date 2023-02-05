

import java.awt.* ;
import java.awt.event.*;
import javax.swing.*;

public class K63A01 extends JFrame implements ActionListener
{
  
  int h = 62;
	int w = h*h/28;
  String sex = "male";
	
  JRadioButton genderM, genderF;
  ButtonGroup  genderGroup;
  JPanel       genderPanel;

  JRadioButton heightA, heightB, heightC, heightD, heightE;
  ButtonGroup  heightGroup;
  JPanel       heightPanel;

  JTextField   resultText;
  JLabel       resultLabl;
  JPanel       resultPanel;

  public K63A01()
  {
    setTitle( "Your Ideal Weight" );
    setDefaultCloseOperation( EXIT_ON_CLOSE );

    // Gender-Gruppe
    genderM = new JRadioButton("Male", true );
    genderM.addActionListener(this);
    genderM.setActionCommand("male");
    genderF = new JRadioButton("Female", false );
    genderF.addActionListener(this);
    genderF.setActionCommand("female");
    
    genderGroup = new ButtonGroup();
    genderGroup.add( genderM );
    genderGroup.add( genderF );
    genderPanel = new JPanel();
    genderPanel.setLayout( new BoxLayout( genderPanel, BoxLayout.Y_AXIS ) );
    genderPanel.add( new JLabel("Your Gender") );
    genderPanel.add( genderM );  genderPanel.add( genderF );

    // Height-Gruppe
    heightA = new JRadioButton("60 to 64 inches", true );
    heightA.addActionListener(this);
    heightA.setActionCommand("A");
    heightB = new JRadioButton("64 to 68 inches", false );
    heightB.addActionListener(this);
    heightB.setActionCommand("B");
    heightC = new JRadioButton("68 to 72 inches", false );
    heightC.addActionListener(this);
    heightC.setActionCommand("C");
    heightD = new JRadioButton("72 to 76 inches", false );
    heightD.addActionListener(this);
    heightD.setActionCommand("D");
    heightE = new JRadioButton("76 to 80 inches", false );
    heightE.addActionListener(this);
    heightE.setActionCommand("E");

    heightGroup = new ButtonGroup();
    heightGroup.add( heightA ); heightGroup.add( heightB );
    heightGroup.add( heightC ); heightGroup.add( heightD );
    heightGroup.add( heightE );

    heightPanel = new JPanel();
    heightPanel.setLayout( new BoxLayout( heightPanel, BoxLayout.Y_AXIS ) );
    heightPanel.add( new JLabel("Your Height") );
    heightPanel.add( heightA ); heightPanel.add( heightB );
    heightPanel.add( heightC ); heightPanel.add( heightD );
    heightPanel.add( heightE );

    // Result-Panel
    resultText  = new JTextField(7);
    resultText.setEditable( false );
    resultLabl  = new JLabel("Ideal Weight");
    resultPanel = new JPanel();
    resultPanel.add( resultLabl );
    resultPanel.add( resultText );

    // Frame: verwendet den Standard Layoutmanager
    add( genderPanel, BorderLayout.WEST );
    add( heightPanel, BorderLayout.EAST );
    add( resultPanel, BorderLayout.SOUTH  );

  }
  
  public void actionPerformed( ActionEvent evt) {

	  if(evt.getActionCommand().equals("A"))
		  h = 62;
	  if(evt.getActionCommand().equals("B"))
		  h = 66;
	  if(evt.getActionCommand().equals("C"))
		  h = 70;
	  if(evt.getActionCommand().equals("D"))
		  h = 74;
	  if(evt.getActionCommand().equals("E"))
		  h = 78;
	  
	  if(evt.getActionCommand().equals("male")){
		  sex = "male";
	  }
	  else if(evt.getActionCommand().equalsIgnoreCase("female")){
      sex = "female";
	  }

    if(sex.equals("male")){
      w = h*h/28;
    }
    else if(sex.equals("female")){
      w = h*h/30;
    }

	  resultText.setText(w + "");
	  repaint();
  }

  public static void main ( String[] args )
  {
    K63A01 weightApp  = new K63A01() ;
    weightApp.setSize( 250, 225 );
    weightApp.setResizable( false );
    weightApp.setVisible( true );
  }
}
