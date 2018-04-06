
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.List;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class treasurerViewer extends JFrame {
	private MemberList m;
	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public treasurerViewer(MemberList m) {
		this.m = m;
		setTitle("Treasurer Managment");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("View Finances");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				treasurerViewer1 vFinance = new treasurerViewer1(m);
				vFinance.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBounds(50, 23, 150, 36);
		contentPane.add(btnNewButton);
		
		
		JButton btnViewMembers = new JButton("View Members");
		btnViewMembers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				treasurerViewer2 vMembers = new treasurerViewer2(m);
				vMembers.setVisible(true);
				setVisible(false);
			}
		});
		btnViewMembers.setBounds(50, 86, 150, 36);
		contentPane.add(btnViewMembers);
		
		/*
		JButton btnCoachExpenses = new JButton("Coach Expenses");
		btnCoachExpenses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				treasurerViewer3 vCoach = new treasurerViewer3(m);
				vCoach.setVisible(true);
				setVisible(false);
			}
		});
		btnCoachExpenses.setBounds(50, 144, 150, 36);
		contentPane.add(btnCoachExpenses);
		*/
		
	}
}
