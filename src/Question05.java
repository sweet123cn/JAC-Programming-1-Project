import java.util.Scanner;

public class Question05 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

        System.out.print("Enter the array element: "); //get keyboard input as a String
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

		int count=1;

		for (int i = 0; i < myarr.length; i++ )
		{
			for (int j = 0; j < myarr.length; j++)
			{
				if ( i != j )
				{
					if (myarr[i] ==myarr[j])  // count the element in an array duplicated times
					{
						count++;
					}
				}
			}

			if (count > myarr.length /2) //if count > n/2, it is majority number
			{
				System.out.println("majority number is: " + myarr[i]);
				break;
			}

			count = 1;

		}

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



//寻找majority的另一种算法，共参考
public static int findMajorityElement(int[] array) {         
	int count = 0;         
	int majorityElement = array[0];        
	for (int i = 0; i < array.length; i++) 
	{             
		if (count == 0) 
		{                 
			majorityElement = array[i];                 
			count = 1;             
		} else if (majorityElement == array[i]) 
		{                 
			count++;             
		} else 
		{                 
			count--;             
		}         
	} // 验证候选元素是否为主要元素        
	count = 0;         
	for (int i = 0; i < array.length; i++) 
	{             
		if (array[i] == majorityElement) 
		{                 
			count++;             
		}        
	}         
	if (count > array.length / 2) 
	{             
		return majorityElement;         
	} else 
	{             
		return 0; // 表示没有主要元素       
	}    
 } 
}
