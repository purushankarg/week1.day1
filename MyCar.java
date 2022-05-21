package week1.day1;

public class MyCar {
	
	//Create a Mycar class and create an object for existing Car class and call all the methods of Car Class
	// Objective: If access modifier is declared as public then we can call the methods anywhere
	//in the project folder( under any package/class into the current class

	public static void main(String[] args) {
		Car mycar = new Car();
		mycar.applyBreak();
		mycar.applyGear();
		mycar.switchonAc();
		mycar.applyAcclerate();
		

	}

}
