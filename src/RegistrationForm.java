import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

public class RegistrationForm extends JFrame {
	static JFrame jf;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JPanel contentPane1;
	private JDateChooser dateChooser;

	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		try {
				jf = new RegistrationForm();
				jf.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
	
	}

	/**
	 * Create the frame.
	 */
	public RegistrationForm() {
		setTitle("Welcome");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNewLabel_1 = new JLabel("Patient Name");
		lblNewLabel_1.setBounds(37, 99, 146, 30);
        contentPane.add(lblNewLabel_1);
        Font fj=new Font("Serif",Font.BOLD,25);
        lblNewLabel_1.setFont(fj);
        
        JLabel lblNewLabel_2 = new JLabel("Age");
        lblNewLabel_2.setBounds(37, 161, 146, 30);
        contentPane.add(lblNewLabel_2);
        Font fn=new Font("Serif",Font.BOLD,25);
        lblNewLabel_2.setFont(fn);
        
        JLabel lblNewLabel_3 = new JLabel("Gender");
        lblNewLabel_3.setFont(new Font("Serif", Font.BOLD, 25));
        lblNewLabel_3.setBounds(37, 226, 130, 23);
        contentPane.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("Hospital Name");
        lblNewLabel_4.setFont(new Font("Serif", Font.BOLD, 25));
        lblNewLabel_4.setBounds(38, 287, 165, 30);
        contentPane.add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("Address");
        lblNewLabel_5.setFont(new Font("Serif", Font.BOLD, 25));
        lblNewLabel_5.setBounds(37, 348, 130, 40);
        contentPane.add(lblNewLabel_5);
        
        JLabel lblNewLabel_6 = new JLabel("Contact Number");
        lblNewLabel_6.setFont(new Font("Serif", Font.BOLD, 25));
        lblNewLabel_6.setBounds(37, 416, 195, 30);
        contentPane.add(lblNewLabel_6);
        
        JButton btnNewButton = new JButton("Submit");
        btnNewButton.addActionListener(new ActionListener() {
		//	private JDateChooser dateChooser;

			public void actionPerformed(ActionEvent e) {
        		ArrayList b=new ArrayList();
        		b.add(textField.getText());
        		b.add(textField_1.getText());
        		b.add(textField_2.getText());
        		b.add(textField_3.getText());
        		b.add(textField_4.getText());
        		b.add(textField_5.getText());
        		b.add(dateChooser.getDate());
        		new finalReport(b);
        		jf.setAlwaysOnTop(false);
        	}
        });
        btnNewButton.setFont(new Font("Serif", Font.BOLD, 28));
        btnNewButton.setBounds(175, 543, 137, 46);
        contentPane.add(btnNewButton);
        
        JLabel lblNewLabel = new JLabel("Registration Form");
        lblNewLabel.setFont(new Font("Serif", Font.BOLD, 34));
        lblNewLabel.setBounds(125, 27, 289, 40);
        contentPane.add(lblNewLabel);
        
        textField_5= new JTextField();
        textField_5.setBounds(242, 428, 234, 30);
        contentPane.add(textField_5);
        textField_5.setColumns(10);
        
        textField_4 = new JTextField();
        textField_4.setBounds(242, 365, 234, 30);
        contentPane.add(textField_4);
        textField_4.setColumns(10);
        
        textField_3 = new JTextField();
        textField_3.setBounds(242, 299, 234, 30);
        contentPane.add(textField_3);
        textField_3.setColumns(10);
        
        textField_2 = new JTextField();
        textField_2.setBounds(242, 234, 234, 30);
        contentPane.add(textField_2);
        textField_2.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setBounds(242, 173, 234, 30);
        contentPane.add(textField_1);
        textField_1.setColumns(10);
        
        textField = new JTextField();
        textField.setBounds(242, 111, 234, 30);
        contentPane.add(textField);
        textField.setColumns(10);
        
        JLabel lblNewLabel_7 = new JLabel("Vaccination Date");
        lblNewLabel_7.setFont(new Font("Serif", Font.BOLD, 25));
        lblNewLabel_7.setBounds(38, 481, 181, 30);
        contentPane.add(lblNewLabel_7);
        
        dateChooser = new JDateChooser();
        dateChooser.getCalendarButton().setBounds(213, 0, 21, 30);
        dateChooser.setDateFormatString("dd-MMM-yyyy");
        dateChooser.setBounds(242, 492, 234, 30);
        contentPane.add(dateChooser);
       // dateChooser.setLayout(null);
        
        
      
	}

}
