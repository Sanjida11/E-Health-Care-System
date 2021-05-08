
//writing all imports
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class signup extends JFrame {
	//declaring necessary components
private String username,name,email,bgroup;
char[] password;
private String age;
private String mobile;
private JTextField names,ages,bgrps,emails,mobiles,unames;
private JLabel namer,ager,bgrpr,emailr,mobiler,unamer,pwordr,gender,male1,male2,female1;
private JButton register;
private Font f;
private int flag=0;
private Container c;
private String tempname="",temppword="";
private JPasswordField pwords;
private static Scanner x;
private JCheckBox male,female;
File fo;


signup() throws IOException{
	//Properties for the frame
	this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	this.setBounds(420,300,500,600);
	this.setTitle("SIGNUP");
	
	//Properties for container
	c=this.getContentPane();
	c.setLayout(null);
	c.setBackground(Color.cyan);
	f = new Font("Times New Roman",Font.BOLD,16);
	
	//creating textfield
		names=new JTextField();
		names.setBounds(230,60,90,30);
		names.setFont(f);
		names.setForeground(Color.black);
		names.setOpaque(true);
		names.setBackground(Color.white);
		name=names.getText();
		name=names.getText();
		c.add(names);

		//creating textfield
		ages=new JTextField();
		ages.setBounds(230,100,90,30);
		ages.setFont(f);
		ages.setForeground(Color.black);
		ages.setOpaque(true);
		ages.setBackground(Color.white);
	    age=ages.getText();
	    age=ages.getText();
		c.add(ages);

		//creating textfield
		bgrps=new JTextField();
		bgrps.setBounds(230,140,90,30);
		bgrps.setFont(f);
		bgrps.setForeground(Color.black);
		bgrps.setOpaque(true);
		bgrps.setBackground(Color.white);
		bgroup=bgrps.getText();
		c.add(bgrps);

		//creating textfield
		emails=new JTextField();
		emails.setBounds(230,180,90,30);
		emails.setFont(f);
		emails.setForeground(Color.black);
		emails.setOpaque(true);
		emails.setBackground(Color.white);
        email=emails.getText();
		c.add(emails);

		//creating textfield
		mobiles=new JTextField();
		mobiles.setBounds(230,220,90,30);
		mobiles.setFont(f);
		mobiles.setForeground(Color.black);
		mobiles.setOpaque(true);
		mobiles.setBackground(Color.white);
		mobile=mobiles.getText();
		c.add(mobiles);

		//creating textfield
		unames=new JTextField();
		unames.setBounds(230,296,90,30);
		unames.setFont(f);
		unames.setForeground(Color.black);
		unames.setOpaque(true);
		unames.setBackground(Color.white);
		c.add(unames);
	
		//creating checkbox
		male=new JCheckBox();
		male.setBounds(270,260,30,30);
		male.setFont(f);
		male.setForeground(Color.black);
		male.setOpaque(true);
		male.setBackground(Color.cyan);
		c.add(male);
		
		//creating label
		male1=new JLabel();
		male1.setText("Male");
		male1.setBounds(230,250,50,50);
		male1.setFont(f);
		male1.setForeground(Color.black);
		male1.setOpaque(true);
		male1.setBackground(Color.cyan);
		c.add(male1);
		
		//creating checkbox
		female=new JCheckBox();
		female.setBounds(365,260,30,30);
		female.setFont(f);
		female.setForeground(Color.black);
		female.setOpaque(true);
		female.setBackground(Color.cyan);
		c.add(female);
		
		//creating label

		female1=new JLabel();
		female1.setText("Female");
		female1.setBounds(310,250,70,50);
		female1.setFont(f);
		female1.setForeground(Color.black);
		female1.setOpaque(true);
		female1.setBackground(Color.cyan);
		c.add(female1);

		//creating password field
		pwords=new JPasswordField();
		pwords.setBounds(230,336,90,30);
		pwords.setFont(f);
		pwords.setForeground(Color.black);
		pwords.setOpaque(true);
		pwords.setBackground(Color.white);
		password=((JPasswordField) pwords).getPassword();
		c.add(pwords);
	
			
		
			
		
		//creating label

		namer=new JLabel();
		namer.setText("Enter Name:");
		namer.setBounds(50,50,100,40);
		namer.setFont(f);
		namer.setForeground(Color.black);
		namer.setOpaque(true);
		namer.setBackground(Color.cyan);	
		c.add(namer);
		
		//creating label
		ager=new JLabel();
		ager.setText("Enter age:");
		ager.setBounds(50,80,80,70);
		ager.setFont(f);
		ager.setForeground(Color.black);
		ager.setOpaque(true);
		ager.setBackground(Color.cyan);
		c.add(ager);
		
		//creating label
		bgrpr=new JLabel();
		bgrpr.setText("Enter blood group:");
		bgrpr.setBounds(50,130,160,50);
		bgrpr.setFont(f);
		bgrpr.setForeground(Color.black);
		bgrpr.setOpaque(true);
		bgrpr.setBackground(Color.cyan);
		c.add(bgrpr);
		//creating label
		emailr=new JLabel();
		emailr.setText("Enter e-mail:");
		emailr.setBounds(50,170,120,50);
		emailr.setFont(f);
		emailr.setForeground(Color.black);
		emailr.setOpaque(true);
		emailr.setBackground(Color.cyan);
		c.add(emailr);
		
		//creating label
		mobiler=new JLabel();
		mobiler.setText("Enter contact number:");
		mobiler.setBounds(50,210,160,50);
		mobiler.setFont(f);
		mobiler.setForeground(Color.black);
		mobiler.setOpaque(true);
		mobiler.setBackground(Color.cyan);
		c.add(mobiler);
		
		//creating label

		gender=new JLabel();
		gender.setText("Select Gender:");
		gender.setBounds(50,240,160,70);
		gender.setFont(f);
		gender.setForeground(Color.black);
		gender.setOpaque(true);
		gender.setBackground(Color.cyan);
		c.add(gender);
		
		//creating label

		unamer=new JLabel();
		unamer.setText("Enter username:");
		unamer.setBounds(50,280,160,70);
		unamer.setFont(f);
		unamer.setForeground(Color.black);
		unamer.setOpaque(true);
		unamer.setBackground(Color.cyan);
		c.add(unamer);
		
		//creating label

		pwordr=new JLabel();
		pwordr.setText("Enter password:");
		pwordr.setBounds(50,320,160,70);
		pwordr.setFont(f);
		pwordr.setForeground(Color.black);
		pwordr.setOpaque(true);
		pwordr.setBackground(Color.cyan);
		c.add(pwordr);
		
		//creating button
		register=new JButton();
		register.setText("SIGNUP");
		register.setBounds(90,400,170,50);
		register.setFont(f);
		register.setForeground(Color.red);
		register.setOpaque(true);
		register.setBackground(Color.white);
		c.add(register);


//adding action listener
register.addActionListener(new ActionListener(){

	@Override
	public void actionPerformed(ActionEvent arg0) {
		login obj;
		try {
			//writing user input to file
		FileWriter ft=new FileWriter("heal1.txt",true);
		BufferedWriter f1=new BufferedWriter(ft);
		PrintWriter fw=new PrintWriter(f1);
		FileWriter fp=new FileWriter("pro2.txt");	

	if(pwords.getText().length()<6)
	{
		JOptionPane.showMessageDialog(null, "PASSWORD SHOULD HAVE ATLEAST 6 CHARACTERS","ERROR",2);
	}

		
				else {
					JOptionPane.showMessageDialog(null, "SUCCESS","SUCCESS",2);
					
					fw.write("\r\n"+unames.getText()+" "+pwords.getText());
					fw.close();
					if(male.isSelected()==true) {
					fp.write("Name:"+names.getText()+"\r\n"+"Age:"+ages.getText()+"\r\nContact number:"+mobiles.getText()+
							" \r\nE-mail:"+emails.getText()+" \r\nBlood Group:"+bgrps.getText()+"\r\nGender:Male");
					fp.close();}
					else if(female.isSelected()==true) {
						fp.write("Name:"+names.getText()+"\r\n"+"Age:"+ages.getText()+"\r\nContact number:"+mobiles.getText()+
								" \r\nE-mail:"+emails.getText()+" \r\nBlood Group:"+bgrps.getText()+"\r\nGender:Female");
						fp.close();}
					setVisible(false);
					new login().setVisible(true);
					
		}}
		
	catch(Exception e){
	}}
	
});

}

//Main method
public static void main(String[] args) throws IOException {
	signup f=new signup();

	f.setVisible(true);
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
f.setBounds(300,200,500,600);
f.setTitle("SIGNUP");
f.setBackground(Color.cyan);

}


}
