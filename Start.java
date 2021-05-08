//This is the start class and execution starts from this class


//writing all imports
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Start extends JFrame {
	//declaring necessary components
	private JButton signup,login;
	private JLabel welcome;
	private Container c;
	private Font f;
	
	//creating constructor
Start(){
	
	//Properties for container
	c=this.getContentPane();
	c.setLayout(null);
	c.setBackground(Color.cyan);
	f = new Font("Times New Roman",Font.BOLD,30);
	Font fr = new Font("Times New Roman",Font.BOLD,23);
	
	//creating label
	welcome=new JLabel();
	welcome.setText("Welcome to Main Menu");
	
	welcome.setBounds(150,10,500,50);
	welcome.setFont(f);
	welcome.setForeground(Color.BLACK);
	welcome.setOpaque(true);
	welcome.setBackground(Color.cyan);

	c.add(welcome);
	//creating button
	login=new JButton();
	login.setText("Login");
	login.setBounds(210,100,170,100);
	login.setFont(fr);
	login.setForeground(Color.red);
	login.setOpaque(true);
	login.setBackground(Color.white);

	c.add(login);
	
	//creating button
	signup=new JButton();
	signup.setText("Signup");
	signup.setBounds(210,230,170,100);
	signup.setFont(fr);
	signup.setForeground(Color.red);
	signup.setOpaque(true);
	signup.setBackground(Color.white);

	c.add(signup);
	
	//adding action listener
	login.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			login obj;
			dispose();
			
			try {
				obj = new login();
				obj.setVisible(true);
			} catch (Exception e){
				
				e.printStackTrace();
			}}});
	
	
	//adding action listener
	signup.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			signup obj;
			dispose();
			
			try {
				obj = new signup();
				obj.setVisible(true);
			} catch (Exception e){
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}});
	
}


//main method
	public static void main(String[] args) {
		//Properties for the frame
		Start f=new Start();
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setBounds(300,300,600,500);
		f.setTitle("Main Menu");
		f.setBackground(Color.RED);

	}

}
