package part1_java_final;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaGui extends JFrame implements ActionListener {
 Font font = new Font("Arial", Font.BOLD,15);
 JLabel header1 = new JLabel("Polytecthnic University of the Philippines");
 JLabel header2 = new JLabel("Mulanay, Quezon Branch");
 JTable t = new JTable();
 JFrame f = new JFrame();
 JFrame f2 = new JFrame();
 JLabel title = new JLabel("Polytechnic University of the Phil");
 JLabel userId = new JLabel("1st Choice");
 JLabel userId2 = new JLabel("2nd Choice");
 JTextField text1 = new JTextField(25);
 JTextField text2 = new JTextField(25);
 JButton b = new JButton("OK");

 
 
 
 private int gWa, maTh, enG, sCie;
 private double grade;
 
 
 String [] columnName = {"Academic Programs", "Min Grade 10 & 11 GWA",
   "Min G10 in Math", "Min G10 in Science", "Min G10 in English"
   
   };
   
   Object [][] data = {
     {"Academic Programs", "Min Grade 10 & 11 GWA",
      "Min G10 in Math", "Min G10 in Science", "Min G10 in English"},
     
     {"BEED", "88", "88", "88", "88"}, {"BPA-PFM", "85", "82", "82","85" },
     {"BSAM", "85", "85", "85", "85"}, {"BSENT", "82", "82", "82","82" },
     {"BSOA", "88", "88", "88", "88"}, {"DIT", "85", "82", "82","85" },
     {"DOMTMOM", "88", "88", "88", "88"}
   };
   
 public class Myframe2 {
  JFrame frame = new JFrame();
  JLabel header = new JLabel("Enter Your Grade Below");
  private JTextField answer = new JTextField(30);
  JLabel gwa11 = new JLabel("Grade 11 GWA");
  JLabel gmath = new JLabel("Grade in Math");
  JLabel gsci = new JLabel("Grade in Science");
  JLabel geng = new JLabel("Grade in English");
  JTextField gwa = new JTextField(30);
  JTextField math = new JTextField(30);
  JTextField sci = new JTextField(30);
  JTextField eng = new JTextField(30);
  JPanel panel = new JPanel();
  JLabel gradeGwa = new JLabel();
  public JButton b2 = new JButton("Submit");
  private JTextField answer2 = new JTextField(30);
 
 
 

  public Myframe2() {
   getContentPane().setLayout(new FlowLayout());
   getContentPane().setBackground(Color.black);
   add(header);
   header.setFont(new Font("TAHOMA", Font.BOLD, 25));
   header.setForeground(Color.green);
   add(gwa11);
   gwa11.setForeground(Color.green);
   add(gwa);
   gwa.setFont(font);
   add(gmath);
   gmath.setForeground(Color.green);
   add(math);
   math.setFont(font);
   add(gsci);
   gsci.setForeground(Color.green);
   add(sci);
   sci.setFont(font);
   add(geng);
   geng.setForeground(Color.green);
   add(eng);
   eng.setFont(font);
   add(b2);
   
  
   b2.addActionListener(new ActionListener(){
   @Override
   public void actionPerformed(ActionEvent d){
   
    if(d.getSource().equals(b2)){
    gWa = Integer.parseInt(gwa.getText());
    maTh = Integer.parseInt(math.getText());
    enG = Integer.parseInt(eng.getText());
    sCie = Integer.parseInt(sci.getText());
    grade = (gWa + maTh + enG + sCie) / 4;
    
    if(grade >= 88){
    answer.setText("You are Qualified to BEED");
    gradeGwa.setText("Your Grade = " +grade);
    
    
    }
    
    else if(grade >= 87){
        answer.setText("You are Qualified to BPA-FPM");
        gradeGwa.setText("Your Grade = " +grade);
    
    }
     else if(grade >= 85){
        answer.setText("You are Qualified to BSENT");
        answer2.setText("You are Qualified to BSAM");
        gradeGwa.setText("Your Grade = " +grade);
    
    }
    
    else{
    answer.setText("Your Grade is not Qualified to enroll");
    gradeGwa.setText("Your Grade = " +grade);
    
    }
    
    }
   }
   });
   
   add(answer);
   answer.setFont(font);
   add(answer2);
   answer2.setFont(font);
   add(gradeGwa);
   gradeGwa.setForeground(Color.green);
   gradeGwa.setFont(font);
     
   
   //close the frame 1
   setVisible(true);
   setResizable(false);
   setSize(400,600);
   t.setVisible(false);
   userId.setVisible(false);
   text1.setVisible(false);
   text2.setVisible(false);
   userId2.setVisible(false);
   b.setVisible(false);
   header1.setVisible(false);
   header2.setVisible(false);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
  }
 
  
  
 }
 

 
 
 public JavaGui() {
 Image icon = new ImageIcon(this.getClass().getResource("/PUPLogo.png")).getImage();
 this.setIconImage(icon);
  getContentPane().setLayout(new FlowLayout());
  getContentPane().setBackground(Color.black);
  add(header1);
  add(header2);
  t =  new JTable(data, columnName);
  pack();
  add(t);
  t.setForeground(Color.red);
  add(userId);
  add(text1);
  add(userId2);
  add(text2);
  header1.setFont(font);
  header2.setFont(font);
  header1.setForeground(Color.green);
  header2.setForeground(Color.green);
  userId.setFont(font);
  userId.setForeground(Color.green);
  userId2.setFont(font);
  userId2.setForeground(Color.green);
  title.setFont(font);
  add(b);
  b.setSize(30,300);
  setResizable(false);
  setLocation(300,100);
  setVisible(true);
  setSize(400,600);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  b.setPreferredSize(new Dimension(100,20));
  
  b.addActionListener(this);
  
  
  
 }

 public static void main(String[] args) {
  new JavaGui();

 }
@Override
 public void actionPerformed(ActionEvent e) {
  
  if(e.getSource().equals(b)) {
   
   new Myframe2();
   
    
   
  }
  
  }

 
  
  
  

  
  }