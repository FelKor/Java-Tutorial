

import java.awt.* ;
import javax.swing.*;
import javax.swing.event.*;

public class K64A02 extends JFrame implements ChangeListener{

    int hunger, aussehen, aroma;

    JSlider hungerSlider, aussehenSlider, aromaSlider;
    Box hungerBox, aussehenBox, aromaBox, sliderBox;

    JTextField resultText, resultText2;
    JPanel resultPanel;    
    
    public K64A02(){
        setTitle("Cookie Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    
        //hunger-Group
        hungerSlider = new JSlider(JSlider.VERTICAL, 0, 10, 5);
        hungerSlider.addChangeListener(this);
        hungerSlider.setName("hunger");
        hungerSlider.setMajorTickSpacing(10);
        hungerSlider.setMinorTickSpacing(1);
        hungerSlider.setPaintTicks(true);
        hungerSlider.setPaintLabels(true);
        hungerSlider.setSnapToTicks(true);
    
        hungerBox = new Box(BoxLayout.Y_AXIS);
        hungerBox.add(new JLabel("Wie hungrig sind Sie?"));
        hungerBox.add(Box.createRigidArea(new Dimension(1, 8)));
        hungerBox.add(hungerSlider);
    
        //aussehen-Group
        aussehenSlider = new JSlider(JSlider.VERTICAL, 0, 10, 5);
        aussehenSlider.addChangeListener(this);
        aussehenSlider.setName("aussehen");
        aussehenSlider.setMajorTickSpacing(10);
        aussehenSlider.setMinorTickSpacing(1);
        aussehenSlider.setPaintTicks(true);
        aussehenSlider.setPaintLabels(true);
        aussehenSlider.setSnapToTicks(true);
    
        aussehenBox = new Box(BoxLayout.Y_AXIS);
        aussehenBox.add(new JLabel("Wie lecker sieht das Gebäck aus?"));
        aussehenBox.add(Box.createRigidArea(new Dimension(1, 8)));
        aussehenBox.add(aussehenSlider);
    
        //aroma-Group
        aromaSlider = new JSlider(JSlider.VERTICAL, 0, 10, 5);
        aromaSlider.addChangeListener(this);
        aromaSlider.setName("aroma");
        aromaSlider.setMajorTickSpacing(10);
        aromaSlider.setMinorTickSpacing(1);
        aromaSlider.setPaintTicks(true);
        aromaSlider.setPaintLabels(true);
        aromaSlider.setSnapToTicks(true);
    
        aromaBox = new Box(BoxLayout.Y_AXIS);
        aromaBox.add(new JLabel("Wie gut riecht das Gebäck"));
        aromaBox.add(Box.createRigidArea(new Dimension(1, 8)));
        aromaBox.add(aromaSlider);
    
        //slider-Box
        sliderBox = new Box(BoxLayout.X_AXIS);
        sliderBox.add(Box.createHorizontalGlue());
        sliderBox.add(hungerBox);
        sliderBox.add(Box.createHorizontalGlue());
        sliderBox.add(aussehenBox);
        sliderBox.add(Box.createHorizontalGlue());
        sliderBox.add(aromaBox);
        sliderBox.add(Box.createHorizontalGlue());
    
        //Result-Group
        resultText = new JTextField(15);
        resultText.setEditable(false);
        resultText2 = new JTextField(17);
        resultText2.setText("Setzen Sie Ihren Einkaufen fort.");
        resultText2.setEditable(false);
    
        resultPanel = new JPanel();
        resultPanel.add(resultText);
        resultPanel.add(Box.createRigidArea(new Dimension(1, 2)));
        resultPanel.add(resultText2);
    
        //Frame
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(sliderBox);
        add(resultPanel);
    }

    //Listener Methode
    public void stateChanged(ChangeEvent e){
        JSlider source = (JSlider)e.getSource();
        if(!(source.getValueIsAdjusting())){
            if(source.getName().equals("hunger"))
                hunger = source.getValue();
            if(source.getName().equals("aussehen"))
                aussehen = source.getValue();
            if(source.getName().equals("aroma"))
                aroma = source.getValue();
        }

        if((hunger + aussehen + aroma) > 15){
            resultText.setText("Gebäck kaufen!");
        }
        else{
            resultText.setText("");
        }
        repaint();
    }

    public static void main(String[] args){
        K64A02 CookieCalculator = new K64A02();
        CookieCalculator.setSize(500, 250);
        CookieCalculator.setVisible(true);
    }
}

