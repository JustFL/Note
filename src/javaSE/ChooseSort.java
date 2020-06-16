package javaSE;

/**
 * @author summerKiss
 * 变种的选择排序 网上的排序方法也是两层循环 当i为一定的值时 遍历剩下所有的数字并进行比较 记录值最小的数字的index值 最后进行交换位置
 * 这种是遍历数字进行比较的同时就进行了交换位置 所以交换位置的动作会比上一种方式多很多 
 */
public class ChooseSort {

	public static void main(String[] args) {
		int[] arr = {1,45,26,72,22,1111,72};
		
		int[] sortedArr = sort(arr);
		
		//验证引用类型变量存储的是地址
		System.out.println(sortedArr);
		
		for(int n:sortedArr) {
			System.out.println(n);
		}

	}
	
	public static int[] sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		return arr;
	}
}
