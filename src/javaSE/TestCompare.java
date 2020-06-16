package javaSE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//ʵ���˱ȽϽӿ�
class Tree implements Comparable<Tree>{
	private int age;
	private int height;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Tree(int age, int height) {
		super();
		this.age = age;
		this.height = height;
	}
	@Override
	public String toString() {
		return "Tree [age=" + age + ", height=" + height + "]";
	}
	@Override
	public int compareTo(Tree o) {
		return this.age - o.age;
	}
	
}

public class TestCompare {
	public static void main(String[] args) {
		Tree t1 = new Tree(30, 20);
		Tree t2 = new Tree(20, 50);
		List<Tree> list = new ArrayList<>();
		list.add(t1);
		list.add(t2);
		
		Collections.sort(list);
		System.out.println(list);
		
		//�Ƚ���
		Collections.sort(list, new Comparator<Tree>() {

			@Override
			public int compare(Tree o1, Tree o2) {
				return o1.getHeight() - o2.getHeight();
			}
		});
		System.out.println(list);
		
		//�Ƚ���lambdaд��
		Collections.sort(list, (o1,o2)->o1.getHeight() - o2.getHeight());
		System.out.println(list);
	}
}