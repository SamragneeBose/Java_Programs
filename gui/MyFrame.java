package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ButtonGroup;

public class MyFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 404, 545);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setBounds(45, 62, 71, 13);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(190, 59, 161, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(150, 455, 85, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Job Application");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(111, 10, 150, 39);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name");
		lblNewLabel_2.setBounds(45, 102, 71, 13);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(190, 99, 161, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Gender");
		lblNewLabel_3.setBounds(45, 153, 71, 13);
		contentPane.add(lblNewLabel_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(45, 172, 103, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(150, 172, 111, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Other");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(261, 172, 103, 21);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_4 = new JLabel("Highest Qualification");
		lblNewLabel_4.setBounds(45, 295, 122, 13);
		contentPane.add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(190, 291, 161, 21);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_5 = new JLabel("Address");
		lblNewLabel_5.setBounds(45, 211, 71, 13);
		contentPane.add(lblNewLabel_5);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(45, 233, 306, 39);
		contentPane.add(textArea);
		
		JLabel lblNewLabel_6 = new JLabel("Job Profile");
		lblNewLabel_6.setBounds(45, 339, 71, 13);
		contentPane.add(lblNewLabel_6);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(190, 335, 161, 21);
		contentPane.add(comboBox_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("I declare that all the information given above is accurate\n to the best of my knowledge.");
		chckbxNewCheckBox.setBounds(45, 395, 306, 21);
		contentPane.add(chckbxNewCheckBox);
	}
}
