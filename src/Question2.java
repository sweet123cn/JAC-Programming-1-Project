import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Joker: ");
		int joker = kb.nextInt();
		System.out.println("Number: ");
		int n = kb.nextInt();
		System.out.println("Enter number: ");
		int num ;
		for(int i = 1; i <= n; i++) {
			int temp = kb.nextInt();
			if (temp >= joker) {
				num = temp % joker;
			} else {
				num = temp;
			}
			System.out.print(num + " ");
		}
	}

}
