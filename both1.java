import java.io.*;
class both1{
void method()throws IOException{
System.out.println("Rohit Kumar Singh");
}
public static void main(String[] args) {
both1 b1=new both1();
try{
b1.method();
}
catch(Exception ee){
	System.out.println("Rohit Vishal Ranveer");
}
}}
