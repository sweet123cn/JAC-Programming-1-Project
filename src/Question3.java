
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j;
        Scanner kb = new Scanner(System.in);

//		Prompt the user to enter two numbers as the dimension of a array; 		
		System.out.println("Enter two numbers: ");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int[][] myarr = new int[a][b];
		
//	    Create the array  		
	    for (i = 0; i < a; i++) {
	    	for(j = 0; j < b; j++) {
	    	myarr[i][j] = (int)(Math.random() * 100 + 1);	
	    	}
	    }
		
//	    print the array		
	    System.out.println("Original Array: ");
		
	    for (i = 0; i < myarr.length; i++) {
   	        for(j = 0; j < myarr[i].length; j++) {
    		System.out.printf("%4d", myarr[i][j]);
    	}
    	System.out.println();
	    }

//	    Prompt the user to enter a number  to disappear		
    	System.out.println("which number you want to disappear:  ");
    	int num = kb.nextInt();

//    	Search the number in the array and replaced  by 0		
    	 for (i = 0; i < myarr.length; i++) {
    	        for(j = 0; j < myarr[i].length; j++) {
     		if (myarr[i][j] == num) {
     			myarr[i][j] = 0;
     		}        	
     	}
    	 }

//    	 Print the new array		
        System.out.println("New Array: ");
        for (i = 0; i < myarr.length; i++) {
    	   	 for(j = 0; j < myarr[i].length; j++) {
    	    		System.out.printf("%4d", myarr[i][j]);
    	    	}
    	    	System.out.println();  
        }
    	
 }
}

