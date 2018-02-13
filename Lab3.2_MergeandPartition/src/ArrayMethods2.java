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
		int x = 0;
		int y = 0;
		int z = 0;
		
		String[] fin = new String[list1.length + list2.length];
		
		//if both lists are still not finished sorting
		while((x < list1.length) && (y < list2.length))
		{
			if(list1[x].compareTo(list2[y]) > 0)
			{
				fin[z] = list2[y];
				
				y++;
				z++;
			}
			else if(list2[y].compareTo(list1[x]) > 0)
			{
				fin[z] = list1[x];
				
				x++;
				z++;
			}
		}
		//keep track of the array
		while(x < list1.length)
		{
			fin[z] = list1[x];
			
			x++;
			z++;
		}
		while(y < list2.length)
		{
			fin[z] = list2[x];
			
			y++;
			z++;
		}
		return fin;
	}


	public static int partition(int[] list)
	{
		int x = 0;
		int y = list.length - 1;
		int z = 0;
		int aa = 0;
		
		while(x != y)
		{
			//two sides of array
			if(list[x] > list[y] && (x < y))
			{
				swap(list, x, y);
				
				z = x;
				x = y;
				y = z + 1;
			}
			else if((list[x] < list[y]) && (x > y))
			{
				swap(list, x, y);
				
				z = x;
				x = y;
				y = z - 1;
			}
			else if(x > y)
			{
				y++;
			}
			else if(x < y)
			{
				y--;
			}
		}
		return x;
	}
	
	//helper method to swap items
	public static void swap(int[] list, int in, int in2)
	{
		int n = list[in];
		list[in] = list[in2];
		list[in2] = n;
	}
}
