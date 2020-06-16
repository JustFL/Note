package javaSE;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		
		//��ǰʱ�� ��ʱ�� ������Сʱ������
		Date date = new Date();
		System.out.println(date);
		
		//��1970-1-1������Ϊֹ�ĺ����� 
		long time = date.getTime();
		System.out.println(time);
		
		//���ݺ���������һ��ʱ�����Ͷ��� 1555315978009
		Date date1 = new Date(1555315978009L);
		System.out.println(date1);
		
		//���� java.sql.Date ��һ�������� ����ʱ��
		java.sql.Date d1 = new java.sql.Date(time);
		
		//����ת��Ϊ�ַ���
		String str = d1.toString();
		System.out.println("java.sql.Date:"+str);
		
		//�ַ���תΪ����
		java.sql.Date d2 = java.sql.Date.valueOf(str);
		
		//java.sql.Time ʱ����  ֻ��ʱ����
		java.sql.Time t1 = new java.sql.Time(time);
		str = t1.toString();
		System.out.println("java.sql.Time:"+str);
		
		//java.sql.Timestamp �����˺���
		
		//---------------------��ʽ��-----------------------
		//java.util.Date����Ĭ�ϵ����Tue Apr 16 09:39:01 CST 2019 ��ʽ���� ������ʽ
		System.out.println("------------------Format----------------------");
		//��ʹ��NumberFormat
		//Ĭ�ϻ�����Ĭ�ϸ�ʽ����ʽ
		NumberFormat instance = NumberFormat.getInstance();
		System.out.println(instance.format(432.778899));
		
		//Ĭ�ϵĻ��Ҹ�ʽ����ʽ
		NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
		System.out.println(currencyInstance.format(432.778899));
		
		//DecimalFormat
		DecimalFormat decimalFormat = new DecimalFormat("000.0000");
		System.out.println(decimalFormat.format(43.778899));
		
		//ʱ���ʽ��DateFormat
		DateFormat df1 = DateFormat.getInstance();
		System.out.println("DateFormat��Ĭ�ϸ�ʽ����ʽ"+df1.format(date));
		
		//ʹ��DateFormat�����ڸ�ʽ��
		DateFormat df2 = DateFormat.getDateInstance();
		System.out.println("DateFormat�����ڸ�ʽ����ʽ"+df2.format(date));
		
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("DateFormat�Ķ��������͸�ʽ��"+df3.format(date));
		
		//ʱ���ʽ��
		DateFormat df4 = DateFormat.getTimeInstance();
		System.out.println("DateFormat��Ĭ��ʱ���ʽ��"+df4.format(date));
		
		//����+ʱ��ĸ�ʽ��
		DateFormat df5 = DateFormat.getDateTimeInstance();
		System.out.println("Ĭ�ϸ�ʽ"+df5.format(date));
		
		DateFormat df6 = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
		System.out.println("�Զ����ʽ"+df6.format(date));
		
		//SimpleDateFormat �Զ����ʽ������
		//yyyy MM dd hh/H mm ss SSS
		SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-MM-dd H:mm:ss:SSS");
		System.out.println(sf1.format(date));
		
		//Calendar
		System.out.println("------------------Calendar----------------------");
		Calendar c1 = Calendar.getInstance();
		System.out.println(df6.format(c1.getTime()));
		
		c1.add(Calendar.YEAR, 2);
		System.out.println(df5.format(c1.getTime()));
		
		//��ǰ�������� calendar.get()�·ݵ�ʱ����Ҫ+1
		System.out.println("��ǰ����ݣ�"+c1.get(Calendar.YEAR)+" ��ǰ���·ݣ�"+(c1.get(Calendar.MONTH)+1)+" ��ǰ�����ڣ�"+c1.get(Calendar.DATE));
		
		//Calendar�Լ�����ʱ��
		Calendar c2 = Calendar.getInstance();
		c2.set(2020, 1, 15);
		System.out.println(df6.format(c2.getTime()));
		
		//ʱ��Ƚ�
		System.out.println(c1.before(c2));
		
		
	}

}
