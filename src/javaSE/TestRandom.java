package javaSE;
/**
 * �����
 * @author summerKiss
 *
 */

import java.util.Random;

public class TestRandom {
	public static void main(String[] args) {
		Random r = new Random();
		
		//int��Χ�ڲ��������
		int n1 = r.nextInt();
		System.out.println(n1);
		
		//�޶���Χ�ڲ��������
		int n2 = r.nextInt(5);
		System.out.println(n2);
		
		System.out.println(TestRandom.anyRandom(23, 45));
	}
	
	public static int anyRandom(int lower,int upper) {
		//��Ϊrandom������[)������Ҫ+1
		int n = (int)(Math.random()*(upper-lower+1)+lower);
		return n;
	}
	
}
