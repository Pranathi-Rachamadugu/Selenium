package javapack;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj = new C();
		obj.sum();
	}
}
	
class A{
	public void sum() {
		
		System.out.println("This is class A");
	}
	
}
class B extends A{
	public void sum() {
		super.sum();
		//System.out.println("This is class B");
		
	}
}

class C extends B{
	public void sum() {
		super.sum();
		//System.out.println("This is class C");
	}
	
}

