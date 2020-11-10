import java.util.*;
class initials
{public static void main()
    {Scanner sc=new Scanner(System.in);
        String st,s;char ch;
        System.out.println("enter name");
        st=sc.nextLine();
        st=" "+st;
        for(int i=0;i<st.length();i++)
        {ch=st.charAt(i);
            if(ch==' ')

                System.out.print(st.charAt(i+1)+".");
        }
    }
}