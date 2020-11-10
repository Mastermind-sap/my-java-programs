import java.util.*;
class figures
{
    double area(double r)
    {double a=(22.0/7.0)*r*r;
        return a;
    }

    float area(float s)
    {float a=s*s;
        return a;
    }

    double area(double l,double b)
    {double a=l*b;
        return a;
    }

    public static void main()
    {Scanner sc=new Scanner(System.in);
        System.out.println("enter 1 for area of circle;\n 2 forarea of square;\n 3 for area of rectangle");
        int n =sc.nextInt();
        figures ob=new figures();
        switch(n)
        {case 1:
            System.out.println("enter the radius of the circle");
            double r=sc.nextDouble();
            System.out.println("area of the circle is "+ob.area(r));
            break;

            case 2:
            System.out.println("enter the side of the square");
            float s=sc.nextFloat();
            System.out.println("area of the square is "+ob.area(s));
            break;

            case 3:
            System.out.println("enter the length of the rectangle");
            double l=sc.nextDouble();
            System.out.println("enter the breath of the rectangle");
            double b=sc.nextDouble();
            System.out.println("area of the rectangle is "+ob.area(l,b));
            break;
        }
    }}