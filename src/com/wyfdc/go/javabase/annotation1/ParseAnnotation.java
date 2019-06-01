package com.wyfdc.go.javabase.annotation1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ParseAnnotation {
	
	public static void parseAnnotationOnClassLevel() throws ClassNotFoundException {
		Class<TestAnnotation> clazz = (Class<TestAnnotation>) Class.forName("com.wyfdc.go.javabase.annotation1.TestAnnotation");
		Annotation[] annotations = clazz.getAnnotations();
		for(Annotation testa:annotations) {
			TestA a = (TestA)testa;
			String s = String.format("Class: %d ,name: %5s, gid:%3s", a.id(),a.name(),a.gid());
			System.out.println(s);
		}
	}

	
	public static void parseAnnotationOnMethodLevel() throws ClassNotFoundException {
		Class<TestAnnotation> clazz = (Class<TestAnnotation>) Class.forName("com.wyfdc.go.javabase.annotation1.TestAnnotation");
		
		Method[] methods = clazz.getDeclaredMethods();
		
		for(Method m:methods) {
			boolean bool = m.isAnnotationPresent(TestA.class);
			if(bool) {
				Annotation[] annotations = m.getAnnotations();
				for(Annotation aa: annotations) {
					TestA a = (TestA)aa;
					String s = String.format("method: %s, id: %d ,name: %5s, gid:%3s", m.getName(),a.id(),a.name(),a.gid());
					System.out.println(s);
				}
			}
		}
		
		
		
	}
	
	public static void parseAnnotationOnFieldLevel() throws ClassNotFoundException {
		Class<TestAnnotation> clazz = (Class<TestAnnotation>) Class.forName("com.wyfdc.go.javabase.annotation1.TestAnnotation");
		
		Field[] fields = clazz.getFields();
		
		for(Field m:fields) {
			boolean bool = m.isAnnotationPresent(TestA.class);
			if(bool) {
				Annotation[] annotations = m.getAnnotationsByType(TestA.class);
				for(Annotation aa: annotations) {
					TestA a = (TestA)aa;
					String s = String.format("Field: %s, id: %d ,name: %5s, gid:%3s", m.getName(),a.id(),a.name(),a.gid());
					System.out.println(s);
				}
			}
		}
		
		
		
	}
	
	public static void parseAnnotationOnConstructorLevel() throws ClassNotFoundException {
		Class clazz = Class.forName("com.wyfdc.go.javabase.annotation1.TestAnnotation");
		
		Constructor<TestAnnotation>[]  constructors = clazz.getConstructors();
		
		for(Constructor<TestAnnotation> cc:constructors) {
			boolean bool = cc.isAnnotationPresent(TestA.class);
			if(bool) {
				Annotation[] annotations = cc.getAnnotationsByType(TestA.class);
				for(Annotation aa: annotations) {
					TestA a = (TestA)aa;
					String s = String.format("Constructor: %s, id: %d ,name: %5s, gid:%3s", cc.getName(),a.id(),a.name(),a.gid());
					System.out.println(s);
				}
			}
		}
		
		
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		ParseAnnotation.parseAnnotationOnClassLevel();
		System.out.println("\n\n");
		ParseAnnotation.parseAnnotationOnMethodLevel();
		System.out.println("\n\n");
		ParseAnnotation.parseAnnotationOnFieldLevel();
		System.out.println("\n\n");
		ParseAnnotation.parseAnnotationOnConstructorLevel();
	}

}
