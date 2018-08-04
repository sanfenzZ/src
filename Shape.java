package src;

/*

 需求描述：

 设计一个Shape接口和它的两个实现类Square和Circle，要求如下：
 Shape接口中有一个抽象方法area()，方法接收一个double类型的参数，返回一个double类型的结果。
 Square和Circle中实现了Shape接口中的area()抽象方法，分别求正方形和圆形的面积并返回。
 在测试类中创建Square和Circle对象，计算边长为2的正方形面积和半径为3的圆形面积。
 */
public interface Shape {
	public double area(double n);
}
