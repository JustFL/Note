package javaSE;
/**
 * 
 * @author zy
 * 
 */

public class Operator {
	public static void main(String[] args) {
		//++n1 ������ ��ֵ n1++ �ȸ�ֵ ������
		int n1 = 5;
		int n2 = n1++;
		int n3 = ++n1;
		System.out.println(n1 + "-" + n2 + "-" + n3);
		
		//n4 += 5;��n5 = n5 + 5;����һ��ǿ������ת��
		short n4 = 5;
		n4 += 5;
		System.out.println(n4);
		
//		short n5 = 5;
//		n5 = n5 + 5;
//		System.out.println(n5);
		
		//&&��·�� &�Ƕ�·��  |��||һ��������
		int n6 = 1;
		System.out.println(5>6 && n6++ == 1);
		System.out.println(n6);
		int n7 = 1;
		System.out.println(5>6 & n7++ == 1);
		System.out.println(n7);
	}
	
}
