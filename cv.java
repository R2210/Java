 class cv { 
int age=23;
 void change_age(int age) { 
age=age+10;
System.out.println("age in local:"+age); } 
public static void main(String  args []) { 
cv c1=new cv(); 
System.out.println("age before change:"+c1.age); 
c1.change_age(10);
 System.out.println("age after change"+c1.age); } } 

