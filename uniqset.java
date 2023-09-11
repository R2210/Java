import java.util.*;
class uniqset{
public static void main(String[] args)
{
int i,j,k,f=0,n;
int[] a=new int[100];
Scanner sc=new Scanner(System.in);
for(i=0;i<5;i++)
{
System.out.println("enter value");
n=sc.nextInt();
if(n<10||n>100){
	System.out.println("OUT OF RANGE");
	i=i-1;
}
else{
for(j=0;j<=i;j++)
{
    if(a[j]==n)
{
f=1;
System.out.println(" it is a duplicate value enter other value");
i=i-1;
}
}
if(f==0)
{
a[i]=n;
System.out.println("entered value accepted"+n);
}
System.out.println("unique values");
for(k=0;k<=i;k++)
{
System.out.println(a[k]);
}
}
}
}
}