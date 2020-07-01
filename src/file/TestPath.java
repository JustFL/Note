package file;

/**
 * Java���·��/����·���ܽ�
 * @author summerKiss
 *
 */
public class TestPath {
	public static void main(String[] args) {
		
		//�õ����ǵ�ǰ��TestPath.class�ļ���URIĿ¼ �������Լ�
		System.out.println(TestPath.class.getResource(""));
		
		//�õ����ǵ�ǰ��classpath�ľ���URI·�� (�μ���ǰ�ıʼ� classpathָ����.class�ļ���·��)
		System.out.println(TestPath.class.getResource("/"));

		//�õ���Ҳ�ǵ�ǰClassPath�ľ���URI·��
		System.out.println(Thread.currentThread().getContextClassLoader().getResource(""));

		//�õ���Ҳ�ǵ�ǰClassPath�ľ���URI·����
		System.out.println(TestPath.class.getClassLoader().getResource(""));
		
		System.out.println("�û����˻�����:"+System.getProperty("user.name"));
		System.out.println("�û�����Ŀ¼:"+System.getProperty("user.home"));
		System.out.println("�û��ĵ�ǰ����Ŀ¼:"+System.getProperty("user.dir"));
		System.out.println("��ǰ��classpath�ľ���·����URI��ʾ��:" + Thread.currentThread().getContextClassLoader().getResource(""));
		System.out.println("�õ����ǵ�ǰ��classpath�ľ���URI·��:"+ TestPath.class.getResource("/"));
		System.out.println("�õ����ǵ�ǰ��HdfsStream.class�ļ���URIĿ¼:"+TestPath.class.getResource(""));

		//���Բ�Ҫʹ��Ӳ����ľ���·�� ��Ϊ ������ȫ����ʹ��ClassLoader���getResource("")�����õ���ǰclasspath�ľ���·����
		//ʹ��Ӳ����ľ���·������ȫû�б�Ҫ��!��һ�����������ĺ��ѿ�!�����޷���ֲ!
		   
		/**
		 * java ʹ�����·����ȡ�ļ�
		 * 1.java project���� ʹ��java.io�����·����ȡ�ļ�������
		 * Ŀ¼�ṹ
		 * note
		 * 	|___src
		 * 		|___com.decisiontree.SamplesReader.java
		 * 	|___resource
		 * 		|___train.txt,test.txt
		 * 
		 * SamplesReader.java:
		 * String filepath="resource/train.txt";//ע��filepath�����ݣ�
		 * File file=new File(filepath);
		 * 
		 * ��������filepath������ java.ioĬ�϶�λ����ǰ�û�Ŀ¼("user.dir")�� �������̸�Ŀ¼"D:\note"��
		 * ��� ��ʱ�����·��(��user.dirΪ��·����·��)Ϊ"resource/train.txt"
		 * ���� JVM�Ϳ��Ը���"user.dir"��"resource/train.txt"�õ�������·����������·����"D:\note\resource\train.txt"
		 * �Ӷ��ҵ�train.txt�ļ�
		 * ע�⣺���·������ʼ����б��"/" 
		 * ���� filepath="resource/train.txt";
		 * ������filepath="/resource/train.txt"; //error!
		 */

		   
	}
}
