package com.yzt.com.yzt.webService;

public class HelloWorldImpl implements HelloWorld {
	@Override
	public String sayHello(String name) {
		return "hello text "+name;
	}
}
