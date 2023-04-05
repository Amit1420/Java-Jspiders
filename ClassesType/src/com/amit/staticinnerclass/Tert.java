package com.amit.staticinnerclass;

import com.amit.staticinnerclass.OuterClass.InnerClass;

public class Tert {

	public static void main(String[] args) {
		OuterClass.InnerClass.innerMethod();
	InnerClass innerClass = new OuterClass.InnerClass();	
	innerClass.nonStaticMethod();
	}

}
