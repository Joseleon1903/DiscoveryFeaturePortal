AplicacionSpringMVC: Example using Spring 4.x
==============================================================
Author: jose De Leon 
Level: Intermediate  
Technologies: JSP, JPA, JSON, Spring, JUnit  
Summary: The `AplicacionSpringMVC` quickstart is an example of a Java EE 6 application using JSP, JPA 2.0 and Spring 4.x.  
Target Product: WFK  
Product Versions: EAP 6.1, EAP 6.2, EAP 6.3, WFK 2.7  

What is it?
-----------

The `AplicacionSpringMVC` quickstart is an example of a Java EE 6 application using JSP, JPA 2.0 and Spring 4.x. It 
includes a persistence unit and some sample persistence and transaction code to introduce you to database access in enterprise Java:

* In `jboss-as-spring-mvc-context.xml` `<context:component-scan base-package="com.aplication.spring.mvccontroller"/>` 
and `<mvc:annotation-driven/>` are used to register both the non-rest and rest controllers.

* The controllers map the respective urls to methods using `@RequestMapping(url)`.

* To return JSON, the rest controller uses `@ResponseBody`.

* The datasource and entitymanager are retrieved via JNDI.


System Requirements
-------------------

The application this project produces is designed to be run on Red Hat JBoss Enterprise Application Platform (EAP) 6.1 or 
later with the Red Hat JBoss Web Framework Kit (WFK) 2.7.

To run the quickstart with the provided build script, you need the following:

1. Java 1.8, to run JBoss and Maven. You can choose from the following:
    * OpenJDK
    * Oracle Java SE

2. Maven 3.0.0 or later, to build and deploy the examples
    * If you have not yet installed Maven, see the [Maven Getting Started Guide](http://maven.apache.org/guides/getting-started/index.html) for details.
    * If you have installed Maven, you can check the version by typing the following in a command line:

            mvn --version 

3. The JBoss EAP distribution ZIP.
    * For information on how to install and run JBoss, refer to the product documentation.


Configure Maven
---------------

If you have not yet done so, you must [Configure Maven](../README.md#configure-maven) before testing the quickstarts.


Start the JBoss EAP Server
-------------------------

1. Open a command line and navigate to the root of the JBoss EAP directory.
2. The following shows the command line to start the server:

        For Linux:   EAP_HOME/bin/standalone.sh
        For Windows: EAP_HOME\bin\standalone.bat

 
Build and Deploy the Quickstart
-------------------------

_NOTE: The following build command assumes you have configured your Maven user settings. If you have not, you must include 
Maven setting arguments on the command line. See [Build and Deploy the Quickstarts](../README.md#build-and-deploy-the-quickstarts) 
for complete instructions and additional options._

1. Make sure you have started the JBoss EAP server as described above.
2. Open a command line and navigate to the root directory of this quickstart.
3. Type this command to build and deploy the archive:

        mvn clean install jboss-as:deploy

4. This will deploy `target/AplicacionSpringMVC.war` to the running instance of the server.


Access the application
----------------------

The application will be running at the following URL: <http://localhost:8080/AplicacionSpringMVC/>.


Undeploy the Archive
--------------------

1. Make sure you have started the JBoss EAP server as described above.
2. Open a command line and navigate to the root directory of this quickstart.
3. When you are finished testing, type this command to undeploy the archive:

        mvn jboss-as:undeploy


Run the Arquillian Functional Tests
-----------------------------------

This quickstart provides Arquillian functional tests as well. They are located in the functional-tests/ subdirectory under 
the root directory of this quickstart. Functional tests verify that your application behaves correctly from the user's point 
of view. The tests open a browser instance, simulate clicking around the page as a normal user would do, and then close the browser instance.

To run these tests, you must build the main project as described above.

1. Open a command line and navigate to the root directory of this quickstart.
2. Build the quickstart WAR using the following command:

        mvn clean package

3. Navigate to the functional-tests/ directory in this quickstart.
4. If you have a running instance of the JBoss EAP server, as described above, run the remote tests by typing the following command:

        mvn clean verify -Parq-jbossas-remote

5. If you prefer to run the functional tests using managed instance of the JBoss EAP server, meaning the tests will start the 
server for you, type the following command:

        mvn clean verify -Parq-jbossas-managed


Run the Quickstart in JBoss Developer Studio or Eclipse
-------------------------------------

You can also start the server and deploy the quickstart from Eclipse using JBoss tools. For more information, see 
[Use JBoss Developer Studio or Eclipse to Run the Quickstart](../README.md#use-jboss-developer-studio-or-eclipse-to-run-the-quickstarts)


Debug the Application
---------------------

If you want to debug the source code or look at the Javadocs of any library in the project, run either of the following 
commands to pull them into your local repository. The IDE should then detect them.

        mvn dependency:sources
        mvn dependency:resolve -Dclassifier=javadoc



874600ACADEMIA-22589JQ3
 link: https://nam04.safelinks.protection.outlook.com/?url=https%3A%2F%2Fwww.academiaeset.com%2Fdefault%2Fstore%2F248693&data=05%7C02%7Cjedeleon%40unipago.com.do%7C70998dbe36af4624a18808dd87f0380b%7Cb7290e06f6574998a485948a4d4873c0%7C0%7C0%7C638816188037651608%7CUnknown%7CTWFpbGZsb3d8eyJFbXB0eU1hcGkiOnRydWUsIlYiOiIwLjAuMDAwMCIsIlAiOiJXaW4zMiIsIkFOIjoiTWFpbCIsIldUIjoyfQ%3D%3D%7C0%7C%7C%7C&sdata=KU5h7%2Fd2cg4wC%2B9cMMBBTNRsFF5NcSqBhAMJMb4p2mU%3D&reserved=0
link 2 : https://www.academiaeset.com/