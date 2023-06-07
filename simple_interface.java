abstract interface ious{
	void ff();
	void ff1();
	void ff2();
}

class simple_interface implements ious{
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
		ious ii=new simple_interface();
		ii.ff();
		ii.ff1();
		ii.ff2();
	}
}