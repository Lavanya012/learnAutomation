package Array.Duplicates;

import java.util.Arrays;

public class CheckIfAnyduplicateSorted {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		boolean flag = false;

		Arrays.sort(arr);

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				flag = true;
				break;
			}

		}

		if (flag == true) {
			System.out.println("Has duplicates");
		} else {
			System.out.println("Don't have duplicates");
		}

	}

}
