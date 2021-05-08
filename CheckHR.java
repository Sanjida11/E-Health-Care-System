//writing all imports
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class CheckHR extends JFrame{
	//declaring all necessary components
	private JScrollPane s1;
	private JTextArea pres2;
	private Container c;
	private JButton check,check1;
	private Font f,fr;
	private JLabel pres;

	//creating constructor
	CheckHR() throws FileNotFoundException{

		//Properties for the frame
	this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	this.setBounds(420,100,760,760);
	this.setTitle("Check Health Records");

	//Properties for container
	c=this.getContentPane();
	c.setLayout(null);
	c.setBackground(Color.cyan);
	
	f = new Font("Calibri",Font.BOLD,25);
	fr = new Font("Calibri",Font.BOLD,35);

	//creating label

	pres=new JLabel();
	pres.setText("Health Records");
	pres.setBounds(280,30,230,50);
	pres.setFont(fr);
	pres.setForeground(Color.BLACK);
	pres.setOpaque(true);
	pres.setBackground(Color.cyan);
	c.add(pres);
	//creating textarea
	pres2=new JTextArea();
	pres2.setFont(f);
	s1= new JScrollPane(pres2);
	s1.setBounds(120,110,525,500);
	c.add(s1);

	
	//creating button
	check=new JButton();
	check.setText("CHECK");	
	check.setBounds(400,650,150,50);
	check.setFont(f);
	check.setForeground(Color.red);
	check.setOpaque(true);
	check.setBackground(Color.yellow);
	c.add(check);
	//adding action listener
	check.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent arg0) {	
			//reading from file and displaying in text area
			FileReader fr;
			try {
				fr = new FileReader("pen1.txt");
				pres2.read(fr,null);
				fr.close();
			} catch (FileNotFoundException e1) {
				
				e1.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}			
		}});
		
	//creating button
	check1=new JButton();
		check1.setText("GO BACK");	
		check1.setBounds(190,650,190,50);
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
				}}});
	
}
	
	//main method
	public static void main(String[] args) throws FileNotFoundException {
		CheckHR f=new CheckHR();
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);		
		f.setBounds(20,100,760,760);	
		f.setTitle("Main Menu");
		f.setBackground(Color.RED);
	

	}

}
