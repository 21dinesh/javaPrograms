package array;

import java.util.Arrays;
import java.util.List;

public class countName {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Anna","bob","Mike");
		long count= names.stream()
				.filter(name -> name.startsWith("A"))
				.count();
		System.out.println(count);
	}

}
