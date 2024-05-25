public class NestedIf
{
    public static void main(String[] args)
    {
       int a= 15,b=15,c=20;

       if (a == b)
       {

           if (b ==  c) {
               System.out.println("equall");
           }
           else {
               System.out.println("not equall");
           }
       }
           else
           {
               System.out.println("b&c are not  equall");
           }


    }
}
