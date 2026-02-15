package Feb14;

import java.util.HashSet;
import java.util.Set;

public class CommanElement {

	public static void main(String[] args) {
		 int[] arr1 = {1, 2, 3, 4};
		 int[] arr2 = {3, 4, 5, 6};

		 Set<Integer> set1= new HashSet<>();
		
		 
		 for(int i : arr1) {
			 set1.add(i);
		 }
		 
		 for(int i: arr2) {
			 if(set1.contains(i)) {
				 System.out.println(i);
			 }
		 }
		 

	}

}
