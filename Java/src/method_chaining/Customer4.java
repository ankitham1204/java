package method_chaining;

class Destination{
	void reach() {
		System.out.println("reached the destination");
	}
}
class Driver{
	Destination drive() {
		Destination d1=new Destination();
		return d1;
	}
}
class CabApp{
	Driver book() {
		Driver dv1=new Driver();
		return dv1;
	}
}
class Customer4{
	public static void main(String[] args) {
		CabApp c1=new CabApp();
		Driver dv2=c1.book();
		Destination d2=dv2.drive();
		d2.reach();
		
	}
}