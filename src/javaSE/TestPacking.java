package javaSE;

public class TestPacking {
	public static void main(String[] args) {
		//��װ�� ����������������Ϊ����������
		int n = 55;
		
		//�����ֶ�װ�䷽��
		Integer i1 = new Integer(22);
		Integer i2 = Integer.valueOf(2222);
		System.out.println(i1);
		System.out.println(i2);

		//�Զ�װ��
		Integer i3 = n;
		
		//�ֶ�����
		n = i3.intValue();
		
		//�Զ�����
		n = i3;
		
		//����Float��Double����֮�� ����6�ֻ������͵İ�װ�඼ʵ���˳����ؼ��� �ڷ��������л���
		//ֻ������-128~127 �����������ֵ�ڴ˷�Χ�� �Ͳ�new������ ֱ�ӽ��������еĵ�ַ���ظ�����
		Integer num1 = 22;
		Integer num2 = 22;
		//�������淶Χ������ �൱��Integer num3 = new Integer(222); �ڶ��п����˿ռ�
		Integer num3 = 222;
		Integer num4 = 222;
		System.out.println(num1 == num2);
		System.out.println(num3 == num4);
		
		
		//�鿴������
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		//String -> int
		System.out.println(Integer.parseInt("123"));
		System.out.println(Integer.valueOf("234"));
		System.out.println(new Integer("345").intValue());
		
		//int -> String
		System.out.println(123+"");
		System.out.println(String.valueOf(234));
		System.out.println(Integer.toString(345));
		
		//����ת�� 10ת��������
		System.out.println(Integer.toBinaryString(5));
		System.out.println(Integer.toHexString(12));
		//��������ת10����
		System.out.println(Integer.valueOf("101", 2));
		System.out.println(Integer.valueOf("c", 16));
		
		//�����ַ������ж��ٸ���ĸ ���ٸ����� ���ٸ��ո�
		String str = "hello  12  23 4 ";
		char[] arrays = str.toCharArray();
		int icount = 0,acount = 0,count = 0;
		for(char s:arrays) {
			if(s >= 'a' && s <= 'z' || s >= 'A' && s <= 'Z' ) {
				acount++;
			}else if(s >= '0' && s <= '9') {
				icount++;
			}else {
				count++;
			}
		}
		System.out.println(icount+"������ "+acount+"����ĸ "+count+"���ո�");//������ʹ��Character��װ��
		
			
	}
	
}
