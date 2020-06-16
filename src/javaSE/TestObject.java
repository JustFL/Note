package javaSE;

class To{

	//�����ͷ�ǰ���ô˷���
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println(this + " say: i am died");
	}
	
	@Override
	public String toString() {
		//���Խ�����ͨ����дtoString����ֱ�����
		return "i love study";
	}
	
}

public class TestObject {
	public static void main(String[] args) {
		To to = new To();
		//���󴴽�ʱ ������Ƚ������.class�ļ����ص������� Ȼ���ڶ��д���һ���ֽ����ļ����� ���е�ʵ������������ֽ����ļ�����Ϊģ����д��� 
		//.getClass�������ǻ�ȡ����ֽ����ļ�����
		System.out.println(to.getClass());
		System.out.println(to.getClass().getName());
		
		//ֱ����������������� ��ͬ��System.out.println(to.toString()); ������toString����
		System.out.println(to);
		
		//��hashCode�������ص�����ת��Ϊ16���� ���Ƕ����ַ
		System.out.println(Integer.toHexString(to.hashCode()));
		
		to = null;
		//֪ͨ����������������������
		System.gc();
	}
}
