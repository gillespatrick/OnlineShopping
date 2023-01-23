


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>SIGN UP</title>
    </head>
    <body>

        <jsp:directive.include file="../part/header.jsp"/>

        <div class="container-fluid" align = "center">
            <h1>Create New User </h1><br><br>
        </div>
        <br>
        <div class="container-fluid col-3">
            <form action="" method="post" >
                <fieldset class="form-group">
                    <input type="text" class="form-control" name="name" required placeholder="Enter Name">
                </fieldset><br>
                <fieldset class="form-group">
                    <input type="email"  class="form-control" name="email" placeholder="Enter Email" required>
                </fieldset><br>
                <fieldset class="form-group">
                    <input type="number" class="form-control" name="mobilenumber" placeholder="Enter Mobile Number" required>
                </fieldset><br>
                <fieldset class="form-group">
                    <select class="form-select" name="security" required>
                        <option value="Select Your security question"> Select Your security question ! </option>
                        <option value="What was your first car?">What was your first car?  </option>
                        <option value="What is the name of your first pet?">What is the name of your first pet?  </option>
                        <option value="What elementary school did you attend?">What elementary school did you attend?  </option>
                        <option value="What is the name the town where you were born?">What is the name the town where you were born?  </option>
                    </select>
                </fieldset><br>
                <fieldset class="form-group">
                    <input type="text"  class="form-control" name="answer" placeholder="Enter Answer" required>
                </fieldset><br>
                <fieldset class="form-group">
                    <input type="password"  class="form-control" name="password" placeholder="Enter Password" required>
                </fieldset><br>
                <button type="submit" value="signup" class="btn btn-success"> <i class="bi bi-box-arrow-down"></i>
                        Save </button><br>
                    <a  href="signin">  Already have Account ?</a> 
            </form>
        </div>
        <br><br><br>
        <jsp:directive.include file="../part/footer.jsp"/>
    </body>
</html>


