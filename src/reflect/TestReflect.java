package reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * �ڱ���׶β�֪��Ҫ���ص���
 * �����н׶ο��Ի�ȡ�����������Ϣ
 * ��ν������������н׶� ���Զ�̬��ȡ��ͬ�������Ϣ ���ò�ͬ����ķ����Ļ���*/

class DC implements Comics{

	@Override
	public void display() {
		System.out.println("This is DC Comics");
	}
	
}

class Marvel implements Comics{
	
	public String boss;
	
	private String address;

	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public void display() {
		System.out.println("This is Marvel Comics");
	}
	
	private void issue() {
		System.out.println("Marvel issue Spider");
	}
	
	
	private void issue(String name,int edition) {
		System.out.println("Marvel issue "+name+edition);
	}
	
	public Marvel() {
	}
	
	public Marvel(String boss,String address) {
		this.address = address;
		this.boss = boss;
	}

	@Override
	public String toString() {
		return "Marvel [boss=" + boss + ", address=" + address + "]";
	}
	
	
}

interface Comics{
	void display();
}

public class TestReflect {

	public static void main(String[] args) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
		//1 �������ȫ�޶���������ȡclass����(��Ҫ�Ƕ�ȡ�����ļ� ʵ�ֶ�̬����)
		Class<?> mode1 = Class.forName("reflect.DC");
		//2 ͨ������.class
		Class<?> mode2 = DC.class;
		//3 ����.getClass()
		DC dc = new DC();
		Class<?> mode3 = dc.getClass();
		
		//�����ļ�
		//1 properties ��HashTable������
		//2 xml
		
		//���������ļ�����
		Properties p = new Properties();
		//��ȡ�����ļ��б�
		InputStream i = TestReflect.class.getClassLoader().getResourceAsStream("reflect.properties");
		p.load(i);
		//��ȡvalueֵ
		String value = p.getProperty("comics");
		//���������ļ�value����class����
		Class<Comics> cla = (Class<Comics>) Class.forName(value);
		//����class��������޲������췽������ʵ��(newInstance��ʱ���� ����ʹ�ù�������������)
		cla.newInstance().display();
		
		//��ȡ�޲ι�����
		Constructor<Comics> c1 = cla.getConstructor();
		Comics comics1 = c1.newInstance();
		System.out.println("�޲ι��������� " + comics1);
		//��ȡ�вεĹ�����
		Constructor<Comics> c2 = cla.getConstructor(String.class,String.class);
		Comics comics2 = c2.newInstance("Stark","Nork");
		System.out.println("�вεĹ����� " + comics2);
		
		
		System.out.println("------------���Բ���----------------");
		//��ȡpublic������
		Field[] publicfields = cla.getFields();
		for (Field f : publicfields) {
			System.out.println(f.getName());
		}
		
		//��ȡ���е�����
		Field[] allfields = cla.getDeclaredFields();
		for (Field f : allfields) {
			System.out.println(f.getName()+"���Ե�������:"+f.getType());
		}
		
		//��ȡָ��������
		Field designatedfield = cla.getField("boss");
		System.out.println(designatedfield);
		
		Field designatedfield1 = cla.getDeclaredField("address");
		System.out.println(designatedfield1);
		
		
		//���������˽�����Ը�ֵ
		Marvel m = new Marvel();
		designatedfield1.setAccessible(true);
		designatedfield1.set(m, "New York");
		System.out.println(designatedfield1.get(m));
		
		System.out.println("------------�����ȡ������з���----------------");
		//�����ȡ������з��� ���������е�public�ķ����͸���ķ���
		Method[] allmethods = cla.getMethods();
		for (Method method : allmethods) {
			System.out.println(method);
		}
		
		System.out.println("------------�����ȡ����ķ���----------------");
		//�����ȡ������ķ��� ����������ķ��� ���ǰ�������private�ķ���
		Method[] declaredMethods = cla.getDeclaredMethods();
		for (Method method : declaredMethods) {
			System.out.println(method);
		}
		
		
		//��ȡָ���ķ��� ���ҵ���(�����ж��)
		Method designatedmethod = cla.getDeclaredMethod("issue", String.class, int.class);
		designatedmethod.setAccessible(true);
		designatedmethod.invoke(c1.newInstance(), "Iron Man",2);
		
		//��ȡָ���ķ��� ���ҵ���(�޲���)
		Method designatedmethod1 = cla.getDeclaredMethod("issue");
		designatedmethod1.setAccessible(true);
		designatedmethod1.invoke(c2.newInstance("Stan Lee","New York"));
		
		i.close();
		
		
	}

}
