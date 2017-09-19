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

    <title>My JSP 'students.jsp' starting page</title>
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

        <div class="topbox">
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
            <li>
                <a href="teacherHome.jsp">Home</a>
            </li>
            <li class="active"><a href="<s:url action='queryStudent' />">Students & Scores</a>
                <ul>
                    <li><a href="<s:url action='queryStudent' />">Student List</a></li>
                    <li><a href="insertscore.jsp">Insert Score</a></li>
                </ul
            </li>
            <li><a href="<s:url action='queryCourse' />">Courses</a>
            </li>
        </ul>
    </div>
</div>
<!-- ####################################################################################################### -->

<div class="wrapper col4">
    <div id="students">
        <s:form theme="simple" id="editScoreForm" action="editScore">
            <p>
                Student ID :
                <s:textfield id="studentid" name="studentid" label = "Student ID "/>
                <s:submit type="submit" value="Check Score"/>
            </p>
        </s:form>

        <table>
            <tr>
                <th style="display: none">
                    course ID
                </th>

                <th>
                    Course Name
                </th>
                <th>
                    Homework
                </th>
                <th>
                    Midterm Exam
                </th>
                <th>
                    Final Exam
                </th>
                <th>
                    Adjustment
                </th>
                <th>
                    Final Score
                </th>
            </tr>
            <s:iterator value="stuc">
                <s:form id="saveScoreForm" action="saveScore" theme="simple" validate="true">
                    <tr style="color: black">
                        <td style="display: none">

                            <s:textfield name="courseid" value="%{courseid}"/>
                        </td>
                        <td>
                            <s:property value="%{coursename}"/>
                        </td>
                        <td>
                            <s:textfield name="midexam" value="%{midexam}"/>
                        </td>
                        <td>
                            <s:textfield name="finalexam" value="%{finalexam}"/>
                        </td>
                        <td>
                            <s:textfield name="homework" value="%{homework}"/>
                        </td>
                        <td>
                            <s:textfield name="adjustment" value="%{adjustment}"/>
                        </td>
                        <td>
                            <s:property value="%{finalscore}"/>
                        </td>
                        <td>
                            <s:hidden name="id" value="%{id}"/>
                            <s:submit type="submit" value="save"/>
                        </td>
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
        <p class="fl_left">Copyright &copy; 2014 - All Rights Reserved - </p>
        <br class="clear"/>
    </div>
</div>
</body>
</html>
