import java.util.ArrayList;

public class MemberList {
	private ArrayList<Member> Members;
	
	public MemberList()
	{
		Members = new ArrayList<Member>();
	}
	
	public void addMember(Member m)
	{
		Members.add(m);
	}
	
	public void sortList()
	{
		
	}
	
	public void printList()
	{
		for(Member m : Members)
		{
			System.out.println(m.toString());
		}
	}
	
}
