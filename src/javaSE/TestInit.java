package javaSE;
/**
 * �����չʾ��ĳ�ʼ������
 * @author summerKiss
 *
 * object-oriented
 * ����Ĵ�����û�й����� ϵͳ���ṩһ��Ĭ�ϵ��޲����Ĺ����� 
 * e.g 
 * public Fish(){}
 * ���Ǵ������й����� �����Ĭ�Ϲ�������ʧ
 * ������Ĺ�����֮���໥���� ����ʹ��this()������ʽ
 * e.g
 * public Fish(){
 * }
 * public Fish(int age){
 * 	this();//����һ���޲ι����� ������������������ʹ�� ���ұ����ڵ�һ�е���
 *  this.age = age;
 * }
 */

class Fish{
	
	//��Ա���� ϵͳ�����ȸ��������Զ������ʼֵ �����Ĭ�ϳ�ʼ�� null���Ը������е���������
	String color = "green";
	int age = 10;//��������ʼ��
	
	//������г�ʼ�� �ڴ�������ʱ�Զ����� ���ȹ��������� 
	//���Ǻ��������ĳ�ʼ��������˳��
	{
		age = 20;
		color = "red";
	}
	
	//�������г�ʼ��
	public Fish() {
		this.age = 40;
		System.out.println("this is father");
	}
	
	public void setAge(int age) {
		//this��ʾ��ǰ��Ķ��� ˭����������� �Ǹ��������this
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Fish [color=" + color + ", age=" + age + "]";
	}
}

class Grass extends Fish{
	//���������Ƿ����Զ��幹���� �����ڹ���������ʽ����super()��������޲ι����� ����������Զ����������вι����� �����޲����Ĺ�������ʧ�Ļ� �ᱨ��
	//����֮ ���������ֻ���Զ�����вι����� �����������ʽ���ø��������вι��� 
	
	public Grass() {
		System.out.println("this is son");
	}
}


public class TestInit {
	public static void main(String[] args) {
		Fish f = new Fish();
		System.out.println(f);
		System.out.println("-------------");
		
		Grass g = new Grass();
		System.out.println(g);
	}
}
