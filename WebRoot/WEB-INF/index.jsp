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
    	<div class="page-header">
    		<h1>cae监控系统</h1>
    	</div>
    	<div class="panel panel-primary">
    		<div class="panel-heading">机器静态信息</div>
    		<div class="panel-body">
    			<div class="row">
	    			<div class="col-md-7">
	    				<div class="col-md-10">用户名:<strong>kuma</strong></div>
	    				<div class="col-md-10">计算机名:<strong>kuma</strong></div>
	    				<div class="col-md-10">域名:<strong>kuma</strong></div>
	    				<div class="col-md-10">ip地址:<strong>kuma</strong></div>
	    				<div class="col-md-10">本地主机名:<strong>kuma</strong></div>
	    				<div class="col-md-10">操作系统:<strong>kuma</strong></div>
	    				<div class="col-md-10">构架类型:<strong>kuma</strong></div>
	    				<div class="col-md-10">操作系统版本:<strong>kuma</strong></div>
	    				<div class="col-md-10">操作系统描述:<strong>kuma</strong></div>
	    				<div class="col-md-10">服务器卖主:<strong>kuma</strong></div>
	    				<div class="col-md-10">CPU核数:<strong>kuma</strong></div>
	    				<div class="col-md-10">内存:<strong>kuma</strong></div>
	    				<div class="col-md-10">文件系统总空间:<strong>kuma</strong></div>
	    				<div class="col-md-10">交换区总空间:<strong>kuma</strong></div>
	    			</div>
	    			<div class="col-md-3">
	    				<div id="fs" style="width:100%;height:50%"></div>
	    			</div>
    			</div>
    		</div>
    	</div>
    	<div class="panel">
    		<div class="row">
    			<div class="col-md-6">
		    		<div class="panel panel-primary">
			    		<div class="panel-heading">CPU信息</div>
			    		<div class="panel-body">
			    			<div id="cpu" style="width:100%;height:50%"></div>
			    		</div>
		    		</div>
	    		</div>
	    		<div class="col-md-6">
			    	<div class="panel panel-primary">
			    		<div class="panel-heading">内存信息</div>
			    		<div class="panel-body">
			    			<div id="memory" style="width:100%;height:50%"></div>
			    		</div>
			    	</div>
		    	</div>
	    	</div>
	    	<div class="panel panel-primary">
	    		<div class="panel-heading">进程信息</div>
	    		<div class="panel-body">
					<table class="table table-bordered table-hover">
						<thead>
							<tr>
								<td>进程名</td>
								<td>进程id</td>
								<td>进程开始时间</td>
								<td>进程占用内存</td>
								<td>进程占用CPU</td>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>kuma</td>
								<td>kuma</td>
								<td>kuma</td>
								<td>kuma</td>
								<td>kuma</td>
							</tr>
							<tr>
								<td>kuma</td>
								<td>kuma</td>
								<td>kuma</td>
								<td>kuma</td>
								<td>kuma</td>
							</tr>
							<tr>
								<td>kuma</td>
								<td>kuma</td>
								<td>kuma</td>
								<td>kuma</td>
								<td>kuma</td>
							</tr>
						</tbody>
					</table>
				</div>
	    	</div>
    	</div>
    	<hr style="height:1px;border:none;border-top:1px solid #0000FF;" />
    	<div class="panel panel-primary">
    		<div class="panel-heading">JVM信息</div>
    		<div class="panel-body">
    			<div class="row">
    				<div class="col-md-6">jvm名称:<strong>kuma</strong></div>
    				<div class="col-md-6">jvm版本:<strong>kuma</strong></div>
    				<div class="col-md-6">jvm提供商:<strong>kuma</strong></div>
    				<div class="col-md-6">jvm启动时间:<strong>kuma</strong></div>
    				<div class="col-md-6">jvm启动参数:<strong>kuma</strong></div>
    				<div class="col-md-6">jvm最大处理器数目:<strong>kuma</strong></div>
    				<div class="col-md-6">jvm总内存:<strong>kuma</strong></div>
    			</div>
    		</div>
    	</div>
    	<hr style="height:1px;border:none;border-top:1px solid #0000FF;"/>
    	<div class="panel panel-primary">
    		<div class="panel-heading">jvm内存</div>
    		<div class="panel-body row">
    			<div class="col-md-6">
    				<div class="panel panel-info">
	    				<div class="panel-heading">eden块</div>
	    				<div class="panel-body">
							<div id="eden" style="width:100%;height:50%"></div>
						</div>
    				</div>
    			</div>
    			<div class="col-md-6">
    				<div class="panel panel-info">
			    		<div class="panel-heading">survivor块</div>
			    		<div class="panel-body">
			    			<div id="survivor" style="width:100%;height:50%"></div>
			    		</div>
		    		</div>
    			</div>
    		</div>
    		<div class="row">
    			<div class="col-md-6">
    				<div class="panel panel-info">
    					<div class="panel-heading">old块</div>
    					<div class="panel-body">
    						<div id="old" style="width:100%;height:50%"></div>
    					</div>
    				</div>
    			</div>
    			<div class="col-md-6">
    				<div class="panel panel-info">
    					<div class="panel-heading">持久代</div>
    					<div class="panel-body">
    						<div id="perm" style="width:100%;height:50%"></div>
    					</div>
    				</div>
    			</div>
    		</div>
    	</div>
    	<hr style="height:1px;border:none;border-top:1px solid #0000FF;"/>
    	<div class="panel">
    		<div class="row">
    			<div class="col-md-6">
	    			<div class="panel panel-primary">
	    				<div class="panel-heading">JVM线程</div>
	    				<div class="panel-body">
	    					<div id="jvm_thread" style="width:100%;height:50%"></div>
	    				</div>
	    			</div>
	    		</div>
	    		<div class="col-md-6">
	    			<div class="panel panel-primary">
    					<div class="panel-heading">JVM类信息</div>
    					<div class="panel-body">
    						<div id="jvm_class" style="width:100%;height:50%"></div>
    					</div>
    				</div>
	    		</div>
    		</div>
    	</div>
    	<hr style="height:1px;border:none;border-top:1px solid #0000FF;"/>
    	<div class="panel panel-primary">
    		<div class="panel-heading">数据库信息</div>
    		<div class="panel-body">
    			<div class="row">
    				<div class="col-md-6">数据库名称:<strong>kuma</strong></div>
    				<div class="col-md-6">数据库版本:<strong>kuma</strong></div>
    				<div class="col-md-6">JDBC驱动名称:<strong>kuma</strong></div>
    				<div class="col-md-6">数据库连接URL:<strong>kuma</strong></div>
    				<div class="col-md-6">数据库连接用户名:<strong>kuma</strong></div>
    				<div class="col-md-6">JDBC驱动版本:<strong>kuma</strong></div>
    			</div>
    		</div>
    	</div>
    </center>
  </body>
  <script type="text/javascript" src="http://liuyang-anime.cn:81/jquery-1.11.1.min.js"></script>
  <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
  <script type="text/javascript" src="http://liuyang-anime.cn:81/echarts.min.js"></script>
  <script type="text/javascript">
	  var dom = document.getElementById("fs");
	  var myChart = echarts.init(dom);
	  var app = {};
	  option = null;
	  option = {
	      title: {
	          text: '文件系统',
	          left: 'center',
	          top: 20,
	          textStyle: {
	              color: '#ccc'
	          }
	      },
	
	      tooltip : {
	          trigger: 'item',
	          formatter: "{a} <br/>{b} : {c} ({d}%)"
	      },
	
	      visualMap: {
	          show: false,
	          min: 80,
	          max: 600,
	          inRange: {
	              colorLightness: [0, 1]
	          }
	      },
	      series : [
	          {
	              name:'访问来源',
	              type:'pie',
	              radius : '55%',
	              center: ['50%', '50%'],
	              data:[
	                  {value:335, name:'直接访问'},
	                  {value:310, name:'邮件营销'},
	                  {value:274, name:'联盟广告'},
	                  {value:235, name:'视频广告'},
	                  {value:400, name:'搜索引擎'}
	              ].sort(function (a, b) { return a.value - b.value; }),
	              roseType: 'radius',
	              label: {
	                  normal: {
	                      textStyle: {
	                          color: 'rgba(255, 255, 255, 0.3)'
	                      }
	                  }
	              },
	              labelLine: {
	                  normal: {
	                      lineStyle: {
	                          color: 'rgba(255, 255, 255, 0.3)'
	                      },
	                      smooth: 0.2,
	                      length: 10,
	                      length2: 20
	                  }
	              },
	              itemStyle: {
	                  normal: {
	                      color: '#c23531',
	                      shadowBlur: 200,
	                      shadowColor: 'rgba(0, 0, 0, 0.5)'
	                  }
	              },
	
	              animationType: 'scale',
	              animationEasing: 'elasticOut',
	              animationDelay: function (idx) {
	                  return Math.random() * 200;
	              }
	          }
	      ]
	  };
	  if (option && typeof option === "object") {
	      myChart.setOption(option, true);
	  }
  </script>
  <script type="text/javascript">
	  var dom1 = document.getElementById("cpu");
	  var dom2 = document.getElementById("memory");
	  var dom3 = document.getElementById("eden");
	  var dom4 = document.getElementById("survivor");
	  var dom5 = document.getElementById("old");
	  var dom6 = document.getElementById("perm");
	  var dom7 = document.getElementById("jvm_thread");
	  var dom8 = document.getElementById("jvm_class");
	  var myChart1 = echarts.init(dom1);
	  var myChart2 = echarts.init(dom2);
	  var myChart3 = echarts.init(dom3);
	  var myChart4 = echarts.init(dom4);
	  var myChart5 = echarts.init(dom5);
	  var myChart6 = echarts.init(dom6);
	  var myChart7 = echarts.init(dom7);
	  var myChart8 = echarts.init(dom8);
	  var app = {};
	  option = null;
	
	  var data = [];
	  var now = +new Date(1997, 9, 3);
	  var oneDay = 24 * 3600 * 1000;
	  var value = Math.random() * 1000;
	  for (var i = 0; i < 1000; i++) {
	      data.push(randomData());
	  }
	  
	  function randomData() {
	      now = new Date(+now + oneDay);
	      value = value + Math.random() * 21 - 10;
	      return {
	          name: now.toString(),
	          value: [
	              [now.getFullYear(), now.getMonth() + 1, now.getDate()].join('/'),
	              Math.round(value)
	          ]
	      };
	  }
	
	  option = {
	      tooltip: {
	          trigger: 'axis',
	          formatter: function (params) {
	              params = params[0];
	              var date = new Date(params.name);
	              return date.getDate() + '/' + (date.getMonth() + 1) + '/' + date.getFullYear() + ' : ' + params.value[1];
	          },
	          axisPointer: {
	              animation: false
	          }
	      },
	      xAxis: {
	          type: 'time',
	          splitLine: {
	              show: false
	          }
	      },
	      yAxis: {
	          type: 'value',
	          boundaryGap: [0, '100%'],
	          splitLine: {
	              show: false
	          }
	      },
	      series: [{
	          name: '模拟数据',
	          type: 'line',
	          showSymbol: false,
	          hoverAnimation: false,
	          data: data
	      }]
	  };
	
	  setInterval(function () {
	
	      for (var i = 0; i < 5; i++) {
	          data.shift();
	          data.push(randomData());
	      }
	
	      myChart1.setOption({
	          series: [{
	              data: data
	          }]
	      });
	      myChart2.setOption({
	          series: [{
	              data: data
	          }]
	      });
	      myChart3.setOption({
	          series: [{
	              data: data
	          }]
	      });
	      myChart4.setOption({
	          series: [{
	              data: data
	          }]
	      });
	      myChart5.setOption({
	          series: [{
	              data: data
	          }]
	      });
	      myChart6.setOption({
	          series: [{
	              data: data
	          }]
	      });
	      myChart7.setOption({
	          series: [{
	              data: data
	          }]
	      });
	      myChart8.setOption({
	          series: [{
	              data: data
	          }]
	      });
	  }, 1000);
	  if (option && typeof option === "object") {
	      myChart1.setOption(option, true);
	      myChart2.setOption(option, true);
	      myChart3.setOption(option, true);
	      myChart4.setOption(option, true);
	      myChart5.setOption(option, true);
	      myChart6.setOption(option, true);
	      myChart7.setOption(option, true);
	      myChart8.setOption(option, true);
	  }
  </script>
</html>
