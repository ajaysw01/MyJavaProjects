package Lambdas;

@FunctionalInterface
interface Car{
	public void book(String source, String destination);
}

//class Ola implements Car{
//
//	@Override
//	public void book(String source, String destineation) {
//
//			System.out.println("Cab is booked from "+source+"to"+destineation);
//	}
//	
//}

public class Test2 {
	public static void main(String[] args) {
		
		Car car = (source, destination)->System.out.println("Cab is booked from "+source+"to"+destination);
		car.book("Pune", "Akola");
	}

}
