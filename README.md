##CODEBLOG - Blogpost
### Um site CRUD no estilo blogpost usando Spring Boot, Spring Security, Bootstrap, thymeleaf, JPA e integração com PostgreSQL. O projeto é feito na arquitetura MVC.

* Tela Inicial:
![home](https://github.com/andarino/blogpost-Springboot/blob/main/img/home.jpeg)

* Tela para criar novas postagens:
![nposts](https://github.com/andarino/blogpost-Springboot/blob/main/img/npost.jpeg)

* Visualizando as postagens:
![posts](https://github.com/andarino/blogpost-Springboot/blob/main/img/post.jpeg)

## Dependências
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
## Inicializando o server
1 - Baixe o projeto na máquina com `git clone https://github.com/andarino/blogpost-Springboot.git` Após o `clone`. Entre na pasta do projeto.
```sh
cd blogpost-Springboot/
```
Compile e rode o arquivo compilado `projeto-0.0.1-SNAPSHOT.jar` no terminal:
```sh
java -jar projeto-0.0.1-SNAPSHOT.jar.jar
```
>O server estará acessível em `http://localhost:8080/posts`
