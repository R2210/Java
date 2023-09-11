class co { 
int age=23; 
void change_age(co c1) { 
age=age+10;
System.out.println("age in local:"+age); } 
public static void main(String aa []) { 
co c1=new co(); 
System.out.println("age before change:"+c1.age); 
c1.change_age(c1);
System.out.println("age after change"+c1.age); } 
}
