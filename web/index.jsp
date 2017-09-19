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

    <title>Scoreboard</title>
    <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1"/>
    <link rel="stylesheet" href="styles/layout.css" type="text/css"/>
    <script type="text/javascript" src="scripts/jquery.min.js"></script>
    <script type="text/javascript" src="scripts/jquery.slidepanel.setup.js"></script>
    <script type="text/javascript" src="scripts/jquery.ui.min.js"></script>
    <script type="text/javascript" src="scripts/jquery.tabs.setup.js"></script>
</head>
<%
    String name = request.getParameter("loginid");
    session.setAttribute("theName", name);
%>
<body>
<div class="wrapper col0">
    <div id="topbar">
        <div id="slidepanel">
            <div class="topbox">
                <h2>Account Login</h2>

                <p>Please login here before use the system! Only registered students and teachers can access this system
                    :)</p>
                <!--<p class="readmore"><a href="#">Continue Reading &raquo;</a></p>-->
            </div>
            <div class="topbox">

            </div>
            <div class="topbox last">
                <h2>Login Here <s:if test="hasActionErrors()">
                    <s:actionerror/>
                </s:if>
                    <s:if test="hasActionMessages()">
                        <s:actionmessage/>
                    </s:if></h2>
                <fieldset>
                    <s:form action="loginprocess" method="post">
                        <legend>Login Form</legend>
                        <label>Username:
                            <!--<input type="text" name="pupilname" id="pupilname" value="" />-->
                            <s:textfield theme="simple" name="loginID" value="" required="true"/>
                        </label>
                        <label>Password:
                            <s:password theme="simple" name="loginpass" value="" required="true"/>
                            <!--<input type="password" name="pupilpass" id="pupilpass" value="" />-->
                        </label>

                        <p>
                            <s:submit theme="simple" value="Login" type="submit"/>
                        </p>
                    </s:form>
                </fieldset>
            </div>
            <br class="clear"/>
        </div>
        <div id="loginpanel">
            <ul>
                <li class="left">Log In Here &raquo;</li>
                <li class="right" id="toggle"><a id="slideit" href="index.jsp#slidepanel">Click here!</a><a id="closeit"
                                                                                                            style="display: none;"
                                                                                                            href="index.jsp#slidepanel">Close
                    Panel</a></li>
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
            <li class="active"><a href="index.html">Home</a>
            </li>
            <li><a href="profiles.jsp">Profiles</a>

            </li>
        </ul>
    </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col3">
    <div id="featured_slide">
        <div id="featured_wrap">
            <ul id="featured_tabs">
                <li><a href="#">About Our School<br/>
                    <span>School of design and Art for every student.</span></a></li>
                <li><a href="#fc2">Overview of this Website<br/>
                    <span>Scoreboard management system info.</span></a></li>
                <li><a href="#fc3">Recent Activities<br/>
                    <span>More Activities recently click here !</span></a></li>
                <li class="last"><a href="#fc4">Exam Schedule<br/>
                    <span>Check here to view Upcoming Exam.</span></a></li>
            </ul>
            <div id="featured_content">
                <div class="featured_box" id="fc1"><img src="images/demo/aboutschool.jpg" alt=""/>

                    <div class="floater"><a href="#">Continue Reading &raquo;</a></div>
                </div>
                <div class="featured_box" id="fc2"><img src="images/demo/2.gif" alt=""/>

                    <div class="floater"><a href="#">Continue Reading &raquo;</a></div>
                </div>
                <div class="featured_box" id="fc3"><img src="images/demo/act.jpg" alt=""/>

                    <div class="floater"><a href="#">Continue Reading &raquo;</a></div>
                </div>
                <div class="featured_box" id="fc4"><img src="images/demo/Examination.jpg" alt=""/>

                    <div class="floater"><a href="#">Continue Reading &raquo;</a></div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col4">
    <div id="container">
        <div id="hpage">
            <ul>
                <li>
                    <h2>Art Festival 2014</h2>

                    <div class="imgholder"><img src="images/demo/artfestivals.jpg" alt=""/></a></div>
                    <p>Art Festival held in December 2014.Many students paricipate in this </p>
                </li>
                <li>
                    <h2>2014-2015 Enrolment</h2>

                    <div class="imgholder"><img src="images/demo/Enrollment.jpg" alt=""/></a></div>
                    <p>2014 - 2015 new erolment will start soon ! dont forget to email us in nfaart@nfa.edu.com for more
                        information.</p>
                </li>
                <li>
                    <h2>Best Academic Student</h2>

                    <div class="imgholder"><img src="images/demo/BestAca.jpg" alt=""/></a></div>
                    <p>Congratulation to Kim Yuna as best academic student year 2013-2014, has achieved highest score
                        this year. We are proud of you !</p>
                </li>
                <li class="last">
                    <h2>New Salsa Class</h2>

                    <div class="imgholder"><img src="images/demo/newclass.jpg" alt=""/></a></div>
                    <p>Salsa class as a new course from our department, with professional trainer we learn new move.</p>
                </li>
            </ul>
            <br class="clear"/>
        </div>
    </div>
</div>
<!-- ####################################################################################################### -->

<div class="wrapper col5">
    <div id="footer">
    </div>
    <br class="clear"/>
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
