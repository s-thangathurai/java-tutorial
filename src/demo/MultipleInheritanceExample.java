package demo;

interface Addition {
	int add(int a,int b);
}

interface Substraction {
	int sub(int a,int b);
}

public class MultipleInheritanceExample implements Addition,Substraction{

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		int sub = (a > b) ? (a-b) : (b-a);
		return sub;
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return (a+b);
	}

	public static void main(String[] args){
		
		MultipleInheritanceExample mie = new MultipleInheritanceExample();
		
		int addition = mie.add(10,15);
		System.out.println("Addition:"+addition);
		
		int substraction = mie.sub(15,10);
		System.out.println("Substraction:"+substraction);
	}
}
