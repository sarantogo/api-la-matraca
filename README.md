# API La Matraca

It is a system designed to manage the "La Matraca" livestock farm. Specifically, the control of vaccines, veterinary visits, buying and selling of cows.

### Entity - Relation Model

For the database, a relational DB was used with MariaDB as the management engine:

![Entity-RelationDiagram](/Users/sarantogo/Downloads/Entity-RelationDiagram.png)

### Architecture

A layered architecture was defined:
1. Persistence Layer: Repositories.
2. Domain Layer: Entities
3. Application / Business Layer: Services and controllers.

The project is organized into functional modules/packages (classes are grouped according to their use case or functionality):

![Structure](/Users/sarantogo/Downloads/Structure.png
)
### Technical specifications

The project is developed with Java JDK version 21.0.2, using Spring Boot framework and Maven as the dependency manager.

The dependencies required to run the project are as follows (pom.xml):

- Spring Web
- Spring Data JPA
- Spring Boot DevTools
- Spring Security
- Spring Boot Validation
- MariaDB Driver
- MapStruct to map DTOs and Entities:
```
<dependency>
	<groupId>org.mapstruct</groupId>
	<artifactId>mapstruct</artifactId>
	<version>1.5.5.Final</version>
</dependency>
```
- Json Web Token for authentication:
```
<dependency>
	<groupId>io.jsonwebtoken</groupId>
	<artifactId>jjwt-api</artifactId>
	<version>0.12.3</version>
</dependency>
<dependency>
	<groupId>io.jsonwebtoken</groupId>
	<artifactId>jjwt-impl</artifactId>
	<version>0.12.3</version>
	<scope>runtime</scope>
</dependency>
<dependency>
	<groupId>io.jsonwebtoken</groupId>
	<artifactId>jjwt-jackson</artifactId>
	<version>0.12.3</version>
    <scope>runtime</scope>
</dependency>
```

### Security:

- Encrypted passwords (BCryptPasswordEncoder)
- Json Web Token
- Roles

### Design Patterns
- Singleton
- Template
- Chain of Responsability
- Builder