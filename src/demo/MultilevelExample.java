package demo;

class A1 {
	int a = 10;
}

class B extends A1{
	
	public void show() {
		System.out.println("A value is:"+a);
	}
}

public class MultilevelExample extends B {

	public static void main(String... args) {
		MultilevelExample me = new MultilevelExample();
		me.show();
	}
}
