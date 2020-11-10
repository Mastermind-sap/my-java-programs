import java.util.*;
class alternate_letters
{static void main()
    {Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=sc.nextLine();
        for(int i=0,j=0;i<s.length();i++,j++)
        {char a=s.charAt(i);
            if(Character.isLetter(a))
            {if(j%2==0)
                System.out.print(Character.toUpperCase(a));
                else
                System.out.print(Character.toLowerCase(a));
            }
            else
            {System.out.print(a);
                j--;
            }
        }
    }
}