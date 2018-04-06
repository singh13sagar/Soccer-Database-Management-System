public class Treasurer {


	private MemberList m;
	private Coach c;

	public Treasurer(MemberList m) {
		this.m = m;



	}


 		
	public String profit() {

		double revenue = 0;
		double expenses = 0;
		double unPaid = 0;
		double rent = 1000;
<<<<<<< HEAD
		double coachesWage = getHoursWorked();
		double profit = 0;
		String output = "";
=======
		double coachesWage = c.getHoursWorked();

>>>>>>> 7148f447fd5f637220dd6923d0097cc64cfdf96a


		for(Member m : m.Members)
		{
			revenue += m.getPaid();
			unPaid += m.getUnpaid();
		}

		expenses = unPaid + rent + coachesWage;
		profit = revenue - expenses;

		output = " Revenue: $" + revenue + "\n" + "Expenses: " + "\n" + "Rent: $" + rent + "\n" + "Coach Wages: $" + coachesWage + "\n" + "UnPaid Fees: $" + UnPaid + "\n" + "Total Expenses: $ " + expenses + "\n" + "Profit: $" + profit; 

	 return output;

<<<<<<< HEAD
=======

	}


	public void ViewMembers() {


	m.paySort(); 

	for(Members m : m.Members)

		System.out.println(m.Members);


	}
	

}



