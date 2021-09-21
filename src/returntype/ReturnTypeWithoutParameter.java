package returntype;

public class ReturnTypeWithoutParameter {

	public int demo1() {
		int num1=300;
		int num2=177;
		int sum  =num1+num2;
		System.out.println("The total is: " +sum);
		System.out.println("========================================");
		return sum;
	}
	
	public String demo2() {
		String car="Mercedes";
		int value= 77000;
		
		System.out.println("The value of " + car + " is "+ value +"$ " );	
		System.out.println("========================================");
		return car; 
	}
	
	public double demo3() {
		double Length=45;
		double Width=77;
		double surface= Length*Width;
		
		System.out.println("The surface of the rectangle is: " + surface);
		System.out.println("========================================");
		
		return surface;
	}
	
	public int demo4() {
		int num1=98;
		int num2=35;
		int num3=64;
		int average= (num1+num2+num3)/3;
		
		System.out.println("The average is: "+ average);
		System.out.println("========================================");
		
		return average; 
	}
	
	public String demo5() {
		String cellphone="Iphone 13";
		int value= 999;
		System.out.println("Basics " + cellphone + " prices starting from: "+ value + "$");		
		
		return cellphone;
	}
	public static void main(String[] args) {
		ReturnTypeWithoutParameter obj1=new ReturnTypeWithoutParameter();
		obj1.demo1();
		obj1.demo2();
		obj1.demo3();
		obj1.demo4();
		obj1.demo5();
		
		
	}
}

