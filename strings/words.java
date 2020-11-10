import java.util.*;
class words
{public static void main()
    {Scanner x=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=x.nextLine()+" ";
        int n=0;
        for(int i=0;i<s.length();i++)
        {if(Character.isWhitespace(s.charAt(i)))
                n+=1;
        }        
        String word[]=new String[n];
        int a=0,b=0;
        for(int i=0;i<s.length();i++)
        {if(Character.isWhitespace(s.charAt(i)))
            { word[b]=s.substring(a,i);
                b++;
                a=i+1;
            }  
        }
        for(int j=0;j<n;j++)
        {for(int j1=0;j1<(n-1);j1++)
                if(word[j1].compareTo(word[j1+1])>1)
                {
                    String temp=word[j1];
                    word[j1]=word[j1+1];
                    word[j1+1]=temp;
            }
        }
        for(int j2=0;j2<n;j2++)
            System.out.print(word[j2]+" ");
    }
}