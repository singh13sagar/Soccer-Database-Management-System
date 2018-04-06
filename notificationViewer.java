

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.*;
import javax.swing.*;

import java.io.*;

public class notificationViewer extends JFrame {

	private JPanel contentPane;
	private Member mainMember;
	private JTextField txtHh;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					notificationViewer frame = new notificationViewer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public notificationViewer(Member mem) {
		mainMember=mem;
		setTitle("Notification");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 148);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/* JLabel lblNewLabel = new JLabel("Notifications");
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setBounds(22, 0, 122, 36);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("     Messages");
		label.setBounds(82, 48, 122, 36);
		contentPane.add(label);

		*/
		
		//JLabel label_1 = new JLabel(mainMember.getMessage());
		//label_1.setBounds(92, 98, 239, 36);
		//contentPane.add(label_1);
		
		JButton btnNewButton = new JButton("<--");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memberViewer temp = new memberViewer(mainMember);
				temp.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBounds(331, 12, 86, 25);
		contentPane.add(btnNewButton);

		txtHh = new JTextField();
		txtHh.setFont(new Font("Dialog", Font.BOLD, 12));
		txtHh.setHorizontalAlignment(SwingConstants.CENTER);
		txtHh.setForeground(Color.BLACK);
		txtHh.setText(mainMember.getMessage());
		txtHh.setBackground(Color.LIGHT_GRAY);
		txtHh.setEditable(false);
		txtHh.setBounds(22, 49, 414, 58);
		contentPane.add(txtHh);
		txtHh.setColumns(10);
	}
}
