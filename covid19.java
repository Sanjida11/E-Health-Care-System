//writing all imports

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;


public class covid19 extends JFrame {
	//declaring necessary components
	private JButton vcentres,tcentres,enumbers,check1,icentres,reginfo,back;
	private Container c;
	private JLabel covid;
	private Font  f;
	private ImageIcon img;
	
	//creating constructor
	covid19(){
		//Properties for the frame
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setBounds(420,300,600,600);
		this.setTitle("covid19");
		
		//Properties for container
		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.cyan);
		c.setLayout(null);
	
		f = new Font("Times New Roman",Font.BOLD,23);
		//creating label

		covid=new JLabel();
		covid.setText("COVID-19 PAGE");
		covid.setBounds(180,20,300,70);
		covid.setFont(f);
		covid.setForeground(Color.BLACK);
		covid.setOpaque(true);
		covid.setBackground(Color.cyan);
		c.add(covid);
		//creating button
	vcentres=new JButton();
	vcentres.setText("Signs of COVID-19");
	vcentres.setBounds(120,100,300,50);
	vcentres.setFont(f);
	vcentres.setForeground(Color.RED);
	vcentres.setOpaque(true);
	vcentres.setBackground(Color.white);
	c.add(vcentres);
	//adding action listener
	vcentres.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent arg0) {		
		try {
			//using option pane to display information
		JOptionPane.showMessageDialog(null, "Most common symptoms:\r\n" + 
				"fever\r\n" + 
				"dry cough\r\n" + 
				"tiredness\r\n" + 
				"Less common symptoms:\r\n" + 
				"aches and pains\r\n" + 
				"sore throat\r\n" + 
				"diarrhoea\r\n" + 
				"conjunctivitis\r\n" + 
				"headache\r\n" + 
				"loss of taste or smell\r\n" + 
				"a rash on skin, or discolouration of fingers or toes\r\n" + 
				"Serious symptoms:\r\n" + 
				"difficulty breathing or shortness of breath\r\n" + 
				"chest pain or pressure\r\n" + 
				"loss of speech or movement\r\n" + 
				"","Symptoms",1);
		} catch (Exception e){
		
			e.printStackTrace();
		}
	}
});
	//creating button
	icentres=new JButton();
	icentres.setText("Precautionary Measures");
	icentres.setBounds(120,160,300,50);
	icentres.setFont(f);
	icentres.setForeground(Color.RED);
	icentres.setOpaque(true);
	icentres.setBackground(Color.white);
	c.add(icentres);
	
	//adding action listener
	icentres.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		try {
			//using option pane to display information

		JOptionPane.showMessageDialog(null, 
				"Protect yourself and others around you by knowing the facts and taking appropriate precautions. Follow advice provided by your local health authority.\r\n" + 
				"To prevent the spread of COVID-19:\r\n" + 
				"Clean your hands often. Use soap and water, or an alcohol-based hand rub.\r\n" + 
				"Maintain a safe distance from anyone who is coughing or sneezing.\r\n" + 
				"Wear a mask when physical distancing is not possible.\r\n" + 
				"Don’t touch your eyes, nose or mouth.\r\n" + 
				"Cover your nose and mouth with your bent elbow or a tissue when you cough or sneeze.\r\n" + 
				"Stay home if you feel unwell.\r\n" + 
				"If you have a fever, cough and difficulty breathing, seek medical attention.\r\n" + 
				"Calling in advance allows your healthcare provider to quickly direct you to the right health facility. This protects you, and prevents the spread of viruses and other infections.\r\n" + 
				"Masks\r\n" + 
				"Masks can help prevent the spread of the virus from the person wearing the mask to others.\n"
				+ " Masks alone do not protect against COVID-19, and should be combined with physical distancing and hand hygiene.\n"
				+ " Follow the advice provided by your local health authority","Precautions",3);
		} catch (Exception e){
		
			e.printStackTrace();
		}}
	
});

	//creating button
	check1=new JButton();
	check1.setText("GO BACK");	
	check1.setBounds(190,410,190,50);
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
	//creating new button
	tcentres=new JButton();
	tcentres.setText("Testing Centres");
	tcentres.setBounds(120,220,300,50);
	tcentres.setFont(f);
	tcentres.setForeground(Color.RED);
	tcentres.setOpaque(true);
	tcentres.setBackground(Color.white);
	c.add(tcentres);
	//adding action listener
	tcentres.addActionListener(new ActionListener(){
		@Override
	public void actionPerformed(ActionEvent arg0) {		
		try {					//using option pane to display information

		JOptionPane.showMessageDialog(null,
				"No. Division District List of Government RT-PCR Laboratories\r\n" + 
				"1 Barisal Barisal (SBMC) Sher E Bangla Medical College,Barisal\r\n" + 
				"2 Chattogram Chattogram (BITID) Bangladesh Institute of Tropical & Infectious Diseases, Chattagram\r\n" + 
				"3 Chattogram Cox's Bazar (CoxMC) Cox's Bazar Medical College (IEDCR Field Laboratory)\r\n" + 
				"4 Chattogram Cumilla (CuMC) Cumilla Medical College\r\n" + 
				"5 Dhaka Dhaka (NILMRC) National Institute of Laboratory Medicine & Referral Centre\r\n" + 
				"6 Dhaka Dhaka (NPML-IPH) Institute of Public Health\r\n" + 
				"7 Dhaka Dhaka (NIPSOM) National Institute of Public Health\r\n" + 
				"8 Dhaka Narayangonj Narayangonj 300 Bed Hospital\r\n" + 
				"9 Khulna Khulna (KMC) Khulna Medical College\r\n" + 
				"10 Khulna Kustia (KuMC) Kustia Medical College\r\n" + 
				"11 Mymensingh Mymensingh (MMC) Mymensingh Medical College\r\n" + 
				"12 Rajshahi Bogura (SZRMC) Shahid Ziaur Rahman Medical College, Bogura\r\n" + 
				"13 Rajshahi Rajshahi (RMC) Rajshshi Medical College\r\n" + 
				"14 Rangpur Dinajpur M Abdur Rahim Medical College, Dinajpur\r\n" + 
				"15 Rangpur Rangpur (RpMC) Rangpur Medical College\r\n" + 
				"16 Sylhet Sylhet (SOMC) Sylhet MAG Osmani Medical College\r\n" + 
				"17 Noakhali Noakhali Abdul Malek Ukil Medical College, Noakhali\r\n" + 
				"18 Chattogram Chattogram Chattogram Medical College, Chattogram\r\n" + 
				"19 Dhaka Dhaka IEDCR-Govt Employees\r\n" + 
				"20 Dhaka Fulbaria Sarkari Karmochari Hospital\r\n" + 
				"Serial\r\n" + 
				"No. Division District List of Private RT-PCR Laboratories\r\n" + 
				"1 Dhaka Dhaka ICDDR'B, Mohakhali\r\n" + 
				"2 Dhaka Dhaka DMFR- Moliculer lab & Diagnostic, Sobhanbag\r\n" + 
				"3 Dhaka Dhaka LABAID, Dhanmondi\r\n" + 
				"4 Dhaka Dhaka Universal Medical College Hospital, Mohakhali\r\n" + 
				"5 Dhaka Dhaka Ideshi, Mohakhali\r\n" + 
				"6 Dhaka Dhaka Popular Diagnostic Centre, Dhanmondi\r\n" + 
				"7 Dhaka Dhaka Square Hospital, Panthapath\r\n" + 
				"8 Dhaka Dhaka Evercare Hospital, Boshundhara\r\n" + 
				"9 Dhaka Dhaka Prava Diagnostic, Banani\r\n" + 
				"10 Dhaka Dhaka United Hospital, Gulshan\r\n" + 
				"11 Dhaka Dhaka Stemz Health Care\r\n" + 
				"12 Dhaka Dhaka Gulshan Clinic Limited\r\n" + 
				"13 Dhaka Dhaka Anwar Khan Modern Medical College Hospital, Dhanmondi, Dhaka\r\n" + 
				"14 Dhaka Dhaka Novas Clinical Research Service Limited, Paribagh, Dhaka\r\n" + 
				"15 Dhaka Gazipur International Medical College Hospital, Tongi, Gazipur\r\n" + 
				"16 Dhaka Dhaka Green Life Medical College, Dhanmondi, Dhaka\r\n" + 
				"17 Dhaka Dhaka Aichi Hospital Limited, Uttara, Dhaka\r\n" + 
				"18 Rajshahi Bogura TMMS Medical College Hospital & Rafatullah Community Hospital\r\n" + 
				"19 Dhaka Dhaka Medinova Medical Services\r\n" + 
				"20 Dhaka Dhaka Alok Health Care Limited, Mirpur, Dhaka\r\n" + 
				"21 Dhaka Dhaka Health Care Diagnostic Center Limited, Dhaka\r\n" + 
				"22 Dhaka Dhaka Boshundhora Medical & Diagnostic Center Center, Shyamoli, Dhaka\r\n" + 
				"23 Dhaka Dhaka DNA Solution Limited, Bir Uttam Kazi Nazrul Islam Road, West Panthopath, Dhaka\r\n" + 
				"24 Dhaka Dhaka Biomed Diagnostic, Navana Newberry Press, Dhaka\r\n" + 
				"25 Dhaka Dhaka Dynamic Lab Diagnostic & Medical Check-up, Rampura, Dhaka\r\n" + 
				"","Testing centres",2,img);
		} catch (Exception e){	
			e.printStackTrace();
		}
	}	
});
//creating button
	enumbers=new JButton();
	enumbers.setText("Emergency Numbers");
	enumbers.setBounds(120,280,300,50);
	enumbers.setFont(f);
	enumbers.setForeground(Color.RED);
	enumbers.setOpaque(true);
	enumbers.setBackground(Color.white);
	
	c.add(enumbers);
	//adding action listener
	enumbers.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		try {
			//using option pane to display information

		JOptionPane.showMessageDialog(null, "DHAKA\r\n" + 
				"\r\n" + 
				"IEDCR: 02-9898796, 10655, 01944333222, email: iedcrcovid19@gmail.com\r\n" + 
				"\r\n" + 
				"Institute of Public Health: 02-8821361\r\n" + 
				"\r\n" + 
				"Armed Forces Institute of Pathology: 01769-016616\r\n" + 
				"\r\n" + 
				"Bangabandhu Sheikh Mujib Medical University: 01866-637482\r\n" + 
				"\r\n" + 
				"Dhaka Shishu (Children) Hospital and Child Health Research Foundation: 02-48110117\r\n" + 
				"\r\n" + 
				"9 am - 2 pm: 01880156639, 01701265193, 01755507465\r\n" + 
				"\r\n" + 
				"2 pm - 7 pm: 01701265184, 01709958448, 01880156635International Centre for Diarrhoeal Disease Research, Bangladesh (icddr,b): 09666-771100\r\n" + 
				"\r\n" + 
				"Institute of Developing Science and Health Initiative and Health Services (ideSHi) - 01793-163304\r\n" + 
				"\r\n" + 
				"Dhaka National Institute of Laboratory Medicine: 02-913917\r\n" + 
				"\r\n" + 
				"Dhaka Medical College Hospital: 02-55165088\r\n" + 
				"\r\n" + 
				"OUTSIDE DHAKA\r\n" + 
				"\r\n" + 
				"Bangladesh Institute of Tropical and Infectious Diseases, Chattogram: 02-88075042, 02-88075043\r\n" + 
				"\r\n" + 
				"Rangpur Medical College: 0521-63388\r\n" + 
				"\r\n" + 
				"Rajshahi Medical College: 0721-772150\r\n" + 
				"\r\n" + 
				"Mymensingh Medical College: 01306497095, 01306497096\r\n" + 
				"\r\n" + 
				"Sylhet MAG Osmani Medical College Hospital: 01700943274\r\n" + 
				"\r\n" + 
				"OTHER HOTLINES\r\n" + 
				"\r\n" + 
				"Directorate General of Health Services (DGHS): 16263\r\n" + 
				"\r\n" + 
				"National Call Centre: 333\r\n" + 
				"\r\n" + 
				"To report rumours or disinformation, dial: 999 or 9512264, 9514988\r\n" + 
				"\r\n" + 
				"For burial assistance, contact joint secretaries to the health ministry on: 01712080983 and 01552204208\r\n" + 
				"\r\n" + 
				"National helpline for violence against women and children: 109","Emergency Numbers",1);
		} catch (Exception e){
		
			e.printStackTrace();
		}}	
});
	//creating button
	reginfo=new JButton();
	reginfo.setText("Vaccine Registration Steps");
	reginfo.setBounds(100,340,350,50);
	reginfo.setFont(f);
	reginfo.setForeground(Color.RED);
	reginfo.setOpaque(true);
	reginfo.setBackground(Color.white);
	c.add(reginfo);
	
	//adding action listener
	reginfo.addActionListener(new ActionListener(){
	
		@Override
	public void actionPerformed(ActionEvent arg0) {
		
		try {
			Font fr=new Font("Times New Roman",Font.BOLD,15);
			//using option pane to display information

		JOptionPane.showMessageDialog(null, "1.First,	in Surokkha (www.surokkha.gov.bd) You need to enter " + 
				"the web portal or Download Surokkha App from Android Play Store or " + 
				"Apple App Store.\nClicking on the \"Register\" button will bring up a screen." + 
				"Then, select \"Category\" from here.\r\n" + 
				"After selecting \"Category\", a screen will appear.\n Here you " + 
				"have to click on \"Verify\" button after providing National Identity Card, " + 
				"number, date of birth (according to National Identity Card) and CAPTCHA.\nIf all is correct, some Bengali and English names will be\r\n" + 
				"displayed. \nProvide mobile number here (OTP and vaccine information will be notified through SMS to this mobile number).\nAt this stage, select \" Chronic disease / co-morbidity\"\n"+
				" Select whether the job is directly related to " + 
				"Covid-19.\r\n" + 
				" At this stage select the current address on the screen below (Division," + 
				"District, Upazila / Thana / City Corporation, Union / Municipality etc.)\nSelect the center where you want to receive the vaccine. Note that" + 
				"the center will be received according to the selected upazila.\r\n" + 
				" Click the \"Save\" button.\r\n" + 
				" Finally complete the registration by clicking on the 'Status Verify' " + 
				"button with the OTP code received via SMS on the mobile.\nCongratulations! Your registration has been completed successfully. Now\r\n" + 
				"at any time you can Download the Vaccine Card online from the web\r\n" + 
				"portal www.surokkha.gov.bd.","VACCINE REGISTRATION STEPS",3);
		} catch (Exception e){
		
			e.printStackTrace();
		}
	}});
	}
	
	//main method
	public static void main(String[] args) {
		
			covid19 f1=new covid19();
			f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
			f1.add(new JRadioButton("Horizontal"), BorderLayout.WEST);
			f1. add(new JRadioButton("Vertical"), BorderLayout.WEST);
			f1. add(new JTextArea("Instructions to player will go here"), BorderLayout.CENTER);
			f1.setResizable(false);
			f1.setBounds(300,300,600,600);
			f1.setTitle("COVID19 PAGE");
			f1.setBackground(Color.CYAN);
			f1.setVisible(true);
			}

}
