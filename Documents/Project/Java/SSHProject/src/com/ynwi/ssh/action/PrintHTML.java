package com.ynwi.ssh.action;

import com.opensymphony.xwork2.ActionSupport;

public class PrintHTML extends ActionSupport {  
	  
    private String html;  
      
    public String getHtml() {  
        return html;  
    }  
  
    public void setHtml(String html) {  
        this.html = html;  
    }  
  
    @Override  
    public String execute() throws Exception {  
  
        html="<table border=2><tr><td>我的名字是:张三</td></tr></table>";  
        return "printhtml";  
    }  
  
}  
