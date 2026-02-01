package jan19;

import java.util.HashSet;
import java.util.Set;

public class IntersectionArray {

	
	public static void main(String[] args) {
		
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {3, 4, 5, 6, 7};
		
		
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> result = new HashSet<>();
		
		for(int num : a) {
			set.add(num);
		}
		
		for(int num: b) {
			 if(set.contains(num)) {
				 result.add(num);
			 }
		}
		
		System.out.println(result);
	}
	
}
