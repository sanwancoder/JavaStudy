package com.wyfdc.go.javabase.annotation;

import java.lang.reflect.Method;

public class TestAnnotation {
	
	@TestId(id = 1,desc = "hello")
	public void sayHello() {
		System.out.println("hello");
	}
	
	@TestId(id=2,desc = "bye")
	public void sayBye() {
		System.out.println("bye");
	}

	public  void sayHey() {
		System.out.println("hey");
	}

	@TestId(id=3)
	public  void sayHi() {
		System.out.println("hi");
	}
	
	public static <T> void main(String[] args) {
		
		Method[] methods = TestAnnotation.class.getDeclaredMethods();
		
		for(Method method: methods){
			
			boolean bool = method.isAnnotationPresent(TestId.class);
			
			if(bool) {
				
				TestId[] annotations = method.getAnnotationsByType(TestId.class);
				
//				TestId ano = method.getAnnotation(annotationClass);
								
				 System.out.println("method name = " + method.getName() + "  |  id = " +
	                        annotations[0].id() + "  |  description = " + annotations[0].desc());
			}
			
		}

	}

}
