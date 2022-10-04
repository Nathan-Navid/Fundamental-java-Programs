package FundamentalJava;

public class ArrayExample {

	public static void main(String[] args) {
//		int days[] = new int[12];
//		days[0] = 31;
//		days[1] = 28;
//		days[2] = 31;
//		days[3] = 31;
//        days[4] = 30;		
//        days[5] = 30;
//		//System.out.println("Jan No of days: "+days[0]+" \n"+" Feb No no Days: "+days[1]);
//        
//        for(int arrcount=0;arrcount<days.length;arrcount++)
//        {
//        	System.out.print(days[arrcount]+" ");
//        }
		
		String subject[] = {"Java","Oracle","Python","AWS"};
		
		System.out.println("Array Length: "+subject.length);
		for(String value:subject)
		{
			System.out.println(value);
		}
	}
}