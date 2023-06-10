class sara{
static int a[]={2,4,8,1,3};
void array()
 { int i;
for(i=0;i<5;i++)
System.out.println(a[i]);
		}
public static void main(String[] args)
{ sara s1=new sara();
s1.array();
System.out.println("Prints third value"+a[2]);
}
}