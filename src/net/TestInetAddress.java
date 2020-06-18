package net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {
	public static void main(String[] args) throws UnknownHostException {
		
		//��ȡ��������������IP��ַ
		InetAddress address = InetAddress.getLocalHost();
		String hostName = address.getHostName();
		String hostAddress = address.getHostAddress();
		System.out.println(hostName+':'+hostAddress);
		
		//��ȡָ����IP��Ϣ
		InetAddress address1 = InetAddress.getByName("Z");
		System.out.println(address1.getHostAddress());
		
		//���ʶ�������Ƕ�̨�����ʱ
		InetAddress[] baidu = InetAddress.getAllByName("www.baidu.com");
		for (InetAddress inetAddress : baidu) {
			System.out.println(inetAddress.getHostAddress());
		}
		
		
	}
}
