import java.util.Scanner;
import java.util.Random;

public class Question04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.println("please input the size of array?");
		int size = kb.nextInt();

		while (size <= 0)
		{
			System.out.println("Array size error, please input size of array:");
			size = kb.nextInt();
		}

		System.out.println("input the element of Ayyar:");
		int i;
		int[] myarr = new int[size];

		for ( i = 0; i < size; i++)
		{
			myarr[i] = kb.nextInt();
		}

		System.out.println("=======the input array=========");

		printIntArray(myarr); 
 
		sortIntArray(myarr);
		
		System.out.println("=======the array sorted=========");

		printIntArray(myarr); //print the sorted array

		kb.close();

	}

	public static void sortIntArray(int[] myarr)
	{
		int i, temp;
		for ( i = 0 ; i < myarr.length; i++) //sort
		{
			for (int j = i ; j < myarr.length; j++)
			{
				if ( myarr[i] < myarr[j])
				{
					temp = myarr[i];
					myarr[i] = myarr[j];
					myarr[j] = temp;
				}
			} 
		}

	}

	public static void printIntArray( int[] arr )
	{
		for ( int i = 0; i < arr.length; i++)
		{
			System.out.printf("%2d ",arr[i]);

			if ( (i+1) %10 == 0)
			{
				System.out.println();
			}

		}

		System.out.println();
	}

}

