package part1_java_final;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DICTquiz extends JFrame implements ActionListener {
  private JRadioButton option1;
  private JRadioButton option2;
  private JRadioButton option3;
  private JRadioButton option4;
  private ButtonGroup optionsGroup;
  private JButton submitButton;
  private JLabel questionLabel;
  private String question = "Who is the Professor of the Course Advance Programming?";
  private String correctAnswer = "Abel Pelandiana";

  public DICTquiz() {
    setLayout(new FlowLayout());

    option1 = new JRadioButton("Abel Pelandiana");
    option2 = new JRadioButton("Manolito Manalo");
    option3 = new JRadioButton("Luisito Asia");
    option4 = new JRadioButton("Nicole Baronia");
    optionsGroup = new ButtonGroup();
    optionsGroup.add(option1);
    optionsGroup.add(option2);
    optionsGroup.add(option3);
    optionsGroup.add(option4);
    submitButton = new JButton("Submit");

    questionLabel = new JLabel(question);
    add(questionLabel);
    add(option1);
    add(option2);
    add(option3);
    add(option4);
    add(submitButton);

    submitButton.addActionListener(this);

  }

  public void actionPerformed(ActionEvent e) {
    if (option1.isSelected()) {
      JOptionPane.showMessageDialog(null, "Correct! The Professor of Advance Programming is Sir Abel Pelandina");
    } else {
      JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is: " + correctAnswer);
    }
  }

  public static void main(String[] args) {
    DICTquiz gui = new DICTquiz();
    gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gui.setSize(300, 100);
    gui.setVisible(true);
    gui.setTitle("DICT Quiz");
  }
}
