package src;

public class Student {
	/*
	 * 
	 * ���һ��ѧ����Student����������Undergradute��Ҫ�����£�
	 * Student����name����������age(����)��һ���������������Ĺ��췽��
	 * �����ڸ�name��age���Ը�ֵ��һ��show()������ӡStudent��������Ϣ��
	 * ��������Undergraduate����һ��degree��ѧλ��
	 * ���ԡ���һ���������������Ĺ��췽����ǰ�����������ڸ��̳е�name��age��ֵ��������������degreeרҵ��ֵ
	 * ��һ��show����������ӡUndergrate��������Ϣ�� �ڲ������д���Student�����Undergraduate��������Ϣ��
	 */
	public Student(String n, int a) {
		name = n;
		age = a;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String show() {
		String s = name + "  ���g  " + age;
		return s;
	}

	private String name;
	private int age;
}
