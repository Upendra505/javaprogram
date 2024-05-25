public class StringDemo {

	public static void main(String[] args)
	{
		String str1 = "Hello";
		String s2 = "World ";
		String s3 = "Upendra";
		String s4 = "Upendra";
		String s = new String(s2);
		  
		System.out.println(str1);
		System.out.println(s3);
		System.out.println(s);
		//Print the values based on Unicode..
		System.out.println(str1.hashCode());
		System.out.println(s2.length());//printing the Length of String
		
	   //To print Char values based on index value and char
		System.out.println(s2.charAt(2));
		System.out.println(s3.indexOf('H'));
		
		//to checking value empty string or not
		System.out.println(str1.isEmpty());
		
		
		// To Print UpperCae Letters and LowerCase..
		
		System.out.println(str1.toLowerCase());
		System.out.println(s2.toUpperCase());
		
		String Sr = str1+s3;
		
		System.out.println(Sr); 
		
		System.out.println(str1.compareTo(s2));
		
		//both String are equal are not
		System.out.println(s2.equals(s3));//its work on unicode
		System.out.println(s3.equals(s4));
		
		// String is multiple times to Avoid 
		
		String s5="avanthi";
		int  i =str1.indexOf('a');
		System.out.println(i);
		System.out.println(s5.lastIndexOf('a'));
	}
	

}
