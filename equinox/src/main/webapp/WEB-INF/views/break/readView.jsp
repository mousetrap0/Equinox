<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
	<head>
		<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	 	<title>게시판</title>
	</head>
	
	<script type="text/javascript">
		$(document).ready(function(){
			var formObj = $("form[name='readForm']");
			
			// 수정 
			$(".update_btn").on("click", function(){
				formObj.attr("action", "/break/updateView");
				formObj.attr("method", "get");
				formObj.submit();				
			})
			
			// 삭제
			$(".delete_btn").on("click", function(){
				
				var deleteYN = confirm("삭제하시겠습니가?");
				if(deleteYN == true){
					
				formObj.attr("action", "/break/delete");
				formObj.attr("method", "post");
				formObj.submit();
					
				}
			})
			
			// 취소
			$(".list_btn").on("click", function(){
				
				location.href = "/break/list";
			})
		})
	</script>
	
	<body>
	
		<div id="root">
			<header>
				<h1> 게시판</h1>
			</header>
			<hr />
			<div>
				<%@include file="nav.jsp" %>
			</div>
			<hr />
			
			<section id="container">
				<form name="readForm" role="form" method="post">
					<input type="hidden" id="breakId" name="breakId" value="${read.breakId}" />
				</form>
				<table>
					<tbody>
						<tr>
							<td>
								<label for="lineId">Line_ID</label><input type="text" id="lineId" name="lineId" value="${read.lineId}" readonly="readonly" />
							</td>
						</tr>	
						<tr>
							<td>
								<label for="notifyTime">Notify_Time</label><textarea id="notifyTime" name="notifyTime" readonly="readonly"><c:out value="${read.notifyTime}" /></textarea>
							</td>
						</tr>
						<tr>
							<td>
								<label for="createUser">작성자</label><input type="text" id="createUser" name="createUser" value="${read.createUser}"  readonly="readonly"/>
							</td>
						</tr>
						<tr>
							<td>
								<label for="createTime">작성날짜</label>
								<fmt:formatDate value="${read.createTime}" pattern="yyyy-MM-dd" />					
							</td>
						</tr>		
					</tbody>			
				</table>
				<div>
					<button type="submit" class="update_btn">수정</button>
					<button type="submit" class="delete_btn">삭제</button>
					<button type="submit" class="list_btn">목록</button>	
				</div>
			</section>
			<hr />
		</div>
	</body>
</html>