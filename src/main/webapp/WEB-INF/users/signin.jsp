


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>SIGN IN</title>
    </head>
    <body>

        <jsp:directive.include file="../part/header.jsp"/>

        <div class="container-fluid" align = "center">
            <h1>  User Login </h1><br><br>
        </div>
        <br>
        
        <div class="container-fluid col-5 " align = "center">
               <c:if test = "${message != null}">
                <div class="alert alert-dismissible alert-success col-8 ">
                    <strong>${message}</strong>
                </div>

            </c:if>
        </div>
        
        
        <div class="container-fluid col-3">
            
            <form action="signup" method="post" >
                
                <fieldset class="form-group">
                    <input type="email"  class="form-control" name="email" placeholder="Enter Your Email" required>
                </fieldset><br>
               
                <fieldset class="form-group">
                    <input type="password"  class="form-control" name="password" placeholder="Enter Your Password" required>
                </fieldset><br>
                
                <button type="submit" class="btn btn-success"> <i class="bi bi-door-open"></i>
                        Login </button><br>
                    <a  href="registration"> You don't have account ?</a> 
            </form>
        </div>
        <br><br><br>
        <jsp:directive.include file="../part/footer.jsp"/>
    </body>
</html>


