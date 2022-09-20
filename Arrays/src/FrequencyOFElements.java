import java.util.HashMap;

public class FrequencyOFElements {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 2, 45, 8 };
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i]))
				hm.put(arr[i], hm.get(arr[i]) + 1);
			else
				hm.put(arr[i], 1);
		}
		System.out.println(hm);
	}

}
