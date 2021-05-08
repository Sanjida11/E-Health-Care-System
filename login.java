//writing all imports
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class login extends JFrame {
	//declrring necessary components
private JLabel unamer,pwordr;
private JTextField unames,pwords;
//private JPasswordField pwords;
private Font f;
private Container c;
private String username,password;
private JButton login1;
private String tempname="",temppword="";
private static Scanner x;


//creating constructor
login(){
	//Properties for the frame
	this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	this.setBounds(420,100,550,600);
	this.setTitle("LOGIN");
	
	//Properties for container
	c=this.getContentPane();
	c.setLayout(null);
	c.setBackground(Color.cyan);
	f = new Font("Calibri",Font.BOLD,25);

	//creating label
unamer=new JLabel();
unamer.setText("Enter username:");
unamer.setBounds(50,220,210,70);
unamer.setFont(f);
unamer.setForeground(Color.black);
unamer.setOpaque(true);
unamer.setBackground(Color.cyan);
c.add(unamer);

//creating label
pwordr=new JLabel();
pwordr.setText("Enter password:");
pwordr.setBounds(50,270,210,70);
pwordr.setFont(f);
pwordr.setForeground(Color.black);
pwordr.setOpaque(true);
pwordr.setBackground(Color.cyan);
c.add(pwordr);

//creating textfield
unames=new JTextField();
unames.setBounds(300,246,90,30);
unames.setFont(f);
unames.setForeground(Color.black);
unames.setOpaque(true);
unames.setBackground(Color.white);
c.add(unames);

//creating passwordfield
pwords=new JPasswordField();
pwords.setBounds(300,290,90,30);
pwords.setFont(f);
pwords.setForeground(Color.black);
pwords.setOpaque(true);
pwords.setBackground(Color.white);
c.add(pwords);

//creating button
login1=new JButton();
login1.setText("Login");
login1.setBounds(90,480,170,50);
login1.setFont(f);
login1.setForeground(Color.red);
login1.setOpaque(true);
login1.setBackground(Color.white);
c.add(login1);




//adding action listener for button
login1.addActionListener(new ActionListener(){

	@Override
	public void actionPerformed(ActionEvent arg0) {
		menu obj;
		login obj2;
		signup obj3;
			boolean found=false;
			try {
				//using scanner to take user input and using delimeter to check if user input matches contents in the file
				x=new Scanner(new File("heal1.txt"));
				x.useDelimiter("[\n ]");
			while(x.hasNext() && !found)
			{
				tempname=x.next();
				temppword=x.next();
				if(tempname.trim().equals(unames.getText()) && temppword.trim().equals(pwords.getText())) {
				found=true;	
			}}
			if(found==true)
			{
				JOptionPane.showMessageDialog(null, "LOGIN SUCCESSFUL","SUCCESS",1);
				
				setVisible(false);
				new menu().setVisible(true);
			}
			else
			{
	int val=JOptionPane.showConfirmDialog(null, "PASSWORD OR USERNAME DOES NOT MATCH\nWould you like to go back?","ERROR",JOptionPane.YES_NO_OPTION);
		if(val==JOptionPane.NO_OPTION)
		{
			setVisible(false);
			new login().setVisible(true);
		}
		else {
			setVisible(false);
			new signup().setVisible(true);
		}
			}
			
			
			}
			catch (Exception e){
				
			}
	}});

}










//main method
public static void main(String[] args) throws IOException {
	login f=new login();
	f.setVisible(true);
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
f.setBounds(300,200,800,800);
f.setTitle("LOGIN");
f.setBackground(Color.cyan);

}
}
