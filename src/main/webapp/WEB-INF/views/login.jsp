<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<title>Login Page</title>

		<!--Stylesheets-->
        <link rel="shortcut icon" href="../favicon.ico"> 
        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/demo.css" />" />
        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/style.css" />" />
        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/animate-custom.css" />" />
		<style>
			.errorblock {
				color: #ff0000;
				background-color: #ffEEEE;
				border: 3px solid #ff0000;
				padding: 8px;
				margin: 16px;
			}
		</style>

</head>
	<body onload='document.f.j_username.focus();'>
	<div id="container_demo" >
    <a class="hiddenanchor" id="toregister"></a>
    <a class="hiddenanchor" id="tologin"></a>
    <div id="wrapper">
        <div id="login" class="animate form">
            <form  action="<c:url value='j_spring_security_check' />"	method='POST' autocomplete="on"> 
                <h1><img alt="Anna Mcgregor" align="middle" src="<c:url value="/resources/images/monogram.gif"/>" /></h1> 
                <p> 
                    <label for="username" class="uname" data-icon="u" >Your username </label>
                    <input type='text' name='j_username' required="required" type="text" placeholder="myusername"/>
                </p>
                <p> 
                    <label for="password" class="youpasswd" data-icon="p"> Your password </label>
                    <input name='j_password' required="required" type="password" placeholder="eg. X8df!90EO" /> 
                </p>
                <p class="keeplogin"> 
                    <input disabled type="checkbox" name="loginkeeping" id="loginkeeping" value="loginkeeping" /> 
                    <label for="loginkeeping">Keep me logged in</label>
                </p>
                <p class="login button"> 
                    <input name="submit" type="submit" value="Login" /> 
                </p>
            </form>
                <c:if test="${not empty error}">
                	<p class="change_link">
						Your login attempt was not successful, try again.<br /> Caused :
						${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
					</p>
                </c:if>

        </div>
			
		   <div id="register" class="animate form">
		   </div>
	  </div>
    
	</div> 
  </body>
</html>