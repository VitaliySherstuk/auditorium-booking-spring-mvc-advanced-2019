<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>${title}</title>
    <link href="/resources/css/registration.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div id="registration-box">
    <h1>${title}</h1>

    <form method="post" action="/registration">

        <div>
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" value="alexey">
        </div>
        <div>
            <label for="email">Email:</label>
            <input type="text" id="email" name="email" value="fasdfasffd@gmail.com">
        </div>
        <div>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" value="123123">
        </div>
        <div>
            <label for="role">Role:</label>
            <input type="text" id="role" name="role" value="BOOKING_MANAGER">
        </div>
        <div>
            <label for="birthday">Birthday:</label>
            <input type="text" id="birthday" name="birthday" value="2000-01-01">
        </div>

        <button type="submit">Register</button>
    </form>
</div>
</body>
</html>