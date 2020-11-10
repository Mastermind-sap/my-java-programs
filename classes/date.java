import java.util.*;
class date
{public static void main()
    {int d=Integer.parseInt(ob.checkin_date[i].substring(0,2));
        int m=Integer.parseInt(ob.checkin_date[i].substring(3,5));
        int y=Integer.parseInt(ob.checkin_date[i].substring(6));
        int d1=Integer.parseInt(ob.checkout_date[i].substring(0,2));
        int m1=Integer.parseInt(ob.checkout_date[i].substring(3,5));
        int y1=Integer.parseInt(ob.checkout_date[i].substring(6));
        ob.day_stay[i]=((y1-y)*365)+((m1-m)*30)+(d1-d));