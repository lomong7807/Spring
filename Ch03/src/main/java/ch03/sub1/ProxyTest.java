package ch03.sub1;

/*
 * 날짜 : 2023/09/19
 * 이름 : 강윤수
 * 내용 : Proxy기반 AOP 실습
 */

public class ProxyTest {
	public static void main(String[] args) {
		
		// target = targetImpl
		Target target = new TargetImpl();
		//proxy = TargetProxy(targetImpl)
		Target proxy = new TargetProxy(target);
		
		proxy.doBusiness();
	}
}
