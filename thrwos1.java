class thrwos1{
	void method() throws ArithmeticException{
		try{
		int a=2;}

catch(ArithmeticException ar){
	System.out.println("Hello Jee");
}
	}
public static void main (String[] args){
	thrwos t2= new thrwos();
	try{
	t2.method();}
	catch(Exception ee){
		System.err.println("heelo java");
	}
}}