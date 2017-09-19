<%@ page language="java" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>Educational</title>
    <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1"/>
    <link rel="stylesheet" href="styles/layout.css" type="text/css"/>
    <script type="text/javascript" src="scripts/jquery.min.js"></script>
    <script type="text/javascript" src="scripts/jquery.slidepanel.setup.js"></script>
    <script type="text/javascript" src="scripts/jquery.ui.min.js"></script>
    <script type="text/javascript" src="scripts/jquery.tabs.setup.js"></script>
</head>
<body>
<div class="wrapper col0">
    <div id="topbar">
        <div id="slidepanel">
        </div>
        <div id="loginpanel">
            <ul>
                <li class="left">Log Out Here &raquo;</li>
                <li class="right" id="toggle"><a id="slideit" href="<s:url action='logout' />">Click here!</a></li>
            </ul>
        </div>
        <br class="clear"/>
    </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col1">
    <div id="header">
        <div id="logo">
            <h1><a href="index.html">BJTU Engineering</a></h1>

            <p>Scoreboard School System</p>
        </div>
        <div class="fl_right">
            <ul>
                <li><a href="www.bjtu.edu.cn">School Board</a></li>
            </ul>
            <p>Tel: +86188923749-50 | Mail: scbjtu@bjtu.edu.cn</p>
        </div>
        <br class="clear"/>
    </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col2">
    <div id="topnav">
        <ul>
            <li class="active"><a href="scores.html">Scores</a>
            </li>
        </ul>
    </div>
</div>
<!-- ####################################################################################################### -->

<div class="wrapper col4">

<s:form name="queryScoreForm" action="queryScore" theme="simple" method="post">
    <a>Hello, <s:property value="%{studentid}"/></a>
    </s:form>

    <div id="details">
        <table>

            <tr>
                <th style="display:none">course ID</th>
                <th>Course Name</th>
                <th>Homework Score</th>
                <th>Mid exam Score</th>
                <th>Final exam Score</th>
                <th>adjustment Score</th>
                <th>Final Score</th>
            </tr>
            <s:iterator value="stuc">
            <s:form name="queryScoreForm" action="queryScore" theme="simple" method="post">
            <tr>
                <td style="display:none"></td>
                <td><s:property value="%{coursename}"/></td>
                <td><s:property value="%{homework}"/></td>
                <td><s:property value="%{midexam}"/></td>
                <td><s:property value="%{finalexam}"/></td>
                <td><s:property value="%{adjustment}"/></td>
                <td><s:property value="%{finalscore}"/></td>
            </tr>
            </s:form>
            </s:iterator>
        </table>
    </div>

</div>
<!-- ####################################################################################################### -->
<div class="wrapper col5">
    <div id="footer">

    </div>
    <br class="clear"/>
</div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col6">
    <div id="copyright">
        <p class="fl_left">Copyright &copy; 2014 - All Rights Reserved - </a></p>
        <br class="clear"/>
    </div>
</div>
</body>
</html>
