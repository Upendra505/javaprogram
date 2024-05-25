package Arrays;

public class ArrayMatrix {

	public static void main(String[] args)
	{
		int a[][]= {{1,2,3},{2,3,4},{4,5,6}};//Installation array a values
		int b[][]= {{4,3,2},{3,2,1},{4,3,2}};//Installation array b values
		int c [][] = new int[3][3]; 
		
		int i,j;////Installation array i,j;
		
		for(int i1=0;i1<3;i1++) //Condition
		{
		   for(int j1=0; j1<3; j1++)
		   {
			   c[i1][j1]=a[i1][j1]+b[i1][j1]; //performing Addition operation
		   }
		   
		   for(int i11=0; i11<3; i11++)
		   {
			   int j1 = 0;
			System.out.print(c[i1][j1]);//to printing the Addition Values
			
		   }
		   
		}
		
	}

}
