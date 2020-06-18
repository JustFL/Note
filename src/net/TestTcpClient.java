package net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TestTcpClient {
	public static void main(String[] args) throws IOException {
		//�����ͻ���socket
		Socket socket = new Socket(InetAddress.getLocalHost().getHostAddress(), 9999);
		//����������������˵���
		OutputStream out = socket.getOutputStream();
		out.write("DHT-162".getBytes());
		//�������
		socket.shutdownOutput();
		
		//���շ���˻���
		/**
		 * ���������ô�ƪ����������  
		 * public int read(byte b[]) �������������ڴӱ����ļ���ȡ����ʱ��һ�㲻���������⣬���������������������;���������һЩ�鷳��
		 * ���磬SocketͨѶʱ���Է�����������1000���ֽڣ�
		 * �����Լ��ĳ������available()����ȴֻ�õ�900������100��������0���о��е�Ī�������ôҲ�Ҳ���ԭ��
		 * ��ʵ��������Ϊ����ͨѶ�����Ǽ���Եģ�һ���ֽ������ּ������з��͡�
		 * ���س������available()������ʱ�õ�0��������ǶԷ���û����Ӧ��Ҳ�����ǶԷ��Ѿ���Ӧ�ˣ�
		 * �������ݻ�û���ʹﱾ�ء��Է�������1000���ֽڸ��㣬Ҳ��ֳ�3�����
		 * �����Ҫ����3��available()�������ܽ���������ȫ���õ���
		 * �������д���룺
		 * int count = in.available();
		 * byte[] b = new byte[count];
		 * in.read(b);
		 * �ڽ����������ʱ����������Ϊ�����available()����ʱ��
		 * �Է����͵����ݿ��ܻ�û�е����õ���count��0��
		 * ��Ҫ�ĳ�������
		 */
		InputStream in = socket.getInputStream();
		int count = 0;
		while (count == 0) {
			count = in.available();
		}
		
		/**
		 * ������ݴ���ľ���
		 * ����InputStream.read(byte[] b)��InputStream.read(byte[] b,int off,int len)
		 * �������������������������ȡ����ֽڵģ��о���ĳ���Ա�ͻᷢ�֣�
		 * ����������������ȡ�����Լ���Ҫ��ȡ�ĸ������ֽڡ�
		 * �����һ������������Ա����ϣ�������ܶ�ȡ��b.length���ֽڣ���ʵ������ǣ�ϵͳ������ȡ������ô�ࡣ
		 * ��ϸ�Ķ�Java��API˵���ͷ����ˣ�������� ������֤�ܶ�ȡ��ô����ֽڣ�
		 * ��ֻ�ܱ�֤����ȡ��ô����ֽ�(����1��)����ˣ����Ҫ�ó����ȡcount���ֽڣ���������´��룺
		 * byte[] b = new byte[count];
		 * int readCount = 0; // �Ѿ��ɹ���ȡ���ֽڵĸ���
		 * while (readCount < count) {
		 * 	     readCount += in.read(bytes, readCount, count - readCount);
		 * }
		 * ����δ�����Ա�֤��ȡcount���ֽڣ�������;����IO�쳣���ߵ����������Ľ�β(EOFException)
		 * 
		 */
		
		byte[] b = new byte[count];
		in.read(b);
		System.out.println("server say "+new String(b, "gbk"));
		
		//�ر�
		in.close();
		out.close();
		socket.close();
		
	}
}
