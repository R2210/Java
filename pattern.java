import java.util.*;
class pattern{
	public static void main(String[] args){
        int i,n,j;
        Scanner s=new Scanner(System.in);
        System.out.println("enter number of rows:");
        n=s.nextInt();
        for(i=0;i<=n;i++){
	    for(j=0;j<=i;j++){
                  System.out.print("*"+" ");
              }
              System.out.println();
	}
}

}