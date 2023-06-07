class tasty{
	public static void ram(){
		int a=8;
		a>>>=1;
	System.out.println(a);
	
	}
}
class test extends tasty{
	public static void ram(){
		System.out.println("hello");
		
	}
	public static void main(String[] args){
		tasty.ram();
	}
}