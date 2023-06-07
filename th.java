class th{
int ram;
void meth(int i){
	this.ram=i;
	System.out.println(this.ram);
}
public static void main(String[] atgs){
	th the=new th();
	the.meth(5);
}
}