package assignment;
import java.util.List;
import java.util.ArrayList;
public class A5perfect {
	  public static void main(String[] args) {
		  int max = 10000;
              List<Integer> perfectNumbers = new ArrayList<>();
         for(int i = 1; i <=max ;i++) {
         int sum = 0;
         for (int j = 1; j < i; j++) {
        	 if (i % j == 0) {
        		 sum += j;
        	 }
         }
		  if (sum == i) {
			   perfectNumbers.add(i);
		  
		  }
		  
     }
           System.out.println("Perfect numbers up to " + max + ": \n" + perfectNumbers);
            
	  }
}

