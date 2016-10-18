## Happy Email Exercise

A two page web form that when deployed opens up to an input page where a user can then configure an email to send to a recipient.
After an email is sent, the web page then logs the information stored in that email to a histories page where a user can view, edit and delete any histories that he or she sends.

Currently the application is setup to save any email entered into the form but still needs to be updated to send an email via an Email Provider as well as check if an email provider is not functioning and switch to a different provider.

### Motivation

This project was started to show what I could pick up with Spring Tool Suite and Java. As well as being able to utilize javascript to show fundamental knowledge of APIs especially as they pertain to posting to an email client and utilizing CRUD procedures.

### Code Example

Comming soon...

### Installation
Found a very helpful pluralsight video if anyone is interested on how to set up a web form with Spring Tool Suite, this was the basis of my learning.
https://app.pluralsight.com/library/courses/spring-boot-first-application/table-of-contents

1)Java JDK -http://www.oracle.com/technetwork/java/javase/downloads/index.html

2)Used Spring Tool Suite - https://projects.spring.io/spring-framework/
  w/a maven focus - http://maven.apache.org/install.html
  Also used npm package- https://www.npmjs.com/package/package
  
  Dependencies used
  Spring Boot provided: spring-boot-starter-web,  spring-boot-starter-test,  spring-boot-starter-data-jpa,  spring-boot-configuration-processor
  
  Database Engine[Maven]: h2
  
  Repository [Maven]: flyway-core
  
### Free Emailers
MailGun - http://www.mailgun.com/ 
  for nodejs https://github.com/mailgun/mailgun-js
  for java https://github.com/sendgrid/sendgrid-java

SendGrid - https://sendgrid.com/
  for nodejs https://github.com/sendgrid/sendgrid-nodejs

### Running Application
Pull down the full application from github, this will include all the dpendecies that I worked on with the project, make sure your local host is setup with your sts application.
You then should be able to run the application from the Run toolbar(ctrl + F11) and then go to the following address http://localhost:8080/index.html#/ (assuming you did not change your default localhost from 8080)

### Contributors

All are welcome, still need to add more email functionaility as well as unit tests.

