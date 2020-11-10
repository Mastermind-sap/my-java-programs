import java.util.*;
class Hotel_Management_Software
{static String name[],address[],checkin_date_time[],checkout_date_time[],suite[],name_r[],address_r[],checkin_date_time_r[],checkout_date_time_r[],suite_r[],pan[],pan_r[];static int age[],day_stay[],age_r[],day_stay_r[],no_rooms,remaining_rooms,register,register_no; 
    public static void main()
    {  Scanner sc=new Scanner(System.in);
        System.out.println("");
        System.out.println("\t\t\t\t\t\t\t\tHotel Management Software");
        System.out.println("\t\t\t\t\t\t\t\t*************************");
        System.out.println("");

        no_rooms=100;
        name=new String[no_rooms];
        address=new String[no_rooms];
        checkin_date_time=new String[no_rooms];
        checkout_date_time=new String[no_rooms];
        pan=new String[no_rooms];
        age=new int[no_rooms];
        day_stay=new int[no_rooms];
        suite=new String[no_rooms];
        remaining_rooms=no_rooms;
        register=200;
        name_r=new String[register];
        address_r=new String[register];
        checkin_date_time_r=new String[register];
        checkout_date_time_r=new String[register];
        pan_r=new String[register];
        age_r=new int[register];
        day_stay_r=new int[register];
        suite_r=new String[register];
        register_no=0;

        int flag=0;
        while(flag==0)
        {
            System.out.println("Enter 1 for Registration\n      2 for Billing\n      3 for Checkout/Searching");
            System.out.print("\nOption:");
            int choice=sc.nextInt();
            System.out.println("\n ******************************************************************************************************************************* \n ");  
            switch(choice)
            {case 1:
                Registration r=new Registration();
                r.main();
                break;
                case 2:
                Billing b=new Billing();
                b.main();
                break;
                case 3:
                Checkout c=new Checkout();
                c.main();
                break;
                default:
                System.out.println("Wrong choice");
            }
            System.out.println("");
            int d=1;
            do
            {
                System.out.println("Do you want to continue?(yes/no)");
                String s=sc.next();
                if(s.equalsIgnoreCase("yes"))
                {System.out.println("\n ******************************************************************************************************************************* \n ");  
                    break;}
                else if(s.equalsIgnoreCase("no"))
                {   flag=1;
                    break;
                }
                else
                {System.out.println("Sorry ,please give your opinion in yes or no"); 
                    d=0;}
            }while(d==0);
        }
    }
}

