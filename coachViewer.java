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
				int select = JOptionPane.showOptionDialog(null, panel, "Delete Member",
				                         JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
				                         null, options, options[1]);
				if(select == 0) 
				{
				    String memName = memeberName.getText(); //gets memberName
					 
				
					 try{
					 
				     
				     
				     
					
				     Scanner scanner = new Scanner(new File("logfile.txt"));
				     
				     List<String> lines = new ArrayList<String>();
					 while(scanner.hasNextLine()){
						 
						 lines.add(scanner.nextLine());
						 
					 }
					 
					 for(int i = 0; i < lines.size(); i++) {   
						    if(lines.get(i).equals(memName.trim())){
						    	for(int it = 0;it < 6; it++){
						    		lines.remove(i);
						    	}
						    }
						} 
					 
					 
                     Iterator<String> iterator = lines.iterator();
                     PrintWriter writer = new PrintWriter("logfile.txt");
                     while(iterator.hasNext()){
						 writer.write(iterator.next() + "\n");
					 }
					 
					
					 writer.close();
					 
					 
					 
					 }catch(FileNotFoundException ex){
						 System.out.println("File not found");
					 }catch(IOException ex){
						 System.out.println(ex);
					 }
				}
			
			
			}
		});
		btnNewButton_5.setBounds(334, 97, 147, 25);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton = new JButton("Notify Member");
		btnNewButton.setBounds(498, 97, 147, 25);
		contentPane.add(btnNewButton);
	}
}
