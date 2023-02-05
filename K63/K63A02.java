

import java.awt.* ;
import java.awt.event.*;
import javax.swing.*;

public class K63A02 extends JFrame implements ActionListener
{
  
  int h = 62;
  int w = h*h/28;
  String sex = "male";
	
  JRadioButton genderM, genderF;
  ButtonGroup  genderGroup;
  Box       genderBox;

  JRadioButton heightA, heightB, heightC, heightD, heightE;
  ButtonGroup  heightGroup;
  Box       heightBox;

  Box buttonBox;

  JTextField   resultText;
  JLabel       resultLabl;
  JPanel       resultPanel;

  public K63A02()
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
    
    genderBox = new Box(BoxLayout.Y_AXIS);
    genderBox.add( Box.createRigidArea(new Dimension(1, 40)));
    genderBox.add( new JLabel("Your Gender") );
    genderBox.add( Box.createRigidArea( new Dimension(1, 8) ) );
    genderBox.add( genderM );    genderBox.add( genderF );
    genderBox.add( Box.createRigidArea( new Dimension(1, 36) ) );

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

    heightBox = new Box(BoxLayout.Y_AXIS);
    heightBox.add( new JLabel("Your Height") );
    heightBox.add(Box.createRigidArea(new Dimension(1, 8)));
    heightBox.add( heightA ); heightBox.add( heightB );
    heightBox.add( heightC ); heightBox.add( heightD );
    heightBox.add( heightE );

    buttonBox = new Box(BoxLayout.X_AXIS);
    buttonBox.add(Box.createHorizontalGlue());
    buttonBox.add(genderBox);
    buttonBox.add(Box.createHorizontalGlue());
    buttonBox.add(heightBox);
    buttonBox.add(Box.createHorizontalGlue());

    // Result-
    resultText  = new JTextField(7);
    resultText.setEditable( false );
    resultLabl  = new JLabel("Ideal Weight");
    resultPanel = new JPanel();
    resultPanel.add( resultLabl );
    resultPanel.add( resultText );

    // Frame: verwendet den Standard Layoutmanager
    setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
    add(buttonBox);
    add(resultPanel);

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
    K63A02 weightApp  = new K63A02() ;
    weightApp.setSize( 250, 225 );
    weightApp.setVisible( true );
  }
}
