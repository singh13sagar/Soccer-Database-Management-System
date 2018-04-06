
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.List;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DisplayStat extends JFrame {

	private JPanel contentPane;
	private Member mainMember;
	private MemberList mList;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DisplayStat frame = new DisplayStat();
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
	public DisplayStat(MemberList mem, int i) {
		//mainMember=mem;
		mList=mem;
		mainMember= mList.getMember(i);

		setTitle("Statements");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Account Statement");
		lblNewLabel.setBounds(40, 28, 151, 40);
		contentPane.add(lblNewLabel);
		
		JTextArea list=new JTextArea();
		
		//List list = new List();
		list.setBounds(52, 100, 343, 99);
		list.append("Account Statement for current month \n");
		list.append("The Ammount you DUE this month: "+mainMember.getDuefee()+"\n");
		list.append("The Ammount you PAID this month: " + mainMember.getPaid() + "\n");
		contentPane.add(list);
		
		JButton btnNewButton = new JButton("<--");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memberViewer temp = new memberViewer(mList,i);
				temp.setVisible(true);
				//new memberViewer("Try for now").setVisible(true);
				setVisible(false);

			}

		});
		btnNewButton.setBounds(359, 12, 77, 25);
		contentPane.add(btnNewButton);
	}
}
