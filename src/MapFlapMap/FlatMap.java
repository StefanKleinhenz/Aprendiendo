package MapFlapMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
		
		List<String> words = Arrays.asList("Java", "is", "cool");
		List<String[]> mm = words.stream().map(word->word.split(""))
		//Stream<String[] -> Stream <String>> das ist was die flatMap Funktion macht.
//		.flatMap(Arrays::stream)
		.distinct()
		.collect(Collectors.toList());

		
	}
    
}
