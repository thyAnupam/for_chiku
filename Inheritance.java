class SuperClassA {

	public void MethodOfA(){
		System.out.println("SuperClassA");
	}
	
}

class SubClassB extends SuperClassA{
		
	public void MethodOfB(){
		System.out.println("SubClassB");
	}
	
}

public class Test {
	public static void main(String args[]){
		SubClassB b = new SubClassB();
		
		b.MethodOfA();
		b.MethodOfB();
	}
}
