import java.util.*;
import java.lang.*;
class dice1
{
public static void main(String[] args){
int i,d1,d2,c=0;
Random ran=new Random();
int f1=0,f2=0,f3=0,f4=0,f5=0,f6=0;
for(i=1;i<=10000;i++)
{
d1=1+ran.nextInt(6);
d2=1+ran.nextInt(6);
if(d1==d2)
{
	c++;
switch(d1){
case 1:{
++f1;

}
case 2:
{
++f2;
break;
}
case 3:
{
++f3;
break;
}
case 4:
{
++f4;
break;
}
case 5:
{
++f5;
break;
}
case 6:
{
++f6;
break;
}
}
}
}
System.out.println("face\tfrequency ");
System.out.println("1\t"+f1+"\n2\t"+f2+"\n3\t"+f3+"\n4\t"+f4+"\n5\t"+f5+"\n6\t"+f6);
System.out.println("sucessful attempts"+c);
}
}
