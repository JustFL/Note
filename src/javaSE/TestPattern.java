package javaSE;

/**
 * ������ʽ
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPattern {
	public static void main(String[] args) {
		
		Scanner superman = new Scanner(System.in);
		System.out.println("������һ����������");
		String str = superman.next();
		
		//�绰���� ֻ�������� ��1��ͷ "1\\d{10}"
		//���� ֻ�������ֺ���ĸ ����4-10 "\\w{4,10}"
		//�û��� ��Ӣ�Ŀ�ͷ ֻ�������ֺ���ĸ ����4-16 "[a-zA-Z]\\w{3,15}"
		
		//����Ҫƥ���������ʽ
		Pattern p = Pattern.compile("[a-zA-Z]\\w{3,15}");
		//����Ҫ��֤���ַ���
		Matcher m = p.matcher(str);
		//��֤
		System.out.println(m.matches());
		
		superman.close();
	}
}
