package returntype;

public class ReturnTypeWithParameter {
	
	public int demo1(int num1, int num2) {
		int sum  =num1+num2;
		System.out.println("The total is: "+sum);
		System.out.println("************************************************************");
		return sum;
	}
	
	public String demo2(String classes, String course) {
	
		System.out.println("Mahmud's Job is teaching " + classes+ " ,and currently students are learning " + course);
		System.out.println("************************************************************");
		return classes; 
	}
	public double demo3(double num1, double num2, double num3) {
		double average=(num1+num2+num3)/3;
		System.out.println("The average is: "+ average);
		System.out.println("************************************************************");
	
		return average; 
	}

public String demo4 (String Juice, int value) {
	
	System.out.println("The "+ Juice +" Juice cost is " + value+ "$");
	System.out.println("************************************************************");
	return Juice; 
	
	}

public String demo5 (int num1, int num2, String operation ) {
	
	System.out.println("A "+num1 +" + "+ num2 + " is called the "+ operation );
	
	return operation; 
}
	
	public static void main(String[] args) {
		ReturnTypeWithParameter obj=new ReturnTypeWithParameter();
		obj.demo1(32, 38);
	    obj.demo2("QA", "JAVA");
	    obj.demo3(26, 838, 8383);
	    obj.demo4("Orange", 3);
	    obj.demo5(12, 25, "Addition");
	    
	    
	    
	
		
		
		
	}

}
