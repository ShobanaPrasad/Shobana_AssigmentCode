package assignmts.week1;

public class FindSumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int digit, number = 123, sum = 0;
		while (number>0)
		{
			digit = number%10;
					//System.out.println(digit);
					
					sum = sum+digit;
					//System.out.println(sum);
					
					number = number/10;
					//System.out.println(number);
		}
		System.out.println("Sum of digits:" +sum);
		
	}

}
