import java.util.Scanner;
public class StarThree
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Stars:-");
             int  numb = sc.nextInt();


        for (int row= 1; row<= numb; row++)
        {
           for (int col=1; col<=row; col++)
           {
               System.out.print(col);
           }
            System.out.println();
        }
    }
}