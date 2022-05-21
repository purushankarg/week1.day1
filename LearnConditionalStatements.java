package week1.day1;

public class LearnConditionalStatements {

	public static void main(String[] args) {
		int age=65;
		if(age>60)
			System.out.println("Senior citizen");
		if(age>40) {
			System.out.println("40+");
		}
		else if(age>18)
		System.out.println("Eligible to Vote");
		else
		System.out.println("Age is less than 18 and not Eligible to vote");
		
		

	}

}
