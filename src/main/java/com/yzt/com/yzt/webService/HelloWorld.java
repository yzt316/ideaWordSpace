package com.yzt.com.yzt.webService;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * 服务接口定义
 */
@WebService
public interface HelloWorld {
	String sayHello(@WebParam(name = "text") String name);
}
