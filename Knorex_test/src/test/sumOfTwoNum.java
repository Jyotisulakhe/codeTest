package test;
//Given an array of integers arr[], and a number t, check whether
//there exist two elements in arr[] whose sum is exactly t.
public class sumOfTwoNum {

	
	  static boolean isThereSum(int arr[], int size, int t)
	    {
	        for (int i = 0; i < (size - 1); i++) {
	            for (int j = (i + 1); j < size; j++) {
	                if (arr[i] + arr[j] == t) {
	                    return true;
	                }
	            }
	        }

	        return false;
	    }
	
	 public static void main(String[] args)
	    {

	        int arr[] = { 1, -2, 1, 0, 5 };
	        int t = 0;
	        int size = arr.length;

	        if (isThereSum(arr, size, t)) {
	            System.out.println("true");
	            
	            
	        }
	        else {
	        	 System.out.println("false");
	        }
			     
	        }
}
