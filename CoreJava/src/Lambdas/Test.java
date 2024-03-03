package Lambdas;

@FunctionalInterface
interface Cab{
	public void bookCab();
}

//class Ola implements Cab{
//	public void bookCab() {
//		System.out.println("Cab is booked");
//	}
//	
//}

public class Test {
	public static void main(String[] args) {
		Cab cab = ()->System.out.println("Cab is Booked");

		cab.bookCab();
	}

}
