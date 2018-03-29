import java.util.ArrayList;
import java.util.Collections;

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
	
	public void removeMember(Member m)
	{
		Members.remove(m);
	}
	
	public void sortList() // sort by practices attended 
	{
		Collections.sort(Members);
	}
	
	public void printList()
	{
		for(Member m : Members)
		{
			System.out.println(m.toString());
		}
	}
	
}
