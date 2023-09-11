import java.util.*;
import java.lang.*;
class Subs
{
public static void main(String[] args){
String str1,str2,str;
String k,m;
int a,b;
System.out.println("enter string");
Scanner sc=new Scanner(System.in);
str=sc.next();
System.out.println("enter two indexes");
a=sc.nextInt();
b=sc.nextInt();
System.out.println(str.substring(a,b));
System.out.println(str.substring(a));
System.out.println("enter substring character to search start and end with");
k=sc.next();
m=sc.next();
System.out.println(str.startsWith(k));
System.out.println(str.endsWith(m));
}
}

