package com.yzt.com.yzt.webService.client;

import com.yzt.com.yzt.webService.HelloWorld;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * 服务访问客户端
 */
public class HelloClient {
	public static void main(String[] args) {
		JaxWsProxyFactoryBean jwpfb = new JaxWsProxyFactoryBean();
		jwpfb.setServiceClass(HelloWorld.class);
		jwpfb.setAddress("http://localhost:8080/helloWorld");
		HelloWorld helloWorld = (HelloWorld)jwpfb.create();
		String res = helloWorld.sayHello("webService服务");
		System.out.println(res);
	}
}
