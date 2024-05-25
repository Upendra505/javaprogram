package Exception;

public class DemoEXCEPTION
{

	public static void main(String[] args)
	{
		int c = 100/10;
		
		

	try {
		int a []= {1,2,3,4};
		System.out.println(a[5]);
		String s="anu";
		System.out.println(s.charAt(5));
	}
	catch(ArrayIndexOutOfBoundsException ae)
	{
		System.out.print("Array Error");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	

}
}
