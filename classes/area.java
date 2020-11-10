import java.util.*;
class area
{
 double area(double b,double h)
    {double a1=b*h;
        return a1;
    }
 double area(float d1,float d2)
    {double a2=(1.0/2.0)*d1*d2;
        return a2;
    }
 double area(double a,double b,double h)
    {double a3=(1.0/2.0)*(a+b)*h;
        return a3;
    }

public static void main()
{Scanner sc=new Scanner(System.in);
System.out.println("enter 1 for area of parallelogram;\n 2 for area of rhombus;\n 3 for area of trapezium");
int n =sc.nextInt();
area ob=new area();
switch(n)
{case 1:
System.out.println("enter the base of the parallelogram");
double b=sc.nextDouble();
System.out.println("enter the height of the parallelogram");
double h=sc.nextDouble();
System.out.println("area of the parallelogram is "+ob.area(b,h));
break;

case 2:
System.out.println("enter a diagonal of the rhombus");
float d1=sc.nextFloat();
System.out.println("enter another diagonal of the rhombus");
float d2=sc.nextFloat();
System.out.println("area of the rhombus is "+ob.area(d1,d2));
break;

case 3:
System.out.println("enter a parallel side of the trapezium");
double a=sc.nextDouble();
System.out.println("enter another parallel side of the trapezium");
double b1=sc.nextDouble();
System.out.println("enter height of the trapezium");
double h1=sc.nextDouble();
System.out.println("area of the trapezium is "+ob.area(a,b1,h1));
break;
}
}}