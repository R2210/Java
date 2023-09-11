import java.util.*;
class Prime{
	private int n;
	public void setN(int m){
	n=m;
	}
	public int getN(){
	return n;
	}
        public void prime(){
		int i,c=0;
		for(i=1;i<=n;i++){
			if(n%i==0){
			    c++;
			}	
		}
		if(c==2){
			System.out.println("prime number");
		}
		else{
			System.out.println("not a prime number");
			}	
	}
}
class Pr{
     public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		Prime p=new Prime();
 		System.out.println("enter number:");
		int a=s.nextInt();
		p.setN(a);
		p.prime();
}

}