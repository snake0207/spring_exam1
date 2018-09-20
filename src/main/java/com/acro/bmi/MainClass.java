package com.acro.bmi;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cfg = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(cfg);
		MyInfo myinfo = ctx.getBean("myInfo", MyInfo.class);
		
		myinfo.getInfo();
		ctx.close();
	}

}
