package test;
import java.util.*;

public class printSeq {
	
	 public static void main(String []argh){
		 Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            
	          // Math.pow(2, n);
	            int num=b*(Math.pow(2, n));
	            int sum=a+num;
	        }
	        in.close();
	            }
}
