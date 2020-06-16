package file;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ������
 * �ṩ�˲�ͬ�������͵Ķ�ȡ��д��
 * */
public class TestDataStream {

	public static void main(String[] args) throws IOException {
		int[] no = {11,22,33};
		String[] name = {"Tony Stark","Thor","Bruce Banner"};
		
		//��������������
		DataOutputStream douts = new DataOutputStream(new FileOutputStream("DataStream.txt"));
		
		//���ò�ͬ��д�뷽�� д�벻ͬ���͵�����
		for (int i = 0; i < no.length; i++) {
			douts.writeInt(no[i]);
			douts.writeUTF(name[i]);
		}
		
		//�ر�
		douts.close();
		
		//-----------------------------------
		//������������ȡ
		DataInputStream dins = new DataInputStream(new FileInputStream("DataStream.txt"));
		
		//���ò�ͬ�ķ��� ���벻ͬ���͵�����
		for (int i = 0; i < no.length; i++) {
			System.out.println(dins.readInt());	
			System.out.println(dins.readUTF());
			
		}
		
		//�ر�
		dins.close();
		
		
		
	}

}
