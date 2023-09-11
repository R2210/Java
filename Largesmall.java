import java.util.*;
class Largesmall
{
public static void main(String[] args)
{
int a,b,c,d,e,f;
System.out.println("enter 5 integers");
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
d=s.nextInt();
e=s.nextInt();
if(a>b&&a>c&&a>d&&a>e)
{
System.out.println("largest number in group"+a);
}
else if(b>a&&b>c&&b>d&&b>e)
{
System.out.println("largest number in group"+b);
}
else if(c>b&&c>a&&c>d&&c>e)
{
System.out.println("largest number in group"+c);
}
else if(d>b&&d>c&&d>a&&d>e)
{
System.out.println("largest number in group"+d);
}
else
{
System.out.println("largest number in group"+e);
}
if(a<b&&a<c&&a<d&&a<e)
{
System.out.println("smallest number in group"+a);
}
else if(b<a&&b<c&&b<d&&b<e)
{
System.out.println("smallest number in group"+b);
}
else if(c<b&&c<a&&c<d&&c<e)
{
System.out.println("smallest number in group"+c);
}
else if(d<b&&d<c&&d<a&&d<e)
{
System.out.println("smallest number in group"+d);
}
else
{
System.out.println("smallest number in group"+e);
}
}
}
