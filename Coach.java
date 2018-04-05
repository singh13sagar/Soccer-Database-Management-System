import java.util.Random; // debug 

public class Coach 
{
	private int hourWorked;
	Random ran = new Random();
	private MemberList m;
	
	Coach(MemberList m)
	{
		this.m = m;
	}
	
	public int getHoursWorked()
	{
		hourWorked = ran.nextInt(8); 
		return hourWorked;
	}
	
}
