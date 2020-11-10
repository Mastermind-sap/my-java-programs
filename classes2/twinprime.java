import java.util.*;
class twinprime 
{public static void main()
{Scanner sc=new Scanner(System.in);
System.out.println("enter a no.");
int a=sc.nextInt();
System.out.println("enter another no.");
int b=sc.nextInt();
int d;
if (a>b)
d=a-b;
else
d=b-a;
int p=0,q=0;
for (int i=2;i<a;i++)
{if (a%i==0)
p=1;
}
for (int j=2;j<b;j++)
{if (b%j==0)
q=1;
}
if((p!=1)&&(q!=1)&&(d==2))
System.out.println("they are twin prime nos.");
else
System.out.println("they are not twin prime nos.");}}
