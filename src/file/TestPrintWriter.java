package file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestPrintWriter {

	public static void main(String[] args) throws IOException {
		
		//����ʵ����AutoCloseable�ӿڵ������󶼿���ʹ��try catch�������Զ��Զ���Դ�ͷ�
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter("StreamTest.txt");
		
		String str = null;
		while(true) {
			str = br.readLine();
			if(str.equals("q")) {
				break;
			}
			//ֱ�ӽ�����д��
			pw.println(str);
		}
		br.close();
		pw.close();
		
		
	}

}
