import java.util.*;
class happy_word
{
    public static void main()
    {Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        String s=sc.next().toUpperCase();
        int p=0;String news="";char ch=' ';
        for(int i=0;i<s.length();i++)
        {ch=s.charAt(i);
            p=(int)ch-64;
            news=news+(Integer.toString(p));
        }
        int n=Integer.parseInt(news);
        int s1=n;
        while(!(s1<10))
        {s1=0;
            while(n!=0)
            {int r=n%10;
                s1+=(r*r);
                n/=10;
            }
            n=s1;
        }
        if(s1==1)
            System.out.println("Happy word");
        else
            System.out.println("Not a happy word");
    }
}