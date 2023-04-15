package assignment;
import java.util.Scanner;

	public class sumcount {	
   
    	void calcSumAndCountAllNumbersDivBy_2_Or_7() 
		     
			{
				Scanner scanner = new Scanner(System.in);
				System.out.print("Enter a maximum value ");
				int max = scanner.nextInt();
		        int count = 0;
		        int sum = 0;
		        for (int i = 1; i < max; i++) 
		        {
		            if (i % 2 == 0 || i % 7 == 0) 
		            {
		                count++;
		                sum += i;
		            }
		        
		        }
				System.out.println("Count: " + count);
				System.out.println("Sum: " + sum);

		    }
			public static void main(String []args) 
			{
			sumcount obj=new sumcount();
		obj.calcSumAndCountAllNumbersDivBy_2_Or_7();
			}
		}

	


