# API La Matraca

Es un sistema diseñado para gestionar la finca ganadera "La Matraca". Específicamente, el control de vacunas, visitas de veterinario, compra y venta de las vacas.

### Modelo Entidad - Relación

Para la base de datos se utilizó una BD relacional con MariaDB como motor de gestión:

![Entity-RelationDiagram](/Users/sarantogo/Downloads/Entity-RelationDiagram.png)

### Arquitectura

Se definió una arquitectura por capas:
1. Capa de Persistencia: Repositorios.
2. Capa de Dominio: Entidades
3. Capa de Aplicación/Negocio: Servicios y controladores.

El proyecto está organizado en módulos/paquetes funcionales (las clases se encuentran agrupadas según su caso de uso o funcionalidad):

![Structure](/Users/sarantogo/Downloads/Structure.png
)
### Especificaciones Técnicas

El proyecto está desarrollado con Java JDK versión 21.0.2, usando Spring Boot como marco de trabajo. 

Las dependencias necesarias para ejecutar el proyecto son las siguientes (pom.xml):

- Spring Web
- Spring Data JPA
- Spring Boot DevTools
- Spring Security
- Spring Boot Validation
- MariaDB Driver
- MapStruct para mapear los DTO a Entidades:
```
<dependency>
	<groupId>org.mapstruct</groupId>
	<artifactId>mapstruct</artifactId>
	<version>1.5.5.Final</version>
</dependency>
```
- Json Web Token para la autenticación:
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

### Seguridad:

- Contraseñas encriptadas (BCryptPasswordEncoder)
- Json Web Token
- Roles

### Patrones de Diseño
- Singleton
- Template
- Chain of Responsability
- Builder