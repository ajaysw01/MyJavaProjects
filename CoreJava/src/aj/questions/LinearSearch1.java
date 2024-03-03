package aj.questions;

public class LinearSearch1 {

	public static void main(String[] args) {

		int[] arr = {10,50,30,15,20};
		int key = 15;
		
		for(int i =0; i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.println("key found at "+i);
			}
		}
	}

}
