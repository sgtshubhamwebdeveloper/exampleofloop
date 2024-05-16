package examplesforloop;

public class DisplayWeekAndDays {
	public void weeks1()
	{
	int weeks =4;
	for(int i=1;i<=weeks;i++)
		System.out.println("Weeks : "+i);
	}
	public void day1()
	{
		int days=7;
		for(int i=1;i<=days;i++)
			System.out.println("Days : " +i);
	}


	public static void main(String[] args)
	{
		DisplayWeekAndDays a =new DisplayWeekAndDays();
		a.day1();
		a.weeks1();
		
	}

}
