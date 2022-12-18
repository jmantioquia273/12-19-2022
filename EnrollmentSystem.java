package part1_java_final;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EnrollmentSystem extends JFrame implements ItemListener {
  private JCheckBox mathBox;
  private JCheckBox scienceBox;
  private JCheckBox englishBox;
  private JButton submitButton;
  private JLabel coursesLabel;
  private String courses = "";

  public EnrollmentSystem() {
    setLayout(new FlowLayout());

    mathBox = new JCheckBox("BEED");
    scienceBox = new JCheckBox("BSAM");
    englishBox = new JCheckBox("BSOA");
    submitButton = new JButton("Submit");

    add(mathBox);
    add(scienceBox);
    add(englishBox);
    add(submitButton);

    mathBox.addItemListener(this);
    scienceBox.addItemListener(this);
    englishBox.addItemListener(this);
    submitButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Courses Enrolled: " + courses);
      }
    });

    coursesLabel = new JLabel("Courses: ");
    add(coursesLabel);
  }

  public void itemStateChanged(ItemEvent e) {
    courses = "";
    if (mathBox.isSelected()) {
      courses += "BEED ";
    }
    if (scienceBox.isSelected()) {
      courses += "BSAM ";
    }
    if (englishBox.isSelected()) {
      courses += "BSOA ";
    }
    coursesLabel.setText("Courses: " + courses);
  }

  public static void main(String[] args) {
    EnrollmentSystem gui = new EnrollmentSystem();
    gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gui.setSize(300, 80);
    gui.setVisible(true);
    gui.setTitle("Enrollment System");
  }
}
