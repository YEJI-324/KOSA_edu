package quiz;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAdvice {
	
	public Object around(ProceedingJoinPoint point) throws Throwable {
		
		System.out.println("before point.proceed()");
		
		Object result = point.proceed();

		System.out.println("after point.proceed()");
		
		return result;
	}
}
