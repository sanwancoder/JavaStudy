package com.wyfdc.go.javabase.annotation1;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.CONSTRUCTOR,
	ElementType.METHOD,ElementType.TYPE})
@Inherited
@Documented
public @interface TestA {
	
	public int id();
	
	public String name() default "xiaoming";

	public Class<Long> gid();
}
