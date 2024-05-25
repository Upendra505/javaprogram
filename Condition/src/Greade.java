import  java.util.Scanner;
public class Greade
{
    public static void main(String[] args)
    {
        System.out.println("Enter The Marks:");
        Scanner sc =  new Scanner(System.in);
        int marks = sc.nextInt();

            int  number = marks;
          if(marks<=50)
          {
              System.out.println("fail");
          }
          else if (marks>= 60  &&  marks< 70)
          {
              System.out.println("Grade is c+");
          }
          else if (marks>=70  &&  marks< 80)
          {
              System.out.println("Grade is b");
          } else if (marks>=80  &&  marks< 90)
          {
              System.out.println("Grade is B+");
          } else if (marks>=90 &&  marks< 100)
          {
              System.out.println("Grade is A");
          }

          else
          {
              System.out.println("not vaild");
          }
    }
}
