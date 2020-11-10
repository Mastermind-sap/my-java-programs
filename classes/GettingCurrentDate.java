import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GettingCurrentDate {
   public static void main() {
       DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
       Date dateobj = new Date();
       System.out.println(df.format(dateobj));

       Calendar calobj = Calendar.getInstance();
       System.out.println(df.format(calobj.getTime()));
    }
}