//compilethis

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.io.*;

public class club extends JFrame {

	private JPanel contentPane;
	//private ArrayList<Member> list_Member;
	//public ArrayList<Member> mList;
	public MemberList mList;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					club frame = new club();
					//mList= new ArrayList<Member>();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public club() {
		//mList= new ArrayList<>();
		mList = new MemberList();
		makeGUI();
	}

	public club(MemberList m) {
		//mList= new ArrayList<>();
		mList = m;
		makeGUI();
	}

	public void makeGUI()
	{

		this.read_Users();
		setTitle("Memeber Management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 95);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Treasurer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				treasurerViewer tView = new treasurerViewer(mList);
				tView.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBounds(172, 12, 117, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Coach");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String password = "abc";
				JPanel panel = new JPanel();
				JLabel label = new JLabel("Enter a password:");
				JPasswordField passwordBox = new JPasswordField(10);
				panel.add(label);
				panel.add(passwordBox);
				String[] options = new String[]{"OK", "Cancel"};
				int select = JOptionPane.showOptionDialog(null, panel, "Coach Validation",
				                         JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
				                         null, options, options[1]);
				if(select == 0) 
				{
				    char[] coachPass = passwordBox.getPassword();
				    String passCompare = String.copyValueOf(coachPass);

				    if (passCompare.equals(password)){
						new coachViewer(mList).setVisible(true);
						setVisible(false);
				    }
				    
				}
			}
		});
		btnNewButton_1.setBounds(24, 12, 117, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Member");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = "abc";
				JPanel panel = new JPanel();
				JLabel label = new JLabel("Enter Member Name:");
				//JLabel label2 = new JLabel("Enter Password:");
				
				JTextField memeberName = new JTextField(15);
				//JPasswordField passwordBox = new JPasswordField(15);
				panel.add(label);
				panel.add(memeberName);
				//panel.add(label2);
				//panel.add(passwordBox);
				String[] options = new String[]{"OK", "Cancel"};
				int select = JOptionPane.showOptionDialog(null, panel, "Coach Validation",
				                         JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
				                         null, options, options[1]);
				if(select == 0) 
				{
					String memName = memeberName.getText().toLowerCase();
					Member temp = new Member();
					int j=0;
					for(int i=0; i<mList.Members.size();i++)
					{
						temp=mList.getMember(i);
						j=i;
						if(temp.getName().equals(memName))
							i=mList.Members.size()+1; // top get out of loop
					}
					
						//memberViewer mView = new memberViewer(temp);
						memberViewer mView = new memberViewer(mList,j);
						//mView.lblName.setText("Hello" + temp.getName());
						mView.setVisible(true);

						//new memberViewer().lblName.setText("Hello"+temp.getName());
						
						setVisible(false);
				    
				    
				}
			}
		});
		btnNewButton_2.setBounds(319, 12, 117, 25);
		contentPane.add(btnNewButton_2);
	}

	public void read_Users()
	{
		try{
		Scanner in= new Scanner(new File("logfile.txt"));
		int records=Integer.parseInt(in.nextLine());
		Member temp;
		String bin;
		//in.useDelimiter("\\R+");
        while(in.hasNextLine())
		{
			temp= new Member();
			//temp.setLname(in.nextLine());
			temp.Lname=in.nextLine();//-------------1
			//temp.setFname(in.nextLine());
			temp.Fname= in.nextLine();//------------2
			//temp.setaddress(in.nextLine());
			temp.setAddress(in.nextLine());//-------3
			//temp.setTelephone(in.nextLine());
			//temp.setEmail(in.nextLine());
			temp.setNumber(in.nextLine());//--------4
			temp.setPaymentStatus(in.nextLine());//-5
			temp.setMessage(in.nextLine());//-------6
			//System.out.println(temp.toString());
			if(in.hasNextLine())
				bin= in.nextLine();
			mList.addMember(temp);

		}
		in.close();
	}
		//Collections.sort(mList);}
		catch(FileNotFoundException e)
		{
			System.out.println("file isnt there");
		}
	}

	
}
