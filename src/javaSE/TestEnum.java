package javaSE;

enum Season{
	//����Ķ�����Season���͵�4������ 
	//�൱��private static final javaSE.Season Spring = new Season(); �͵���ģʽһ��������ֱ�Ӵ�������Ķ���
	//�������޷���������
	Spring,Summer,Autumn,Winter;
	
	//ö�����Ϳ��Զ���������ʵ������
	private int n;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	private Season() {
	}

	//���Զ��幹���� ������˽�е�
	private Season(int n) {
		this.n = n;
	}

	//ö�����Ϳ��Զ���������ʵ������
	public void show() {
		System.out.println(this.getN());
	}
}

class Vacation{
	private Season season;

	public Season getSeason() {
		return season;
	}

	public void setSeason(Season season) {
		this.season = season;
	}
}

public class TestEnum {

	public static void main(String[] args) {
		Vacation v = new Vacation();
		Season.Spring.setN(123);
		v.setSeason(Season.valueOf("Spring"));
		System.out.println(v.getSeason());
		v.getSeason().show();
	}

}
