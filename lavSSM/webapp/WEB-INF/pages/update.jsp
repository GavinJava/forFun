<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="Js/jquery.min.js"></script>
<script type="text/javascript" src="Js/update.js"></script>
<style>
.item_content ul { list-style: none; }
.item_content ul li { width: 200px; height: 160px; float: left; margin: 10px }
.item_content { width: 740px; height: auto; border: 1px solid #ccc; float: left; }
.item_content .item { width: 200px; height: 120px; line-height: 120px; text-align: center; cursor: pointer; background: #ccc; }
.item_content .item img { width: 200px; height: 120px; border-radius: 6px; }
.close { display: block; width: 20px; height: 20px; top: 0; right: 0; z-index: 9999; position: absolute; text-align: center; font-size: 16px; cursor: pointer; color: aliceblue }
</style>
</head>
<body>
	<div>
		<form action="goFinish" method="post">
			User Id:<input type="text" id="userId" name="userId" value="${user.userId }" readonly="readonly"/><br/>
			User Name:<input type="text" id="userName" name="userName" value="${user.userName }"/><br/>
			User Pwd:<input type="text" id="userPwd" name="userPwd" value="${user.userPwd }"/><br/>
			<select name="deptId">
				<c:forEach items="${allDepts }" var="dept">
					<c:choose>
						<c:when test="${dept.deptId==user.dept.deptId }">
							<option value="${dept.deptId }" selected="selected">${dept.deptName }</option>
						</c:when>
						<c:otherwise>
							<option value="${dept.deptId }">${dept.deptName }</option>
						</c:otherwise>
					</c:choose>
				</c:forEach>
			</select>
			<input type="submit" value="Done,Save it!"/>
		</form>
	</div>
	<div class="item_container">
  <div class="item_content" id="imageChange">
    <ul>
      <li>
        <div class="item"> <img src="http://www.jq22.com/img/cs/500x500-1.png" width="150" height="150"> 
        <span onclick="removePicture(this)" class="rmPicture close">×</span> </div>
      </li>
      <li>
        <div class="item"> <img src="http://www.jq22.com/img/cs/500x500-2.png" width="150" height="150"> 
        <span onclick="removePicture(this)" class="rmPicture close">×</span> </div>
      </li>
      <li>
        <div class="item"> <img src="http://www.jq22.com/img/cs/500x500-3.png" width="150" height="150"> 
        <span onclick="removePicture(this)" class="rmPicture close">×</span> </div>
      </li>
      <li>
        <div class="item"> <img src="http://www.jq22.com/img/cs/500x500-4.png" width="150" height="150"> 
        <span onclick="removePicture(this)" class="rmPicture close">×</span> </div>
      </li>
      <li>
        <div class="item"> <img src="http://www.jq22.com/img/cs/500x500-5.png" width="150" height="150"> 
        <span onclick="removePicture(this)" class="rmPicture close">×</span> </div>
      </li>
      <li>
        <div class="item"> <img src="http://www.jq22.com/img/cs/500x500-6.png" width="150" height="150"> 
        <span onclick="removePicture(this)" class="rmPicture close">×</span> </div>
      </li>
      <li>
        <div class="item"> <img src="http://www.jq22.com/img/cs/500x500-7.png" width="150" height="150"> 
        <span onclick="removePicture(this)" class="rmPicture close">×</span> </div>
      </li>
      <li>
        <div class="item"> <img src="http://www.jq22.com/img/cs/500x500-8.png" width="150" height="150"> 
        <span onclick="removePicture(this)" class="rmPicture close">×</span> </div>
      </li>
      <li>
        <div class="item"> <img src="http://www.jq22.com/img/cs/500x500-9.png" width="150" height="150"> 
        <span onclick="removePicture(this)" class="rmPicture close">×</span> </div>
      </li>
    </ul>
  </div>
</div>
</body>
</html>