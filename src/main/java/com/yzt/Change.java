package com.yzt;

import com.yzt.com.yzt.vo.Person;

public class Change {

	final static int i = 123;
	static final int j = 456;

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("yzt");
		person.setAge(23);
		change(person);
		System.out.println(person);
		System.exit(0);
	}



	private static void change(Person o){
		o.setName("change");
		o.setAge(666);
	}

	private static void change(int i){
		i++;
	}

	private static void change(String str){
		str+="change";
	}

}
