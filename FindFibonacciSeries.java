package assignmts.week1;

public class FindFibonacciSeries {

	public static void main(String[] args) {
		
		int range = 8, firstNum = 0, secNum = 1;

		System.out.print(firstNum+ ", "+secNum+ ", ");			
		
		for(int i=2; i<range; i++)
		{
			int sum = firstNum + secNum;
			System.out.print(sum+ ", ");
			firstNum=secNum;
			secNum=sum;
			
		}
		
		
}

}
