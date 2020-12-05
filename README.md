# springELK
Simple web application (Customer Relationship Management) built using SpringMVC, JSPs and deployed on Elastic BeanStalk. Application
performs all CRUD operations on a bunch of records that are stored via MySQL DB instance on AWS RDS.

## Steps
* Clone the project from the repository.
* In the project directory, run `mvn clean` command to remove the target folder.
* Launch a RDS (MySQL) instance on AWS cloud console with minimal configuration. Once running, copy the 
instance DNS-link and paste it in the spring-mvc-crud-demo-servlet.xml file in the WEB-INF folder replacing "localhost" from
"jdbcUrl" property of "myDataSource" bean.
* Run `mvn install` from the project directory. This generated the deployable "war" file to be used.
* After launching the RDS instance, try and connect to the MySQL workbench with the same credentials.
* Run the given SQL scripts inside the workbench and create the schema.
* Create a new application environment in the AWS Elastic BeanStalk console and choose "Tomcat" as the 
runnable environment.
* Upload the "spring-crm.war" file from the target directory into the application.
* Configure the instance security group for the RDS instance and allow port for MySQL to listen from anywhere on 3306.
* Once the application is up and health status is OK, Copy the DNS-link and paste in the web browser to see your CRUD application.

