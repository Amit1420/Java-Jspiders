package com.amit.objectmethodpack.equalspack;

class Ac{
	int temp;

	public Ac(int temp) {
		this.temp = temp;
	}

	@Override
	public String toString() {
		return "AC [temp=" + temp + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Ac))
			return false;
		return this.temp == ((Ac) obj).temp;
	}

}
public class AcTest {

	public static void main(String[] args) {
		
		Ac ac1 = new Ac(25);
		Ac ac2 = new Ac(25);
		System.out.println(ac1);
		System.out.println(ac2);
		System.out.println(ac1==ac2);
		System.out.println(ac1.equals(ac2));

	}

}
