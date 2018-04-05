public class Treasurer {


	private MembersList m;
	private Coach c;

	public Treasurer(MembersList m) {
		this.m = m;



	}


 		
	public String profit() {

		double revenue = 0;
		double expenses = 0;
		double unPaid = 0;
		double rent = 1000;
		double coachesWage = getHoursWorked();
		double profit = 0;
		String output = "";


		for(Members m : m.Members)
		{
			revenue += m.getPaid();
			unPaid += m.getUnpaid();
		}

		expenses = unPaid + rent + coachesWage;
		profit = revenue - expenses;

		output = " Revenue: $" + revenue + "\n" + "Expenses: " + "\n" + "Rent: $" + rent + "\n" + "Coach Wages: $" + coachesWage + "\n" + "UnPaid Fees: $" + UnPaid + "\n" + "Total Expenses: $ " + expenses + "\n" + "Profit: $" + profit; 

	 return output;


	}


	public void ViewMembers() {


	m.paySort(); 

	for(Members m : m.Members)

		System.out.println(m.Members);


	}
	

}



