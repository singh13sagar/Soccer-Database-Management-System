
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.List;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class treasurerViewer1 extends JFrame {
	MemberList m;
	private JTextArea area;
	private JPanel contentPane;
	private Treasurer treasurer;
	/**
	 * Create the frame.
	 */
	public treasurerViewer1(MemberList m) {
		this.m = m;
		treasurer = new Treasurer(m);
		setTitle("Treasurer Managment");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		area = new JTextArea();
		area.setBounds(82, 10, 350, 275);
		contentPane.add(area);
		area.setText(treasurer.profit());
		
		
		JButton button = new JButton("<-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						new treasurerViewer(m).setVisible(true);
						setVisible(false);
			}
		});
		button.setBounds(12, 10, 58, 36);
		contentPane.add(button);
		
	}
}
