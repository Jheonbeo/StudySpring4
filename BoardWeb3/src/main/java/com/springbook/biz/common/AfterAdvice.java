package com.springbook.biz.common;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AfterAdvice {
	@After("PointCutCommon.allPointcut()")
	public void afterLog(){
		System.out.println("[���� ó��]����Ͻ� ���� ���� �� ������ ����");
	}
}
