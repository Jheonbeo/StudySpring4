package com.springbook.biz.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		UserService userSerivce = (UserService)container.getBean("userSerivce"); //getBean�� ������ object�� ��ȯ
		
		//vo ��ü�� presentation -> biz -> persist 3Layer ��� �Դٰ��� �ؼ� data transfer object�� �ǹ��ΰ� DTO 
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("test123");
		
		UserVO user = userSerivce.getUser(vo);
		if(user != null){
			System.out.println(user.getName() + "�� ȯ���մϴ�.");
		}
		else{
			 System.out.println("�α��� ����");
		}
		container.close();
	}

}
