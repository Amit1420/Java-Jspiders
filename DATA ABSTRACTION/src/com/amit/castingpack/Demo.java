package com.amit.castingpack;

/*Can we have non-static data members in abstract class ? -->YES
 *Can we have static data members in abstract class ? -->YES
 *Can we have final non-static data members in abstract class ? -->YES
 *Can we have final static data members in abstract class ? -->YES
 *Can we have blocks in abstract class ? -->YES
 *Can we have private methods in abstract class ? -->YES
 *Can we have static methods in abstract class ?-->YES
 *Can we have final methods in abstract class ? -->YES
 *Can we declare abstract method private ? -->NO  
 *Can we declare abstract method static ?  -->NO
 *Can we declare abstract method final?    -->NO
 *The subclass usually provides implementations for all of the abstract methods in its parent class. 
 *However, if it does not, then the subclass must also be declared abstract.
 *A method defined abstract must always be redefined in the subclass, thus making overriding compulsory OR either make subclass itself abstract.
 **/
 

abstract class A{ 
	int b;
	static int a;
	final static int x;
	final int y;
	{   y=10;
	    System.out.println("y : "+y);
	    b=25;
	    System.out.println("b : "+b);
		System.out.println("Non static block");
	}
	static {
		x=20;
		System.out.println("x : "+x);
		a=35;
	    System.out.println("a : "+a);
		System.out.println("static block");
		
	}
	public void m1()
	{
		System.out.println("m1() defined for class A");	
		m();
		m5();
	}
     private void m()
     {
    	 System.out.println("Private Method");
     }
     static void m5()
     {
    	 System.out.println("Static Method");
     }
     final void m6()
     {
    	 System.out.println("Final Method");
     }
	 public abstract void m2();
	 public abstract void m3();
//	 public abstract void m7();
}
class B extends A{
	@Override
	public void m2()
	{
		System.out.println("m2() defined for class B ");
	}
	@Override
	public void m3()
	{
		System.out.println("m3() defined for class B ");
	}
	public void m4()
	{
		System.out.println("m4() defined for class B ");
	}
	
}
public class Demo {

	public static void main(String[] args) {
		A a=new B();
		a.m1();
		a.m2();
		a.m3();
		((B)a).m4();
		a.m6();
		
	}

}
