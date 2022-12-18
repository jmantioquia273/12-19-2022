package part1_java_final;

import java.awt.*;
import javax.swing.*;

public class StudentInformation extends JFrame {
  public StudentInformation() {
    // Set up the text area
    JTextArea textArea = new JTextArea();
    textArea.setEditable(false);
    textArea.setText("Name: John Manuel M. Antioquia\n" +
                     "Age: 21\n" +
                     "Program: DICT\n" +
                     "Year: 3\n" +
                     "Student ID: 2020-00216-MQ-0");
    getContentPane().add(new JScrollPane(textArea), BorderLayout.CENTER);

    // Set up the frame
    setTitle("Student Information");
    setSize(300, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);  // Centers the window on the screen
  }

  public static void main(String[] args) {
    // Show the frame
    StudentInformation frame = new StudentInformation();
    frame.setVisible(true);
  }
}
