class Main{
	final boolean  Not_override()
	//The method which declared with final keyword can't override in derived  class
	{
		final int not_changeable=20;
		int changeable=4;
		int result=not_changeable/changeable-not_changeable*changeable;
		if(result== -75){
			return true;
		}
		else{
			return false;
		}
	}
	void output(){
		System.out.println(Not_override());
	}
}

class final_features1 extends Main{
	//We can't override the Not_override method because it is final type.
	// But we can override the output method because it is not final type
	
	
	// final boolean Not_override(){
		// System.out.println("It can't be override");
	// }
	
	
	void output(){
		System.out.println("We successfully override the method");
	}
public static void main(String[] args){
	Main m1=new Main();
	m1.output();
	final_features1 ff=new final_features1();
	ff.output();
}
}