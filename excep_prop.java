class excep_prop{
static void m1(){
System.out.println("It's the first method");
excep_prop obj=new excep_prop();
obj.m2();
}
void m2(){
System.out.println("It's the second method");
m3();
}
void m3(){
	// try{
		int a=23/0;

System.out.println("Here Exception Occurred"+a);
// }	
// catch(Exception ob){
System.err.println("Something Went Wrong");}
// }
public static void main(String[] args){
excep_prop.m1();
}}
