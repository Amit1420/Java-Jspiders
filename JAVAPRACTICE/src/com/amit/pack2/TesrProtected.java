package com.amit.pack2;

import com.amit.pack1.Metro;

class Retro extends Metro{
	@Override
	protected void doSomething()
	{
		super.doSomething();
	}
	
}
public class TesrProtected {

	public static void main(String[] args) {
		
		Retro retro = new Retro();
		retro.doSomething();
	}

}
