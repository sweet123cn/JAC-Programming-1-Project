import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

        System.out.print("Enter the array element: ");
        String line = kb.nextLine();

        // Split the input line with ',' seperated into individual integers
        String[] nums = line.split(",");

        // Convert the strings to integers
        int[] myarr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            myarr[i] = Integer.parseInt(nums[i]);
        }
		System.out.println("the array you input:");
		printIntArray (myarr);

		int[] duplicateArray = findDuplicateIntArray(myarr); //count duplicate numbers

		System.out.println("array element duplicate times:");
		printIntArray (duplicateArray);

		boolean flag = false;

		for ( int j = 0 ;j < myarr.length; j ++)
		{
			if ( duplicateArray[j] > myarr.length/2)
			{
				System.out.println("the majority element is :" + myarr[j]);
				flag = true;
				break;
			}

		}

		if (!flag)
		{
			System.out.println("there is no majority element which appears more than " + (myarr.length/2) + " times");
		}

		kb.close();
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

	public static int[] findDuplicateIntArray(int[] myArray)
	{
		int[] duplicate = new int[myArray.length];

		int count = 0;

		for (int i = 0; i < myArray.length; i++ )
		{
			for (int j : myArray)
			{
				if (myArray[i] == j)
				{
					count++;
				}
			}

			duplicate[i] = count;
			count = 0;
		}

		return duplicate;
	}

}
