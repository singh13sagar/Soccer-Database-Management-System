//compilethis

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class memberViewer extends JFrame {

	private JPanel contentPane;
	public JLabel lblName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					memberViewer frame = new memberViewer();
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
	public memberViewer(String name) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 576, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("View Fees");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Fees memberFee = new Fees();
				memberFee.setVisible(true);
				//new Fees().setVisible(true);
				//new memberViewer().lblName.setText("Hello");
				setVisible(false);
			}
		});
		btnNewButton.setBounds(12, 107, 150, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Display Statement");
		btnNewButton_1.setBounds(174, 107, 180, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Notifications");
		btnNewButton_2.setBounds(366, 107, 150, 25);
		contentPane.add(btnNewButton_2);
		
		lblName = new JLabel("Hello");
		lblName.setBounds(27, 41, 103, 15);
		contentPane.add(lblName);
	}

}
