package app.vercel.ferry.aop.aspectj.example;

/************************
 * Made by [MR Ferry™]  *
 * on Juli 2023         *
 ************************/

public class Calculator{

	@Interception(printValue = "penambahan")
	public int add(int x, int y){
		int result = x + y;
		System.out.println("x + y = " + result);
		return result;
	}

	@Interception(printValue = "pengurangan")
	public int subtract(int x, int y){
		int result = x - y;
		System.out.println("x - y = " + result);
		return result;
	}

	@Interception(printValue = "pembagian")
	public int divide(int x, int y){
		int result = x / y;
		System.out.println("x - y = " + result);
		return result;
	}

	@InterceptionAround
	public int multiply(int x, int y){
		int result = x * y;
		System.out.println("x * y = " + result);
		return result;
	}

}
