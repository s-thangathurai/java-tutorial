package demo;

class SuperEncapsulation {
	
	private int i = 50;
	
	public int getIValue(){
		return i;
	}
}

class SubEncapsulation extends SuperEncapsulation{
	
	public void show(){
		System.out.println("i value is:"+getIValue());
	}
}
public class EncapsulationExample {
	
	public static void main(String... args){
		SubEncapsulation se = new SubEncapsulation();
		se.show();
	}
}
