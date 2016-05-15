/*
Name: Justin Bortmas
COSC 3317
HW #14 Problem 14.12
 */

package tempconvert;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TempConvert extends JFrame {
    
private JLabel desc1, desc2;
private JTextField fah;

public TempConvert()
{
    super("A Simple Temperature Converter");

    desc1 = new JLabel("Please enter the temperature in Fahrenheit: ");
    fah = new JTextField(10);

    fah.addActionListener(

    new ActionListener() {

        public void actionPerformed(ActionEvent e) {
            int temp = Integer.parseInt( fah.getText() );
            int celcius = ( int ) ( 5.0f / 9.0f * ( temp - 32 ) );
            fah.setText( String.valueOf( celcius ) );
        }
    }
    );
        desc2 = new JLabel("The temperature in Celcius is: ");

        Container container = getContentPane();
        container.setLayout( new BorderLayout() );
        container.add( desc1, BorderLayout.NORTH );
        container.add( fah, BorderLayout.CENTER );
        container.add( desc2, BorderLayout.SOUTH );
        setSize(225, 80);
        setVisible(true);
}

public static void main ( String args[] ) {
    
    TempConvert app = new TempConvert();
    app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
}

}
