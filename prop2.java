import java.util.*;
class prop2{
public static void main(String[] args){
Properties P=System.getProperties();
Enumeration men= P.keys();
while(men.hasMoreElements()){
Object kobj =men.nextElement();
Object vobj =P.get(kobj);
System.out.println(kobj + " "+vobj);
}}}