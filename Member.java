import java.util.Random; // debug 
import java.io.*;

public class Member implements Comparable<Member>{
	private String Fname;
	private String Lname;
	private int pAttended; // # of practices attended
	private String Address;
	private int pBalance; // payment balance
	private String phoneNumber;
	Random rand = new Random();  // debug
	private int timesPaid;
	private boolean paid;
	private String activity;
	private String Message;
	
	
	public static void main(String[] args){  // htis method is for testing only, please remove
		Member member = new Member ("Prabagar", "Sivakumar");
		member.setNumber("647-555-5555");
		member.setPaymentStatus(true);
		member.setAddress("Somewhere in Scarborough");
		member.setMessage("New message");
		member.addMember();

	}
	
	
	
	public Member(String Fname, String Lname) 
	{
		this.Fname = Fname;
		this.Lname = Lname;
		pAttended = 0;
		timesPaid = 0;
		pAttended = rand.nextInt(10); // debug
		timesPaid = rand.nextInt(10); // debug
	}
	
    public void setNumber(String num){
		phoneNumber = num;
	}

	public void setPaymentStatus(boolean status){
		paid = status;
	}

	public void setAddress(String address){
        Address = address;
	}

	public void setMessage(String message){
	    Message = message;
	}

	public void addActivity(String act)
	{
		activity= act;
	}
	
	public String printActivity()
	{
		if(activity != null) return activity;
		else return "Not enrolled";
	}
	
	
	public int getPractices()
	{
		return pAttended;
	}
	
	public String toString()
	{
		String out = "";
		out = Fname+" "+Lname+" "+" Practices: "+ pAttended +" Times Paid: "+ timesPaid +" Activity: " + printActivity() ;
		return out; 
	}
	
	public int getTimesPaid()
	{
		return timesPaid;
	}
	
	@Override
	public int compareTo(Member otherMember) {
		if(otherMember.getPractices() > this.getPractices()) return -1;
		else if(otherMember.getPractices() > this.getPractices()) return 1;
		else return 0;
	}
	
	
	public String getFName(){
		return Fname;
	}

	public String getLName(){
		return Lname;
	}

	public String getNumber(){
		return phoneNumber;
	}

    public String getPaymentStatus(){
		
		if(paid == true)
		  return "paid";
		else
		  return "unpaid";
	}

	public String getAddress(){
		return Address;
	}

    public String getMessage(){
		return Message;
	}

	public void addMember(){     //add log of member to textfile containing member logs
		
		try{
		PrintWriter writer = new PrintWriter ("logfile.txt" , "UTF-8");
		writer.println(getFName());  
		writer.println(getLName()); 
		writer.println(getNumber());
		writer.println( getPaymentStatus());
		writer.println(getAddress());
		writer.println(getMessage()); 
		writer.close();
		}catch(FileNotFoundException e){
			System.out.println("File not found.");
		}catch(IOException e){
			System.out.println(e);
		}
	}
}
