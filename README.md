# JS Caughlin Individual Project


### Problem Statement
K12 teachers and administrators have to be constantly aware of State and Federal Testing requirement. 
he current solutions would be to spend a lot of money on consulting and creating a curriculum or purchase something with a huge CapEx and a lengthly implementation. 
Student Acheive aspires to be an intuitive, low cost and flexible solution. The Learning Module offer the flexibility where a teacher can either pay a fee for a prebuilt module or they can create their own. Furthermore, teachers have the ability to share their modules and activities with other teachers who subscribe to Student Achieve. In order to accomadate different learners, the activity modules can either be delivered online or be printed out as a worksheet. If printed as a worksheet, the instructor can manually enter a score.

Currently, the application is mobile friendly and application for the iPad is pending. Our version 1.0 doesn't allow for parent/guardian access, but version 2 will support this. Version 2.0 will also facilitate "Home Rights" so a student can have additional learning opportunities at hom.



### Project Technologies/Techniques 

* 	**JUnit Unit Testing**
	* TDD-Create Testing plan
	* Unit Test for jsp's Accessibility?
	* JUnit tests to achieve 80%+ code coverage 
	  	
* **Security/Authentication**
  * Tomcat's JDBC Realm Authentication
  * Admin role: create/read/update/delete (crud) of all data
  * Teacher role: 
  			* Create learning modules
  			* Read student information
  * Student role: read individual pages and update Learning Modules
  * All: Must login to view
  * Pending: When registering for login, all users default to pending and will receive a 
  message that their account is pending admin approval.
  * Version 2.0 Parent Role
  
* **Database**
  * MySQL
  * Store users and roles
  * Store learning module information and UserDao scores
  * Storing Student images and Learning Modules
  
* **ORM Framework**
  * Hibernate 5
  * Generic or Abstact DAO
  * SQL Injection
  
* **git**
	* Always have a working version of Application
	* Utilize branches to Add Features 	 
  
* **Dependency Management**
  * Maven
  * CSS "Dependency Management"

* **CSS/UI Design**
  * Bootstrap
  * WCAG 2.0 Compliant for accessibility
  * Modal Plugin: [A Humaan Project](http://www.humaan.com/modaal/)
  * jsp-Logical Templating and Directory Structure
  
* **Data Validation**
  * Front End: Bootstrap
  * Server: Java (Libraries Available?)
  	 *How can I UserDao Server-Side Validation if it is being caught by front End?*
  	 * Hibernate "Prepared Statements?"
		
* **Logging**
  * Configurable Logging
	* Log Files Separated by Date
	* Server logs separated from Java Classes 
   	* INFO, Debug for development
   	* Separate Production and Testing Logs
	
* **Hosting**
  * AWS-EC2
  * Custom Domain-Route 53
  * SSL Deployment-AWS Certificate Manager
  * Tomcat config files

* **Application Design**
	* Project Lombok for efficiency
	* Hibernate Annotation Tools
  
* **Independent Research Topic/s**
	* Accessible and ethical UI Design-Validation Tools/Test?	
	* Google Cloud Vision API [Link to API](https://cloud.google.com/vision/)
	* Google reCAPTCHA [Link to API](https://developers.google.com/recaptcha/)
	* Angular Front end?

* **IDE: IntelliJ IDEA**
	* Code Quality Plugins
	* Templates 	

### VERSION 2.0

### Design

* [Screen Design](DesignDocuments/WireFrames.bmpr)
* [Database Design](DesignDocuments/studentManager.svg)
* **Application Flow- NEED HELP!!!**

### [Project Plan](ProjectPlan.md)

### [Development Journal](Journal.md)
