<%@page import="java.util.List"%>
<%@page import="com.springbook.biz.board.BoardVO"%>
<%@page import="com.springbook.biz.impl.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
	<a href="logout.do">Log-out</a><p>
<%
	List<BoardVO> boardList = (List)request.getAttribute("boardList"); //�⺻������ Object Ÿ������ ���ϵ�
%>
<style type="text/css">
body {
	text-align: center;
}

form {
	display: inline-block;
}
</style>
<table border="1">
	<tr>
		<th>��ȣ
		<th>����
		<th>�ۼ���
		<th>�����
		<th>��ȸ��
	</tr>
	<%
		for (BoardVO board : boardList) {
	%>
	<tr>
		<td><%=board.getSeq()%></td>
		<td><a href="getBoard.do?seq=<%=board.getSeq()%>"><%=board.getTitle()%></td>
		<td><%=board.getWriter()%></td>
		<td><%= board.getRegDate() %></td>
		<td><%= board.getCnt() %></td>
	</tr>
	<%
		}
	%>
</table>