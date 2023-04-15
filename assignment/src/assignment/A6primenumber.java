package assignment;

public class A6primenumber {

	public static void main(String[] args) {
	   for (int i=1;i<=25;i++){
			int count = 0;
		    for (int j=2; j<=i/2;j++) {
		    	if (i%j==0) {
		    		count++;
		    	}
		    }
		    
		    if(count==0) {
		    	System.out.println("prime numbre" +" 1 to 25" );
		    	System.out.println(i);
		    }
		}
	   

	}
}

