<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 

<html>
	<head>
	<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function(){
			var formObj = $("form[name='writeForm']");
			$('#write_btn').on("click", function(){
				if(fn_valiChk()){
					return false;
				}
				
				var notifyToKt = $('#notifyToKtYn').is(':checked');
				if(notifyToKt){
					$('#notifyToKtYn').value='Y';
				}
				else{
					$('#notifyToKtYn').value='N'
				}
				
				document.getElementById('breakTime').value= 
					document.getElementById('breakTime').toISOString().slice(0, -1);
				document.getElementById('breakTime').value= 
					document.getElementById('breakTime').toISOString().slice(0, -1);
				
				document.getElementById('breakTime').value= 
					document.getElementById('breakTime').toISOString().slice(0, -1);
				
				
				
				formObj.attr("action", "/break/write");
				formObj.attr("method", "post");
				formObj.submit();
			});
		})
		function fn_valiChk(){
			var regForm = $("form[name='writeForm'] .chk").length;
			for(var i = 0; i<regForm; i++){
				if($(".chk").eq(i).val() == "" || $(".chk").eq(i).val() == null){
					alert($(".chk").eq(i).attr("title"));
					return true;
				}
			}
		}
	</script>
	 	<title>게시판</title>
	</head>
		
	<body>
	
		<div id="root">
			<header>
				<h1>Break 게시판</h1>
			</header>
			<hr />
			<div>
				<%@include file="nav.jsp" %>
			</div>
			<hr />
			
			<section id="container">
				<form name="writeform" method="post" action="/break/write">
					<table>
						<tbody>
							<tr>
								<td>
									<label for="lineId">Line ID</label>
									<input type="text" id="lineId" name="lineId" class="chk" title="라인"/>
								</td>
							</tr>	
							<tr>
								<td>
									<label for="breakTime">Break Time</label>
									<input type="datetime-local" id="breakTime" name="breakTime" class="chk"/>
								</td>
							</tr>
						<!--  	<tr>
								<td>
									<label for="notifyTime">Notify Time</label>
									<input type="datetime-local" id="notifyTime" name="notifyTime" class="chk" />
								</td>
							</tr>
							<tr>
								<td>
									<label for="notifyToKtYn">Notify To KT</label>
									<input type="checkbox" id="notifyToKtYn" name="notifyToKtYn" class="chk" />
								</td>
							</tr>
							<tr>
								<td>
									<label for="recoveryTime">Recovery Time</label>
									<input type="datetime-local" id="recoveryTime" name="recoveryTime" class="chk" />
								</td>
							</tr>
							
							-->
							<tr>
								<td>        
									<label for="remark">비고</label>
									<textarea id="remark" name="remark" class="chk" title="내용을 입력하세요."></textarea>
								</td>
							</tr>
							<tr>
								<td>						
									<button type="button" id="write_btn" name="write_btn">작성</button>
								</td>
							</tr>			
						</tbody>			
					</table>
				</form>
			</section>
			<hr />
		</div>
	</body>
</html>

