# Blog Backend 
### used Spring Boot 3.0, Maven, and Java 19

This repository contains a blog backend implemented using Spring Boot 3.0, Maven, and Java 19. The blog backend provides REST APIs to create, read, update, and delete blog posts.

The project was generated using Spring Initializr.

 ## Dependencies
- Spring WEB is used for building web applications using Spring MVC.  

- Spring Data Mongodb is used to connect to MongoDB and perform CRUD operations. 


## Installation

1/ Clone the repository: `git clone https://github.com/yaakoubichaima/blog-app-backend.git`

2/ Navigate to the project directory: `cd blog-app-backend`

3/ Install the required dependencies: `mvn clean install`

4/ Run the application: `mvn spring-boot:run`

## Usage
The blog backend provides the following REST APIs:

### Method	URL	Description
| Method |    URL    |     Description      |
| ------ | --------- | -------------------- |
|  GET   | /blogs/ | Retrieve all blogs |
|  GET   | /blogs/{id}  | Retrieve a specific blog by ID|
|  POST   | /blogs/{id}  | Create a new blog post |
|  POST   | /blogs/{id}  | Update an existing blog by ID |
|  DELETE | /blogs/{id}  | Delete a blog by ID |

The request and response body for the REST APIs are in JSON format.

