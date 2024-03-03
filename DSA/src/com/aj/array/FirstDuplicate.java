package com.aj.array;

public class FirstDuplicate {
	public static void main(String[] args) {
		int[] arr = {2,4,6,8,4,10};
		int temp = 0;
		for(int i = 0; i<arr.length; i++) {
			for(int j = i; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate elements are "+arr[i]);
					temp +=1;
					break;
				}
			}
			if(temp>0) {
				break;
			}
		}
	}


}

class DP{
	int[] arr = {2,4,6,8,4,10};
	for(int i =0; i<arr.length; i++) {
		for(int j = 0; j<arr.length;j+=) {
			if(arr[i]=arr[j]) {
				System.out.println(arr[i]);
				temp+=1;
				break
			}
		}
		if(temp>=0) {break;
	}
}
