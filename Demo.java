//Java Program to copy a source array into a destination array in Java
class Demo {
public static void main(String[] args) {
//declaring a source array
	int[] copyFrom = { 2,3,4,5,6,6,3,5,2,1,32,12,12,3,4 };
	//declaring a destination array
	int[] copyTo = new int[7];
	//copying array using System.arraycopy() method
	System.arraycopy(copyFrom, 2, copyTo, 0, 7);
	//printing the destination array
	for(int i=0; i<copyTo.length; i++){
	System.out.println(copyTo[i]);
			}
	}
	}