<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<title>小小论坛</title>
<meta charset="utf-8" />
<link rel="stylesheet" href="css/index.css">
</head>
<div class="dvhead">
	<div class="dvlogo">
		<a href="index.jsp">小小论坛</a>
	</div>
	<div class="dvreg">
			<s:if test="#session.user==null">
				已有账号，立即&nbsp;<a href="login.jsp">登录</a>
			</s:if>
			<s:else>
				<s:property value="#session.user.username "/> 
				<a href="${pageContext.request.contextPath }/LoginAction_logout"> 注销   </a>
			</s:else>
	</div>
</div>
<div class="dvContent">
	<div class="dvquesleft">

		<div class="dvqstitle">
			<image class="imgbean" src="images/bean.jpg"> <span
				class="qsTitle">讨论区</span>
		</div>
		<div class="dvtabhead">
			<div class="tabheads tabcurrent">全部帖子</div>
<!-- 			<div class="tabheads">我的帖子</div> -->
<!-- 			<div class="tabheads">我的关注</div> -->
		</div>
		<div class="tabContent">
			<div class="tab">
				<s:iterator value="#application.initDatas" var="data">
					<div class="dvques">
						<div class="quesCount">
							<div class="count"><s:property value="#data.ansnum" /></div>
							<div class="ques">回答数</div>
						</div>
						<div class="quesContent">
							<div class="quesTitle">
									<a href="${pageContext.request.contextPath }/DetailAction_execute?id=<s:property value="#data.id" />"> 
									<s:property value="#data.title" /></a>
							</div>
							<div class="qContent">${data.dcontent }</div>
							<div class="tags">
<%-- 								<span class="tag">excel</span><span class="tag">程序</span> --%>
							</div>
							<div class="quesUser">
								<image src="images/0.gif" class="imguser" />
								<div class="userName">
									${data.user.username }
									 <div class="liulan"><s:property value="#data.dtime" /></div> 
									 
									 <s:if test="#session.user.admin">
									 	<a href="${pageContext.request.contextPath }/DeleAction_deleData?delId=<s:property value="#data.id" />" class="layui-btn layui-btn-danger layui-btn-small">删除</a>
									 </s:if>
								</div>

							</div>
						</div>
					</div>
				</s:iterator>
			</div>
			<div class="tab hidden">2</div>
			<div class="tab hidden">3</div>
			<div class="tab hidden">4</div>
		</div>
	</div>
	<div class="dvquesright">
		<div>
			<buton class="btnques" onclick="location.href='add.jsp'">提个问题</buton>
		</div>
	</div>

</div>
<body>
</body>
</html>


