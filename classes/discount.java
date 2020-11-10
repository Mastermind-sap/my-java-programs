import java.util.*;
class discount
{static double pp;static int n;
    static Scanner sc=new Scanner(System.in);
    void discount()
    { switch(n)
        {
            case 1:
            System.out.println("enter the dicount%");
            int m=sc.nextInt();
            discount(m);
            break;

            case 2:
            System.out.println("enter the dicount%");
            int p=sc.nextInt();
            System.out.println("enter the next dicount%");
            int q=sc.nextInt();
            discount(p,q);
            break;

            case 3:
            System.out.println("enter the dicount%");
            int a=sc.nextInt();
            System.out.println("enter the next dicount%");
            int b=sc.nextInt();
            System.out.println("enter the another dicount%");
            int c=sc.nextInt();
            discount(a,b,c);
            break;

            default:
            System.out.println("Invalid");
        }
    }

    void discount(int a)
    {double p1=pp*(1.0-(a/100.0));
        System.out.println("price to be paid= "+p1);
    }

    void discount(int p,int q)
    {double p2=pp*(1.0-(p/100.0))*(1.0-(q/100.0));
        System.out.println("price to be paid= "+p2);
    }

    void discount(int m,int n,int o)
    {double p3=pp*(1.0-(m/100.0))*(1.0-(n/100.0))*(1.0-(o/100.0));
        System.out.println("price to be paid= "+p3);
    }

    public static void main()
    {
         discount ob=new discount();
         System.out.println("enter the printed price");
        pp=sc.nextDouble();
        System.out.println("enter 1 for single discount\n 2 for two successive discount \n 3 for three successive discount");
        n=sc.nextInt();
        ob.discount();
    }
}