class testArray{
public int array(int main_array[])	        //Here main_array is local variable.
{ int mini=main_array[0];
for(int i=1; i<main_array.length; i++)
	{	if(main_array[i] >mini)
			{	mini=main_array[i];
			}
	} return mini;
}
public static void main(String []args)
{ int[] main_array={67,45,14,25,32}; 
int eww;
testArray t1 = new testArray();
eww=t1.array(main_array);	//Calling of instance method //through static method.
System.out.println("The Minimum Value from the given array is:" + eww);
}
}
