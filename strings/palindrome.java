import java.util.*;
class palindrome
{public static void main()
    {   Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        String s=sc.next();
        StringBuffer s1=new StringBuffer(s);
        s1.reverse();
        if(s1.toString().compareTo(s)==0)
            System.out.println("It is a palindrome");
        else
            System.out.println("It is not a palindrome");
    }
}