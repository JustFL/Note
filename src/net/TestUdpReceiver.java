package net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class TestUdpReceiver {
	public static void main(String[] args) throws IOException {
		//����˸��ݼ����˿ڴ���socket
		DatagramSocket socket = new DatagramSocket(9999);
		//�����������ݵİ�
		byte[] b = new byte[1024];
		DatagramPacket packet = new DatagramPacket(b, b.length);
		//��������
		socket.receive(packet);
		//��ȡ����
		System.out.println(new String(packet.getData(), "gbk"));
		//�ر�
		socket.close();
		
	}
}
