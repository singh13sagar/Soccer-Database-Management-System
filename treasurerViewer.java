
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

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					treasurerViewer frame = new treasurerViewer();
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
	public treasurerViewer() {
		setTitle("Treasurer Managment");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("View Finances");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(279, 23, 157, 36);
		contentPane.add(btnNewButton);
		
		List list = new List();
		list.setBounds(82, 10, 191, 181);
		contentPane.add(list);
		
		JButton btnViewMembers = new JButton("View Members");
		btnViewMembers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnViewMembers.setBounds(279, 86, 157, 36);
		contentPane.add(btnViewMembers);
		
		JButton btnCoachExpenses = new JButton("Coach Expenses");
		btnCoachExpenses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCoachExpenses.setBounds(279, 144, 157, 36);
		contentPane.add(btnCoachExpenses);
		
		/* JButton button = new JButton("<-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						new club().setVisible(true);
						setVisible(false);
			}
		});
		button.setBounds(12, 10, 58, 36);
		contentPane.add(button);
		*/
		
		Button button_1 = new Button("New button");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_1.setBounds(82, 199, 105, 36);
		contentPane.add(button_1);
		
		Button button_2 = new Button("New button");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(193, 199, 105, 36);
		contentPane.add(button_2);
	}
}
