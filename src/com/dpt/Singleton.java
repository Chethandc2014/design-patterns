package com.dpt;

public class Singleton {
	
	private static  Singleton singleton;

	private Singleton() {
		
	}
	
	public static Singleton getSingleInstance() {
		if(singleton!=null) {
			return singleton;
		}else {
			return new Singleton();
		}
	}

}
