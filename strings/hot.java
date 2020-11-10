import java.util.*;
class hot
{public static void main()
    {Scanner x=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=x.nextLine().trim();
        if(s.substring(0,3).equalsIgnoreCase("hot"))
            System.out.println("No change in the string");
        else
            System.out.println("HOT"+s);
    }
}