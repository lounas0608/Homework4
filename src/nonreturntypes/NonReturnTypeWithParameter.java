package nonreturntypes;

public class NonReturnTypeWithParameter {
	
	public static void demo1 (String car , int Price ) {

			System.out.println("The value of " + car + " is " + Price + "$");
		System.out.println("========================================");
	}
	
	public static void demo2 (double num1, double num2) {
		double avg=(num1+num2)/2;
		System.out.println("The average is "+avg);
		System.out.println("========================================");
				}
	
	public static void demo3 (String name, int age, int lastfour) {
		System.out.println("The named "+ name + " is "+ age+ " years old, and his last four is "+ lastfour );
		System.out.println("========================================");
			}
	
	
	public static void demo4 (double num1, double num2, double num3, double num4) {
		double avg=(num1+num2+num3+num4)/4;
		System.out.println("The average is: "+avg);
		
		System.out.println("========================================");
		
	}
	public static void demo5 (String Salary, int num) {
		System.out.println(" My "+ Salary + " after deduction is:"+ num);
		
		
	}
	
	public static void main(String[] args) {
	
		NonReturnTypeWithParameter.demo1("2018 Honda CRV ", 26000);
		NonReturnTypeWithParameter.demo2(40, 20);
		NonReturnTypeWithParameter.demo3("Jhon", 33, 1234);
		NonReturnTypeWithParameter.demo4(77, 90, 45, 76);
		NonReturnTypeWithParameter.demo5("Salary", 3740);
		
		
		
	}

}
