import java.util.*;
class par{
void mm(){
System.out.println("function in parent class");
}
void mm1(){
System.out.println("function2 in parent class");
}
}
class chil extends par{
void mm(){
System.out.println("function in child class");
}
void mm1(){
System.out.println("function2 in child class");
}
}
class override{
	public static void main(String[] args){
		chil ob=new chil();
		ob.mm();
		ob.mm1();
	}
}

