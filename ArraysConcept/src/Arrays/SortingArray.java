package Arrays;

public class SortingArray 
{

	public static void main(String[] args)
	{
	
	int arr[] = new int[]{9,4,10,3,5,6,8,7,1,2}; // initialize Array 

for(int i=0; i<arr.length;i++)// repeat Steps
{
	 for(int j=i+1;j<arr.length;j++)
	 {
		 
		 int temp =0;// Temp value 0;
		 if (arr[i]>arr[j])//Checking condition
		 {
			 temp = arr[i];//Sorting array in ascending order 
			 arr[i]= arr[j];
			 arr[j]= temp;
			 
		 }
	 }
	 System.out.println(arr[i]+"");// printing an array
   }
  }
}
