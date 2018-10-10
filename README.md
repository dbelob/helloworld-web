# Hello World web application

Creating a simple web application on *Java* in various ways:

1. HTTP Servlet:
   * `web.xml` file
   * *@WebServlet* annotation
   * *ServletContainerInitializer* interface implementation
1. [Spring MVC](https://spring.io/projects/spring-framework):
   * `web.xml` file
   * *Java* configuration
1. [Spring Boot](https://spring.io/projects/spring-boot):
   * Spring MVC
   * Spring WebFlux
1. [JavaServer Faces](https://javaee.github.io/javaserverfaces-spec/):
   * [Apache MyFaces](http://myfaces.apache.org)
   * [Oracle Mojarra](http://javaserverfaces.java.net)
1. [Google Web Toolkit](http://www.gwtproject.org)
1. [Struts](https://struts.apache.org)
1. [Dropwizard](https://www.dropwizard.io)
1. [Play](https://www.playframework.com)
1. [JAX-RS](https://github.com/jax-rs)
   * [Apache CXF](http://cxf.apache.org)
   * [Jersey](https://jersey.github.io)
   * [RESTEasy](https://resteasy.github.io)
1. [Vaadin](https://vaadin.com)
1. [Seam](http://seamframework.org)
1. [Wicket](https://wicket.apache.org)
1. [Tapestry](http://tapestry.apache.org)
1. [Spark Java](http://sparkjava.com)
1. [Vert.x](https://vertx.io)
1. [Rapidoid](https://www.rapidoid.org)
1. [Lagom](https://www.lagomframework.com)
1. [Ratpack](https://ratpack.io)
1. [Micronaut](http://micronaut.io)
1. [MicroProfile](https://microprofile.io):
   * [Hammock](https://hammock-project.github.io)
   * [WildFly Swarm](http://wildfly-swarm.io)/[Thorntail](https://thorntail.io)
   * [Helidon](https://helidon.io)
   * [Payara Micro](https://www.payara.fish/payara_micro)

## Requirements

* [JDK 8+](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
* [Apache Maven 3.5.0+](https://maven.apache.org/download.cgi)

## Running

1. Change directory:
    `cd <maven module directory>`

1. From the command line with Maven:

    `mvn jetty:run`  
    (for *helloworld-web-servlet-xml*, *helloworld-web-servlet-annotation*, *helloworld-web-servlet-interface-war*, *helloworld-web-spring-mvc-xml*, *helloworld-web-spring-mvc-java*, *helloworld-web-jsf-myfaces*, *helloworld-web-jsf-mojarra*, *helloworld-web-struts*, *helloworld-web-jaxrs-apache-cxf*, *helloworld-web-jaxrs-jersey*, *helloworld-web-jaxrs-resteasy*, *helloworld-web-vaadin*, *helloworld-web-seam*, *helloworld-web-wicket*, *helloworld-web-tapestry* modules)

    `mvn spring-boot:run`  
    (for *helloworld-web-spring-boot-mvc*, *helloworld-web-spring-boot-webflux* modules)

    `mvn gwt:codeserver`  
    (in one terminal window for *helloworld-web-gwt-client* module)  
    `mvn jetty:run`  
    (in another terminal window for *helloworld-web-gwt-server* module)
    
    `mvn package`  
    `java -jar target/hello-world.jar server hello-world.yml`  
    (for *helloworld-web-dropwizard* module)
    
    `mvn clean package`  
    `mvn play2:run`  
    (for *helloworld-web-play* module)
    
    `mvn package`  
    `mvn lagom:runAll`  
    (for *helloworld-web-lagom-impl* module)
    
    `mvn package`  
    `java -jar target/hello-world.jar`  
    (for *helloworld-web-sparkjava*, *helloworld-web-vertx*, *helloworld-web-rapidoid*, *helloworld-web-ratpack*, *helloworld-web-micronaut*, *helloworld-web-microprofile-hammock*, *helloworld-web-microprofile-helidon* modules)
    
    `mvn package`  
    `java -jar target/hello-world-swarm.jar`  
    (for *helloworld-web-microprofile-wildfly-swarm* module)
    
    `mvn package`  
    `java -jar target/hello-world-microbundle.jar`  
    (for *helloworld-web-microprofile-payara* module)

1. Access the deployed web application at: http://localhost:8080