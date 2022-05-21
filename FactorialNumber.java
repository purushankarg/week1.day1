package week1.day1;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input: 5
		//output: 5*4*3*2*1 = 120
		int input=5;
		int fact=1;
		for (int i=1;i<=input ;i++)
		{
		fact=(fact*i);	
		}
		System.out.println("factorial of 5 is: "+fact);

	}

}
