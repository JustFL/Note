package javaSE;

import java.util.Arrays;

/**
 * �ɱ����
 * �ײ�������� λ��ֻ���ڲ����б�����һ��
 * @author summerKiss
 *
 */

class VA{
	public void show(int... args){
		System.out.println(Arrays.toString(args));
		System.out.println(args.length);
	}
}

public class VariableArguments {
	public static void main(String[] args) {
		VA va = new VA();
		va.show(1,2,3);
	}
}
