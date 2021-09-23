package ex03.spring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class LogPrintHandlerImpl implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("invoke method start");
		
		// 보조 업무 구현
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		
		log.info("[timer start]");
		
		//////////////////////////////////
		// 주 관심사
		Object result = invocation.proceed();
		//////////////////////////////////
		
		log.info("[timer stop]");
		sw.stop();
		log.info("[Time Log] method : "+ invocation.getMethod()); // 실행한 메소드 명칭 보여줌.
		log.info("[Time Log] Process Time : " + sw.getTotalTimeMillis());
		
		return result;
	}

}
