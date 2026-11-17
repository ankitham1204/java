package design_patterns;
class Bank{
	private int bal=5000;
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	private static Bank b;
	static public Bank getInstance() {
		if (b==null) {
			b=new Bank();
			
		}
		return b;
	}
}


public class Mainclass {
	public static void main (String[] args) {
		Bank b1= Bank.getInstance();
		System.out.println(b1.getBal());
	}
}


