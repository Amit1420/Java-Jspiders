package com.amit.cardevelopment;

class Engine{
	String engNo;
	int hp;
	int yom;
	
	public Engine(String engNo, int hp, int yom) {
		this.engNo = engNo;
		this.hp = hp;
		this.yom = yom;
	}

	@Override
	public String toString() {
		return "Engine [engNo=" + engNo + ", hp=" + hp + ", yom=" + yom + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Engine)) return false;
		Engine eng=(Engine) obj;
		return this.engNo.equals(eng.engNo) && this.hp==eng.hp && this.yom==eng.yom;
		
	}
	
	

}
