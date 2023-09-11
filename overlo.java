import java.util.*;
class scl{
void add(int a,int b){
System.out.println("sum of two numbers both are integers "+(a+b));
}
void add(double a,double b){
System.out.println("sum of two numbers both are double values "+(a+b));
}
void add(int a,double b){
System.out.println("sum of two numbers one integer and othe double values "+(a+b));
}
}
class overlo{
public static void main(String[] args){
    int a,b;
double c,d;
System.out.println("enter two numbers integers");
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
System.out.println("enter two numbers double values");
c=s.nextDouble();
d=s.nextDouble();
scl ob=new scl();
ob.add(a,b);
ob.add(c,d);
ob.add(a,c);
}
}

