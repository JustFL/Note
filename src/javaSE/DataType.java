package javaSE;

import java.math.BigDecimal;

public class DataType {
	public static void main(String[] args) {
		/*
		 * ������������ ���ֵ
		 * */
		//1 ��������(���ȷֱ�Ϊ1��2��4��8byte) ע��:����ֵ����������Ļ� �ͻ�Ĭ��Ϊint���� 
		byte a = 15;
		short b = 32000;
		int c = 1000000;
		long d = 1000002222l;
		System.out.println("a=" + a + "\n" + "b=" + b + "\n" + "c=" + c + "\n" + "d=" + d);
		
		//��0B/0bǰ׺��ʾ2������
		int n1 = 0b101;
		System.out.println(n1);
		
		//��0��ʾ8������
		int n2 = 017;
		System.out.println(n2);
		
		//��0x/0X��ʾ16������
		int n3 = 0X17;
		System.out.println(n3);
		
		//��ѧ������e/E
		double n4 = 1.4E10;
		System.out.println(n4);
		
		//2 ��������(���ȷֱ�Ϊ4��8byte) ע��:����ֵ����Ǹ������͵Ļ� �ͻ�Ĭ��Ϊdouble���� 
		float e = 1.5f;
		double f = 2.12312d;
		System.out.println("e=" + e + "\n" + "f=" + f);
		
		//��Ӻ󲻵���0.3
		double n5 = 0.1;
		double n6 = 0.2;
		System.out.println(n5 + n6);
		
		//׼ȷ����С��
		BigDecimal num1 = new BigDecimal("0.1");
		BigDecimal num2 = new BigDecimal("0.2");
		System.out.println(num1.add(num2));
		
		//3 �ַ�����(2byte) ��Χ0~65535 ÿһ����ֵ��Ӧһ���ַ�
		char g = 'a';
		char g2 = '��';
		int g1 = g2;
		System.out.println(g1);
		System.out.println(g);
		//4 �������� 
		boolean h = true;
		System.out.println(h);
		
		/*
		 * ������������ ��ŵ�ַ
		 * */
		//1 �ַ���
		//2 ������
		//3 ����
		//4 �ӿ�
		
		
	}
}
