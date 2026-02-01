package Feb1;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		
		int[] arr= {44,6,732,38,7,1};
		
		int[] arr1= {38,14,16,72,1,15,8};
		
		
		Set<Integer> original = new HashSet<>();
		Set<Integer> duplicate = new HashSet<Integer>();
		
		
		for(int value : arr) {
			original.add(value);
		}
		
		for(int value : arr1) {
			if(original.contains(value)) {
				duplicate.add(value);
			}
		}
		
		System.out.println(duplicate);
	}

}
