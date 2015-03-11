package demo;

class A {
	
	public void display(){
		System.out.print("Hello A");
	}
}

public class SingleInheritanceExample extends A{

	public static void main(String... args) {
		
		SingleInheritanceExample sie = new SingleInheritanceExample();
		sie.display();
		
	}
}
