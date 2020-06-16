package file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 *                             Reader
 *                               |
 *  BufferedReader-------InputStreamReader------PrintWriter(����������)
 *                               |
 *                          FileReader
 *                           
 * @author summerKiss
 *
 */

public class TestFileReader {
	public static void main(String[] args) throws IOException {
		//�����ַ��ļ�������
		File f = new File("StreamTest.txt");
		FileReader fr = new FileReader(f);
		//��ȡ ����ÿ�ζ���ȡһ���ַ� 
//		int temp;
//		while((temp = fr.read()) != -1) {
//			System.out.print((char)temp);
//		}
		//�����ַ�����
		char[] c = new char[(int)f.length()];
		//���ļ����ݴ洢���ַ�������
		fr.read(c);
		System.out.println(c);
		
		//�ر�
		fr.close();
		
		//����д��������д��
		FileWriter fw = new FileWriter(f);
		//����д��
		fw.write("Tony Stark");
		//�ر�
		fw.close();
	}
	
	
}
