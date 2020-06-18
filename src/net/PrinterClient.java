package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * ʹ��PrintWriter�Դ����� ��ʾ��������
 * 
 * @author summerKiss
 *
 */
public class PrinterClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket socket = new Socket("localhost", 12000);
		
		OutputStream out = socket.getOutputStream();
		PrintWriter pw = new PrintWriter(out);
		pw.println("long time no see");
		pw.flush();
		
		InputStream in = socket.getInputStream();
		//���շ������Ļظ�
		BufferedReader bin = new BufferedReader(new InputStreamReader(in));
		String temp = null;
		StringBuffer sb = new StringBuffer();
		if ((temp = bin.readLine()) != null) {
			sb.append(temp);
		}
		System.out.println("server say:" + sb);
		
		bin.close();
		pw.close();
		socket.close();
	}
}
