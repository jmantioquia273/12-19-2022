package part1_java_final;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Jopay {

	
	
	
	
	public static void main(String[] args) {
	
	
		
		JFrame frame = new JFrame("PUP Enrollment");
		JButton b = new JButton("Submit");
		
		//label of text filed
		
		JLabel title = new JLabel("Polytechnic University of the Philippines");
		JLabel title2 = new JLabel("Mulanay, Quezon Branch");
		JLabel userName = new JLabel("Email:");
		JLabel studId = new JLabel("Student ID:");
		
		//text field 
		frame.getContentPane().setLayout(new FlowLayout());
		JTextField text = new JTextField(); 
		JTextField text2 = new JTextField(); 
		
		
		//location of element
		userName.setBounds(50, 100, 200, 30);
		studId.setBounds(50, 150, 200, 30);
		text.setBounds(150,100,300,30);
		text2.setBounds(150, 150, 300, 30);
		b.setBounds(230, 200, 100, 30);
		title.setBounds(180, 25, 500, 50);
		title2.setBounds(220, 50, 500, 50);
		
		
		
		
		//display the element
		frame.add(studId);
		frame.add(userName);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(600,500);
		frame.setVisible(true);
		frame.add(b);
		frame.add(text);
		frame.add(text2);
		frame.add(title);
		frame.add(title2);
		
		
		
		

	}

}
