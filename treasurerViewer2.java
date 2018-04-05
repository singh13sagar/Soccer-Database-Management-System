
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

public class treasurerViewer2 extends JFrame {
	private MemberList m;
	private JTextArea area;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public treasurerViewer2(MemberList m) {
		this.m = m;
		setTitle("Treasurer Managment");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		area = new JTextArea();
		area.setBounds(82, 10, 350, 181);
		contentPane.add(area);
		m.sortList();
		area.setText(m.printList());
		
		JButton button = new JButton("<-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						new treasurerViewer(m).setVisible(true);
						setVisible(false);
			}
		});
		button.setBounds(12, 10, 58, 36);
		contentPane.add(button);
		
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
