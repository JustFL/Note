package javaSE;

import java.util.Arrays;

/**
 * Arrays������
 * @author summerKiss
 *
 */
public class ArraysTool {
	public static void main(String[] args) {
		int[] arr = {51,231,11,71,33};
		//չʾ����
		System.out.println(Arrays.toString(arr));
		
		//���� ����֧��ָ����Χ������
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//���ֲ���
		System.out.println(Arrays.binarySearch(arr, 33));
		
		//���
		Arrays.fill(arr, 111);
		System.out.println(Arrays.toString(arr));
		
		//����
		int[] arr1 = {1,2,4,5,6};
		int[] arr2 = Arrays.copyOfRange(arr1, 2, 4);
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr1);
		System.out.println(arr2);
		
		System.out.println("third");
	}
}
