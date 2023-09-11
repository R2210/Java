import java.util.*;
class contractemploy{
void getdesignation(String s){
System.out.println("designation of employee :"+s);
}
}	
class hourlyemployee extends ce{
int hr;
int wh;
String str;
hourlyemployee(int hrs,int whs){
hr=hrs;
wh=whs;
}
void calculate(){
double sal=hr*wh*30;
System.out.println("monthly salary of hourlyemployee : "+sal);
}
void getdesignation(String s){
str=s;
System.out.println("designation of hourlyemployee :"+str);
}
}
class weeklyemployee extends ce{
int we;
int wh;
String str;
weeklyemployee(int week,int wag){
we=week;
wh=wag;
}
void calculate(){
double sal=wh*we*30;
System.out.println("monthly salary of weeklyemployee : "+sal);
}
void getdesignation(String s){
str=s;
System.out.println("designation of weeklyemployee :"+str);
}
}
class ce{
public static void main(String[] args){
String str;
System.out.println("\n details of hourly employee\n\n");
hourlyemployee ob=new hourlyemployee(20,200);
ob.getdesignation("electrian");
ob.calculate();
System.out.println("\n details of weekly employee\n\n");
weeklyemployee ob1=new weeklyemployee(10,2000);
ob.getdesignation("software engineer");
ob1.calculate();
}
}
