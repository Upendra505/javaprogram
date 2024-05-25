public class Stars
{
    public static void main(String[] args)
    {
        int n = 10;
        for (int i=1; i<=n; i++)// rows  number of rows creating
        {
            for (int j=n-i; j>0; j-- ) // creating a speace
            {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) // printing the Stars
            {
                System.out.print("*");
            }
            System.out.println( );


        }

    }
}
