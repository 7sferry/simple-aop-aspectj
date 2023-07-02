package app.vercel.ferry.aop.aspectj.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/************************
 * Made by [MR Ferry™]  *
 * on Juli 2023         *
 ************************/

@Aspect
public class InterceptionConfig{

	@Before("@annotation(interception) && execution(* *(..))")
	public void before(Interception interception){
		System.out.println(interception.printValue());
	}

	@After("@annotation(interception) && execution(* *(..))")
	public void after(Interception interception){
		System.out.println("executed");
	}

	@AfterThrowing("@annotation(interception) && execution(* *(..))")
	public void afterThrowing(Interception interception){
		System.out.println("ada error");
	}

	@AfterReturning("@annotation(interception) && execution(* *(..))")
	public void afterReturning(Interception interception){
		System.out.println("tidak ada error");
		System.out.println();
	}

	@Around("@annotation(interceptionAround) && execution(* *(..))")
	public Object around(ProceedingJoinPoint proceedingJoinPoint, InterceptionAround interceptionAround) throws Throwable{
		System.out.println("kalkulasinya dimulai");
		Object proceed = proceedingJoinPoint.proceed();
		System.out.println("kalkulasinya selesai");
		System.out.println();
		return proceed;
	}

}
