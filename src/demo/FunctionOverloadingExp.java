package demo;

class FunOverAddition {
	
	public int add(int a,int b){
		return (a+b);
	}
	
	public int add(int a,int b,int c){
		return (a+b+c);
	}
	
	public int add(int a,int b,int c,int d) {
		return (a+b+c+d);
	}
}

public class FunctionOverloadingExp extends FunOverAddition {
	
	public static void main(String[] args){
		FunctionOverloadingExp foe = new FunctionOverloadingExp();
		System.out.println(foe.add(5, 10));
		System.out.println(foe.add(5, 10,3));
		System.out.println(foe.add(5, 10,3,5));
	}
}
