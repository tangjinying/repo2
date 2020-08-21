package com.hgy.annodemo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * 简单测试框架
 * @author 28319
 *
 */
public class TestCheck {
	public static void main(String[] args) throws IOException {
		Calculator c = new Calculator();
		//获取字节码文件
		Class clazz = c.getClass();
		
		int number = 0;
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("bug.txt")));
		//获取所有方法
		Method[] methods = clazz.getMethods();
		for (Method method : methods) {
			//判断方法是否有Cheak注解
			if(method.isAnnotationPresent(Check.class)) {
				try {
					method.invoke(c);
				} catch (Exception e) {
					number++;
					bw.write(method.getName()+"方法出现异常");
					bw.newLine();
					bw.write("异常的名称："+e.getCause().getClass().getSimpleName());
					bw.newLine();
					bw.write("异常的原因："+e.getCause().getMessage());
					bw.newLine();
					bw.write("------------------");
					bw.newLine();
				}
			}
		}
		bw.write("本次一共出现"+number+"次异常");
		bw.flush();
		bw.close();
	}
}
