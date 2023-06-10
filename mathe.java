class mathe {
public static void main(String[] args)
{ int a=34,b=32;
 int c;
c=Math.max(a,b);
System.out.println("Maximum value from a and b is "+c);
c=Math.min(a,b);
System.out.println("Minimum value from a and b is"+c);
System.out.println("Square root of a"+Math.sqrt(a));
System.out.println("Absolute value of b"+Math.abs(b));
System.out.println("Random value from 0.0 to 100.0 " + Math.random()*101);
}
}