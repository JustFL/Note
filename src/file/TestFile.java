package file;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
/**
 * File��ȿ��Զ��ļ����в��� Ҳ���Զ��ļ��н��в���
 * */
public class TestFile {
	
	//�ݹ���ʾһ���ļ����е������ļ������ļ����е������ļ�
	public void show(String path) {
		File filepath = new File(path);
		if (filepath.isFile()) {
			System.out.println(filepath.getAbsolutePath());
		}else if(filepath.isDirectory()) {
			File[] files = filepath.listFiles();
			for(File f : files) {
				if (f.isFile()) {
					System.out.println(f.getName());
				}
				else if (f.isDirectory()) {
					System.out.println("Ŀ¼�����ǣ�"+f.getName());
					show(f.getAbsolutePath());
				}	
			}
		}
	}

	public static void main(String[] args) throws IOException {
		/**
		 * �ļ�����
		 * */
		//�����pathname����д����·�� Ҳ����д���·�� ���·����������������Ŀ��·��
		File file = new File("FileTest.txt");
		
		//�ж��ļ������ļ����Ƿ����
		System.out.println(file.exists());
		
		//�ж��Ƿ����ļ�
		System.out.println(file.isFile());
		
		//�����ļ�
		file.createNewFile();
		
		//·�����ļ���
		System.out.println(file.getName());
		System.out.println(file.getPath());//����������Ŀ��·��
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getParent());
		
		//�Ƿ�ɶ���д
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		//���һ���޸ĵ�ʱ��
		long modify_time = file.lastModified();
		System.out.println(DateFormat.getDateInstance().format(new Date(modify_time)));
		
		//��ȡ�ļ����ݵ��ֽ���
		System.out.println(file.length());
		
		//ɾ��
		file.delete();
		
		/**
		 * Ŀ¼����
		 * */
		System.out.println("----------�ļ���-------------");
		//�����pathname����д����·�� Ҳ����д���·�� ���·����������������Ŀ��·��
		File path = new File("FileTestfolder");
				
		//�ж��ļ������ļ����Ƿ����
		System.out.println(path.exists());
				
		//�ж��Ƿ����ļ���
		System.out.println(path.isDirectory());
		
		//�����ļ���
		path.mkdir();
		
		//���������ļ���
		path.mkdirs();
		
		//��ȡĿ¼�µ����е��ļ����ļ��е����� String��ʽ
		String[] str = path.list();
		for (String s : str) {
			System.out.println(s);
		}
		
		//ʹ���ļ�������
		System.out.println("------------�ļ�������String��ʽ------------------");
		String[] str1 = path.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith("java");
			}
		});
		//�ļ�������lambdaд��
		str1 = path.list((dir,name)->name.endsWith("java"));
		Arrays.stream(str1).forEach(System.out::println);
		
		//��ȡĿ¼�µ����е��ļ����ļ��е����� File��ʽ
		System.out.println("------------�ļ�������File��ʽ------------------");
		File[] files = path.listFiles();
		for (File f : files) {
			if (f.isDirectory()) {
				System.out.println(f.getPath());
			} else {
				System.out.println(f.getName());
			}
		}
		
		//ɾ���ļ���
		path.delete();
		
		new TestFile().show("D:\\XunLeiDownload\\japan");
	}

}
