package Arrays;

public class LargestElementArray {
   public static void main(String args[]){
        int arr[]= {56,43,12,45,76,87,35};
        int large= arr[0];
        for(int i=1;i< arr.length;i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
        }  System.out.println("largest :" +large);

        int small=arr[0];
            for(int j=1;j< arr.length;j++){
                if(arr[j]<small){
                    small=arr[j];
                }
            } 
            System.out.println("Smallest :"+small);

            }
    }