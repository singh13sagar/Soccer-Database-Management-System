//compilethis
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import javax.swing.border.*;

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
		setBounds(100, 100, 610, 223);
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

					/*
					try
					{
					    String filename= "logfile.txt";
					    FileWriter fw = new FileWriter(filename,true); //the true will append the new data
					    fw.write("\n"); //appends the string to the file
					    fw.write(splitMemberaName[0]); fw.write("\n");
					    fw.write(splitMemberaName[1]); fw.write("\n");
					    fw.write("Brampton"); fw.write("\n");
					    fw.write("False"); fw.write("\n");
					    fw.write("Null"); fw.write("\n");fw.write("\n");
				    	fw.close();
					}
					catch(IOException ioe)
					{
					    System.err.println("IOException: " + ioe.getMessage());
					}
					*/

 					 JOptionPane.showMessageDialog(panel, "Member has been added.");
				    
				}
			}
		});
		btnNewButton_4.setBounds(74, 96, 147, 25);;
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
		btnNewButton_5.setBounds(245, 96, 147, 25);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton = new JButton("Notify Member");
				btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 JTextArea textArea = new JTextArea(null,5,30);
                textArea.setWrapStyleWord(true);
                textArea.setLineWrap(true);
           		JPanel panel = new JPanel(new BorderLayout(3,3));
                panel.add(new JScrollPane(textArea), BorderLayout.CENTER);
				String[] options = new String[]{"Send Notification", "Cancel"};
				int select = JOptionPane.showOptionDialog(null, panel, "Notification",
				                         JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
				                         null, options, options[1]);
				
			}
			
		});
		btnNewButton.setBounds(419, 96, 147, 25);
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
