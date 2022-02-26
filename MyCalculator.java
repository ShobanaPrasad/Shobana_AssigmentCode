package assignmts.week1;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator obj = new Calculator ();
		obj.add();
		System.out.println("The sum of number:" +obj.add());
		obj.sub();
		System.out.println("The sub of number:" +obj.sub());
		obj.mul();
		System.out.println("The mul of number:" +obj.mul());		
		obj.divide();
		System.out.println("The divide of number:" +obj.divide());

	}

}
