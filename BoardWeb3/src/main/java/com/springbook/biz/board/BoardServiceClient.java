	package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		BoardService boardSerivce = (BoardService)container.getBean("boardSerivce"); //getBean�� ������ object�� ��ȯ
		
		//vo ��ü�� presentation -> biz -> persist 3Layer ��� �Դٰ��� �ؼ� data transfer object�� �ǹ��ΰ� DTO 
		BoardVO vo = new BoardVO();
		vo.setSeq(100);
		vo.setTitle("�ӽ� ����");
		vo.setWriter("ȫ�浿");
		vo.setContent("�ӽ� ����..");
		boardSerivce.insertBoard(vo);
		
		List<BoardVO> boardList = boardSerivce.getBoardList(vo);
		for(BoardVO board : boardList){
			System.out.println("---> " + board.toString());
		}
		container.close();
	}

}
