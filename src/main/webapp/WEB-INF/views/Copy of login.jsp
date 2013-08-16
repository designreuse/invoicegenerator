<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Login Page</title>
<style>
/* .errorblock { */
/* 	color: #ff0000; */
/* 	background-color: #ffEEEE; */
/* 	border: 3px solid #ff0000; */
/* 	padding: 8px; */
/* 	margin: 16px; */
/* } */
<!-- </style> -->
</head>
<body onload='document.f.j_username.focus();'>
	<h3>Login with Username and Password (Custom Page)</h3>
 
	<c:if test="${not empty error}">
		<div class="errorblock">
			Your login attempt was not successful, try again.<br /> Caused :
			${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
		</div>
	</c:if>
 
	<form name='f' action="<c:url value='j_spring_security_check' />"
		method='POST'>
 
		<table>
			<tr>
				<td>User:</td>
				<td><input type='text' name='j_username' value=''>
				</td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='j_password' />
				</td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit"
					value="submit" />
				</td>
			</tr>
			<tr>
				<td colspan='2'><input name="reset" type="reset" />
				</td>
			</tr>
		</table>
 
	</form>
</body>
</html>


<html>
	<head>
		<title>Login Page</title>
		<style>
		<!--Stylesheets-->
        <link rel="shortcut icon" href="../favicon.ico"> 
        <link rel="stylesheet" type="text/css" href="css/demo.css" />
        <link rel="stylesheet" type="text/css" href="css/style.css" />
		<link rel="stylesheet" type="text/css" href="css/animate-custom.css" />

		
	</head>
	<body onload='document.f.j_username.focus();'>
	<div id="container_demo" >
    <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->
    <a class="hiddenanchor" id="toregister"></a>
    <a class="hiddenanchor" id="tologin"></a>
    <div id="wrapper">
        <div id="login" class="animate form">
            <form  action="mysuperscript.php" autocomplete="on"> 
                <h1>Log in</h1> 
                <p> 
                    <label for="username" class="uname" data-icon="u" > Your email or username </label>
                    <input id="username" name="username" required="required" type="text" placeholder="myusername or mymail@mail.com"/>
                </p>
                <p> 
                    <label for="password" class="youpasswd" data-icon="p"> Your password </label>
                    <input id="password" name="password" required="required" type="password" placeholder="eg. X8df!90EO" /> 
                </p>
                <p class="keeplogin"> 
                    <input type="checkbox" name="loginkeeping" id="loginkeeping" value="loginkeeping" /> 
                    <label for="loginkeeping">Keep me logged in</label>
                </p>
                <p class="login button"> 
                    <input type="submit" value="Login" /> 
                </p>
                <p class="change_link">
                    Not a member yet ?
                    <a href="#toregister" class="to_register">Join us</a>
                </p>
            </form>
        </div>
 
        <div id="register" class="animate form">
            <form  action="mysuperscript.php" autocomplete="on"> 
                <h1> Sign up </h1> 
                <p> 
                    <label for="usernamesignup" class="uname" data-icon="u">Your username</label>
                    <input id="usernamesignup" name="usernamesignup" required="required" type="text" placeholder="mysuperusername690" />
                </p>
                <p> 
                    <label for="emailsignup" class="youmail" data-icon="e" > Your email</label>
                    <input id="emailsignup" name="emailsignup" required="required" type="email" placeholder="mysupermail@mail.com"/> 
                </p>
                <p> 
                    <label for="passwordsignup" class="youpasswd" data-icon="p">Your password </label>
                    <input id="passwordsignup" name="passwordsignup" required="required" type="password" placeholder="eg. X8df!90EO"/>
                </p>
                <p> 
                    <label for="passwordsignup_confirm" class="youpasswd" data-icon="p">Please confirm your password </label>
                    <input id="passwordsignup_confirm" name="passwordsignup_confirm" required="required" type="password" placeholder="eg. X8df!90EO"/>
                </p>
                <p class="signin button"> 
                    <input type="submit" value="Sign up"/> 
                </p>
                <p class="change_link">  
                    Already a member ?
                    <a href="#tologin" class="to_register"> Go and log in </a>
                </p>
            </form>
        </div>
         
    </div>
</div> 

	</body/>
</html>