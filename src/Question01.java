import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, n3, sum, magicNum;
		Scanner kb = new Scanner(System.in);

//		prompt the user to enter numbers		
		System.out.println("Enter 3 2-digital numbers: ");
		n1 = kb.nextInt();
		n2 = kb.nextInt();
		n3 = kb.nextInt();
		
		sum = n1 + n2 + n3;

//		According the conditions to get the value of magic Number; 		
		if (sum % 3 == 0 && sum % 5 != 0) {
			int sum1 = n1 + n3;
			int div = n2 / 10;
			if (n1 + n3 < 100) {
				magicNum = div * 100 + sum1;	
			}else {
				magicNum = div * 1000 + sum1;
			} 
		    }else if (sum % 3 != 0 && sum % 5 == 0) {
				int sum2 = n1 + n3;
				int remainder = n2 % 10;
				magicNum = sum2 * 10  + remainder;
				
			} else if (sum % 3 == 0 && sum % 5 == 0) {
				magicNum = (n2 *1000) + (n1 * 10) + 1;
				
			} else {
				magicNum = n1 *10000 + n2 * 100 + n3;
			}
				
		System.out.println("Your magic number is " + magicNum);

		kb.close();
	}

}
