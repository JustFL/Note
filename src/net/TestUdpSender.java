package net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class TestUdpSender {
	public static void main(String[] args) throws IOException {
		//����udp socket
		DatagramSocket socket = new DatagramSocket();
		//�������
		byte[] b = "hello receiver".getBytes();
		DatagramPacket packet = new DatagramPacket(b, b.length, InetAddress.getLocalHost(), 9999);
		//��������
		socket.send(packet);
		//�ر�
		socket.close();
	}
	
	
}
