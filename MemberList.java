import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
	
	public void paySort()
	{
		paidCompare p = new paidCompare();
		Members.sort((Comparator<? super Member>) p);
	}
	
	public class paidCompare implements Comparator<Member>{

		public int compare(Member person1, Member person2)
		{
			if(person1.getTimesPaid() > person2.getTimesPaid()) return -1;
			else if(person1.getTimesPaid() < person2.getTimesPaid()) return 1;
			else return 0;
			
		}

	}
	
}


