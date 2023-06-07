 import java.lang.*;

 abstract class multi{
	abstract  void ff();
	abstract void ff1();
}
abstract class level extends multi{
	abstract void ff2();
	abstract void ff3();
	
}
class inheritance1 extends level{
	void ff(){
		System.out.println("Prdyumn has no girlfriend");
	}
	void ff1(){
	System.out.println("He is a big randhwa and every girls fear from his anger");
	}
	void ff2(){
		System.out.println("Every girl fear from his hydrocil");
	}
	void ff3(){
		System.out.println("He has a good friend circle");
	}
	public static void main(String[] args){
		level m1=new inheritance1();
		m1.ff();
		m1.ff1();
		m1.ff2();
		m1.ff3();
		
	}
}