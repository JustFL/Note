package net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestTcpServer {
	public static void main(String[] args) throws IOException {
		//��������� �������ü����˿�
		ServerSocket serversocket = new ServerSocket(9999);
		//��ȡ�ͻ��˷��͹�����socket
		Socket socket = serversocket.accept();
		//��������ȡ����
		InputStream in = socket.getInputStream();
		byte[] b = new byte[in.available()];
		in.read(b);
		System.out.println(socket.getInetAddress().getHostAddress() + " say:"+new String(b, "gbk"));
		
		
		//���ͻ��˻���
		OutputStream out = socket.getOutputStream(); 
		out.write("OPUD-313".getBytes());
		
		//�ر�
		in.close();
		out.close();
		socket.close();
		serversocket.close();
		
	}
}
