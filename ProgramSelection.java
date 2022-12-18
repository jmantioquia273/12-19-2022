package part1_java_final;

import javax.swing.*;

public class ProgramSelection {
  public static void main(String[] args) {
    // Create an array of strings containing the names of the courses
    String[] courses = {"BEED", "BSAM", "BSOA", "DICT", "DOMT"};
    String[] year = {"I", "II", "III", "IV"};

    // Create a combo box with the courses as options
    JComboBox<String> comboBox = new JComboBox<>(courses);
    JComboBox<String> comboBox1 = new JComboBox<>(year);
    JLabel label1 = new JLabel("Select your Program");

    // Add the combo box to a panel
    JPanel panel = new JPanel();
    panel.add(label1);
    panel.add(comboBox);
    panel.add(comboBox1);


    // Create a frame to hold the panel
    JFrame frame = new JFrame("Course Selection");
    frame.add(panel);
    frame.pack();
    frame.setVisible(true);
  }
}
