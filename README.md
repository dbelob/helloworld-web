# Hello World web application

Creating a simple web application on *Java* in various ways:

1. HTTP Servlet (`web.xml` file)
1. HTTP Servlet (*@WebServlet* annotation)
1. HTTP Servlet (*ServletContainerInitializer* interface implementation)
1. Spring MVC (`web.xml` file)
1. Spring MVC (*Java* configuration)
1. Spring Boot

## Requirements

* [JDK 10+](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
* [Apache Maven 3.5.0+](https://maven.apache.org/download.cgi)

## Running

Change directory

    cd <maven module directory>

From the command line with Maven:

    mvn jetty:run
    (for helloworld-web-servlet-xml, helloworld-web-servlet-annotation, helloworld-web-servlet-java-war, helloworld-web-spring-mvc-xml, helloworld-web-spring-mvc-java)

    mvn spring-boot:run
    (for helloworld-web-spring-boot)

Access the deployed web application at: http://localhost:8080