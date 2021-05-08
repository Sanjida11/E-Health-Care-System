//writing all imports
import java.awt.Choice;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ChoiceFormat;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class bookapp extends JFrame {
	//declaring necessary components
	private JButton save,check,check1;
	private JLabel rec,welcome,welcome1;
	private Font f;
	private Container c;
	private JLabel title;
	private JScrollPane s,s1;
	private JTextArea pres1,pres2,pres3;
	private JList co,cor;
	private java.util.Date date;

	//creating constructor
	bookapp(){
		//Properties for the frame
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setBounds(420,200,700,800);
		this.setTitle("Book Appointments");
		
		//Properties for container
		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.cyan);
		
		
		f = new Font("Times New Roman",Font.BOLD,30);	
		Font fr = new Font("Times New Roman",Font.BOLD,23);		
		Font fr1 = new Font("Times New Roman",Font.BOLD,16);
		
		//creating label
		title=new JLabel();
		title.setText("Book Appointments");	
		title.setBounds(190,10,500,50);
		title.setFont(f);
		title.setForeground(Color.BLACK);
		title.setOpaque(true);
		title.setBackground(Color.cyan);
		c.add(title);
		
		//creating label
		JLabel title1 = new JLabel();
		title1.setText("Receipt");	
		title1.setBounds(50,400,100,50);
		title1.setFont(fr);
		title1.setForeground(Color.BLACK);
		title1.setOpaque(true);
		title1.setBackground(Color.cyan);
		c.add(title1);
		
		//creating textarea
		pres1=new JTextArea();		
		pres1.setForeground(Color.black);
		pres1.setBounds(170,535,350,40);	
		pres1.setFont(fr1);
		pres1.setForeground(Color.BLACK);
		pres1.setOpaque(true);
		pres1.setBackground(Color.white);
		c.add(pres1);
		
		//creating textarea
		pres2=new JTextArea();
		pres2.setForeground(Color.black);
		pres2.setBounds(170,573,350,40);
		pres2.setFont(fr1);
		pres2.setForeground(Color.BLACK);
		pres2.setOpaque(true);
		pres2.setBackground(Color.white);
		c.add(pres2);
		
		//creating textarea
		pres3=new JTextArea();	
		pres3.setForeground(Color.black);
		pres3.setBounds(170,420,350,115);
		pres3.setFont(fr1);
		pres3.setForeground(Color.BLACK);
		pres3.setBackground(Color.white);
		c.add(pres3);
		
		//creating button
		save=new JButton();
		save.setText("BOOK");	
		save.setBounds(30,670,140,50);
		save.setFont(f);
		save.setForeground(Color.red);
		save.setOpaque(true);
		save.setBackground(Color.yellow);
		c.add(save);



		//adding action listener
		save.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent arg0) {
		login obj;
		try {
			//writing to file
		FileWriter fw=new FileWriter("pet.txt");
		FileWriter fp=new FileWriter("pes.txt");
		 JOptionPane.showMessageDialog(null, "SAVED","SAVED",1);
		if(co.getSelectedIndex()==1) {
				
					fw.write("Department:Cardiology\r\nFees:5000 tk");
					fw.close();
				}else if(co.getSelectedIndex()==2) {
	
					fw.write("Department:A&E\r\nFees:3000 tk");
					fw.close();
				}
		else if(co.getSelectedIndex()==0) {
	
			fw.write("Department:Medicine\r\nFees:3000 tk");
			fw.close();}else if(co.getSelectedIndex()==3) {
		
					fw.write("Department:Anestheics\r\nFees:2000 tk");
					fw.close();
				}else if(co.getSelectedIndex()==4) {
		
					fw.write("Department:Breast Screening\r\nFees:5000 tk");
					fw.close();
				}
				else if(co.getSelectedIndex()==5) {
			
					fw.write("Department:CCU\r\nFees:5000 tk");
					fw.close();
				}else if(co.getSelectedIndex()==6) {

					fw.write("Department:Diagnostic Imaging\r\nFees:3500 tk");
					fw.close();
				}else if(co.getSelectedIndex()==7) {
					
					fw.write("Department:Gastroentrology\r\nFees:3000 tk");
					fw.close();
				}else if(co.getSelectedIndex()==8) {
					fw.write("Department:Gynaecology\r\nFees:4000 tk");
					fw.close();
				}else if(co.getSelectedIndex()==9) {
					fw.write("Department:Haematology\r\nFees:3500 tk");
					fw.close();
				}else if(co.getSelectedIndex()==10) {
					fw.write("Department:ICU\r\nFees:6000 tk");
					fw.close();
				}else if(co.getSelectedIndex()==11) {
					fw.write("Department:Nephrology\r\nFees:5000 tk");
					fw.close();
				}else if(co.getSelectedIndex()==12) {
					fw.write("Department:Neurology\r\nFees:3000 tk");
					fw.close();}else if(co.getSelectedIndex()==13) {
					fw.write("Department:Opthamology\r\nFees:3000 tk");
					fw.close();
				}else if(co.getSelectedIndex()==14) {
					fw.write("Department:Oncology\r\nFees:3000 tk");
					fw.close();
				}else if(co.getSelectedIndex()==15) {
					fw.write("Department:Orthopadics\r\nFees:4000 tk");
					fw.close();
				}else if(co.getSelectedIndex()==16) {
					fw.write("Department:Physiotherapy\r\nFees:3000 tk");
					fw.close();
				}else if(co.getSelectedIndex()==17) {
					fw.write("Department:Radiology\r\nFees:5000 tk");
					fw.close();
				}else if(co.getSelectedIndex()==18) {
					fw.write("Department:Renal\r\nFees:5000 tk");
					fw.close();
				}else if(co.getSelectedIndex()==19) {
					fw.write("Department:Rheumatology\r\nFees:4000 tk");
					fw.close();
				}
	
				 if(cor.getSelectedIndex()==0) {
						fp.write("Time:12:00\r\nBooked on:"+java.time.LocalDate.now());
						fp.close();
					}
					else if(cor.getSelectedIndex()==1) {
						fp.write("Time:1:00\r\nBooked on:"+java.time.LocalDate.now());
						fp.close();
					}
					else if(cor.getSelectedIndex()==2) {
						fp.write("Time:2:00\r\nBooked on:"+java.time.LocalDate.now());
						fp.close();
					}
					else if(cor.getSelectedIndex()==3) {
						fp.write("Time:3:00\r\nBooked on:"+java.time.LocalDate.now());
						fp.close();
					}
					else if(cor.getSelectedIndex()==4) {
						fp.write("Time:4:00\r\nBooked on:"+java.time.LocalDate.now());
						fp.close();
					}
					else if(cor.getSelectedIndex()==5) {
						fp.write("Time:5:00\r\nBooked on:"+java.time.LocalDate.now());
						fp.close();
					}
					else if(cor.getSelectedIndex()==6) {
						fp.write("Time:6:00\r\nBooked on:"+java.time.LocalDate.now());
						fp.close();
					}
					else if(cor.getSelectedIndex()==7) {
						fp.write("Time:7:00\r\nBooked on:"+java.time.LocalDate.now());
						fp.close();
					}
					else if(cor.getSelectedIndex()==8) {
						fp.write("Time:8:00\r\nBooked on:"+java.time.LocalDate.now());
						fp.close();
					}
					else if(cor.getSelectedIndex()==9) {
						fp.write("Time:9:00\r\nBooked on:"+java.time.LocalDate.now());
						fp.close();
					}
					else if(cor.getSelectedIndex()==10) {
						fp.write("Time:10:00\r\nBooked on:"+java.time.LocalDate.now());
						fp.close();
					}
					else if(cor.getSelectedIndex()==11) {
						fp.write("Time:11:00\r\nBooked on:"+java.time.LocalDate.now());
						fp.close();
					}
					else if(cor.getSelectedIndex()==12) {
						fp.write("Time:24:00\r\nBooked on:"+java.time.LocalDate.now());
						fp.close();
					}
					else if(cor.getSelectedIndex()==13) {
						fp.write("Time:13:00\r\nBooked on:"+java.time.LocalDate.now());
						fp.close();
					}
					else if(cor.getSelectedIndex()==14) {
						fp.write("Time:14:00\r\nBooked on:"+java.time.LocalDate.now());
						fp.close();
					}
					else if(cor.getSelectedIndex()==15) {
						fp.write("Time:15:00\r\nBooked on:"+java.time.LocalDate.now());
						fp.close();
					}
					else if(cor.getSelectedIndex()==16) {
						fp.write("Time:16:00\r\nBooked on:"+java.time.LocalDate.now());
						fp.close();
					}
					else if(cor.getSelectedIndex()==17) {
						fp.write("Time:17:00\r\nBooked on:"+java.time.LocalDate.now());
						fp.close();
					}
					else if(cor.getSelectedIndex()==18) {
						fp.write("Time:18:00\r\nBooked on:"+java.time.LocalDate.now());
						fp.close();
					}
					else if(cor.getSelectedIndex()==19) {
						fp.write("Time:19:00\r\nBooked on:"+java.time.LocalDate.now());
						fp.close();
					}
					else if(cor.getSelectedIndex()==20) {
						fp.write("Time:20:00\r\nBooked on:"+java.time.LocalDate.now());
						fp.close();
					}
					else if(cor.getSelectedIndex()==21) {
						fp.write("Time:21:00\r\nBooked on:"+java.time.LocalDate.now());
						fp.close();
					}
					else if(cor.getSelectedIndex()==22) {
						fp.write("Time:22:00\r\nBooked on:"+java.time.LocalDate.now());
						fp.close();
					}
					else if(cor.getSelectedIndex()==23) {
						fp.write("Time:23:00\r\nBooked on:"+java.time.LocalDate.now());
						fp.close();
					}
					else if(cor.getSelectedIndex()==24) {
						fp.write("Time:24:00");
						fp.close();
					}
				
		}
	catch(Exception e){
		
	}
	}
});

		//creating button
		check=new JButton();
		check.setText("RECEIPT");	
		check.setBounds(400,670,180,50);
		check.setFont(f);
		check.setForeground(Color.red);
		check.setOpaque(true);
		check.setBackground(Color.yellow);
		c.add(check);
		//adding action listener
		check.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {	
				FileReader fr;
				FileReader fc;
				FileReader f0;
				try {
					f0 = new FileReader("pro2.txt");
					BufferedReader fe=new BufferedReader(f0);
					pres3.read(f0, null);
					f0.close();		
					fr = new FileReader("pet.txt");
					pres1.read(fr, null);
					fr.close();
					fc = new FileReader("pes.txt");
					pres2.read(fc, null);
					fc.close();				
				}
				catch (FileNotFoundException e1) {
					e1.printStackTrace();} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		});
		
		//creating label
		welcome=new JLabel();
		welcome.setText("Select Department");		
		welcome.setBounds(30,100,200,50);
		welcome.setFont(fr);
		welcome.setForeground(Color.BLACK);
		welcome.setOpaque(true);
		welcome.setBackground(Color.cyan);
		c.add(welcome);
	
		//creating label
		welcome1=new JLabel();
		welcome1.setText("Select Time");		
		welcome1.setBounds(60,250,200,50);
		welcome1.setFont(fr);
		welcome1.setForeground(Color.BLACK);
		welcome1.setOpaque(true);
		welcome1.setBackground(Color.cyan);
		c.add(welcome1);
		
		//creating a string array to store department names
		String[] arr= {"Medicine","Cardiology","A&E","Anesthetics","Breast Screening","CCU","Diagnostic Imaging","Gastroenterology",
				"Gynecology","Haematology","ICU",
				"Nephrology","Neurology","Opthamology","Oncology","Orthopaedics",
			"Physiotherapy","Radiology","Renal",	"Rheumatology"};
		//adding array to list
		 co=new JList(arr);
		co.setFont(fr);
		//adding list to scrollpane
		s=new JScrollPane(co);
		s.setBounds(260,100,300,80);
		c.add(s);
		//creating string array to store times
		String[] arr1= {"12:00","1:00","2:00","3:00","4:00","5:00","6:00",
				"7:00","8:00","9:00","10:00","11:00","24:00","13:00","14:00","15:00","16:00",
				"17:00","18:00","19:00","20:00","21:00","22:00","23:00"};
		//adding array to list
		 cor=new JList(arr1);
		cor.setFont(fr);
		//adding list to scrollpane
		s1=new JScrollPane(cor);
		s1.setBounds(260,250,300,80);
		c.add(s1);
		
		
		//creating button
		check1=new JButton();
		check1.setText("GO BACK");	
		check1.setBounds(190,670,190,50);
		check1.setFont(f);
		check1.setForeground(Color.red);
		check1.setOpaque(true);
		check1.setBackground(Color.yellow);
		c.add(check1);
		//adding action listener
		check1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				menu obj;
				dispose();
				
				try {
					obj = new menu();
					obj.setVisible(true);
				} catch (Exception e){
					e.printStackTrace();
				}
				}
		});

}

	//main method
	public static void main(String[] args) {
		bookapp f=new bookapp();
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	f.setBounds(300,200,700,800);
	f.setTitle("Main Menu");
	f.setBackground(Color.RED);

	}

}
