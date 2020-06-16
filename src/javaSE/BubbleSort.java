package javaSE;

import java.util.Arrays;

/**
 * ц╟ещеепР
 * */
public class BubbleSort {
	public static void main(String[] args) {
		Integer[] arrs = {12,84,98,25,84,38,71,41,53,66,36,55};
		for (int i = 0; i < arrs.length-1; i++) {
			for (int j = 0; j < arrs.length-1-i; j++) {
				if (arrs[j] > arrs[j+1]) {
					int temp = arrs[j+1];
					arrs[j+1] = arrs[j];
					arrs[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arrs));
	}
}
