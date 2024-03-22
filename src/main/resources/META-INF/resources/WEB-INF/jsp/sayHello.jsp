<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Say Hello jsp</title>
</head>
<body>
    <h1>Say Hello JSP response</h1>
    <p>
        This is a simple JSP response from the server.
    </p>
    <article style="font-size: larger;">
        For this the JSP file is placed in the src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp<br><br>
        The JSP file is served by the server when the URL /say-hello-jsp is hit.<br><br>
        In the properties file the view resolver is configured to look for the JSP files in the WEB-INF/jsp folder.<br><br>
        The full path of the JSP file is src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp<br><br>
        Spring Boot automatically configures the view resolver to look for the JSP files in the WEB-INF/jsp folder.<br><br>
        We need to set the prefix and suffix for the view resolver in the application.properties file. <br>The part from src/main/resources/META-INF is automatically picked up by Spring Boot.<br>
    </article>
</body>
</html>