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

		int count=1;

		for (int i = 0; i < myarr.length; i++ )
		{
			for (int j = 0; j < myarr.length; j++)
			{
				if ( i != j )
				{
					if (myarr[i] ==myarr[j])
					{
						count++;
					}
				}
			}

			if (count > myarr.length /2)
			{
				System.out.println("majority number is: " + myarr[i]);
				break;
			}

			count = 1;

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
