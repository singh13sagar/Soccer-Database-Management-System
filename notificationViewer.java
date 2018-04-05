import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;

public class notificationViewer extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
	}

	/**
	 * Create the frame.
	 */
	public notificationViewer() {
		setTitle("Notification");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Notifications");
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setBounds(22, 0, 122, 36);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("     Messages");
		label.setBounds(82, 48, 122, 36);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("     Messages");
		label_1.setBounds(92, 98, 239, 36);
		contentPane.add(label_1);
	}
}
