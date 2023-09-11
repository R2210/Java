import java.util.*;
import java.lang.*;
class reverse{
public static void main(String[] args)
{
String str;
int i,l;
System.out.println("enter string");
Scanner sc=new Scanner(System.in);
str=sc.next();
l=str.length();
System.out.println("reverse of string");
for(i=l-1;i>=0;i--)
{
System.out.print("   "+str.charAt(i));
}
}
}
