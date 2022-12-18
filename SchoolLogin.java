package part1_java_final;

import javax.swing.*;

public class SchoolLogin {
  public static void main(String[] args) {
    // Create a panel to hold the email, password, and school name fields
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

    // Create a field for the email address
    JLabel emailLabel = new JLabel("Email:");
    JTextField emailField = new JTextField(20);
    panel.add(emailLabel);
    panel.add(emailField);

    // Create a field for the password
    JLabel passwordLabel = new JLabel("Password:");
    JPasswordField passwordField = new JPasswordField(20);
    panel.add(passwordLabel);
    panel.add(passwordField);

    // Create a field for the school name
    JLabel schoolLabel = new JLabel("School Name:");
    JTextField schoolField = new JTextField(20);
    panel.add(schoolLabel);
    panel.add(schoolField);

    // Display the login dialog and get the user's input
    int result = JOptionPane.showConfirmDialog(null, panel, "School Login",
        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

    // Check the user's input
    if (result == JOptionPane.OK_OPTION) {
      String email = emailField.getText();
      char[] password = passwordField.getPassword();
      String school = schoolField.getText();
      System.out.println("Email: " + email);
      System.out.println("Password: " + new String(password));
      System.out.println("School: " + school);
    }
  }
}
