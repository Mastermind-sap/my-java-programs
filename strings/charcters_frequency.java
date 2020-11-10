import java.util.*;
class charcters_frequency
{public static void main()
    {Scanner x=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=x.nextLine();
        for(int i=0;i<s.length();i++)
        {char ch=s.charAt(i);
            if(ch!=' ') 
            { int n=1;
                for(int j=i+1;j<s.length();j++)
                {
                    if(s.charAt(j)==ch)
                        n+=1;
                }
                System.out.println("Frequency of "+ch+" is "+n);
                s=s.replace(ch,' ');
            }
        }
    }
}