import java.util.Scanner;

public class Question06 {

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

		int range = myarr.length;

		int i, j;
		boolean findFlag = false;

		for ( i = 0; i <= range; i++ )
		{
			for (j = 0; j < range; j++ )
			{
				if (myarr[j] == i)
				{
					findFlag = true;
				}
			}

			if (!findFlag)
			{
				System.out.println("the missing number is " + i );
			}

			findFlag=false;
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

}
