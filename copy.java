class copy{	//Program for copy the array element

public static void main(String[] args)
{
 int cove[]= new int[20];	//cretion of array object

for(int i=0; i<args.length; i++){	//Loop for convert cmd line argument from string to int
cove[i]=Integer.parseInt(args[i]);
  }

for(int i=0; i<args.length; i++){	/*Loop for print the cmd Line argument in original
						format */
System.out.println(cove[i]);
} System.out.println("The Duplicate of above array");
int[] dest_array= new int[20];		/* Declaration of destination array */
System.arraycopy(cove,0,dest_array,0,cove.length);	/* Copying previous array which value
							is assingning during cmd line argument*/
for(int i=0; i<args.length; i++) {
System.out.println(dest_array[i]);	/* Printing copied array */
}
}
}
