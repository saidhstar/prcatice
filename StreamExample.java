package sorting;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		IntStream.range(1, 11).skip(5).forEach(x->System.out.println(x));
		System.out.println(IntStream.range(1, 11).skip(5).sum());
		Stream.of("sai","apart","mythili").sorted().findFirst().ifPresent(System.out::println);
		int[] array= {2,5,1,7,8,9};
		
		Set<String> lsit=Stream.of("sai","apart","mythili").sorted().collect(Collectors.toSet());
	}
}
