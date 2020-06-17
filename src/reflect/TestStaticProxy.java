package reflect;


/**
 * ����ģʽʵ����Ŀ������ڱ�����֮ǰ���߷���֮���Ԥ���� ���˵Ȳ��� ����ʵ���˶�Ŀ��ķ��ʿ���
 * ��̬���� �ڱ���׶δ��������� �ڴ�������Ϊ��Ҫ���ʵķ������ô����� */
interface Person{
	void Singing();
	void Talent();
}

//��Ƭ��˾ ��Ϊ����
class Warner implements Person{
	
	//�������µ�����
	private Person star;
	
	public Warner(Person p) {
		this.star = p;
	}

	public Person getStar() {
		return star;
	}

	public void setStar(Person star) {
		this.star = star;
	}

	@Override
	public void Singing() {
		System.out.println("��ױ");
		star.Singing();
		System.out.println("�ؼ�");
	}

	@Override
	public void Talent() {
		System.out.println("�����");
		star.Talent();
		System.out.println("��Ϣ");
	}
	
}

class JJ implements Person{

	@Override
	public void Singing() {
		System.out.println("JJ���ܲ�");
	}

	@Override
	public void Talent() {
		System.out.println("JJ������");
		
	}
	
}

class Jay implements Person{

	@Override
	public void Singing() {
		System.out.println("Jay������ĩ��");
		
	}

	@Override
	public void Talent() {
		System.out.println("Jay����");
		
	}
	
}

public class TestStaticProxy {
	public static void main(String[] args) {
		
		JJ jj = new JJ();
		Jay jay = new Jay();
		//ΪJJ����
		Warner w = new Warner(jj);
		w.Singing();
		
		//ΪJay����
		w.setStar(jay);
		w.Talent();
		
	}
}
