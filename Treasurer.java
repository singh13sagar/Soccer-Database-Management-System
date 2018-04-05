public class Treasurer {


	private MembersList m;
	private Coach c;

	public Treasurer(MembersList m) {
		this.m = m;



	}



	public void profit() {

		double revenue = 0;
		double expenses = 0;
		double unPaid = 0;
		double rent = 1000;
		double coachesWage = getHoursWorked();



		for(Members m : m.Members)
		{
			revenue += m.getPaid();
			unPaid += m.getUnpaid();
		}

		expenses = unPaid + rent + coachesWage;

		System.out.println("Revenue: $" + revenue )

	}



	

}



