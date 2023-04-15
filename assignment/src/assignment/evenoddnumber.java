package assignment;

public class evenoddnumber {
  public static boolean isEven(int n) {
		        return n % 2 == 0; // Check if n is divisible by 2 without a remainder
		    }

		    public static boolean isOdd(int n) {
		        return n % 2 != 0; // Check if n is not divisible by 2 without a remainder
		    }

		    public static void main(String[] args) {
		        int num1 = 10;
		        int num2 = 15;

		        System.out.println(num1 + " is even? " + isEven(num1));
		        System.out.println(num1 + " is odd? " + isOdd(num1));
		        System.out.println(num2 + " is even? " + isEven(num2));
		        System.out.println(num2 + " is odd? " + isOdd(num2));
		    }
		}
		





