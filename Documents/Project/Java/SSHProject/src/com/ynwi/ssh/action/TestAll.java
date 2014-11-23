package com.ynwi.ssh.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ynwi.ssh.service.TestBean;

public class TestAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 获取UserBean的实例
		TestBean bean = (TestBean) ctx.getBean("TestImpl"); // 调用方法
		// bean.show();
		System.out.print(bean.show());
	}

}
