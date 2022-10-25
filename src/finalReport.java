import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class finalReport extends JFrame {
	private JPanel contentPane;
	private JLabel textField;
	private JLabel textField_1;
	private JLabel textField_2;
	private JLabel textField_3;
	private JLabel textField_4;
	private JLabel textField_5;
	private JLabel textField_6;
	private JLabel textField_7;
	private JLabel textField_8;

	/**
	 * Launch the application.
	 */
	Connection con=null;
	PreparedStatement pstmnt=null;
	

	

	/**
	 * Create the frame.
	 */
	public finalReport(ArrayList a) {
		initComponents();
		
		this.setVisible(true);
		textField.setText((String)a.get(0));
		textField_1.setText((String)a.get(1));
		textField_2.setText((String)a.get(2));		
		textField_3.setText((String)a.get(3));
		textField_4.setText((String)a.get(4));
		textField_5.setText((String)a.get(5));
		Date dt= (Date)a.get(6);
		LocalDate ld=dt.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		   String d1=ld.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
		   textField_6.setText(d1);
		   String d2=ld.plusDays(28).format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
		   textField_7.setText(d2);
		   try {
			   String query="Insert into report(PatientName,Age,Gender,HospitalName,Address,ContactNumber,firstDate,SecondDate) values(?,?,?,?,?,?,?,?)";
			   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reportdb","root","root");
		   pstmnt=con.prepareStatement(query);
		   pstmnt.setString(1,textField.getText());
		   pstmnt.setString(2,textField_1.getText());
		   pstmnt.setString(3,textField_2.getText());
		   pstmnt.setString(4,textField_3.getText());
		   pstmnt.setString(5,textField_4.getText());
		   pstmnt.setString(6,textField_5.getText());
		   pstmnt.setString(7,textField_6.getText());
		   pstmnt.setString(8,textField_7.getText());
		   pstmnt.executeUpdate();
		   JOptionPane.showMessageDialog(null,"Data Added Successfully");
		   }catch(Exception ex) {
			   JOptionPane.showMessageDialog(null,ex);
		   }
			
		  
	}

	private void initComponents() {
		setTitle("Welcome");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Final Report");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 34));
		lblNewLabel.setBounds(172, 54, 229, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Patient Name");
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 25));
		lblNewLabel_1.setBounds(41, 127, 146, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Age");
		lblNewLabel_2.setFont(new Font("Serif", Font.BOLD, 25));
		lblNewLabel_2.setBounds(41, 171, 146, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Gender");
		lblNewLabel_3.setFont(new Font("Serif", Font.BOLD, 25));
		lblNewLabel_3.setBounds(39, 226, 114, 23);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Hospital Name");
		lblNewLabel_4.setFont(new Font("Serif", Font.BOLD, 25));
		lblNewLabel_4.setBounds(41, 279, 176, 27);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Address");
		lblNewLabel_5.setFont(new Font("Serif", Font.BOLD, 25));
		lblNewLabel_5.setBounds(41, 330, 146, 27);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Contact Number");
		lblNewLabel_6.setFont(new Font("Serif", Font.BOLD, 25));
		lblNewLabel_6.setBounds(41, 378, 176, 36);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Vaccination Date");
		lblNewLabel_7.setFont(new Font("Serif", Font.BOLD, 25));
		lblNewLabel_7.setBounds(41, 439, 190, 27);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Next Date");
		lblNewLabel_8.setFont(new Font("Serif", Font.BOLD, 25));
		lblNewLabel_8.setBounds(41, 495, 163, 23);
		contentPane.add(lblNewLabel_8);
		
		 textField = new JLabel();
		   textField.setBounds(241, 135, 195, 27);
		   contentPane.add(textField);
		   
		   textField_1 = new JLabel();
			textField_1.setBounds(241, 177, 235, 27);
			contentPane.add(textField_1);
			
			textField_2 = new JLabel();
			textField_2.setBounds(241, 234, 235, 27);
			contentPane.add(textField_2);
			
			textField_3 = new JLabel();
			textField_3.setBounds(238, 289, 238, 27);
			contentPane.add(textField_3);
			
			textField_4 = new JLabel();
			textField_4.setBounds(241, 340, 235, 27);
			contentPane.add(textField_4);
			
			textField_5 = new JLabel();
			textField_5.setBounds(241, 393, 235, 27);
			contentPane.add(textField_5);
			
		textField_6= new JLabel();
		textField_6.setBounds(241, 439, 235, 27);
		contentPane.add(textField_6);
		
		
		textField_7 = new JLabel();
		textField_7.setBounds(241, 491, 235, 27);
		contentPane.add(textField_7);
		
	
	}
}
