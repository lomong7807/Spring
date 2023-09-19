package ch03.sub3;

import org.springframework.stereotype.Component;

@Component("service2")
public class Service {
	
	
	
	public void insert() {
		System.out.println("Core concern - insert...");
	}
	
	public void select() {
		System.out.println("Core concern - select...");
	}
	
	public void update(int no) {
		System.out.println("Core concern - update...");
	}
	
	public void delete(int seq, String uid) {
		System.out.println("핵심관심 - delete...");
		char ch = uid.charAt(1);
	}
}
