//writing immports
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class presDiets extends JFrame {
	//declaring necessary components
private JLabel pres,title,diet;
JTextArea diet11;
private JTextArea pres1,presr1,presr11;
JLabel diet1,dietr,presr;
private JButton save,check,check1;
private Container c;
private Font f,fr,fs;
private String temppres,tempdiet;
static Scanner x;
//creating constructor
presDiets(){
	//Properties for the frame
	this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	this.setBounds(420,100,600,600);
	this.setTitle("Prescriptions and Diets");
	
	//Properties for container
	c=this.getContentPane();
	c.setLayout(null);
	c.setBackground(Color.cyan);
	f = new Font("Times New Roman",Font.BOLD,30);
	fr = new Font("Times New Roman",Font.BOLD,27);
	fs = new Font("Times New Roman",Font.BOLD,21);
	//creating labe;
	pres=new JLabel();
	pres.setText("Prescriptions");
	pres.setBounds(80,100,200,50);
	pres.setFont(fr);
	pres.setForeground(Color.BLACK);
	pres.setOpaque(true);
	pres.setBackground(Color.cyan);
	c.add(pres);
	
	//creating textarea

	pres1=new JTextArea();
	pres1.setForeground(Color.black);
	pres1.setBounds(35,150,250,200);
	pres1.setFont(fs);
	pres1.setForeground(Color.BLACK);
	pres1.setOpaque(true);
	pres1.setBackground(Color.white);
	c.add(pres1);
	//creating label
	diet=new JLabel();
	diet.setText("Diets");
	diet.setBounds(400,100,100,50);
	diet.setFont(fr);
	diet.setForeground(Color.BLACK);
	diet.setOpaque(true);
	diet.setBackground(Color.cyan);
	c.add(diet);
	//creating label
	diet1=new JLabel();
	diet1.setText("Diets");
	diet1.setBounds(400,100,100,50);
	diet1.setFont(fr);
	diet1.setForeground(Color.BLACK);
	diet1.setOpaque(true);
	diet1.setBackground(Color.cyan);
	c.add(diet1);

	//creating textarea

	diet11=new JTextArea();
	diet11.setForeground(Color.black);
	diet11.setBounds(310,150,250,200);
	diet11.setFont(fs);
	diet11.setBorder(null);
	diet11.setForeground(Color.BLACK);
	diet11.setOpaque(true);
	diet11.setBackground(Color.white);
	c.add(diet11);
	//creating label
	title=new JLabel();
	title.setText("Prescriptions and Diets");	
	title.setBounds(140,10,500,50);
	title.setFont(f);
	title.setForeground(Color.BLACK);
	title.setOpaque(true);
	title.setBackground(Color.cyan);
	c.add(title);
	//creating button
	save=new JButton();
	save.setText("SAVE");	
	save.setBounds(50,400,120,50);
	save.setFont(f);
	save.setForeground(Color.red);
	save.setOpaque(true);
	save.setBackground(Color.yellow);
	c.add(save);
	//creating button
	check=new JButton();
	check.setText("CHECK");	
	check.setBounds(400,400,150,50);
	check.setFont(f);
	check.setForeground(Color.red);
	check.setOpaque(true);
	check.setBackground(Color.yellow);
	c.add(check);
	
	//creating button
	check1=new JButton();
	check1.setText("GO BACK");	
	check1.setBounds(190,400,190,50);
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}});
	//adding action listener
	save.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			try {
				FileWriter fw=new FileWriter("health.txt");
				FileWriter fl=new FileWriter("health1.txt");
				
				if(pres1.getText().isEmpty() && diet1.getText().isEmpty() ) 
					{
				JOptionPane.showMessageDialog(null, "FILL IN ATLEAST ONE BOX BEFORE SAVING!!","ERROR",2);
			
				}
					else {
						JOptionPane.showMessageDialog(null, "SAVED!","SAVED",1);
						
						fw.write(diet11.getText());
						fw.close();
						fl.write(pres1.getText());
						fl.close();
				
			} }catch (Exception e){
		
				e.printStackTrace();
			}}});
//adding action listener
	check.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {		
			prescheck obj;
			dispose();
			setVisible(false);
			new prescheck().setVisible(true);
			
		}
	});
}
//main method
	public static void main(String[] args) {
		presDiets f=new presDiets();
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);	
		f.setBounds(20,100,600,600);	
		f.setTitle("Main Menu");
		f.setBackground(Color.RED);


	}

}
