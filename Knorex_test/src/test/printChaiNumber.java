package test;

import java.util.*;
//n=5, m=2, s=1, should print: 2. Explanation: Start at seat
//number 1. The prisoners in seats numbered 1 and 2 get sweets.
//Warn prisoner 2.


public class printChaiNumber {

	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i=0;i<t;i++)
        {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int s = scanner.nextInt();
            int result = (m + s - 1) % n;
            if(result == 0)
                result = n;
            System.out.println(result);
        }
}
}