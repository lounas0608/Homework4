package nonreturntypes;

public class NonReturnTypeWithoutParameter {
	
	public static void demo1() {
		
		System.out.println("Practice 1");
		System.out.println("========================================");
	}
	
	public static void demo2() {
		
		System.out.println("Let me test this method");
		System.out.println("========================================");
	}
	
	public static void demo3() {
		
		int age=70;
		System.out.println("My daddy's age is " + age);
		System.out.println("========================================");
	}
	
	public static void demo4() {
		
		int num1=30;
		int num2=77;
		int avg=(num1+num2)/2;
		System.out.println("The average of 30 and 77 is " + avg);
		System.out.println("========================================");
	}
	
	public static void demo5() {
		
		String name="Mahmud";
		
		System.out.println("I am return this homework to" + " "+ name);
		
			}
	
	public static void main(String[] args) {
		
		NonReturnTypeWithoutParameter.demo1();
		NonReturnTypeWithoutParameter.demo2();
		NonReturnTypeWithoutParameter.demo3();
		NonReturnTypeWithoutParameter.demo4();
		NonReturnTypeWithoutParameter.demo5();
	}

}
