package week1.day1;

public class TwoWheeler {
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 1234567890L;
	boolean isPunctured = false;
	String bikeName="Apache";
	double runningKM=8000.55;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	TwoWheeler bike = new TwoWheeler();
	System.out.println("Number of Wheels= " +bike.noOfWheels);
	System.out.println("Number of Mirrors= " + bike.noOfMirrors);
	System.out.println("Bike Chasis Number=" + bike.chassisNumber);
	System.out.println("Bike Name is = "+ bike.bikeName);
	System.out.println("Bike Running Kms="+bike.runningKM);
	
	}

}
