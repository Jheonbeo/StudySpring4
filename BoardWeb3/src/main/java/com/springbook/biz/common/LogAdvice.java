package com.springbook.biz.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class LogAdvice {
	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
	public void allPointcut(){}	//�ش� �Լ��� xml���� ID�� ���� �� 
	@Pointcut("execution(* com.springbook.biz..*Impl.get*(..))")
	public void getPointcut(){}	//�ش� �Լ��� xml���� ID�� ���� �� 
	
	@Before("allPointcut()")
	public void printLog(){
		System.out.println("[���� �α�] ����Ͻ� ���� ���� �� ����");
	}
}
