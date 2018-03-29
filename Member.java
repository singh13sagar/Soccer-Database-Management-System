import java.util.Random; // debug 


public class Member implements Comparable<Member>{
	private String Fname;
	private String Lname;
	private int pAttended; // # of practices attended
	private String Address;
	private int pBalance; // payment balance
	private String phoneNumber;
	Random rand = new Random();  // debug
	
	public Member(String Fname, String Lname) 
	{
		this.Fname = Fname;
		this.Lname = Lname;
		pAttended = 0;
		pAttended = rand.nextInt(10); // debug
	}
	
	public String getName()
	{
		return Fname + " " + Lname;
	}
	
	public int getPractices()
	{
		return pAttended;
	}
	
	public String toString()
	{
		String out = "";
		out = Fname+" "+Lname+" "+" Practices: "+ pAttended;
		return out; 
	}
	
	@Override
	public int compareTo(Member otherMember) {
		if(otherMember.getPractices() > this.getPractices()) return -1;
		else if(otherMember.getPractices() > this.getPractices()) return 1;
		else return 0;
	}
}
