import java.util.*;
class initials
{public static void main()
    {Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=" "+sc.nextLine(),s1="";
        for(int i=0;i<s.length();i++)
        {if(Character.isWhitespace(s.charAt(i)))
            s1+=s.charAt(i+1);
        }
        System.out.println(s1);
    }
}