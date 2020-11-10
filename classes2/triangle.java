import java.util.*;
class triangle
{public static void main()
{Scanner sc=new Scanner(System.in);
double a=sc.nextDouble();
double b=sc.nextDouble();
double c=sc.nextDouble();
if((a==b)&&(b==c))
System.out.println("equilateral");
else if((a==b)||(b==c)||(c==a))
System.out.println("isosceles");
else
System.out.println("scalene");
}}
