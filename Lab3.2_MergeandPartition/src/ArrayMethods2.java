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
		//Test arrays
		int[]test1 = {1,4,4,5,6,4,3,17,0};
		double[]test2 = {1.1,4.1,4.2,5.0,2.0,4.0,3.0,17.0,0.0};
		String[]test3 = {"zebra", "tortilla", "abba", "foo", "bar", "aba"};
		
		//Merge sort
		long start = System.nanoTime();
		mergesort(test1);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Insertion sort time: " + time + " nanoseconds.");
		System.out.println(Arrays.toString(test1));
		
		//Partition
		start = System.nanoTime();
		selectionSort(test2);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Selection sort time: " +time + " nanoseconds.");
		System.out.println(Arrays.toString(test2));
		
	
	public static String[] merge(String[] list1, String[] list2)
	{
		//precondition: both lists are sorted.
		String[] f1;
		String[] f2;
		String[] newString;

		//new test
		this.list1[] = list2;
		
				
				
		while(f1 > 0; f2>f2)	
		{
			
		}
		






	}


	public static int partition(int[] list)
	{
		int x;
		String



	}
}
