import java.util.*;
class Calc{
	private int a,b;
        public void setA(int n){
	a=n;
	}
 	public int getA(){
	return a;
	} 
         public void setB(int m){
	b=m;
	}
 	public int getB(){
	return b;
	} 
        public void add(){
	System.out.println("ADD:"+(a+b));
	} 
	 public void sub(){
	System.out.println("SUB:"+(a-b));
	} 
	 public void mul(){
	System.out.println("MUL:"+(a*b));
	} 
	 public void div(){
	System.out.println("div:"+(a/b));
	} 
        public void rem(){
	System.out.println("REM:"+(a%b));
	} 
}
class Calculator{
        public static void main(String[] args){
		int i,j;
		Scanner s=new Scanner(System.in);
		System.out.print("enter number:");
		i=s.nextInt();
		System.out.print("enter number:");
		j=s.nextInt();
		Calc c=new Calc();
		c.setA(i);
		c.setB(j);
		System.out.println("enter choice:");
		System.out.println("1,ADD");
		System.out.println("2.SUBTACTION");
		System.out.println("3.MULTIPLICATION");
		System.out.println("4.DIVISION");
		System.out.println("5.REMAINDER");
		int ch;
		ch=s.nextInt();
		switch(ch){
			case 1:
				c.add();
				break;
			case 2:
				c.sub();
				break;
			case 3:
				c.mul();
				break;
			case 4:
				c.div();
				break;
			case 5:
				c.rem();
				break;
			default :
                               System.out.println("enter valid option:");
		}
	}
}