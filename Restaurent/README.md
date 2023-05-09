
* ## Frameworks and languages used

    **Spring Boot**

    Spring Boot is a popular framework for building web applications and microservices using the Java programming language. It provides a streamlined development experience and makes it easy to create stand-alone, production-grade Spring-based applications.

    Spring Boot is built using the Java programming language and is designed to work with a variety of other Java-based frameworks, including:

    * Spring Framework
    * Hibernate
    * Apache Struts
    * Apache Camel
    * Apache CXF
    * Apache Kafka

    **Java**

    Java is also used with a variety of other frameworks and tools, including:

    Android Studio: A popular integrated development environment (IDE) for building Android mobile applications using Java.

    Eclipse: An open-source IDE that is widely used for developing Java-based applications.

    IntelliJ IDEA: A popular IDE for developing Java applications that provides advanced features like code refactoring, code completion, and debugging.

    Maven: A popular build automation tool for Java projects that helps to manage project dependencies and automate the build process.



* ## Data flow

    * **1.controller**
    In Spring MVC, controller methods are the final destination point that a web request can reach. After being invoked, the controller method starts to process the web request by interacting with the service layer to complete the work that needs to be done.

    * **2.services**
    Service Components are the class file which contains @Service annotation. These class files are used to write business logic in a different layer, separated from @RestController class file.

    * **3. Repository**
    Repository is mainly used for managing the data in a Spring Boot Application. We all know that Spring is considered to be a very famous framework of Java. We mainly use this Spring Boot to create the Spring-based stand-alone and production-based applications with a very minimal amount of effort.
    @Repository annotation is used to indicate that the class provides the mechanism for storage, retrieval, search, update and delete operation on objects

    * **4.DataBase Design**
    Spring Boot gives you defaults on all things. For example, the default database is H2 . Consequently, when you want to use any other database, you must define the connection attributes in the application.properties file.

* ## Data Structure used in this project

    **Array List**

    ArrayList in Java is used to store dynamically sized collection of elements. Contrary to Arrays that are fixed in size, an ArrayList grows its size automatically when new elements are added to it. ArrayList is part of Java's collection framework and implements Java's List interface

* ## Project Summary

Restaurent management project involves developing a system for adding, updating, deleting, and getting restaurant details. This can include information such as the restaurant's name, address, contact information,etc,. The system will likely require a database to store and retrieve information, as well as a user interface for restaurant owners or administrators to manage the information. The focus of the project is on the technical aspects of creating a system for restaurant management rather than the broader strategy and operational considerations involved in running a restaurant.

    In this project we have 

    * add restaurent details into database
    * update restaurent details of the user
    * show all the restaurent details 
    * delete the restaurent details and
    * show the details of the particular restaurent. 

