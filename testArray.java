import java.util.Scanner;
class testArray{
public int array(int arr[])
{ int mini=arr[0];
for(int i=1; i<arr.length; i++)
	{	if(mini>arr[i])
			{	mini=arr[i];
			}
	} return mini;
}
public static void main(String []args)
{ int[] arr; 
int eww;
Scanner sc =new Scanner(System.in);
System.out.println("Enter the elements of array");
for(int i=0; i<5; i++)
{System.out.println("Enter the"+i+"th element of array"); 
arr[i] = sc.nextInt();
}
eww=array(arr);
System.out.println("The Minimum Value from the given array is:" + eww);
}
}
