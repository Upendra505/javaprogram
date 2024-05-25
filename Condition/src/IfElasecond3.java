import java.util.Scanner;
class AgeGroup
{
    public static void main(String args[])
    {
        System.out.println("Enter The Age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age<=12)
        {
            System.out.println(" Child");
        }
        else if (age>12 && age<18)
        {

            System.out.println("Tenagers");
        }
        else
            {
                System.out.println("Adult");
            }
        }
}
