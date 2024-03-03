package Lambdas;

@FunctionalInterface
interface Bike{
	public String bookBike(String src, String dest);
}

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike bike = (src, dest)-> {System.out.println("Bike is booked");
			return ("price is 200");};
			
			bike.bookBike("Akl", "pune");
	}

}
