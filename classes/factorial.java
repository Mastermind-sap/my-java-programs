import java.util.*;
class factorial
{ int fact(int n)
    {int f=1;
        for(int i=1;i<=n;i++)
        f=f*i;
        return f;}
       
        public static void main(int n,int m)
        {
            factorial ob=new factorial();
            double s=ob.fact(n)/(ob.fact(m)*ob.fact(n-m));
            System.out.println(s);
        }
    }