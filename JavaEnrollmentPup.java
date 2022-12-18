package part1_java_final;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JavaEnrollmentPup {

	public static void main(String[] args) {
	

		//variable declaration
		String studName;
		int engGrade, mathGrade, scienceGrade, hsGwa;
		double genAve;
		
		
	
		
		
		//Construct
		JTextArea myArea = new JTextArea(20,80);
		JScrollPane myScroll = new JScrollPane(myArea);
		String[] choice = new String[] {"BEED", "BPA-FPM","BSAM","BSENT","BSOA","DIT","DOMTMOM"};
		String[] choice2 = new String[] {"BPA-FPM","BSAM","BSENT","BSOA","DIT"};
		
		
		//text to display
		myArea.setText("\t\t\tPOLYTECHNIC UNIVERSITY OF TH PHILIPPINES"+
		"\n\t\t\t\tMulanay, Quezon Branch"+"\n"+
		"\nAcademic Programs"+"\tMin Grade 10 and 11 GWA"+"\tMin Grade in Math"+
		"\tMin Grade in Science"+"\tMin Grade in English"+
		"\nBEED"+"\t\t88"+"\t\t88"+"\t\t88"+"\t\t88"
		+"\nBPA-FPM"+"\t\t85"+"\t\t82"+"\t\t82"+"\t\t85"
		+"\nBSAM"+"\t\t85"+"\t\t85"+"\t\t85"+"\t\t85"
		+"\nBSENT"+"\t\t82"+"\t\t82"+"\t\t82"+"\t\t82"
		+"\nBSOA"+"\t\t85"+"\t\t85"+"\t\t85"+"\t\t85"
		+"\nDIT"+"\t\t82"+"\t\t82"+"\t\t82"+"\t\t82"
		+"\nDOMTMOM"+"\t\t82"+"\t\t82"+"\t\t82"+"\t\t82"
				);
		myArea.setFont(new Font("Tahoma",Font.BOLD, 12));
		myArea.setBackground(Color.black);
		myArea.setForeground(Color.white);
		
		//output
		studName = JOptionPane.showInputDialog("Please Enter your Name");
		JOptionPane.showMessageDialog(null, myScroll, "PUP MUlanay",JOptionPane.PLAIN_MESSAGE);
		
		while(true) {
		int response = JOptionPane.showOptionDialog(null,"Hello " +studName +"\nSelect your Desire Program",
                "PUP Mulanay",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null,
                choice, choice[0]);
		
		if(response == 0) {
	
			hsGwa = Integer.parseInt(JOptionPane.showInputDialog("Enter your Grade 10 & 11 GWA"));
			engGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter your Engish Grade"));
			scienceGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter your Math Grade"));
			mathGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter your Scince"));
			
			genAve = (engGrade + mathGrade + scienceGrade + hsGwa ) / 4;
			
			if(genAve >= 88) {
				
				JOptionPane.showMessageDialog(null,"Youre Qualified to BEED Program","Congratulations",JOptionPane.PLAIN_MESSAGE);
				break;
			}
			
			else {
				JOptionPane.showMessageDialog(null,"Please Select program base on your GWA","Invalid",JOptionPane.ERROR_MESSAGE);
				
				
			}
			
			
		}
		
		else if(response == 1) {
			hsGwa = Integer.parseInt(JOptionPane.showInputDialog("Enter your Grade 10 & 11 GWA"));
			engGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter your Engish Grade"));
			scienceGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter your Math Grade"));
			mathGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter your Scince"));
			
			genAve = (engGrade + mathGrade + scienceGrade + hsGwa ) / 4;
			
			
			if(genAve >= 85) {
				
				JOptionPane.showMessageDialog(null,"Youre Qualified to BPA-FPM Program","Congratulations",JOptionPane.PLAIN_MESSAGE);
				break;
			}
			
			else {
				JOptionPane.showMessageDialog(null,"Please Select program base on your GWA","Invalid",JOptionPane.ERROR_MESSAGE);
				
				
			}
			
			
			
		}
		
		else if(response == 2) {
			hsGwa = Integer.parseInt(JOptionPane.showInputDialog("Enter your Grade 10 & 11 GWA"));
			engGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter your Engish Grade"));
			scienceGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter your Math Grade"));
			mathGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter your Scince"));
			
			genAve = (engGrade + mathGrade + scienceGrade + hsGwa ) / 4;
			
			
			if(genAve >= 85) {
				
				JOptionPane.showMessageDialog(null,"Youre Qualified to BSAM Program","Congratulations",JOptionPane.PLAIN_MESSAGE);
				break;
			}
			
			else {
				JOptionPane.showMessageDialog(null,"Please Select program base on your GWA","Invalid",JOptionPane.ERROR_MESSAGE);
				
				
			}
			
			
			
		}
		
		else if(response == 3) {
			hsGwa = Integer.parseInt(JOptionPane.showInputDialog("Enter your Grade 10 & 11 GWA"));
			engGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter your Engish Grade"));
			scienceGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter your Math Grade"));
			mathGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter your Scince"));
			
			genAve = (engGrade + mathGrade + scienceGrade + hsGwa ) / 4;
			
			
			if(genAve >= 82) {
				
				JOptionPane.showMessageDialog(null,"Youre Qualified to BSENT Program","Congratulations",JOptionPane.PLAIN_MESSAGE);
				break;
			}
			
			else {
				JOptionPane.showMessageDialog(null,"Please Select program base on your GWA","Invalid",JOptionPane.ERROR_MESSAGE);
				
				
			}
			
			
			
		}
		
		else if(response == 4) {
			hsGwa = Integer.parseInt(JOptionPane.showInputDialog("Enter your Grade 10 & 11 GWA"));
			engGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter your Engish Grade"));
			scienceGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter your Math Grade"));
			mathGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter your Scince"));
			
			genAve = (engGrade + mathGrade + scienceGrade + hsGwa ) / 4;
			
			
			if(genAve >= 82) {
				
				JOptionPane.showMessageDialog(null,"Youre Qualified to BSOA Program","Congratulations",JOptionPane.PLAIN_MESSAGE);
				break;
			}
			
			else {
				JOptionPane.showMessageDialog(null,"Please Select program base on your GWA","Invalid Grade",JOptionPane.ERROR_MESSAGE);
				
				
			}
			
			
			
		}
		
		else if(response == 5) {
			hsGwa = Integer.parseInt(JOptionPane.showInputDialog("Enter your Grade 10 & 11 GWA"));
			engGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter your Engish Grade"));
			scienceGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter your Math Grade"));
			mathGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter your Scince"));
			
			genAve = (engGrade + mathGrade + scienceGrade + hsGwa ) / 4;
			
			
			if(genAve >= 82) {
				
				JOptionPane.showMessageDialog(null,"Youre Qualified to DIT Program","Congratulations",JOptionPane.PLAIN_MESSAGE);
				break;
			}
			
			else {
				JOptionPane.showMessageDialog(null,"You are not Qualified to Enroll","Invalid Grade",JOptionPane.ERROR_MESSAGE);
				
				
			}
			
			
			
		}
		else if(response == 6) {
			hsGwa = Integer.parseInt(JOptionPane.showInputDialog("Enter your Grade 10 & 11 GWA"));
			engGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter your Engish Grade"));
			scienceGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter your Math Grade"));
			mathGrade = Integer.parseInt(JOptionPane.showInputDialog("Enter your Scince"));
			
			genAve = (engGrade + mathGrade + scienceGrade + hsGwa ) / 4;
			
			
			if(genAve == 82 || genAve == 83) {
				
				JOptionPane.showMessageDialog(null,"Youre Qualified to DOMTMOM Program","Congratulations",JOptionPane.PLAIN_MESSAGE);
				break;
				
			}
			
			else if(genAve >= 84) {
				
				int response2 = JOptionPane.showOptionDialog(null,"Hello " +studName +"\nYour Grade is Qualified to DOMTMOM\n"
						+ "But your grade is Higher than required GWA to DOMTMOM\nYou can Choose with the Program below",
		                "PUP Mulanay",
		                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null,
		                choice2, choice2[0]);
				
				if(response2 == 0 ) {
					
				JOptionPane.showMessageDialog(null, "You are Qualified to BPA-FPM Program","Congratulations",
							JOptionPane.PLAIN_MESSAGE);
				break;
					
				}
				
				else if(response2 == 1 ) {
					JOptionPane.showMessageDialog(null, "You are Qualified to BSAM Program","Congratulations",
								JOptionPane.PLAIN_MESSAGE);
					break;
				}	
				else if(response2 == 2 ) {
					JOptionPane.showMessageDialog(null, "You are Qualified to BSENT Program","Congratulations",
								JOptionPane.PLAIN_MESSAGE);
					break;
				}
				else if(response2 == 3 ) {
					JOptionPane.showMessageDialog(null, "You are Qualified to BSOA Program","Congratulations",
								JOptionPane.PLAIN_MESSAGE);
					break;
				}	
				else if(response2 == 4 ) {
					JOptionPane.showMessageDialog(null, "You are Qualified to DIT Program","Congratulations",
								JOptionPane.PLAIN_MESSAGE);
					break;
				}	
				
				
				
				
			}
			
			else {
				JOptionPane.showMessageDialog(null,"You are not Qualified to Enroll","Invalid Grade",JOptionPane.ERROR_MESSAGE);
				
				
			}
			
			
			
		}
		
		else {
			
			JOptionPane.showMessageDialog(null, "Error", 
	        		"Invalid Selection", JOptionPane.ERROR_MESSAGE);
	              System.exit(0);
			
		}
		
		
		
		
		
		
		
		
		
		}
		
		
		
		

	}

}
