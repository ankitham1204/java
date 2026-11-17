package upcasting;

class Animals {
	}

class Dog extends Animals{
	
}
class Animal{
	public static void main(String[] args) {
		Animals a= new Dog();
		Dog d=(Dog)a;
		System.out.println("casted");
		
	}
}
