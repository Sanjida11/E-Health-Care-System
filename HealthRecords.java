//writing all imports
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class HealthRecords extends JFrame {
	//declaring necessary components
private JButton save,check,check1;
private JLabel rec,bsugar,sys,dias,temp,hrate,orate,height,weight;
private Font f;
private Container c;
private JTextField bsugar1,temp1,sys1,dias1,hrate1,orate1,height1,weight1;
private JLabel title;

//creating constructor
HealthRecords(){
	//Properties for the frame
	this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	this.setBounds(420,300,850,600);
	this.setTitle("Health Records");
	
	//Properties for container
	c=this.getContentPane();
	c.setLayout(null);
	c.setBackground(Color.cyan);
	
	f = new Font("Times New Roman",Font.BOLD,30);
	Font fr = new Font("Times New Roman",Font.BOLD,21);	
	//creating label
	title=new JLabel();
	title.setText("Health Records");	
	title.setBounds(300,10,500,50);
	title.setFont(f);
	title.setForeground(Color.BLACK);
	title.setOpaque(true);
	title.setBackground(Color.cyan);
	c.add(title);
	//creating label
	bsugar=new JLabel();
	bsugar.setText("Blood Sugar");	
	bsugar.setBounds(70,80,300,50);
	bsugar.setFont(fr);
	bsugar.setForeground(Color.BLACK);
	bsugar.setOpaque(true);
	bsugar.setBackground(Color.cyan);
	c.add(bsugar);
	//creating textfield
	bsugar1=new JTextField();	
	bsugar1.setBounds(320,90,100,30);
	bsugar1.setFont(fr);
	bsugar1.setForeground(Color.BLACK);
	bsugar1.setOpaque(true);
	bsugar1.setBackground(Color.white);
	c.add(bsugar1);
	//creating label
	hrate=new JLabel();
	hrate.setText("Average Heart Rate");	
	hrate.setBounds(450,80,300,50);
	hrate.setFont(fr);
	hrate.setForeground(Color.BLACK);hrate.setOpaque(true);
	hrate.setBackground(Color.cyan);
	c.add(hrate);
	//creating textfield
	hrate1=new JTextField();	
	hrate1.setBounds(680,90,100,30);
	hrate1.setFont(fr);
	hrate1.setForeground(Color.BLACK);
	hrate1.setOpaque(true);
	hrate1.setBackground(Color.white);
	c.add(hrate1);
	//creating label
	orate=new JLabel();
	orate.setText("Average Oxygen Levels");	
	orate.setBounds(450,120,300,50);
	orate.setFont(fr);
	orate.setForeground(Color.BLACK);
	orate.setBackground(Color.cyan);
	c.add(orate);
	//creating textfield
	orate1=new JTextField();	
	orate1.setBounds(680,130,100,30);
	orate1.setFont(fr);
	orate1.setForeground(Color.BLACK);
	orate1.setOpaque(true);
	orate1.setBackground(Color.white);
	c.add(orate1);
	
	//creating label
	height=new JLabel();
	height.setText("Height");	
	height.setBounds(450,165,300,50);
	height.setFont(fr);
	height.setForeground(Color.BLACK);
	height.setBackground(Color.cyan);
	c.add(height);
	//creating textfield
	height1=new JTextField();	
	height1.setBounds(680,177,100,30);
	height1.setFont(fr);
	height1.setForeground(Color.BLACK);
	height1.setOpaque(true);
	height1.setBackground(Color.white);
	c.add(height1);

	//creating label
	weight=new JLabel();
	weight.setText("Weight");	
	weight.setBounds(450,215,300,50);
	weight.setFont(fr);
	weight.setForeground(Color.BLACK);
	hrate.setOpaque(true);
	weight.setBackground(Color.cyan);
	c.add(weight);
	//creating textfield
	weight1=new JTextField();	
	weight1.setBounds(680,222,100,30);
	weight1.setFont(fr);
	weight1.setForeground(Color.BLACK);
	weight1.setOpaque(true);
	weight1.setBackground(Color.white);
	c.add(weight1);
	//creating label
	sys=new JLabel();
	sys.setText("Blood Pressure(Systole)");	
	sys.setBounds(70,120,500,50);
	sys.setFont(fr);
	sys.setForeground(Color.BLACK);
	sys.setOpaque(true);
	sys.setBackground(Color.cyan);
	c.add(sys);
	
	//creating textfield
	sys1=new JTextField();	
	sys1.setBounds(320,130,100,30);
	sys1.setFont(fr);
	sys1.setForeground(Color.BLACK);
	sys1.setOpaque(true);
	sys1.setBackground(Color.white);
	c.add(sys1);
	//creating label
	dias=new JLabel();
	dias.setText("Blood Pressure(Diastole)");	
	dias.setBounds(70,170,500,50);
	dias.setFont(fr);
	dias.setForeground(Color.BLACK);
	dias.setOpaque(true);
	dias.setBackground(Color.cyan);
	c.add(dias);
	
	//creating textfield
	dias1=new JTextField();	
	dias1.setBounds(320,177,100,30);
	dias1.setFont(fr);
	dias1.setForeground(Color.BLACK);
	dias1.setOpaque(true);
	dias1.setBackground(Color.white);
	c.add(dias1);
	
	//creating label
	temp=new JLabel();
	temp.setText("Temperature");	
	temp.setBounds(70,220,500,50);
	temp.setFont(fr);
	temp.setForeground(Color.BLACK);
	temp.setOpaque(true);
	temp.setBackground(Color.cyan);
	c.add(temp);

	//creating textfield
	temp1=new JTextField();	
	temp1.setBounds(320,225,100,30);
	temp1.setFont(fr);
	temp1.setForeground(Color.BLACK);
	temp1.setOpaque(true);
	temp1.setBackground(Color.white);
	c.add(temp1);
	
	//creating button
	save=new JButton();
	save.setText("SAVE");	
	save.setBounds(160,380,120,50);
	save.setFont(f);
	save.setForeground(Color.red);
	save.setOpaque(true);
	save.setBackground(Color.yellow);
	c.add(save);
	
	//creating button
	check=new JButton();
	check.setText("CHECK");	
	check.setBounds(510,380,150,50);
	check.setFont(f);
	check.setForeground(Color.red);
	check.setOpaque(true);
	check.setBackground(Color.yellow);
	c.add(check);
	
	//creating button
	check1=new JButton();
	check1.setText("GO BACK");	
	check1.setBounds(300,380,190,50);
	check1.setFont(f);
	check1.setForeground(Color.red);
	check1.setOpaque(true);
	check1.setBackground(Color.yellow);
	c.add(check1);
	//adding action listener
	save.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
	
			try {
				//writing to file
				FileWriter fw=new FileWriter("pen1.txt",true);
						JOptionPane.showMessageDialog(null, "SAVED!","SAVED",1);						
						fw.write("\r\r\nBlood Sugar:"+bsugar1.getText()+
								"\r\nBloodPressure(Systole):"+sys1.getText()+
								"\r\nBlood Pressure(Diastole):"+dias1.getText()+
								"\r\nTemperature:"+temp1.getText()+
								"\r\nAverage Heart Rate:"+hrate1.getText()+
								"\r\nAverage Oxygen Levels"+orate1.getText()+
								"\r\nHeight:"+height1.getText()+
								"\r\nWeight:"+weight1.getText());
						fw.close();
				
				
		}catch (Exception e){
		
				e.printStackTrace();
			}}});
	//adding action listener
	check.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {	
			CheckHR obj;
			dispose();
			
			try {
				obj = new CheckHR();
				obj.setVisible(true);
			} catch (Exception e){
				
				e.printStackTrace();
			}}});
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
}

//main method	
public static void main(String[] args) {	
		HealthRecords f=new HealthRecords();
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	f.setBounds(300,300,850,500);
	f.setTitle("Main Menu");
	f.setBackground(Color.RED);
	}

}
