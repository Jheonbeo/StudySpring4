<%@page import="com.springbook.biz.impl.BoardDAO"%>
<%@page import="com.springbook.biz.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
	BoardVO board = (BoardVO)request.getAttribute("board");
%>
<form action="updateBoard.do" method="post">
<input name="seq" type="hidden" value="${board.seq}"/>
<table border="1">
	<tr>
		<td>����</td>
		<td><input type="text" value="${board.title}" name="title"></td>
	</tr>
	<tr>
		<td>�ۼ���</td>
		<td>${board.writer}</td>
	</tr>
	<tr>
		<td>����</td>
		<td><input type="text" value="${board.content}" name="content"></td>
	</tr>
	<tr>
		<td>�����</td>
		<td>${board.regDate}</td>
	</tr>
	<tr>
		<td>��ȸ��</td>
		<td>${board.cnt}</td>
	</tr>
	<tr><td colspan="2"><input type="submit" value="�� ����"></td></tr>
</table>
</form>
<a href="InsertBoard.jsp">�� ���</a>&nbsp;&nbsp;&nbsp;
<a href="deleteBoard.do?seq=<%=board.getSeq() %>">�� ����</a>&nbsp;&nbsp;&nbsp;
<a href="getBoardList.do">�� ���</a>&nbsp;&nbsp;&nbsp;