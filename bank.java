import java.util.*;
class account{
double bal,ano;
String aname,adre;
void credit(Double s){

	bal=bal+s;
}
void debit(Double s){
if(s>bal)
{
		System.out.println("money "+s+"  exceeded balance account"); 
}
else
{
	bal=bal-s;
}
}
account(double ba,String anam,String adr,double an)
{
bal=ba;
aname=anam;
adre=adr;
ano=an;
}
}
class bank{
public static void main(String[] args){
	String n,a;
	double b,anno;
	int op;
System.out.println("enter balance,name,accountno,address");
Scanner sc=new Scanner(System.in);
b=sc.nextDouble();
n=sc.next();
anno=sc.nextDouble();
a=sc.next();
account acc=new account(b,n,a,anno);
do{
System.out.println("enter 1.credit 2.debit 3.exit");
op=sc.nextInt();
	switch(op){
		case 1:{
			    
				System.out.println("enter amount to credit");
				double s=sc.nextDouble();
				acc.credit(s);
				System.out.println("after credit resultant money"+acc.bal);
				break;
		}
		case 2:
		{
			System.out.println("enter amount to debit");
			double  s=sc.nextDouble();
			acc.debit(s);
			System.out.println("after debit resultant money"+acc.bal);
            			break;
		}
		case 3:
		{
		exit:
		break;}
	default:System.out.println("invalid option");}
}while(op!=3);
}
}


