package com.student;

class Manger extends Student1 {	//班长，测试同一包内子类的权限控制
	void getStudentInformation() {
		System.out.println("name is" + studentName);
		System.out.println("age is" + studentAge);
		//System.out.println("account is" + studentAccount);
		System.out.println("addr is" + studentAddr);
	}

}
