package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ����һ����˳��� �������յ�����ݼ���
 * 
 * �����ж��ַ��� ���շ�����Է�Ϊ���������� 
 * ���������������Ϳ��Է�Ϊ�ֽ������ַ���
 * �ַ�����Ҫ�����ı� �ֽ������Դ��������ʽ
 * 
 * �ֽ�������
 *              FileInputStream              
 *                |        
 *                |                     DataInputStream
 * InputStream--FilterInputStream------ BufferedInputStream      
 *                |        
 *                |        
 *              ObjectInputStream          
 *                        
 * ������������Ӧ�� ��һ��PrintStream                       
 *                        
 * @author summerKiss
 *
 */

public class TestFileStream {
	public static void main(String[] args) throws IOException {
		
		/**
		 * д��
		 * */
		File file = new File("StreamTest.txt");
		//����д���� ���Խ���׷��д�� public FileOutputStream(File file, boolean append)
		FileOutputStream fo = new FileOutputStream(file);
		//�����ַ�����洢Ҫд�������
		String str = "(����)Thor is 1500 years old";
		byte[] bout = str.getBytes();
		//��ʼд��
		//������public void write(byte b[], int off, int len)
		fo.write(bout);
		//�ر�
		fo.close();
		
		//���ֶ�ȡ��ʽ �������ַ�ʽ���ԶԸ��ļ��������ĵ����
		/**
		 * 1>����ֽڶ�ȡ
		 * fs.read()��ȡ��ÿ���ֽڷ��ص���ASCII��Ӧ���������� ת��Ϊ�ַ��鿴���� 
		 * �����ݽ���ʱ ���ȡ-1��ʾû��������
		 * ���������������ֽڱ�ʾһ���ַ� ��������ֽڶ�ȡ��ʱ�� ���ֵİ���ֽڻ���ʾΪ��
		 * */
		//�����ļ��ֽ���
		FileInputStream fi1 = new FileInputStream(file);
		//�������ͱ�������ļ��ֽ�����ȡ���
		int charToInt;
		//����ֽڶ�ȡ ֱ���ļ�ĩβ-1
		while ((charToInt = fi1.read()) != -1) {
			System.out.print(charToInt + " " + (char)charToInt + "\n");
		}
		//�ر���
		fi1.close();
		
		/**
		 * 2>�������ֽڶ�ȡ��һ���ֽ������� Ȼ��ת��Ϊ�ַ���
		 */
		FileInputStream fi2 = new FileInputStream(file);
		//����һ���ֽ����� ָ����С�����ַ�ʽ
		//1>(int)file.length() �ļ��Ĵ�С
		//2>fi2.available()    ���ĳ���
		byte[] b = new byte[(int)file.length()];
		//����ȡ������ȫ���洢���ַ�������
		fi2.read(b);
		//��ȡ�������ݴ洢�������� 
		//�ڶ���������ʾ��������ĸ�λ�ÿ�ʼ���
		//������������ʾ��ȡ���ٸ��ֽ�
		//fi2.read(b, 1, 2);
		//������ת��Ϊ�ַ��� ����ָ���˱��뷽ʽ Ȼ��������
		System.out.println(new String(b, "gbk"));
		//�ر���
		fi2.close();
		
		/**
		 * 3>���ֽ���ת��Ϊ�ַ���
		 */
		FileInputStream fi3 = new FileInputStream(file);
		//���ֽ�����װΪ�ַ���
		InputStreamReader ir = new InputStreamReader(fi3);
		
		int tmp;
		//�ַ���ÿ�ζ�ȡһ���ַ�
		while ((tmp = ir.read()) != -1) {
			System.out.print((char)tmp);
		}
		//ֱ�ӹر��������Ϳ���
		ir.close();
		
		

		

	}
}
