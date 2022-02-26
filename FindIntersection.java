package assignmts.week1;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3,2,11,8,6,7};
		Arrays.sort(a);
		int b[] = {1,2,8,11,9,7};
		Arrays.sort(b);
		for (int i=0; i<a.length;i++)
		{
			for (int j=0;j<b.length;j++)
				{
				if (a[i]==b[j])
					
				System.out.println(b[j]);
				}
				}
	}

}
