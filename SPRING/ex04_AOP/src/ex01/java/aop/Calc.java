package ex01.java.aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class Calc {
	// 사칙연산 계산
	
	// 주관심사 : 계산(add, mul)
	// 보조관심사 : 계산에 걸린 시간(add, mul 실행시간)
	//		   : add 시작되고 계산이 끝나는 시점까지 걸린 시간
	//		   : 보조관심사 결과 log 출력
	
	public int add(int x, int y) {
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		
		log.info("[timer start]");
		// 실제 작업
		int result = x + y; 
		
		sw.stop();
		log.info("[timer stop]");
		log.info("[Time Log] method : add");
		log.info("[Time Log] Process Time : " + sw.getTotalTimeMillis());
		
		return result;
	}
	
	public int mul(int x, int y) {
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		
		log.info("[timer start]");
		// 실제 작업
		int result = x * y; 
		
		sw.stop();
		log.info("[timer stop]");
		log.info("[Time Log] method : mul");
		log.info("[Time Log] Process Time : " + sw.getTotalTimeMillis());
		
		return result;
	}
}
