package javaSE;

public class Loop {

	public static void main(String[] args) {
		
		//�������ж� Ȼ��ִ��ѭ���� ֱ������������
		int x = 0;
		while(x < 5) {
			System.out.println(x);
			x++;
		}
		
		//��ִ��һ��ѭ���� �ٽ����ж�
		int y = 0;
		do {
			System.out.println(y);
			y++;
		}while(y < 5);
		
		//continue ��������ѭ�����ִ�� ������һ�������ж�
		//break ��������ѭ��
		//return ����������
		a:
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(j == 3) {
					break a;//�������ѭ��
				}
				System.out.println("i:"+i+" j:"+j);
			}
		}

	}

}
