public class Treasurer {


	private MemberList m;
	private Coach c;

	public Treasurer(MemberList m) {
		this.m = m;



	}



	public void profit() {

		double revenue = 0;
		double expenses = 0;
		double unPaid = 0;
		double rent = 1000;
		double coachesWage = c.getHoursWorked();



		for(Member m : m.Members)
		{
			revenue += m.getPaid();
			unPaid += m.getUnpaid();
		}

		expenses = unPaid + rent + coachesWage;

		System.out.println("Revenue: $" + revenue );

	}



	

}



