import java.util.*;
class merge
{public static void main()
    {Scanner sc=new Scanner(System.in);
        int P[]=new int[6];
        int Q[]=new int[4];
        System.out.println("enter the elements of the array P");
        for(int i=0;i<6;i++)
            P[i]=sc.nextInt();
        System.out.println("enter the elements of the array Q");
        for(int i=0;i<4;i++)
            Q[i]=sc.nextInt();
        int R[]=new int[10];
        for(int i=0;i<6;i++)
            R[i]=P[i];
        for(int i=0;i<4;i++)
            R[6+i]=Q[i];
        System.out.println("the resultant array R is:");
        for(int i=0;i<10;i++)
            System.out.println(R[i]);
    }}