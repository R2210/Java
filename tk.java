class demo { 
demo(int x,int y,int z) { 
this(x,y);
 System.out.println("Value of z:"+z); } 
demo(int x,int y) { 
this(x); 
System.out.println("Value of y:"+y); } 
demo(int x) { 
System.out.println("Value of z:"+x); 
} }
 class tk { public static void main(String aa[]) { 
demo e=new demo(5,10,15); } } 
