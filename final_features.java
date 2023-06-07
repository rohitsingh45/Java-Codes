import java.lang.*;
class final_features{
	 int Changeable=23;
	final int non_changeable=43; //Final makes the variable constant
	void before(){
		System.out.println("The data which can be change: "+Changeable);
		System.out.println("The data which can't be change: "+non_changeable);
		
	}
	void change(){
		Changeable=43;
		//non_changeable=23; It should must be comment otherwise it generate error
	}
	void after(){
		System.out.println("The data which can be change: "+Changeable);
		System.out.println("The data which can't be change: "+non_changeable);
		
	}
public static void main(String[] args){
	final_features ff=new final_features();
	ff.before();
	ff.change();
	ff.after();
	
}
}