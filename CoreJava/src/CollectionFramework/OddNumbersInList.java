package CollectionFramework;

import java.util.Arrays;
import java.util.List;

public class OddNumbersInList {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,34,45,67,89);
		
		nums.stream()
			.filter(n -> n%2 != 0)
			.forEach(System.out::println);

	}

}
