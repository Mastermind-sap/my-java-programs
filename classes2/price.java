import java.util.*;
class price
{public static void main()
{Scanner sc=new Scanner(System.in);
System.out.println("enter the printed price");
double p=sc.nextDouble();
double a=p-((10.0/100.0)*p);
double c=a+((6.0/100.0)*a);
System.out.println("price to be paid="+c);
}}