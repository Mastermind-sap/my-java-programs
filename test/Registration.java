import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
class Registration
{public static void main()
    { System.out.println("");
        System.out.println("\t\t\t\t\t\t\t\t\tRegistration");
        System.out.println("\t\t\t\t\t\t\t\t\t************");
        System.out.println("");
        Hotel_Management_Software ob=new Hotel_Management_Software();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of guests");
        int n1=sc.nextInt();
        if(n1<=ob.remaining_rooms)
        {
            for(int i=(ob.no_rooms-ob.remaining_rooms),d=0;d<n1;i++,d++)
            {   ob.remaining_rooms=ob.remaining_rooms-1;
                System.out.println("enter name of the guest");
                ob.name[i]=sc.next();
                ob.name[i]+=sc.nextLine();
                System.out.println("enter age of the guest in years");
                int d1=0;
                do
                {

                    if(ob.age[i]<1)
                    {System.out.println("invalid age");
                        System.out.println("please enter the age again");
                        d1=1;
                    }
                    else if(ob.age[i]>110)
                    {System.out.println("invalid age");
                        System.out.println("please enter the age again");
                        d1=1;
                    }
                    else 
                        d1=0;
                }while(d1==1);
                System.out.println("enter address of the guest");
                ob.address[i]=sc.next();
                ob.address[i]+=sc.nextLine();
                System.out.println("enter PAN no. of the guest");
                int p=0;
                do
                {
                    ob.pan[i]=sc.next();
                    ob.pan[i]+=sc.nextLine();
                    if((ob.pan[i].length()==10)&&(Character.isLetter(ob.pan[i].charAt(0)))&&(Character.isLetter(ob.pan[i].charAt(1)))
                            &&(Character.isLetter(ob.pan[i].charAt(2)))&&(Character.isLetter(ob.pan[i].charAt(3)))
                                    &&(Character.isLetter(ob.pan[i].charAt(4)))&&(Character.isDigit(ob.pan[i].charAt(5)))
                                            &&(Character.isDigit(ob.pan[i].charAt(6)))&&(Character.isDigit(ob.pan[i].charAt(7)))
                                                    &&(Character.isDigit(ob.pan[i].charAt(8)))&&(Character.isLetter(ob.pan[i].charAt(9)))
                                                            &&(Character.isUpperCase(ob.pan[i].charAt(0)))&&(Character.isUpperCase(ob.pan[i].charAt(1)))
                                                                    &&(Character.isUpperCase(ob.pan[i].charAt(2)))&&(Character.isUpperCase(ob.pan[i].charAt(3)))
                                                                            &&(Character.isUpperCase(ob.pan[i].charAt(4)))&&(Character.isUpperCase(ob.pan[i].charAt(9))))
                    p=0;
                    else 
                    {System.out.println("invalid PAN no.");
                        System.out.println("PAN structure is as follows: AAAPL1234C");
                        System.out.println("please enter the PAN no. again");
                        p=1;
                    }

                }while(p==1);

                DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                Date dateobj = new Date();
                ob.checkin_date_time[i]=df.format(dateobj);

                int w=0;
                while(w==0)
                {
                    System.out.println("Enter 1 for Deluxe suit-- Rs.2000/day \n 2 for Super Deluxe suit-- Rs.4000/day \n 3 for Executive suit-- Rs.6000/day  \n 4 for Presidential suite-- Rs.8000/day ");
                    int s=sc.nextInt();
                    switch(s)
                    {
                        case 1:
                        ob.suite[i]="Deluxe";
                        w=1;
                        break;
                        case 2:
                        ob.suite[i]="Super Deluxe";
                        w=1;
                        break;
                        case 3:
                        ob.suite[i]="Executive";
                        w=1;
                        break;
                        case 4:
                        ob.suite[i]="Presidential";
                        w=1;
                        break;
                        default:
                        System.out.println("Wrong choice");
                    }
                }
            }
            System.out.println("");
            System.out.println("\t\t\t\t\t\t\t\tRegistration is complete!");
            System.out.println("\t\t\t\t\t\t\t\t*************************");
            System.out.println("");
        }
        else
        {
            System.out.println("Sorry ,we are out of rooms");
            System.out.println("We have only "+ob.remaining_rooms+" rooms at the moment");
        }
    }
}
