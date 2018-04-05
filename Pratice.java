
public class Pratice {
	
	private MemberList members;
	private Coach coach;
	private String activity;
	private int feesPaid;
	
	public Pratice(String activity, MemberList m)
	{
		//coach = new Coach();
		this.activity = activity;
	}
	
	public void enroll(Member m)
	{
		members.addActivity(m, activity); //Known bug Null pointer
	}
	
	
	
}
