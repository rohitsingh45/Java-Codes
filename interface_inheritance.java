 interface ious{
	void ff();
}
interface ious2 extends ious{
		void ff1();
}
interface ious3 extends ious2{
		void ff2();
}
class interface_inheritance implements  ious3{
	public void ff(){
		System.out.println("Hello Paro");
	}
	public void ff1(){
		System.out.println("You are very care taking boy");
	}
	public void ff2(){
		System.out.println("But You have many bad habit");
	}
	public static void main(String[] args){
		ious ii=new interface_inheritance();
		ii.ff();
				ious3 ii1=new interface_inheritance();
		ii1.ff2();            
				ious2 ii2=new interface_inheritance();
		ii2.ff1();
	}
}