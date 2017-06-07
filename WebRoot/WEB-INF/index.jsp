<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
    	<div class="page-header"><h1>cae监控系统</h1></div>
    	<div class="panel panel-primary">
    		<div class="panel-heading">机器静态信息</div>
    		<div class="panel-body"></div>
    	</div>
    	<div class="panel panel-primary" style="float:left;width:50%">
    		<div class="panel-heading">CPU信息</div>
    		<div class="panel-body"></div>
    	</div>
    	<div class="panel panel-primary" style="float:left;width:50%">
    		<div class="panel-heading">内存信息</div>
    		<div class="panel-body"></div>
    	</div>
    	<div class="panel panel-primary">
    		<div class="panel-heading">进程信息</div>
    		<div class="panel-body"></div>
    	</div>
    	<hr/>
    	<div class="panel panel-primary">
    		<div class="panel-heading">JVM信息</div>
    		<div class="panel-body"></div>
    	</div>
    	<hr/>
    	<div class="panel panel-primary" style="float:left;width:50%">
    		<div class="panel-heading">eden块</div>
    		<div class="panel-body"></div>
    	</div>
    	<div class="panel panel-primary" style="float:left;width:50%">
    		<div class="panel-heading">survivor块</div>
    		<div class="panel-body"></div>
    	</div>
    	<div class="panel panel-primary" style="float:left;width:50%">
    		<div class="panel-heading">old块</div>
    		<div class="panel-body"></div>
    	</div>
    	<div class="panel panel-primary" style="float:left;width:50%">
    		<div class="panel-heading">持久代</div>
    		<div class="panel-body"></div>
    	</div>
    	<hr/>
    	<div class="panel panel-primary" style="float:left;width:50%">
    		<div class="panel-heading">JVM线程</div>
    		<div class="panel-body"></div>
    	</div>
    	<div class="panel panel-primary" style="float:left;width:50%">
    		<div class="panel-heading">JVM类信息</div>
    		<div class="panel-body"></div>
    	</div>
    	<hr/>
    	<div class="panel panel-primary">
    		<div class="panel-heading">数据库信息</div>
    		<div class="panel-body"></div>
    	</div>
    </center>
  </body>
  <script type="text/javascript" src="http://liuyang-anime.cn:81/jquery-1.11.1.min.js"></script>
  <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

</html>
