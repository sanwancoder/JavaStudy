package com.wyfdc.go.javabase.annotation1;

@TestA(id = 0,name = "TestAnnotation",gid=Long.class)
public class TestAnnotation {
	
	@TestA(id = 1,name = "hello",gid=Long.class)
	public Integer i;
	
	@TestA(id=2,name = "bye",gid=Long.class)
	public TestAnnotation() {
		System.out.println("bye");
	}

	@TestA(id=3,name="hi",gid=Long.class)
	public  void sayHi() {
		System.out.println("hi");
	}

	@TestA(id=4,name="a",gid=Long.class)
	protected void a() {
		System.out.println("a");
	}
	
	@TestA(id=5,name="a",gid=Long.class)
	private void b() {
		System.out.println("b");
	}

}
