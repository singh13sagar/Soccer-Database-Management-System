import java.awt.EventQueue;

public class ClubViewer {

public static void main(String[] args) {
		
		Member David = new Member("David", "Chester"); //debug
		Member Sarah = new Member("Sarah", "James"); //debug
		Member Bob = new Member("Bob", "Williams"); //debug
		
		MemberList members = new MemberList(); //debug
		members.addMember(Bob); //debug
		members.addMember(Sarah); //debug
		members.addMember(David); //debug
		
		members.printList(); //debug
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					club frame = new club();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
