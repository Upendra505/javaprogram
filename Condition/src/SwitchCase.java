import java.util.Scanner;
public class SwitchCase
{
    public static void main(String[] args)
    {
        System.out.println("Enther weak number :");
        Scanner sc = new Scanner(System.in);
        int day =sc.nextInt();
         switch (day)
         {

             case 1:
                 System.out.println("MONDAY");
                 break;
                 case 2:
             System.out.println("TUESDAY");
             break;

             case 3:
                 System.out.println("WEDNESDAY");
                 break;
             case 4:
                 System.out.println("THURSDAY");
                 break;
             case 5:
                 System.out.println("FRIDAY");
                 break;
             case 6:
                 System.out.println("SATURDAY");
                 break;
             default:
                 System.out.println("Invalid a number");
         }

    }
}
