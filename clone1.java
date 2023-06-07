import java.lang.*;
class clone1 implements Cloneable{
	int s=32;
	int ff=23;
	public static void main (String[] args) throws CloneNotSupportedException
	{
	clone1 cc= new clone1();
	clone1 pc=(clone1) cc.clone();
	pc.s=33;
	System.out.println(pc.s +" Not Equal to" + cc.s);
	}
}