package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * ɨ����
 * ���Զ�����Դ���д���
 * */
public class TestScanner {
	public static void main(String[] args) throws IOException {
		
		//�����in��System���ڲ������һ��InputStream�� �Ǽ��������� �����������������Ϊ����Դ
		Scanner stream = new Scanner(System.in);
		
		//������Դ���д���
		if(stream.hasNextInt()) {
			System.out.println("������");
		}else
		{
			System.out.println("��������");
		}
		
		stream.close();
		
		
		//�����Լ�����  
		FileInputStream fs = new FileInputStream("StreamTest.txt");
		
		//����Scanner�������Դ���д��� ���ｫFileInputStream��Ϊ����Դ
		Scanner superman = new Scanner(fs);
		
		//ͨ��nextϵ�еķ��� ��ȡ��ͬ�������͵�����
		//�����ȡ���ɿո�ָ���һ������
		String word = superman.next();
		System.out.println(word);
		
		//��ȡһ��
		String line = superman.nextLine();
		System.out.println(line);
		
		//�ر���
		superman.close();
		fs.close();
		
	}
}
