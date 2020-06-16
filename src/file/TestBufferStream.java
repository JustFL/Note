package file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ������
 * ���������Ч�� �������ṩһ���������洢һ������ 
 * */
public class TestBufferStream {

	public static void main(String[] args) throws IOException {
		//��ҵ:��һ��ͼƬ������ д�뵽����һ��ͼƬ�ļ���
		File f1 = new File("thread.png");
		FileInputStream ins = new FileInputStream(f1);
				
		File f2 = new File("thread_1.png");
		FileOutputStream outs = new FileOutputStream(f2);
				
		//ȡ��һ���ֽ� д��һ���ֽ�
//		int temp;
//		while((temp = ins.read()) != -1) {
//			outs.write(temp);
//		}
		
		//�������뻺������������������а�װ  ��߶�дЧ��
		BufferedInputStream bins = new BufferedInputStream(ins);
		BufferedOutputStream bouts = new BufferedOutputStream(outs);
		
		//��������д
		int temp;
		while((temp = bins.read()) != -1) {
			bouts.write(temp);
		}
		
		//ǿ��ˢ�� ��֤���е����ݶ���д��
		bouts.flush();
		
		//��������ر�
	    ins.close();
	    bins.close();
		outs.close();
		bouts.close();
	}

}
