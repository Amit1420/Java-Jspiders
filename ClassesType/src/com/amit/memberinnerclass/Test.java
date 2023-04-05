package com.amit.memberinnerclass;
                                    
public class Test {

	public static void main(String[] args) {
		OuterClass oc1 = new OuterClass();
		oc1.value();
		OuterClass.InnerClass ic1 =oc1.new InnerClass();
		ic1.innerMethod();

	}

}
