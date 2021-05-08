//writing all imports
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class prescheck extends JFrame {
	//decaring necessary components
private JTextArea pres2,pres3;
private JLabel dietr,presr,diet,pres;
private JButton check,check1;
private Container c;
private Font f,fr,fs;
	
	//creating constructor
	prescheck(){
		//Properties for the frame
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setBounds(420,100,800,700);
		this.setTitle("Check Prescriptions and Diets");
		
		//Properties for container
		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.cyan);
		f = new Font("Times New Roman",Font.BOLD,30);
		fr = new Font("Times New Roman",Font.BOLD,27);
		fs = new Font("Times New Roman",Font.BOLD,21);
		//creating textarea
		pres2=new JTextArea();
		pres2.setForeground(Color.black);
		pres2.setBounds(30,160,350,300);
		pres2.setFont(fs);
		pres2.setForeground(Color.BLACK);
		pres2.setOpaque(true);
		pres2.setBackground(Color.white);
		c.add(pres2);
		//creating textarea

		pres3=new JTextArea();
		pres3.setForeground(Color.black);
		pres3.setBounds(400,160,350,300);
		pres3.setFont(fs);
		pres3.setForeground(Color.BLACK);
		pres3.setBackground(Color.white);
		c.add(pres3);
		//creating label
		pres=new JLabel();
		pres.setText("Check Prescriptions");
		pres.setBounds(80,100,300,50);
		pres.setFont(fr);
		pres.setForeground(Color.BLACK);
		pres.setOpaque(true);
		pres.setBackground(Color.cyan);
		c.add(pres);
		//creating label
		diet=new JLabel();
		diet.setText("Check Diets");	
		diet.setBounds(500,100,300,50);
		diet.setFont(fr);
		diet.setForeground(Color.BLACK);
		diet.setOpaque(true);
		diet.setBackground(Color.cyan);
		c.add(diet);
		//creating button
		check=new JButton();
		check.setText("CHECK");	
		check.setBounds(400,500,150,50);
		check.setFont(f);
		check.setForeground(Color.red);
		check.setOpaque(true);
		check.setBackground(Color.yellow);
		c.add(check);
		//creating button
		check1=new JButton();
		check1.setText("GO BACK");	
		check1.setBounds(190,500,190,50);
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
		check.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {	
			
		
				FileReader fr,fe;
			
				try {
					
					fe = new FileReader("health1.txt");
					pres2.read(fe, null);
					fe.close();
					fr = new FileReader("health.txt");
					pres3.read(fr, null);
					fr.close();
				}catch (Exception e){
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}});
	
	}
	//main method
	public static void main(String[] args) throws IOException {
		prescheck f=new prescheck();
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setBounds(300,200,800,800);
		f.setTitle("LOGIN");
		f.setBackground(Color.pink);

	}
}
