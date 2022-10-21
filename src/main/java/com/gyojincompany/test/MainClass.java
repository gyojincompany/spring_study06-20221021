package com.gyojincompany.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String configLocation1 = "classpath:applicationCTX1.xml";
		String configLocation2 = "classpath:applicationCTX2.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation1,configLocation2);
		
		Student student1 = ctx.getBean("student1", Student.class);
		System.out.println(student1.getName());//홍길동
		System.out.println(student1.getAge());//30
		System.out.println(student1.getHobbys());//[운동, 노래, 게임]
		System.out.println(student1.getHeight());//180
		System.out.println(student1.getWeight());//80
		
		StudentInfo studentInfo = ctx.getBean("studentInfo1", StudentInfo.class);
		Student studentHong = studentInfo.getStudent();
		
		System.out.println("-------------------------------");
		
		System.out.println(studentHong.getName());
		
		if(student1.equals(studentHong)) {
			System.out.println("student1과 studentHong은 같은 객체입니다.");
		} else {
			System.out.println("student1과 studentHong은 다른 객체입니다.");
		}
		
		Student student2 = ctx.getBean("student2", Student.class);
		System.out.println(student2.getName());//김유신
		System.out.println(student2.getAge());//23
		System.out.println(student2.getHobbys());//[영화, 체육, 야구]
		System.out.println(student2.getHeight());//176
		System.out.println(student2.getWeight());//83
		
		
		
		ctx.close();

	}

}
