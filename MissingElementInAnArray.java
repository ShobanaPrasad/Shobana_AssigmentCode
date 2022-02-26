package assignmts.week1;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,7,6,8,10,14,16};   
		Arrays.sort(arr);
		int count = 1;
for (int i=0; i<=arr.length-1;i++)
{
	if (arr[i]!=i+count)
	{
		System.out.println(i+count);
		count++;
	}
	
}

	}

	
}

