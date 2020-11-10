import java.util.*;
class price
{public static void main()
{Scanner sc=new Scanner(System.in);
double p=sc.nextDouble();
System.out.println("enter the printed price");
double a=p-((10/100)*p);
double c=a+((6/100)*a);
System.out.println("price to be paid="+c);
}}