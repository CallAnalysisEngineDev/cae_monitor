<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<base href="<%=basePath%>">
    <title>cae监控系统</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
  </head>
  
  <body>
  	<center>
  		<div class="page-header"><h1>管理员登录</h1></div>
  		<c:if test="${!empty errInfo}">
	  		<div class="alert alert-danger alert-dismissible" role="alert" style="width:60%">
	  			<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	  			<strong>请先登录!</strong>
	  		</div>
  		</c:if>
  		<div class="alert alert-danger alert-dismissible" role="alert" style="width:60%" hidden id="error">
	  		<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	  		<strong id="errInfo"></strong>
	  	</div>
  		<div class="input-group" style="width:30%">
  			<span class="input-group-addon" id="basic-addon1">账号:</span>
  			<input id="useraccount" type="text" class="form-control" placeholder="请输入管理员账号" aria-describedby="basic-addon1">
		</div>
		<div class="input-group" style="width:30%">
  			<span class="input-group-addon" id="basic-addon1">密码:</span>
  			<input id="password" type="password" class="form-control" placeholder="请输入管理员密码" aria-describedby="basic-addon2">
		</div>
    	<input type="button" onclick="shakeHand()" value="登录" class="btn btn-primary btn-lg"/>
  	</center>
  	<form action="index" method="post" id="admin_login_form"></form>
  </body>
  <script type="text/javascript" src="http://liuyang-anime.cn:81/jquery-1.11.1.min.js"></script>
  <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
  <script type="text/javascript" src="http://liuyang-anime.cn:81/browser-storage.js"></script>
  <script type="text/javascript" src="http://liuyang-anime.cn:81/DES3.js"></script>
  <script type="text/javascript" src="http://liuyang-anime.cn:81/jsencrypt.min.js"></script>
  <script type="text/javascript" src="js/login.js"></script>
  <script type="text/javascript">
    var login=new Login();
    function shakeHand(){
    	login.login_1();
    }
    $(document).keyup(function(event){
  		if(event.keyCode==13){
  			shakeHand();
  		}
	});
  </script>
</html>
