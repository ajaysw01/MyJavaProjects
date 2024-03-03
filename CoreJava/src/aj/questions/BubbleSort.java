package aj.questions;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {10,50,30,15,20};
		
		System.out.println("unsorted");
		for(int i = 0; i<arr.length-1; i++) {//traverse array
			for(int j = 0; j<arr.length-1; j++) {//compare
				if(arr[j]>arr[j+1]) {
						int temp =arr[j];
						arr[j] = arr[j+1];
						arr[j+1]=temp;
							
				}
				
						
			}
		}
		System.out.println("sorted array : ");
		for(int value : arr) {
			System.out.println(value);
		}
		
	}

}
