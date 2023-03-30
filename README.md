# Consuming a REST API with Spring Boot

This is a demo project that demonstrates how to consume a REST API using Spring Boot. The project uses the `RestTemplate` class provided by Spring Boot to make a GET request to the [Official Joke API](https://github.com/15Dkatz/official_joke_api) and retrieve a random joke. The joke is then displayed on a simple web page using Thymeleaf as the template engine.

## Getting Started

To run this project, you need to have [Java 11](https://openjdk.java.net/projects/jdk/11/) or later and [Maven](https://maven.apache.org/) installed on your system. Once you have these tools installed, you can follow these steps:

1. Clone the repository to your local machine:

   ```bash
   git clone https://github.com/danielj909/ConsumingRestDemo.git

2. Navigate to the project directory:

   ```bash
   cd ConsumingRestDemo
   
3. Run the project using Maven:

   ```bash
   mvn spring-boot:run
   
4. Open a web browser and go to http://localhost:8080 to see the random joke.

## Built With
- [Spring Boot](https://spring.io/projects/spring-boot) - The framework used for building the application.
- [Maven](https://maven.apache.org/) - Dependency Management.
- [Thymeleaf](https://www.thymeleaf.org/) - The template engine used for rendering views.
- [Bootstrap](https://getbootstrap.com/) - The CSS framework used for styling the web page.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments
- The [Official Joke API](https://github.com/15Dkatz/official_joke_api) for providing the REST API used in this project.
- The [Spring Boot documentation and guides](https://spring.io/guides) for providing a wealth of information on how to build Spring Boot applications.
