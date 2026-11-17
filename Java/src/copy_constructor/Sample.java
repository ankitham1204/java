package copy_constructor;


// Shallow Copy
class Add{
	String ad;
	public Add(String ad) {
		this.ad=ad;
	}
}
public class Sample {
	String n;
	int id ;
	Add a1;
//Constructor
public Sample(String n, int id,Add a1) {
		this.n = n;
		this.id = id;
		this.a1=a1;
	}
//Copy Constructor
public Sample(Sample s1) {
	this.n=s1.n;
	this.id=s1.id;
	this.a1=s1.a1;
}
@Override
public String toString() {
	return n+" "+id+" "+a1.ad;
}
public static void main(String[] args) {
	Add a = new Add("London");
	Sample n = new Sample("bob",12,a);
	System.out.println(n);
	Sample n1 =new Sample(n);
	System.out.println(n1);	
	System.out.println("---------");
	n1.a1.ad="Bengaluru";
	System.out.println(n);
	System.out.println(n1);	
}
}