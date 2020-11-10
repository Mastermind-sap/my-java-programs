import java.util.*;
class triangle
{public static void main()
{Scanner sc=new Scanner(System.in);
System.out.println("enter 1st angle");
double a=sc.nextDouble();
System.out.println("enter 2nd angle");
double b=sc.nextDouble();
System.out.println("enter 3rd angle");
double c=sc.nextDouble();
double t=a+b+c;
if ((t==180)&&(a!=0)&&(b!=0)&&(c!=0))
{System.out.println("the triangle is possible");
if ((a<90)&&(b<90)&&(c<90))
System.out.println("an acute angled triangle");
else if ((a==90)||(b==90)||(c<90))
System.out.println("an right angled triangle");
else
System.out.println("an obtuse angled triangle");
}
else
System.out.println("triangle is not possible");
}}