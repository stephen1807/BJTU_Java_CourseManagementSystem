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
                <h2>Login Here</h2>

                <form action="teacherHome.jsp" method="post">
                    <fieldset>
                        <legend>Login Form</legend>
                        <label for="pupilname">Username:
                            <input type="text" name="pupilname" id="pupilname" value=""/>
                        </label>
                        <label for="pupilpass">Password:
                            <input type="password" name="pupilpass" id="pupilpass" value=""/>
                        </label>
                        <!--<label for="pupilremember">
                          <input class="checkbox" type="checkbox" name="pupilremember" id="pupilremember" checked="checked" />
                          Remember me</label>-->

                        <p>
                            <input type="submit" name="pupillogin" id="pupillogin" value="Login"/>
                        </p>

                    </fieldset>
                </form>
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
                <li><a href="http://www.bjtu.edu.cn">School Board</a></li>
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
                <a href="index.html">Home</a>
            </li>
            <li class="active">
                <a href="profiles.jsp">Profiles</a>
            </li>
        </ul>
    </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col3">
    <div id="featured_slide">
        <div id="featured_wrap">
            <div id="featured_content">
                <ul id="featured content">
                    <div class="featured_box" id="fc1"><img src="images/demo/bjtu.jpg" alt=""/>
                    </div>
            </div>
        </div>
    </div>
</div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col3">
    <div id="featured_slide">
        <div id="featured_wrap">
            <div id="featured_content">
                <ul id="featured content">
                    <p> Beijing Jiaotong University (BJTU, formerly known as Northern Jiaotong University) is a national
                        key university under the direct administration of the Ministry of Education and now is jointly
                        supported by the Ministry of Education, the China Railway Corporation (formerly known as the
                        Ministry of Railways) and Beijing Municipal Government.

                    <p>BJTU is one of the first universities selected into the “National 211 Project” and the “985
                        Strength Discipline Innovation Platform” project, one of the first institutions authorized to
                        confer master’s and doctoral degrees. BJTU, as the leading organization, has established the
                        Collaborative Innovation Centre for Rail Transit Safety, which is one of the first 14
                        collaborative centers approved by the Chinese government to enter the “National 2011
                        Projects”.</p>

                    <p>As one of the three origins of the Jiaotong University, BJTU grew out of Beijing Railway
                        Management Institute, China’s first higher educational institution which was committed to
                        fostering railway management talents and initiated modern China’s education in railway
                        management and telecommunication.</p>

                    <p>Some renowned people in Chinese history received education at the University, including Liu Han,
                        founder of China’s first radio station, Ying Shangcai, inventor of China’s first high-power
                        steam engine, Zheng Zhenduo, famous writer and literary critic and historian, Jin Shixuan,
                        author of China’s first railway management monograph, Xu Jing, pioneer of railway transport
                        economics in China, and Yang Rumei, one of the early four major accountants in China.</p>

                    <p>Some famous scholars worked at the University, including Xiang Zhejun, Chief Prosecutor of the
                        Tokyo Trial and Ma Yinchu, famous demographer and economist.</p></ul>
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
