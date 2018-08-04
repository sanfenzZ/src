package src;

public class Student {
	/*
	 * 
	 * 设计一个学生类Student和它的子类Undergradute，要求如下：
	 * Student类有name（姓名）和age(年龄)，一个包含两个参数的构造方法
	 * ，用于给name和age属性赋值，一个show()方法打印Student的属性信息。
	 * 本科生类Undergraduate增加一个degree（学位）
	 * 属性。有一个包含三个参数的构造方法，前两个参数用于给继承的name和age赋值，第三个参数给degree专业赋值
	 * ，一个show（）方法打印Undergrate的属性信息。 在测试类中创建Student对象和Undergraduate的属性信息。
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
		String s = name + "  年齡  " + age;
		return s;
	}

	private String name;
	private int age;
}
