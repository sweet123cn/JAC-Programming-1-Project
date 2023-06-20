import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

//		Prompt the user to enter a number as joker		
		System.out.println("Joker: ");
		int joker = kb.nextInt();

//		Prompt the user to enter a value how many number he/she wants to put and input numbers 		
		System.out.println("Number: ");
		int n = kb.nextInt();
		System.out.println("Enter number: ");

//		Follow the rule to print the numbers		
		int num ;
// according the explanation of the question text:
		// for(int i = 1; i <= n; i++) {
		// 	int temp = kb.nextInt();
		// 	if (temp >= joker) {
		// 		num = joker - 1;
		// 	} else {
		// 		num = 0;
		// 	}
		// 	System.out.print(num + " ");
		// }
		
// according the output examples:
		for(int i = 1; i <= n; i++) {
			int temp = kb.nextInt();
		        num = temp % joker;
		 	System.out.print(num + " ");
		 }

		kb.close();
	}

}
