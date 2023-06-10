class rahul {static int a,b,c;
static rahul r1=new rahul(); //-----Here r1 is static object.
void calculate()
{ a=18600;
b=7;
c=a*b;
r1.assign(); //--- we also call it without the object name like 'assign();'
}
void assign()
{ System.out.println(c);
}
 public static void main(String ram[])  //---- we can't remove the public static. 
{ 
r1.calculate();

}
}
