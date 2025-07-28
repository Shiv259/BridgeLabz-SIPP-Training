import java.util.*;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<Integer> ll = Arrays.asList(3, 1, 2, 2, 3, 4);
        Collections.sort(ll);
		Set<Integer> set = new HashSet<Integer>();
		for(int i : ll) {
			set.add(i);
		}
		System.out.println(set);
		
		
		
	}
}