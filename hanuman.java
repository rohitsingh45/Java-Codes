class hanuman {
	 int a,b,c;   //instance data member
	void f1()	//instance member method
	{
	     a=23;	//instance data member
	     b=33;	//instance data member
	}
       
	    public static void main(String ram[])
{ 	hanuman h1=new hanuman();	//instance data member
	h1.f1();	// function calling
		
System.out.println(h1.a+"\n"+h1.b);	/* a & b are instance data member and here we using it 					in static member method so we call using it object h1 						before using the value of a and b must be call the 					funtion f1.*/
									
}
}