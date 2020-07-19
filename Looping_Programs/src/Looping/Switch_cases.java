package Looping;

public class Switch_cases {
	
	public static void main(String[] args) {
		
		int days=yearno(2019,2);
		System.out.println(days);
		
	}
	
	public static int yearno(int year, int month)
	{
		int noofdays=0;
		
		switch (month)
		{
		case 1:
			noofdays =31;
			break;
			
		case 2:
			if(year%4==0)
			{
				noofdays=29;
			}else{
				noofdays =28;
			}
			break;
		case 3:
			noofdays =31;
			break;
		case 4:
			noofdays =30;
			break;
		case 5:
			noofdays =31;
			break;
		case 6:
			noofdays =30;
			break;
		}
		return noofdays;
	}

}
