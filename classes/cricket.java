import java.util.*;
class cricket
{public static void main()
{Scanner sc=new Scanner(System.in);
String n[]=new String[11];
int r[]=new int[11];
System.out.println("enter");
for(int i=0;i<11;i++)
{n[i]=sc.next();
r[i]=sc.nextInt();
}
int p=-1;
for(int j=0;j<11;j++)
{for(int i=0;i<10;i++)
{if(r[i]>r[i+1])
p=i;
}
}
if(p>-1)
{System.out.println(n[p]);
System.out.println(r[p]);
}}}