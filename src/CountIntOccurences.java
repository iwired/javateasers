import java.util.Arrays;
import java.util.Scanner;

public class CountIntOccurences {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
		int[] digitsPresent = new int[] { -1, -1, 9 ,6, 5 };
		
        int numDigits = scanner.nextInt();
        
       
        int[] digits = new int[numDigits];
        for(int i = 0; i < numDigits; i++) {
            digits[i] = 
            		Integer.parseInt(scanner.next());
        }
        Arrays.sort(digits);
        scanner.close();
        int count = 0;
        for(int i = 0; i < numDigits; i++,count=0) {    
           	for(int j=0; j < digitsPresent.length; j++) {
        	   if(digitsPresent[j] == digits[i]) {
        		 count++;       		
        	   }       	  
        	 }
           System.out.print(digits[i] + " " + count + " ");
         }
    }
}