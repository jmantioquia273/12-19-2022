package part1_java_final;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AnimatedJButton {
  public static void main(String[] args) {
    // Create a new JFrame container
    JFrame frame = new JFrame("Animated Button");
    // Set the frame to exit when it is closed
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // Set the size of the frame
    frame.setSize(300, 200);
    frame.setLocation(300, 200);

    // Set the layout manager for the frame
    frame.setLayout(new FlowLayout());

    // Create a new JButton
    JButton button = new JButton("Click me!");
    // Add the button to the frame
    frame.add(button);

    // Create a timer to animate the button
    Timer timer = new Timer(500, new ActionListener() {
      private boolean state = true;
      public void actionPerformed(ActionEvent e) {
        if (state) {
          button.setBackground(Color.YELLOW);
        } else {
          button.setBackground(Color.BLUE);
        }
        state = !state;
      }
    });
    timer.start();

    // Display the frame
    frame.setVisible(true);
  }
}
