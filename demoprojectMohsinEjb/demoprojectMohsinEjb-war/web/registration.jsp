
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Registration</title>
    </head>
    <body>
        <div  class="form">

            <form id="contactform">

                <p class="contact"><label for="name">Name</label></p>

                <input id="name" name="name" placeholder="First and last name" required="" tabindex="1" type="text">

                <p class="contact"><label for="phone">Mobile phone</label></p>

                <input id="phone" name="phone" placeholder="phone number" required="" type="text"> <br>


                <p class="contact"><label for="email">Email</label></p>

                <input id="email" name="email" placeholder="example@domain.com" required="" type="email">



                <p class="contact"><label for="username">Create a username</label></p>

                <input id="username" name="username" placeholder="username" required="" tabindex="2" type="text">



                <p class="contact"><label for="password">Create a password</label></p>

                <input type="password" id="password" name="password" required="" type="text">

                <p class="contact"><label for="repassword">Confirm your password</label></p>

                <input type="password" id="password" name="password" required="" type="text">

                <form action="/action_page.php">
                    <p> <label for="birthday">Birthday:</label></p>
                    <input type="date" id="birthday" name="birthday">
                    </input>
                </form>
                <select class="select-style gender" name="gender">

                    <option value="select">Gender </option>

                    <option value="m">Male</option>

                    <option value="f">Female</option>

                    <option value="others">Other</option>

                </select><br><br>

                <input class="buttom" name="submit" id="submit" tabindex="5" value="Sign up" type="submit">   

            </form>

        </div>

    </body>
</html>