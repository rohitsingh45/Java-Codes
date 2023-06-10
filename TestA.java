//Java Program to copy a source array into a destination array in Java
class TestA {
public static void main(String[] args) {
//declaring a source array
int[] copyFrom = { 1,12,14,12,15,14,17,18,18,196,3,24,5 };
//declaring a destination array
int[] copyTo = new int[70];
//copying array using System.arraycopy() method
System.arraycopy(copyFrom, 0, copyTo, 0,13);
//printing the destination array
System.out.println(copyTo);
}
}