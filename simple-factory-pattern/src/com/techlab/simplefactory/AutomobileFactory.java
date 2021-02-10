package com.techlab.simplefactory;

public class AutomobileFactory {
	public IAutoMobile make(AutoType type) {
		if(type==AutoType.AUDI) {
			return new Audi();
		}
		if(type==AutoType.BMW) {
			return new BMW();
		}
		return new Tesla();
	}

}
