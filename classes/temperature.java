import java.util.*;
class temperature
{static double max,min,f1,f2,a,b;
    temperature(double a,double b)
    {max=a;min=b;}

    static void input()
    {Scanner sc=new Scanner(System.in);
        System.out.println("enter the max temp");
        a=sc.nextDouble();
        System.out.println("enter the min temp");
        b=sc.nextDouble();
    }

    void compute()
    {f1=((9*max)/5)+32;
     f2=((9*min)/5)+32;}

    void display()
    {System.out.println("max temp="+f1);
        System.out.println("min temp="+f2);
    }

    public static void main()
      {input();
        temperature ob=new temperature(a,b);
        ob.compute();
        ob.display();
}}