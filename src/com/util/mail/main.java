package com.util.mail;

import java.util.ArrayList;
import java.util.List;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args){ 
		
		List<String> toAddress =  new ArrayList<String>();
		List<String> ccAddress = new ArrayList<String>();

	         //这个类主要是设置邮件  
		 //String[] a = {"baiyixiushi@iflyun.com","793541110@qq.com","739269544@qq.com","1161629819@qq.com","793541110@qq.com"};
	      MailSenderInfo mailInfo = null;   
	      //for(int i=0;i<a.length;i++){
	    	  mailInfo = new MailSenderInfo();
	      
//	      mailInfo.setMailServerHost("smtp.qq.com");   
//	      mailInfo.setMailServerPort("587");   
//	      mailInfo.setValidate(true);   
//	      mailInfo.setUserName("1240472382@qq.com");   
//	      mailInfo.setPassword("wxl820306112.");//您的邮箱密码   
//	      mailInfo.setFromAddress("1240472382@qq.com"); 
	    	  mailInfo.setMailServerHost("smtp.163.com");
	    	  mailInfo.setMailServerPort("25"); 
	    	  mailInfo.setValidate(true);  
	    	  mailInfo.setUserName("jinson_88@163.com");   
		      mailInfo.setPassword("jinson8237481");//您的邮箱密码   
		      mailInfo.setFromAddress("jinson_88@163.com");
	      toAddress.add("xinyuehu@iflyun.com");
	      //ccAddress.add("baiyixiushi@iflyun.com");
	      ccAddress.add("1240472382@qq.com");
	      mailInfo.setToAddress1(toAddress);
	      mailInfo.setCcAddress(ccAddress);
	      //mailInfo.setToAddress(a[i]);   
	      mailInfo.setSubject("数据未及时更新");   
	      mailInfo.setContent("数据未更新。。。。");   
	         //这个类主要来发送邮件  
	      SimpleMailSender sms = new SimpleMailSender();  
	          sms.sendTextMail(mailInfo);//发送文体格式   
	          System.out.println("发送成功");
	          //sms.sendHtmlMail(mailInfo);//发送html格式  
	    //}
	} 
}
