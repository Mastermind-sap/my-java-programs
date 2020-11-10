import java.util.*;
public class CheckDate
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);    
        int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
        String input;
        System.out.print("Enter Date (dd/MM/yyyy) : ");
        input=sc.nextLine();
        int d=Integer.parseInt(input.substring(0,2));
        int m=Integer.parseInt(input.substring(3,5));
        int y=Integer.parseInt(input.substring(6));
        if(y>1900 && y<=9999)
        {
            if(((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0))
            {
                    days[1]++;
            }
            if(m>0 && m<=12)
            {
                if(d>0 && d< days[m-1])
                {
                    System.out.print("Valid Date");
                }
                else
                {
                   System.out.print("Invalid Date"); 
                }
            }
            else
            {
                   System.out.print("Invalid Date"); 
            }
        }
        else
        {
           System.out.print("Invalid Date"); 
        }
    }
}
