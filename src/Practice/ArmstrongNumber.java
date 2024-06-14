package Practice;

import java.util.Scanner;

public class ArmstrongNumber {
	   static String armstrongNumber(int n) {
	        // code here
	        int num =n;
	        int sum = 0;
	        while(n>0){
	            int x = n%10;
	            sum = sum + (x*x*x);
	            n = n/10;
	        }
	        if(num==sum) {
	            return "true";
	        }
	        return "false";
	    
	    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		System.out.println(armstrongNumber(n));
	}
}
