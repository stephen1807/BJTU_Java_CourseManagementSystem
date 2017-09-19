<%@ page language="java" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
+
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Teacher Home</title>

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
            <li class="active">
                <a href="teacherHome.jsp">Home</a>
            </li>
            <li><a href="<s:url action='queryStudent' />">Students & Scores</a>
                <ul>
                    <li><a href="<s:url action='queryStudent' />">Student List</a></li>
                    <li><a href="insertscore.jsp">Insert Score</a></li>
                </ul>
            </li>
            <li><a href="<s:url action='queryCourse' />">Courses</a>
            </li>
        </ul>
    </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col4">
    <div class="isi">
    </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col3">
    <div id="featured_slide">
        <div id="featured_wrap">
            <ul id="featured_tabs">
                <li><a href="#fc1">Score Overview<br/>
                    <span>Summary of student's score.</span></a></li>
                <li><a href="#fc2">Course Overview<br/>
                    <span>List of course available this semester.</span></a></li>
                <li class="last"><a href="#fc4">Exam Schedule<br/>
                    <span>Check upcoming exam schedule.</span></a></li>
            </ul>
            <div id="featured_content">
                <div class="featured_box" id="fc1"><img src="images/demo/1.gif" alt=""/>

                </div>
                <div class="featured_box" id="fc2"><img src="images/demo/2.gif" alt=""/>

                </div>
                <div class="featured_box" id="fc3"><img src="images/demo/Examination.jpg" alt=""/>

                </div>
                <div class="featured_box" id="fc4"><img src="images/demo/Examination.jpg" alt=""/>

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

                    <div class="imgholder"><img src="images/demo/artfestivals.jpg" alt=""/></div>
                    <p>Art Festival held in December 2014.Many students paricipate in this </p>
                </li>
                <li>
                    <h2>2014-2015 Enrolment</h2>

                    <div class="imgholder"><img src="images/demo/Enrollment.jpg" alt=""/></div>
                    <p>2014 - 2015 new erolment will start soon ! dont forget to email us in nfaart@nfa.edu.com for more
                        information.</p>
                </li>
                <li>
                    <h2>Best Academic Student</h2>

                    <div class="imgholder"><img src="images/demo/BestAca.jpg" alt=""/></div>
                    <p>Congratulation to Kim Yuna as best academic student year 2013-2014, has achieved highest score
                        this year. We are proud of you !</p>
                </li>
                <li class="last">
                    <h2>New Salsa Class</h2>

                    <div class="imgholder"><img src="images/demo/newclass.jpg" alt=""/></div>
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
