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
		int sum1=0, sum2=0;

		sum1 = range*(range + 1)/2;

		for ( i = 0; i < range; i++)
		{
			sum2 =sum2 + myarr[i];
		}

		System.out.println("the mising num is " + (sum1-sum2));

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
