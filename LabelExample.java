package part1_java_final;


import java.awt.*;
import javax.swing.*;

public class LabelExample {
  public static void main(String[] args) {
    // Create a new JFrame container
    JFrame frame = new JFrame("Student Info");
    // Set the frame to exit when it is closed
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // Set the size of the frame
    frame.setSize(500, 200);

    // Set the layout manager for the frame
    frame.setLayout(new GridLayout(4, 1, 0, 5));

    // Create a new JLabel for the name
    JLabel label1 = new JLabel("Name: John Manuel Antioquia");
    label1.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
    // Add the label to the frame
    frame.add(label1);

    // Create a new JLabel for the age
    JLabel label2 = new JLabel("Age: 21");
    label2.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
    // Add the label to the frame
    frame.add(label2);
    

    // Create a new JLabel for the school
    JLabel label3 = new JLabel("School: Polytechnic University of the Philippines Mulanay, Quezon Branch");
    label3.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
    // Add the label to the frame
    frame.add(label3);
    
    JLabel label4 = new JLabel("Student ID: 2020-00216-MQ-0");
    label4.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
    // Add the label to the frame
    frame.add(label4);

    // Display the frame
    frame.setVisible(true);
  }
}


