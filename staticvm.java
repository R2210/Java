import java.util.*;
class staticvm{
	static{
System.out.println("static block");
	}
static int id=20;
static String name="kumar";
static  void display(int idd,String nam){
System.out.println("id "+idd+" "+nam); 
}
public static void main(String[] args){
	staticvm.display(10,"vamshi");
	System.out.println("id "+staticvm.id+" "+staticvm.name); 
}
}
