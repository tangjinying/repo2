package com.hgy.anno;
@pro(className = "com.hgy.anno.Worker",methodName = "show")
public class ReflectTest {
	public static void main(String[] args) {
		Class<ReflectTest> ReflectTestClass = ReflectTest.class;
		pro an = ReflectTestClass.getAnnotation(pro.class);
		String className = an.className();
		String methodName = an.methodName();
		System.out.println(className);
		System.out.println(methodName);
	}
}
