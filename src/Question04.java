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
 
		int radonRange = 100; //random number range:0-99

		int i, temp;
		
		int[] myarr1 = randomIntArray(size, radonRange); //generate a random integer array

		for ( i = 0 ; i < myarr1.length; i++) //sort
		{
			for (int j = i ; j < myarr1.length; j++)
			{
				if ( myarr1[i] < myarr1[j])
				{
					temp = myarr1[i];
					myarr1[i] = myarr1[j];
					myarr1[j] = temp;
				}
			} 
		}

		System.out.println("=======the array sorted=========");

		printIntArray(myarr1); //print the sorted array

		kb.close();

	}

	public static int[] randomIntArray(int size,int range)
	{
		System.out.println("====generate random array======="); 

		Random rand = new Random();

		int[] myarr =new int[size];

		for ( int i = 0; i < size; i++)
		{
			myarr[i] = rand.nextInt(range);
		}

		printIntArray( myarr );

		return myarr;

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

