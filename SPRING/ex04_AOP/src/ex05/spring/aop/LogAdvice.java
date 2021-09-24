package ex05.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAdvice {

	public Object around(ProceedingJoinPoint point) throws Throwable {
		String str1 = "실행 전 호출";
		String str2 = "실행 후 호출";
		
		System.out.println(str1);
		
		Object obj = point.proceed();
		
		System.out.println(str2);
		
		return obj;
	}
}
