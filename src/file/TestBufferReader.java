package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**�����ַ���
 * FileReader FileWriter�ǽڵ�(��Ӧ���ǰ�װ��)�� ����ײ�� ֱ�ӽӴ����ݵ��ַ���
 * 
 * */
public class TestBufferReader {
	public static void main(String[] args) throws IOException {
		
		//����
		File f = new File("StreamTest.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		//ÿ�ζ�ȡһ������ ���ݽ�����Ϊnull
		String str;
		while((str = br.readLine()) != null) {
			System.out.println(str);
		}
	
		//�ر�
		br.close();
	}
}
