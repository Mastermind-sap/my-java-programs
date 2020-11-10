import java.util.*;
class an_and
{public static void main()
    {Scanner x=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=x.nextLine()+" ";
        int an=0,and=0;String s1="";
        for(int i=0;i<s.length();i++)
        {if(Character.isWhitespace(s.charAt(i)))
            {if(s1.equalsIgnoreCase("and"))
                and+=1;
                else if(s1.equalsIgnoreCase("an"))
                an+=1;
                s1="";
            }
            else
                s1+=s.charAt(i);
        }
        System.out.println("The frequency of and in the sentence is "+and);
        System.out.println("The frequency of an in the sentence is "+an);
    }
}

