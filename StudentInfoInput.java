package part1_java_final;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StudentInfoInput extends JFrame implements ActionListener {
  private JLabel nameLabel, courseLabel, idLabel, yearLabel;
  private JTextField nameField, courseField, idField, yearField;
  private JButton submitButton;

  public StudentInfoInput() {
    setLayout(new FlowLayout());

    // Initialize labels
    nameLabel = new JLabel("Name: ");
    courseLabel = new JLabel("Course: ");
    idLabel = new JLabel("ID: ");
    yearLabel = new JLabel("Year: ");

    // Initialize text fields
    nameField = new JTextField(20);
    courseField = new JTextField(20);
    idField = new JTextField(20);
    yearField = new JTextField(20);

    // Initialize button
    submitButton = new JButton("Submit");

    // Add components to the frame
    add(nameLabel);
    add(nameField);
    add(courseLabel);
    add(courseField);
    add(idLabel);
    add(idField);
    add(yearLabel);
    add(yearField);
    add(submitButton);
    submitButton.addActionListener(this);

    // Set the frame properties
    setTitle("Student Information Input");
    setSize(300, 200);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  public void actionPerformed(ActionEvent e) {
	    // Get the input from the text fields
	    String name = nameField.getText();
	    String course = courseField.getText();
	    String id = idField.getText();
	    String year = yearField.getText();

	    // Display the input
	    JOptionPane.showMessageDialog(this, "Name: " + name + "\nCourse: " + course + "\nID: " + id + "\nYear: " + year);
	  }

  public static void main(String[] args) {
    StudentInfoInput sii = new StudentInfoInput();
    sii.setVisible(true);
  }
}
