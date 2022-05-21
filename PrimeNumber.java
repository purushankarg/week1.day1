package week1.day1;

public class PrimeNumber {
	
	// To find a number is Prime Number or not
			// A number which is divisible by itself is a prime number
			// Ex: input:13
			// output:13 is a prime number

	public static void main(String[] args) {
		int input=13;
		int flag=0;
		if (input==0 || input==1) {
			System.out.println("Its a PRIME Number");
		}
		else {
			for(int i=2; i<input; i++) {
				if (input%i==0)
				{
					System.out.println("Not a PRIME Number");
					flag=1;
					break;
				}
			}
			if (flag==0) {
				System.out.println("Its a PRIME Number");
			}
		}
	}		

}
