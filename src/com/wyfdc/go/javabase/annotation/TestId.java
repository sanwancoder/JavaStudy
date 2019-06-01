package com.wyfdc.go.javabase.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
/**
   *    方法级别的注解  使用在方法上

 *
 */
public @interface TestId {
	
	public int id();
	
	public String desc() default "no desc";

//	public int id();

}
