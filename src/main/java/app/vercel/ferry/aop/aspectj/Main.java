package app.vercel.ferry.aop.aspectj;

import app.vercel.ferry.aop.aspectj.example.Calculator;

/************************
 * Made by [MR Ferry™]  *
 * on Juli 2023         *
 ************************/

public class Main{
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add(2, 1);
		calculator.subtract(2, 1);
		calculator.multiply(2, 1);
		calculator.divide(2, 0);
	}
}
