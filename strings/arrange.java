import java.util.*;
class arrange
{public static void main()
    {Scanner x=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=x.nextLine();
        char ch[]=new char[s.length()];
        for(int i=0;i<s.length();i++)
            ch[i]=s.charAt(i);
        for(int i=0;i<s.length();i++)
        {   for(int j=0;j<(s.length()-1);j++)
            {if(ch[j]>ch[j+1])
                {char ch1=ch[j];
                    ch[j]=ch[j+1];
                    ch[j+1]=ch1;
                }
            }
        }
        for(int i=0;i<s.length();i++)
            System.out.print(ch[i]);
    }
}