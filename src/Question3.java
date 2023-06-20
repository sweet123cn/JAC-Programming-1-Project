import java.util.Random;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j;
        Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		int[][] myarr = new int[a][b];
		
		
	    Random rand = new Random();
	    
	    for (i = 0; i < a; i++) {
	    	for(j = 0; j < b; j++) {
	    		
	    	// Dont use any libraty, how about Math.random
	    		myarr[i][j] = rand.nextInt(100);	
	    	}
	    }
	    System.out.println("Original Array: ");
	    for (i = 0; i < myarr.length; i++) {
   	        for(j = 0; j < myarr[i].length; j++) {
    		System.out.printf("%4d", myarr[i][j]);
    	}
    	System.out.println();
	    }
    	System.out.println("which number you want to disappear:  ");
    	int num = kb.nextInt();
    	
    	 for (i = 0; i < myarr.length; i++) {
    	        for(j = 0; j < myarr[i].length; j++) {
     		if (myarr[i][j] == num) {
     			myarr[i][j] = 0;
     		}        	
     	}
    	 }
        System.out.println("New Array: ");
        for (i = 0; i < myarr.length; i++) {
    	   	 for(j = 0; j < myarr[i].length; j++) {
    	    		System.out.printf("%4d", myarr[i][j]);
    	    	}
    	    	System.out.println();  
        }
    	
 }
}

