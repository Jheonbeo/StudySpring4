package com.springbook.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AroundAdvice {
	@Around("PointCutCommon.allPointcut()")
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("[BEFORE] : ����Ͻ� �żҵ� ���� ���� ó���� ����..");
		Object returnObj = pjp.proceed(); 	//����Ͻ� �޼ҵ� ȣ��
		System.out.println("[AFTER] : ����Ͻ� �żҵ� ���� �Ŀ� ó���� ����..");
		return returnObj;
	}
}
