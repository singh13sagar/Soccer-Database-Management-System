//compilethis

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;

public class coachViewer extends JFrame {

	private JPanel contentPane;


	private MemberList mList;

	/*
	public static void main(String[] args) {
=======
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
>>>>>>> d1243f1549a401314664270da0c7ce301cc3e209
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					coachViewer frame = new coachViewer(MemberList mem);
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
	public coachViewer(MemberList mem) {
		mList=mem;

		setTitle("Coach Viewer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("Add Member");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel panel = new JPanel();
				JLabel label = new JLabel("Enter Member Name:");
				JTextField memeberName = new JTextField(10);
				panel.add(label);
				panel.add(memeberName);
				String[] options = new String[]{"OK", "Cancel"};
				JOptionPane.showMessageDialog(panel, "Type the firstname follwed by a space and the lastname to add a member");
				int select = JOptionPane.showOptionDialog(null, panel, "Add Member",
				                         JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
				                         null, options, options[1]);
				if(select == 0) 
				{
				     String memName = memeberName.getText(); //gets memberName
				     String[] splitMemberaName = memName.split("\\s+");
					 //System.out.println(memName);
					 //System.out.println(splitMemberaName[0]);
					 //System.out.println(splitMemberaName[1]);

					 Member tempMem= new Member();
					 tempMem.setFirstName(splitMemberaName[0]);
					 tempMem.setLastName(splitMemberaName[1]);
 					 mList.addMember(tempMem);
 					 JOptionPane.showMessageDialog(panel, "Member has been added.");
				    
				}
			}
		});
		btnNewButton_4.setBounds(171, 97, 147, 25);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Delete Member");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = "abc";
				JPanel panel = new JPanel();
				JLabel label = new JLabel("Enter Member Name:");
				JTextField memeberName = new JTextField(10);
				JPasswordField passwordBox = new JPasswordField(10);
				panel.add(label);
				panel.add(memeberName);
				String[] options = new String[]{"OK", "Cancel"};
				JOptionPane.showMessageDialog(panel, "Type the firstname follwed by a space and the lastname to delete a member");

				int select = JOptionPane.showOptionDialog(null, panel, "Delete Member",
				                         JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
				                         null, options, options[1]);
				if(select == 0) 
				{
				    String memName = memeberName.getText();
					Member temp = new Member();
					for(int i=0; i<mList.Members.size();i++)
					{
						temp=mList.getMember(i);
						
						if(temp.getName().equals(memName))
							mList.removeMember(temp);
							i=mList.Members.size()+1; // top get out of loop
					}
					JOptionPane.showMessageDialog(panel, "Member has been deleted.");
						
					
					 
				}
			
			
			}
		});
		btnNewButton_5.setBounds(334, 97, 147, 25);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton = new JButton("Notify Member");
		btnNewButton.setBounds(498, 97, 147, 25);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("<--");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new club().setVisible(true);
				setVisible(false);

			}
		});
		btnNewButton_1.setBounds(25, 12, 54, 25);
		contentPane.add(btnNewButton_1);
	}
}
