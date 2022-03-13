## CODEBLOG - Blogpost
 A blogpost application that uses user authentication  

![spring](https://img.shields.io/badge/Spring-6DB33F?logo=spring&logoColor=white)
![jpa](https://img.shields.io/badge/Made%20with-JPA-brightgreen)
![postgres](https://img.shields.io/badge/PostgreSQL-316192?logo=postgresql&logoColor=white)
![thymeleaf](https://img.shields.io/badge/-Thymeleaf-brightgreen)


* Home
![home](https://github.com/andarino/blogpost-Springboot/blob/main/img/home.jpeg)

* View to create new posts
![nposts](https://github.com/andarino/blogpost-Springboot/blob/main/img/npost.jpeg)

* Viewing posts
![posts](https://github.com/andarino/blogpost-Springboot/blob/main/img/post.jpeg)

## Dependencies
* Java:
```
$ java --version
openjdk 15.0.2 2021-01-19
OpenJDK Runtime Environment (build 15.0.2+7)
OpenJDK 64-Bit Server VM (build 15.0.2+7, mixed mode)
```
* Maven:
```
$ mvn --version
Apache Maven 3.8.2 (NON_CANONICAL)
Maven home: /opt/maven
Java version: 15.0.2, vendor: N/A, runtime: /usr/lib/jvm/java-15-openjdk
Default locale: en_US, platform encoding: UTF-8
OS name: "linux", version: "5.10.42-1-manjaro", arch: "amd64", family: "unix"
```
## Initializing the server
1 - Download the project to the machine with `git clone https://github.com/andarino/blogpost-Springboot.git`. Then enter the project folder.
```sh
cd blogpost-Springboot/
```
Compile and run the compiled file  `projeto-0.0.1-SNAPSHOT.jar`:
```sh
mvn clean install
cd target/
java -jar projeto-0.0.1-SNAPSHOT.jar.jar
```
>The server will be accessible at `http://localhost:8080/posts`
