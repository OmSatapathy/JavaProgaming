package jan15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SecondhighestElement {

	public static void main(String[] args) {

		Map<Integer, Integer> mp = new HashMap<>();
		mp.put(1, 12);

		mp.put(2, 32);
		mp.put(3, 8);
		mp.put(4, 65);
		mp.put(5, 6);
		mp.put(6, 7);
		mp.put(7, 47);

		System.out.println("Original Map: " + mp);

		List<Integer> values = new ArrayList<Integer>(mp.values());
		Collections.sort(values, Collections.reverseOrder());

		System.out.println(values.get(1));

		int secondHigest = values.get(1);

		Iterator<Entry<Integer, Integer>> iterator = mp.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Integer, Integer> entry = iterator.next();
			if (entry.getValue() == secondHigest) {
				iterator.remove();
				break;
			}

		}
		
		System.out.println("Map after removing second highest: " + mp);
	}

}
