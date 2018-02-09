import java.util.Arrays;

/**
 * @author Alyssa
 * Period 2 
 * 2/15/18 
 * Lab 3.2
 */

public class ArrayMethods2 
{

	public static void main(String [] args)
	{
		//Testing arrays
		String [] test1 = {"apple", "cucumber", "microsoft", "zorro"};
		String [] test2 = {"banana", "cherry", "mahogany", "oreos", "pie"};
		int [] test3 = {3, 4, 2, 7, 12, 22, 0, 1};
		
		//Merge
		long start = System.nanoTime();
		String[] mergeResult = merge(test1,test2);
		long end = System.nanoTime();
		long time = end- start;
		System.out.println("Merge time: " + time + " nanoseconds.");
		System.out.println(Arrays.toString(mergeResult));
		
		//Partition
		start = System.nanoTime();
		int pivotFinalPos = partition(test3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Partition time: " + time + " nanoseconds.");
		System.out.println("Final Pivot Position: " + pivotFinalPos);
		System.out.println(Arrays.toString(test3));
	}
	
	public static String[] merge(String[] list1, String[] list2)
	{
		//precondition: both lists are sorted.
		int x;
		int y;
		int z;
		
		int midpt = list1;

	}


	public static int partition(int[] list)
	{
		int x;
		int y;
		int piv = list[x];
		
		while(x >1)
		{
			
		}
		
		

	}
	
	public static int swap(int[] list)
	{
		list[] = 
	}
}
