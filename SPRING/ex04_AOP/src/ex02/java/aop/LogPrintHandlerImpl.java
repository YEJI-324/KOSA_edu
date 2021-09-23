package ex02.java.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class LogPrintHandlerImpl implements InvocationHandler {

	private Object target;
	
	// 객체를 받을 생성자 구현 -> DI
	public LogPrintHandlerImpl(Object target) {
		this.target = target;
	}

	@Override // 보조 관심사를 여기에 작성
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("invoke method start");
		
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		
		log.info("[timer start]");
		
		// 주 관심사
		int result = (int)method.invoke(target, args);
		
		log.info("[timer stop]");
		sw.stop();
		log.info("[Time Log] method : "+ method.getName());
		log.info("[Time Log] Process Time : " + sw.getTotalTimeMillis());
		
		return result;
	}

}
