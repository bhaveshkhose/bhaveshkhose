package Exception_Pack;


public class Exception1 {
	
	public static void method1() throws Throwable {
		System.out.println("In the method1");
		method2();
		System.out.println("Method1 exit ");
	}
	public static void method2() throws Throwable {
		System.out.println("In the method2");
		
			try
			{
				method3();
			}
			catch(Exception e){
				
				System.out.println(e);
				
			}
			finally{
				System.out.println("Finallyyyy");
			}
		
		System.out.println("Method 2 exit");
	}
	public static void method3() throws Throwable {
		System.out.println("In the method3");
		int a=0;
		int b=0;
		int c=a/b;
		throw new Throwable("testing throw ");
		
			}
	public static void div(int a , int b) throws ArithmeticException{
		
		
		if(b==0)
			try{int c = a/ b;
	
			}
		catch(ArithmeticException E) {
			System.out.println(E);
		}
		
		else {
			int c=a/b;
			System.out.println(c);
		}
	}
	static void testException1() throws CustomExcep
	{
		//System.out.println(10/0);
		throw new CustomExcep("Just for expri");
		
	}
	static void testException2() throws CustomExcep2
	{
		try {
			
			throw new CustomExcep2("Testing");
			}
		catch(CustomExcep2 e) {
			
			e.addInformation("Exc");
			
			
		}
	}
	
	
	public static void main(String [] args) throws CustomExcep{
		
			try {
				testException1();
			} 
			catch (CustomExcep e) {
								
				System.out.println(e.getLocalizedMessage())	;		
				
			}
			
		
			
	
	
	}
}
