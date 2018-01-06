package com.yzt.com.yzt.webService.publishApp;

import com.yzt.com.yzt.webService.HelloWorld;
import com.yzt.com.yzt.webService.HelloWorldImpl;

import javax.xml.ws.Endpoint;

/**
 * 发布服务
 */
public class PublishApp {
	public static void main(String[] args) {
		System.out.println("===============发布自己的webService==============");
		HelloWorld hello = new HelloWorldImpl();
		String url = "http://localhost:8080/helloWorld";
		Endpoint.publish(url,hello);
		System.out.println("==================服务启动========================");
	}
}
