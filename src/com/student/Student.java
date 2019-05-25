package com.student;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 zhangGang = new Student1(19, "山西太原", "张刚", 350);
		Teacher missLiu = new Teacher(35, "北京", "刘老师", 2000, "102198");
		missLiu.question(zhangGang);

	}

}
