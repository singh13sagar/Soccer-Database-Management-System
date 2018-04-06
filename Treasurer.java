public class Treasurer {


	private MemberList m;
	private Coach c;

	public Treasurer(MemberList m) {
		this.m = m;

		c = new Coach(m);

	}


 		
	public String profit() {

		double revenue = 0;
		
		double unPaid = 0;
		double rent = 1000;
		double expenses = 0;
		double profit = 0;
		String output = "";

		double coachesWage = 15*c.getHoursWorked();


		

		for(Member m : m.Members)
		{
			revenue += m.getPaid();
			unPaid += m.getUnpaid();
		}
	
		expenses = unPaid + rent + coachesWage;
		profit = revenue - expenses;

		output = "Income Statement\n___________________________\n" +"Revenue: "+"\n" +"Lesson Fees: $" +revenue + "\n"+"Total Revenue: $" + revenue  + "\n___________________________\nExpenses: " + "\n" + "Rent: $" + rent + "\n" + "Coach Wages: $" + coachesWage + "\n" + "UnPaid Fees: $" + unPaid + "\n" + "Total Expenses: $ " + expenses + "\n" + "___________________________\n" +"Profit: $" + profit; 

	 return output;


	}


	public void ViewMembers() {


	m.paySort(); 

	}
	

}



