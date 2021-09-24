package ex04.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

// XML 기반 POJO 방식의 AspectJ를 이용한 AOP 방법
public class LogAdvice {
	// Around 방식의 사전/사후 처리 AOP around 방식으로 할 때는
	// 인수는 ProceedingJoinPoint, 리턴 - Object 필수
	
	public Object around(ProceedingJoinPoint point) throws Throwable { // point.proceed() 의 예외처리
		
		String methodName = point.getKind();
		String methodName2 = point.getSignature().getName();
		
		System.out.println("[Log ] methodName = " + methodName + ", methodName2 = " + methodName2 + " 호출되기 전.");
		
		StopWatch sw = new StopWatch();
		sw.start(methodName);
		
		Object result = point.proceed();
		
		sw.stop();
		System.out.println("[Log ] " + methodName + " 호출 환료.");
		System.out.println("[Log ] 실행 시간 : " + sw.getTotalTimeMillis()/100 + " 초");
		
		return result;
	}
}
