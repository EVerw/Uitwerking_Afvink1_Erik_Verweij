/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afvink1_3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Erik
 */
public class Afvink1_3 extends JFrame {

    /**
     * @param args the command line arguments
     */
    private JTextField textField;
    private JLabel Label;

    public static void main (String[] args) {
        Afvink1_3 frame = new Afvink1_3();
        frame.setSize(300, 200);
        frame.createGUI();
        frame.setVisible(true);
    }
    
     private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout() );
        textField = new JTextField("Hello!");
        Label = new JLabel("Doe deze even invullen"); 
        window.add(Label) ;
        window.add(textField);
    }

    
}
