package assignment;

public class modulus {

	public static void main(String[] args) {
		int m,n;
		m=6;
		n=7;
		int remainder=calc(m,n);
		System.out.println("the remainder is" + " " + remainder);
	}
	public static int calc (int m, int n) {
		int product=m*n; //multiply m and n
		int result =product /2;//divide the product by 2
		int remainder =result%7;//find the remainder with respect to division
		return remainder;//return the remainder

	}

}
