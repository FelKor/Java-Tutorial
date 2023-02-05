

import java.awt.* ;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class K64A01 extends JFrame implements ActionListener, ChangeListener
{
  
  int h = 50;
  int w = h*h/28;
  String sex = "male";
	
  JRadioButton genderM, genderF;
  ButtonGroup  genderGroup;
  Box       genderBox;

  JSlider heightSlider;
  Box heightBox;

  Box buttonBox;

  JTextField   resultText;
  JLabel       resultLabl;
  JPanel       resultPanel;

  public K64A01()
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
    heightSlider = new JSlider(JSlider.VERTICAL, 40, 80, 50);
    heightSlider.addChangeListener(this);
    heightSlider.setMajorTickSpacing(10);
    heightSlider.setMinorTickSpacing(1);
    heightSlider.setPaintTicks(true);
    heightSlider.setPaintLabels(true);
    heightSlider.setSnapToTicks(true);

    heightBox = new Box(BoxLayout.Y_AXIS);
    heightBox.add(new JLabel("Your height in Inches"));
    heightBox.add(Box.createRigidArea(new Dimension(1, 8)));
    heightBox.add(heightSlider);

    //Top Box Layout
    buttonBox = new Box(BoxLayout.X_AXIS);
    buttonBox.add(Box.createHorizontalGlue());
    buttonBox.add(genderBox);
    buttonBox.add(Box.createHorizontalGlue());
    buttonBox.add(heightSlider);
    buttonBox.add(Box.createHorizontalGlue());

    // Result-Group
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

  //Listener Methoden
  public void stateChanged(ChangeEvent e) {
    JSlider source = (JSlider)e.getSource();
    if(!source.getValueIsAdjusting()){
        h = source.getValue();
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
  
  public void actionPerformed( ActionEvent evt) {
	  
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
    K64A01 weightApp  = new K64A01() ;
    weightApp.setSize( 250, 225 );
    weightApp.setVisible( true );
  }
}
