import java.util.*;
class unique
{public static void main()
{Scanner sc=new Scanner(System.in);
System.out.println("enter a no.");
int n=sc.nextInt();
int i,r=0,a=0,b=0,c=0;
for(i=1;i!=0;)
{r=n%10;
n=n/10;
i=n;
if(n<100)
{c=r;
continue;}
if(n<10)
{b=r;
continue;}
if(n==0)
{a=r;
continue;}
}
if ((a!=b)&&(b!=c))
System.out.println("it is an unique no.");
else
System.out.println("it is not an unique no.");
}}