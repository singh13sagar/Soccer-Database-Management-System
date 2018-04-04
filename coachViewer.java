

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class coachViewer extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					coachViewer frame = new coachViewer();
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
	public coachViewer() {
		setTitle("Coach Viewer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("Add Member");
		btnNewButton_4.setBounds(171, 97, 147, 25);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Delete Member");
		btnNewButton_5.setBounds(334, 97, 147, 25);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton = new JButton("Notify Member");
		btnNewButton.setBounds(498, 97, 147, 25);
		contentPane.add(btnNewButton);
	}
}
