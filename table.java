class table{
int num,Table=5;
void five()
{
System.out.println("The table of "+Table+" is:");
 for(num=1;num<=10;num++)
	{ Table=5;
		System.out.print(Table+"*"+num);
           Table=Table*num;
	System.out.println("="+Table);
	}
}
public static void main(String ram[])
{table f1=new table();
f1.five();
}
}