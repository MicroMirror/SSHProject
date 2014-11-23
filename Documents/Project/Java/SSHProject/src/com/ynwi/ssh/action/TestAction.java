package com.ynwi.ssh.action;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;
import com.ynwi.ssh.service.TestBean;

public class TestAction extends ActionSupport {
	private String html;  
    
    public String getHtml() {  
        return html;  
    }  
  
    public void setHtml(String html) {  
        this.html = html;  
    }  

	@Override
	public String execute() throws Exception {
		// 读取配置文件

		html = exeTest();
		return "testhtml";

	}

	public String exeTest() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 获取UserBean的实例
		TestBean bean = (TestBean) ctx.getBean("TestImpl"); // 调用方法
		// bean.show();
		return bean.show();
	}

}
