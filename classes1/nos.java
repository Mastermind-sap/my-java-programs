import java.util.*;
class nos
{public static void main()
{Scanner sc=new Scanner(System.in);
System.out.println("enter a no.");
float a=sc.nextFloat();
System.out.println("enter a no.");
float b=sc.nextFloat();
System.out.println("enter a 1 for sum, 2 for difference and 3 for product");
int c=sc.nextInt();
float d=a+b;
float e=a-b;
float f=a*b;
switch(c)
{case 1:System.out.println("sum is"+d);
break;
case 2:System.out.println("diff is"+e);
break;
case 3:System.out.println("product is"+f);
break;
default:System.out.println("invalid");
break;
}
}
}