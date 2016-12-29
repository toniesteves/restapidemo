# REST api demo
About

This is just a simple rest api demo using Spring Boot with Spring Security and JWT (JSON Web Token). The JWT development solution is partially based on the blog entry [REST Security with JWT using Java and Spring Security](https://www.toptal.com/java/rest-security-with-jwt-spring-security-and-java) and the demo project Cerberus. Thanks to the authors!

# Requirements

 * Maven
 * PostgreSQL
 * Java 1.8+

# Usage

Just start the application with the Spring Boot maven plugin. The application is running at http://localhost:8080.

There are three user accounts present to demonstrate the different levels of access to the endpoints in the API and the different authorization exceptions:

* Admin - admin:admin
* User - user:password
* Disabled - disabled:password (this user is disabled)

There are three endpoints that are reasonable for the demo:

* /auth - authentication endpoint with unrestricted access
* /purchases - an example endpoint that is restricted to authorized users (a valid JWT token must be present in the request header)
* /protected - an example endpoint that is restricted to authorized users with the role 'ROLE_ADMIN' (a valid JWT token must be present in the request header)
I've written a small Javascript client and put some comments in the code that hopefully makes this demo understandable.

# Generating password hash for new users

I'm using bcrypt to encode passwords. Your can generate your hashes with this simple tool: Bcrypt Generator

Creator

Toni Esteves

* https://twitter.com/toni_esteves
* https://github.com/toniesteves

#Copyright and license

The code is released under the MIT license.

Please feel free to send me some feedback or questions!
