class text{
String kk;
void f1()
{ kk="Sir Jee";
System.out.println("It is example of literal string:- " + kk);
String pk=new String("He is my brother and she is my sister");
System.out.println("It is an example of another type string method:- " + pk);
System.out.println("The length of pk is(Without removing white spaces):- "+pk.length());
System.out.println("The length of pk without white spaces:- " + pk.replace(" ","").length());
System.out.println("For convert text in to lowercase:- "+pk.toLowerCase());
//System.out.println("Converting in to lowercase using locale:- "+pk.toLowerCase(Locale.INDIA));
System.out.println("The position of my word in pk strings:"+pk.indexOf("my"));
System.out.println("The position of e in the string kk: " + kk.indexOf('e'));
System.out.println("The last position of my in string pk " + pk.lastIndexOf("my"));
System.out.println(pk.concat(" Name-Vishal ").concat(" Name-Shweta ").concat(" Smaller ").concat(" Younger"));}
public static void main(String ram[])
{
text t1=new text();
t1.f1();
}
}