package com.github.liuzhengyang.simplerpc.core;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Description:
 *
 * @author liuzhengyang
 * @version 1.0
 * @since 2017-01-10
 */
public class RpcClientWithLBTest {
	@Test
	public void init() throws Exception {
		RpcClientWithLB rpcClientWithLB = new RpcClientWithLB("hello");
		rpcClientWithLB.init();
		IHello iHello = rpcClientWithLB.newProxy(IHello.class);
		iHello.say("hello world");
		iHello.say("hello world");
		iHello.say("hello world");
		iHello.say("hello world");
		iHello.say("hello world");
		iHello.say("hello world");
		iHello.say("hello world");
		iHello.say("hello world");
		iHello.say("hello world");
	}

}