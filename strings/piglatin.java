import java.util.*;
class piglatin
{public static void main()
    {Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word ");
        String str1=sc.next().toUpperCase();
        String str2="",str3="";char ch;
        for(int i=0;i<str1.length();i++)
        {ch=str1.charAt(i);
            if((ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
            {str2=str1.substring(0,i);
                str3=str1.substring(i,str1.length());
                break;
            }
        }System.out.println("New word in piglatin:"+str3+str2+"AY");
    }
}