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

## Sreenshots

![Screenshot (110)](https://user-images.githubusercontent.com/57689321/101230836-cf2f7700-3675-11eb-8e1c-5c6ceded112f.png)
![Screenshot (107)](https://user-images.githubusercontent.com/57689321/101230837-cfc80d80-3675-11eb-92b4-c73c91b0306b.png)
![Screenshot (108)](https://user-images.githubusercontent.com/57689321/101230838-cfc80d80-3675-11eb-9a04-8cb481709af6.png)
![Screenshot (109)](https://user-images.githubusercontent.com/57689321/101230839-cfc80d80-3675-11eb-9835-03731ea8d428.png)

