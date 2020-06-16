package javaSE;

//����ʽ�ӿڶ��� ֻ����һ�����󷽷� ������������ lambdaֻ��ʹ��ʹ�ú���ʽ�ӿ�
//@FunctionalInterface ��һ��ע�� ��������һ������ʽ�ӿ� ���ڱ����ʱ��ͻ���м��
@FunctionalInterface
interface LambdaInter{
	String sayHello(String name);
	default void func1() {
		System.out.println("����ʽ�ӿ�����������û������");
	}
}

//��ҵʹ��lambdaʵ�ֽ�ȡ�ַ���  ����Ϊsub(String str,int start,int end)
@FunctionalInterface
interface StrSub{
	String sub(String str, int start, int end);
}


public class TestLambda {
	public static void main(String[] args) {
		//ʹ��lambdaʵ�ֺ���ʽ�ṹ�ĳ��󷽷� �в����з���ֵ
		LambdaInter la = (name)->{
			System.out.println("-----");
			String s = "hello "+name;
			return s;
			};
		String str = la.sayHello("tom");
		System.out.println(str);
		
		System.out.println("���ǻ����ķָ���!");
		
		//ʹ��lambda�滻threadʹ��ʱ���ڲ���д��
		//�����������ڲ���д��
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("this is runnable");
			}
			
		});
		t.start();
		
		//lambdaд��
		new Thread(()-> {System.out.println("this is lambda runnable");}).start();;

		
		//ʹ�������ڲ���ʵ���ַ�����ȡ
		StrSub s1 = new StrSub() {

			@Override
			public String sub(String str, int start, int end) {
				return str.substring(start, end);
			}
			
		};
		System.out.println(s1.sub("lambda", 0, 2));
		
		//ʹ��lambda���ʽʵ���ַ�����ȡ
		StrSub s2 = (str1,start,end)->{return str1.substring(start, end);};
		System.out.println(s2.sub("lambda", 0, 2));
		
		//ʹ��lambda��������ʵ���ַ�����ȡ lambda���õ�ʹ��ǰ������lambda��ֻ��һ����� ֻ��һ������
		StrSub s3 = String::substring;
		System.out.println(s3.sub("lambda", 0, 2));
	}
	
}

