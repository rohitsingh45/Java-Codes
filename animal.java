class wild {
	void wild1() {
	int x=3,y=5,z=10;
	System.out.println(++z + y - y + z + x++);
	}
}


class animal extends wild{
void wild1(){
	System.out.println("Hello");
	super.wild1();
	
}
public static void main(String[] args){
	animal aa=new animal();
	aa.wild1();
}
}
