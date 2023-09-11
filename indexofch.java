import java.util.*;
import java.lang.*;
class indexofch{
public static void main(String[] args)
{
String str;
int i,l,co=0,k;
char c;
System.out.println("enter String");
Scanner sc=new Scanner(System.in);
str=sc.next();
l=str.length();
System.out.println("enter alphabet to get occurence of alphabet");
c=sc.next().charAt(0);
k=str.indexOf(c);
if(k==-1){
System.out.println("alphabet not found");
}
else
{
	for(i=0;i<str.length();i++){
	if(str.charAt(i)==c){
co++;
	}
	}
	System.out.println("count "+co);
}
}
}

