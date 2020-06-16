package javaSE;

/**
 * ��̬ ͬһ���������� ʹ�ò�ͬ��ʵ����ִ�в�ͬ�Ĳ���
 * 
 * �ص㣺
 * 1>�����м̳л�ʵ�ֹ�ϵ ���з�����д
 * 2>��������ָ���������
 *   �ӿ�����ָ��ʵ�������
 *   
 *   ʹ�ö�̬����������֮��Ĳ��� ֻ�ܵ��ø����й�ͬ������
 *   
 *   ��̬�������ڲ������߷���ֵ
 * @author summerKiss
 *
 */

class Pet{
	private String name;
	Pet(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void eat() {
		System.out.println("Pet "+name+"is eating");
	}
}

class Dog extends Pet{
	Dog(String name){
		super(name);
	}
	public void eat() {
		System.out.println("Dog is eating");
	}
	public void run() {
		System.out.println("Dog is runing");
	}
}

class Cat extends Pet{
	Cat(String name){
		super(name);
	}
	public void eat() {
		System.out.println("Cat is eating");
	}
	public void play() {
		System.out.println("Cat is playing");
	}
}


class PetHospital{
	//������̬ ����ʹ�ø�������� ���Դ���������������
	public void treadment(Pet pet) {
		System.out.println(pet.getName()+"�Ĳ��κ���");
		System.out.println(pet.getClass());
		if (pet instanceof Dog) {
			Dog dog = (Dog)pet;
			dog.run();
		}else {
			Cat cat = (Cat)pet;
			cat.play();
		}
	}
}



public class VarietyState {
	public static void main(String[] args) {
		Dog wangwang = new Dog("����");
		Cat miaomiao = new Cat("����");
		PetHospital p = new PetHospital();
		p.treadment(wangwang);
		p.treadment(miaomiao);
	}
}
