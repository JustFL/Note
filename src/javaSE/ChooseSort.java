package javaSE;

/**
 * @author summerKiss
 * ���ֵ�ѡ������ ���ϵ����򷽷�Ҳ������ѭ�� ��iΪһ����ֵʱ ����ʣ�����е����ֲ����бȽ� ��¼ֵ��С�����ֵ�indexֵ �����н���λ��
 * �����Ǳ������ֽ��бȽϵ�ͬʱ�ͽ����˽���λ�� ���Խ���λ�õĶ��������һ�ַ�ʽ��ܶ� 
 */
public class ChooseSort {

	public static void main(String[] args) {
		int[] arr = {1,45,26,72,22,1111,72};
		
		int[] sortedArr = sort(arr);
		
		//��֤�������ͱ����洢���ǵ�ַ
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
