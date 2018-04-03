package cps406;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class club extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					club frame = new club();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public club() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 95);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Treasurer");
		btnNewButton.setBounds(172, 12, 117, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Coach");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String password = "abc";
				JPanel panel = new JPanel();
				JLabel label = new JLabel("Enter a password:");
				JPasswordField passwordBox = new JPasswordField(10);
				panel.add(label);
				panel.add(passwordBox);
				String[] options = new String[]{"OK", "Cancel"};
				int select = JOptionPane.showOptionDialog(null, panel, "Coach Validation",
				                         JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
				                         null, options, options[1]);
				if(select == 0) 
				{
				    char[] coachPass = passwordBox.getPassword();
				    String passCompare = String.copyValueOf(coachPass);

				    if (passCompare.equals(password)){
						new coachViewer().setVisible(true);
						setVisible(false);
				    }
				    
				}
			}
		});
		btnNewButton_1.setBounds(24, 12, 117, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Member");
		btnNewButton_2.setBounds(319, 12, 117, 25);
		contentPane.add(btnNewButton_2);
	}
}
