import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);

        System.out.print("Enter the array element: ");  //get keyboard input as a String
        String line = kb.nextLine();

        // Split the input line with ',' seperated into individual integers
        String[] nums = line.split(",");

        // Convert the strings to integers
        int[] myarr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            myarr[i] = Integer.parseInt(nums[i]);
        }
		System.out.println("the array you input:");
		printIntArray (myarr); //output the input array

		int range = myarr.length;

		int i;
		int sum1=0, sum2=0;

		sum1 = range*(range + 1)/2; //calculate the sum of 0-n

		for ( i = 0; i < range; i++) //calculate the sum of this array
		{
			sum2 =sum2 + myarr[i];
		}

		System.out.println("the mising num is " + (sum1-sum2));  //sum1 - sum2 is the missing number

		kb.close();
	}

	//output an array to terminal
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
