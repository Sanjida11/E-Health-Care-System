//writing imports

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class menu extends JFrame {
	//declaring necessary components
	private JLabel menu;
	private JButton hrecords,pmethods,brooms,presdiet,covid19,logout;
	private Container c;
	private Font f;
	
	menu(){
		
		//Properties for the frame
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setBounds(420,300,600,700);
		this.setTitle("MAIN MENU");
		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.cyan);
		
		//Properties for container
		f = new Font("Times New Roman",Font.BOLD,30);
		Font fr = new Font("Times New Roman",Font.BOLD,23);	
		//creating label
		menu=new JLabel();
		menu.setText("Welcome to Main Menu");	
		menu.setBounds(150,10,500,50);
		menu.setFont(f);
		menu.setForeground(Color.BLACK);
		menu.setOpaque(true);
		menu.setBackground(Color.cyan);
		c.add(menu);
		
		//creating button	
		hrecords=new JButton();
		hrecords.setText("Health Records");
		hrecords.setBounds(170,110,250,60);
		hrecords.setFont(fr);
		hrecords.setForeground(Color.red);
		hrecords.setOpaque(true);
		hrecords.setBackground(Color.white);
		c.add(	hrecords);
		//adding action listener
		hrecords.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				HealthRecords obj;
				dispose();
				
				try {
					obj = new HealthRecords();
					obj.setVisible(true);
				} catch (Exception e){
					// TODO Auto-generated catch block
					e.printStackTrace();
				}}});
		//creating button
		logout=new JButton();
		logout.setText("Logout");
		logout.setBounds(170,440,250,60);
		logout.setFont(fr);
		logout.setForeground(Color.red);
		logout.setOpaque(true);
		logout.setBackground(Color.white);
		c.add(	logout);
		//adding action listener
		logout.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
				try {
				System.exit(0);
				} catch (Exception e){
					// TODO Auto-generated catch block
					e.printStackTrace();
				}}});
		//creating button

presdiet=new JButton();
		presdiet.setText("Prescriptions and Diets");
		presdiet.setBounds(100,190,400,60);
		presdiet.setFont(fr);
		presdiet.setForeground(Color.red);
		presdiet.setOpaque(true);
		presdiet.setBackground(Color.white);
		c.add(	presdiet);
		//adding action listener
		presdiet.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					 presDiets obj;
					dispose();
					
					try {
						obj = new presDiets();
						obj.setVisible(true);
					} catch (Exception e){
						// TODO Auto-generated catch block
						e.printStackTrace();
					}}});

		//creating button

		covid19=new JButton();
		covid19.setText("COVID-19 Page");
		covid19.setBounds(100,266,400,60);
		covid19.setFont(fr);
		covid19.setForeground(Color.red);
		covid19.setOpaque(true);
		covid19.setBackground(Color.white);
		c.add(covid19);
		//adding action listener
		covid19.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					covid19 obj;
					dispose();
					
					try {
						obj = new covid19();
						obj.setVisible(true);
					} catch (Exception e){
						// TODO Auto-generated catch block
						e.printStackTrace();
					}}});
		
		//creating button

		brooms=new JButton();
		brooms.setText("Book Hospital Appointments");
		brooms.setBounds(110,350,380,60);
		brooms.setFont(fr);
		brooms.setForeground(Color.red);
		brooms.setOpaque(true);
		brooms.setBackground(Color.white);
		c.add(brooms);
		//adding action listener
		brooms.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				bookapp obj;
				dispose();
				
				try {
					obj = new bookapp();
					obj.setVisible(true);
				} catch (Exception e){
					// TODO Auto-generated catch block
					e.printStackTrace();
				}}});
		
	

	}
	//main method
	public static void main(String[] args) throws IOException {
	menu f=new menu();
	f.setVisible(true);
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	f.setBounds(300,300,600,700);
	f.setTitle("Main Menu");
	f.setBackground(Color.RED);
    f.setVisible(true);
	

	}

}
