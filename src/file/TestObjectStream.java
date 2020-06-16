package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


/**
 * ������
 * ���л� ������洢���ļ���
 * �����л� ���ļ��н������ȡ����
 * */

class Avenger implements Serializable{
	/**
	 * ���л��汾�� �����ָ�� ϵͳ���Զ��������һ�� 
	 * ���л������������෢���仯 �����е�ʱ��汾�Żᷢ���仯 ���������ֶ�ָ��һ�� ��֤�������л�����ȷ
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return name + "," + age;
	}
	public Avenger() {
		
	}
	public Avenger(int age,String name) {
		this.age = age;
		this.name = name;
	}
}

public class TestObjectStream {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Avenger Tony = new Avenger();
		Tony.setAge(39);
		Tony.setName("Tony Stark");
		
		//--------------���л�-----------------
		//����������
		ObjectOutputStream oouts = new ObjectOutputStream(new FileOutputStream("ObjectStream.txt"));
		
		//д�����  �ļ��е���������16����д��
		oouts.writeObject(Tony);
		
		//�ر�
		oouts.close();
		
		//--------------�����л�-----------------
		ObjectInputStream oins = new ObjectInputStream(new FileInputStream("ObjectStream.txt"));
		
		//��ȡ����
		Avenger p = (Avenger)oins.readObject();
		System.out.println(p);
		
		//�ر�
		oins.close();
	}

}
