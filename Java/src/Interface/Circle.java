package Interface;
interface Cirarea{
	void area();
}
class Cirarea1 implements Cirarea{
	public void area() {
		int r=45;
		double pi=3.14;
		double res=pi*r*r;
		System.out.println("Area:"+res);
	}
}
public class Circle {
public static void main(String[] args) {
	Cirarea1 c1=new Cirarea1();
	c1.area();
}
}
