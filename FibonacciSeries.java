package week1.day1;

public class FibonacciSeries {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=5;
		int firstnum=0;
		int secnum=1;
		int sum;
		System.out.println(firstnum);
		System.out.println(secnum);
		for(int i=0; i<=range; i++)
		{
		sum=firstnum+secnum;
		firstnum=secnum;
		secnum=sum;
		System.out.println(sum);
		
		}

	}

}
