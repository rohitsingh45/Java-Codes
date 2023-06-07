class thrwos{
	void method() throws ArithmeticException{
	int a=5/0;
System.out.println(a);	
	}
public static void main (String[] args){
	thrwos t2= new thrwos();
	t2.method();
}}