package javaSE;
/**
 * ����ģʽд��˼· 
 * ֻ����һ��ʵ���Ļ� �Ͳ����������˵��ù��췽�� ���Ե�һ���Ƚ�������private 
 * ����֮�� �����˳����Լ������ܴ���ʵ���� ������ҪԤ�ȴ�����һ��ʵ�� �����ʵ����Ϊ��Ա����
 * Ȼ��дһ������ ������ʵ�� ������Ҫ���÷����ͱ�����Ҫ������ʵ�� ����û�й������޷�����ʵ�� ���Խ�������Ϊstatic ʹ��������ֱ�ӵ��÷���
 * ��Ϊ����Ϊstatic ��Ҫ�������ʵ�� ʵ��Ҳ����Ϊstatic ����ͨ����������е��жϾͿ��Կ���ֻ��һ��ʵ�� 
 * ��������ʵ���� Ϊ�˱�֤��ȫ ���Խ������Ա������Ϊprivate
 * @author summerKiss
 *
 */

class Hungry{
	private static Hungry h = new Hungry();
	private Hungry() {}
	public static Hungry getInstance() {
		return h;
	}
}

class Lazy{
	private static Lazy l = null;
	private Lazy() {}
	public static Lazy getInstance() {
		if (l == null) {
			l = new Lazy();
		}
		return l;
	}
}

public class Singleton {
	public static void main(String[] args) {
		Hungry h1 = Hungry.getInstance();
		Hungry h2 = Hungry.getInstance();
		Hungry h3 = Hungry.getInstance();
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		
		Lazy l1 = Lazy.getInstance();
		Lazy l2 = Lazy.getInstance();
		Lazy l3 = Lazy.getInstance();
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
	}
}
