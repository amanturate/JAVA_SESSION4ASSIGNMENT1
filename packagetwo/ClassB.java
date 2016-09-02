package packagetwo;

import packageone.ClassA;

public class ClassB extends ClassA{

	protected String method() {
		// TODO Auto-generated method stub
		return super.method();
	}
	
	public static void main(String[] args) {
		ClassB B = new ClassB();
		System.out.println(B.method());
	}
}
