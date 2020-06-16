package javaSE;

/**
 * 
 * ���ɱ���
 * 
 * @author summerKiss
 *
 */
public class TestString {
	public static void main(String[] args) {
		//ʹ������ֵ����String���� ֱ���ڷ������ĳ������д���String���� ������ַ���ظ�����s1
		String s1 = "hello";
	
		//�����������Ѿ���Ŀ���ַ���ʱ �Ὣ����ֱ��ָ��õ�ַ �������´��� ��ʡ���ڴ�
		String s2 = "hello";
		
		//��ַ��ͬ
		System.out.println(s1 == s2);
		//�Ƚ�����ֵ
		System.out.println(s1.equals(s2));
		
		//ʹ��new�ؼ��� �ض����ڶ��п��ٿռ� ֮���ǻ�ȥ�������в鿴�Ƿ���Ŀ���ַ��� ����� ����ַ��ŵ����п��ٵĿռ��� 
		//Ȼ���ٽ����еĵ�ַ���ظ�s3����
		String s3 = new String("hello");
		
		System.out.println(s2 == s3);
		
		//�ַ������ɱ� ������s4����ָ����ƴ�Ӻ�����ַ��� ���ַ���hello�����ö�ʧ
		//�ַ���ÿ�θı� ��ʵ���Ǵ��������ַ��� 
		String s4 = "hello";
		s4 = s4.concat(" world"); 
		System.out.println(s4);
		
		//�ַ�������
		System.out.println(s4.length());
		
		//�ַ����Ƚ�
		System.out.println(s4.equalsIgnoreCase("HellO WorLd"));
		
		//��д
		System.out.println(s4.toUpperCase());
		
		//Сд
		System.out.println(s4.toLowerCase());
		
		//���ز����ַ����ڵ�ǰ�ַ�����һ�γ��ֵ�λ��
		System.out.println(s4.indexOf("l"));
		
		//���ز����ַ����ڵ�ǰ�ַ������һ�γ��ֵ�λ�� ���Դ�Сд
		System.out.println(s4.lastIndexOf("l"));
		
		//���ص�ǰ����λ�õ�һ���ַ�
		System.out.println(s4.charAt(0));
		
		//�и��ַ��� �ӿ�ʼλ�õ�ĩβ
		System.out.println(s4.substring(1));
		
		//[start, end)
		System.out.println(s4.substring(6, 11));
		
		//ȥ����β�ո�
		System.out.println(s4.trim());
		
		//�ò���2�ַ����滻����1�ַ���
		System.out.println(s4.replace("l", "a"));
		
		//��xx��ͷ ��xx��β ���Դ�Сд
		System.out.println(s4.endsWith("ld"));
		System.out.println(s4.startsWith("h"));
		
		//�Ƚ������ַ���
		String s5 = "abc";
		String s6 = "bcd";
		System.out.println(s5.compareTo(s6));
		
		//String -> char[]
		char[] charArray = s5.toCharArray();
		for(char c: charArray){
			System.out.println(c);
		}
		
		//�ָ��ַ���
		String s7 = "aa bb c dd efg";
		String[] strings = s7.split(" ");
		for (String string : strings) {
			System.out.println(string);
		}
		
		//�ִ��Ƿ����
		boolean b = s7.contains(" bb ");
		System.out.println(b);
	}
}
