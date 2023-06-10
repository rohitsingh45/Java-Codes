class testArr{
public int array(int arr[])
{ int mini=arr[0];
for(int i=1; i<arr.length; i++)
	{	if(mini>arr[i])
			{	mini=arr[i];
			}
	} return mini;
}
public static void main(String []args)
{ int[] arr={67,45,14,25,32}; 
int eww;
testArr t1=new testArr();
eww=t1.array(arr);
System.out.println("The Minimum Value from the given array is:" + eww);
}
}
