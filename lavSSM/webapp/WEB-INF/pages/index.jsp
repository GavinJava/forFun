<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<% String basePath = request.getContextPath(); %>
</head>
<body>
	<div>
		${errorMessage }
		<c:choose>
			<c:when test="${fn:length(allUsers)==0 }">
				no
			</c:when>
			<c:otherwise>
				<table border="1" align="center" cellspacing="0">
					<tr><th>User ID</th><th>User Name</th><th>User Pwd</th><th>User Dept</th><th>Operation</th></tr>
					<c:forEach items="${allUsers }" var="user">
						<tr>
							<td>${user.userId}</td>
							<td>${user.userName}</td>
							<td>${user.userPwd}</td>
							<td>${user.dept.deptName}</td>
							<td>
								<a href="goDelete?userId=${user.userId}">Delete</a>
								<a href="goUpdate?userId=${user.userId}">Update</a>
							</td>
						</tr>
					</c:forEach>
				</table>
			</c:otherwise>
		</c:choose>
	</div>
</body>
</html>