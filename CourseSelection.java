package part1_java_final;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CourseSelection extends JFrame implements ItemListener {
  private JCheckBox mathBox;
  private JCheckBox scienceBox;
  private JCheckBox englishBox;
  private JLabel coursesLabel;
  private String courses = "";

  public CourseSelection() {
    setLayout(new FlowLayout());

    mathBox = new JCheckBox("Math");
    scienceBox = new JCheckBox("Science");
    englishBox = new JCheckBox("English");

    add(mathBox);
    add(scienceBox);
    add(englishBox);

    mathBox.addItemListener(this);
    scienceBox.addItemListener(this);
    englishBox.addItemListener(this);

    coursesLabel = new JLabel("Courses: ");
    add(coursesLabel);
  }

  public void itemStateChanged(ItemEvent e) {
    courses = "";
    if (mathBox.isSelected()) {
      courses += "Math ";
    }
    if (scienceBox.isSelected()) {
      courses += "Science ";
    }
    if (englishBox.isSelected()) {
      courses += "English ";
    }
    coursesLabel.setText("Courses: " + courses);
  }

  public static void main(String[] args) {
    CourseSelection gui = new CourseSelection();
    gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gui.setSize(300, 100);
    gui.setVisible(true);
    gui.setTitle("Subject Selection");
  }
}
