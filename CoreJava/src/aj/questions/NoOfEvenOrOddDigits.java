package aj.questions;

public class NoOfEvenOrOddDigits {
	public static void main(String[] args) {
		int num = 12345;
		int evenCount =0;
		int oddCount = 0;
		while(num >0) {
			int lastDigit = num % 10;
			if(lastDigit %2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
			num = num /10;
		}
		System.out.println("Even "+evenCount);
		System.out.println("Odd  "+ oddCount);
	}
}
