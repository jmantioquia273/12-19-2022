package part1_java_final;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Javava extends JFrame implements ActionListener {
    // Declare GUI components
    private JLabel lblUsername;
    private JTextField txtUsername;
    private JLabel lblPassword;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    private JLabel lblMessage;

    // Constructor
    public Javava() {
        // Set the frame properties
        setTitle("Login System");
        setSize(300, 200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize the GUI components
        lblUsername = new JLabel("Username:");
        lblUsername.setBounds(20, 20, 80, 25);
        add(lblUsername);

        txtUsername = new JTextField();
        txtUsername.setBounds(100, 20, 160, 25);
        add(txtUsername);

        lblPassword = new JLabel("Password:");
        lblPassword.setBounds(20, 50, 80, 25);
        add(lblPassword);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(100, 50, 160, 25);
        add(txtPassword);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(100, 80, 80, 25);
        btnLogin.addActionListener(this);
        add(btnLogin);

        lblMessage = new JLabel();
        lblMessage.setBounds(20, 110, 260, 25);
        add(lblMessage);

        // Display the frame
        setVisible(true);
    }

    // Action performed when the login button is clicked
    public void actionPerformed(ActionEvent e) {
        // Get the entered username and password
        String username = txtUsername.getText();
        String password = new String(txtPassword.getPassword());

        // Check if the username and password are correct
        if (username.equals("admin") && password.equals("password")) {
            lblMessage.setText("Login successful!");
        } else {
            lblMessage.setText("Invalid username or password. Please try again.");
        }
    }

    // Main method
    public static void main(String[] args) {
        new Javava();
    }
}