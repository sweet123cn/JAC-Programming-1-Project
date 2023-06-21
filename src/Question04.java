import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myarr1 = getIntArray();

		int[] myarr2 = myarr1.clone();

		System.out.println("=========input array=========");

		printIntArray(myarr1); 

		sortDescendingIntArray(myarr1); //Descending sort the array
		
		System.out.println("=======Descending sorted=========");

		printIntArray(myarr1); //print the sorted array

		sortAscendingIntArray(myarr2); //Ascending sort the array
		
		System.out.println("=======Ascending sorted=========");

		printIntArray(myarr2); //print the sorted array


	}

	public static int[] getIntArray()
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("please input the size of array?");
		int size = kb.nextInt();

		while (size <= 0)
		{
			System.out.println("Array size error, please input size of array:");
			size = kb.nextInt();
		}

		System.out.println("input the element of Array n=" + size +" :");
		int i;
		int[] myarr = new int[size];

		for ( i = 0; i < size; i++)
		{
			myarr[i] = kb.nextInt();
		}

		kb.close();

		return myarr;
	}

	public static void sortDescendingIntArray(int[] myarr)
	{
		int i, temp;
		
		for ( i = 0 ; i < myarr.length; i++) //sort
		{
			for (int j = i+1 ; j < myarr.length; j++)
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

	public static void sortAscendingIntArray(int[] myarr)
	{
		int i, temp;
		
		for ( i = 0 ; i < myarr.length; i++) //sort
		{
			for (int j = i+1 ; j < myarr.length; j++)
			{
				
				if ( myarr[i] > myarr[j])
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

