import java.util.*;
class addit{
     int a,b;
     public int addition(){
	return a+b;

}
}
class add{
    public static void main(String[] args){
            Scanner s=new Scanner(System.in);
            addit ad=new addit();
            System.out.println("enter first number:");
            ad.a=s.nextInt();
	    System.out.println("enter second number:");
            ad.b=s.nextInt();
            System.out.println("Answer is" + ad.addition());

}

}
