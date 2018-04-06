import java.util.ArrayList;
import java.util.Random; // debug 
import java.io.*;

public class Member implements Comparable<Member>{
	public String Fname;
	public String Lname;
	private int pAttended; // # of practices attended
	private String Address;
	private int pBalance; // payment balance
	private String phoneNumber;
	Random rand = new Random();  // debug
	private int timesPaid;
	private boolean paid;
	private String activity;
	private String Message;
	private int feeDue;
	private int feeThatPaid;
	private int feeNotPaid;
	//private Account account;
	
	
	public Member()
	{
		this.Fname = "";
		this.Lname = "";
		//account = new Account();
		Random ran = new Random();
		feeDue = ran.nextInt(6) + 100;
		feeThatPaid = feeDue+120;
		feeNotPaid = feeDue;
		timesPaid = rand.nextInt(10);
	}
	public Member(String Fname, String Lname) 
	{
		this.Fname = Fname;
		this.Lname = Lname;
		pAttended = 0;
		timesPaid = 0;
		pAttended = rand.nextInt(10); // debug
		timesPaid = rand.nextInt(10); // debug
		//account = new Account();
		Random ran = new Random();
		feeDue = ran.nextInt(6) + 100;
		feeThatPaid = feeDue - (feeDue / 3);
		feeNotPaid = feeDue - feeThatPaid;
	}
	
    public void setNumber(String num){
		phoneNumber = num;
	}

	public void setFirstName(String fnamee){
		Fname = fnamee;
	}
	public void setLastName(String lnamee){
		Lname = lnamee;
	}

	public void setPaymentStatus(boolean status){
		paid = status;
	}
	
	public void setPaymentStatus(String status) {
		if(status.length()==4)
			paid = true;
		else
			paid = false;
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
		out = Fname+" "+Lname+" "+" Times Paid: " + timesPaid + " Fees Paid: "+feeThatPaid+" Fees Unpaid: "+feeNotPaid;
		return out; 
	}
	
	public int getTimesPaid()
	{
		return timesPaid;
	}
	
	@Override
	public int compareTo(Member otherMember) {
		if(getTimesPaid() > otherMember.getTimesPaid()) return 1;
		if(getTimesPaid() < otherMember.getTimesPaid()) return -1;
		else return 0;
	}
	
	public String getName()
	{
		return Fname + " " + Lname;
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

	public int getPaid()
	{
		return feeThatPaid;
	}
	public int getUnpaid()
	{
		return feeNotPaid;
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
		FileWriter writer = new FileWriter ("logfile.txt" , true);  
		writer.write(getName()+  "\n"); 
		writer.write(getNumber()+ "\n");
		writer.write(getPaymentStatus()+ "\n");
		writer.write(getAddress()+ "\n");
		writer.write(getMessage()+ "\n");
		writer.write("" + "\n");
		writer.flush();
		writer.close();
		}catch(FileNotFoundException e){
			System.out.println("File not found."); //change
		}catch(IOException e){
			System.out.println(e);
		}
	}
	
	public int getDuefee() {
		return feeDue;
	}

	public void deposit(int ammount) {
		if (ammount >= feeDue)
			{
				feeDue = 0;
				paid=true;
				feeThatPaid+=ammount;
				feeNotPaid=0;
			}
		else
			{
				feeDue -= ammount;
				paid=false;
				feeThatPaid += ammount;
				feeNotPaid = feeDue;
				
			}
	}

	public boolean anyDue() {
		if (feeDue == 0)
			return false;
		else
			return true;
	}








	
}
