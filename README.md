# Static Data Project – Part 2: Database-Driven Signup & Login

This branch demonstrates the next step in evolving the project. In Part 2, I have implemented user signup and login functionality using a database. Unlike Part 1, where the authentication logic was based on comparing form input values, Part 2 leverages Spring Boot with JPA and Thymeleaf to persist user data.

## Key Features

- **User Signup & Login**: New users are registered into the database, and login is authenticated against stored credentials.
- **Database Integration**: Utilizes Spring Data JPA to interact with a MySQL database.
- **Improved Security**: Implements proper error handling and data validation.
- **Thymeleaf Integration**: Dynamic rendering of signup and login forms.

## How to Run

1. Update the `application.properties` with your database connection details.
2. Build and run the Spring Boot application.
3. Access the signup page at `/signup` and the login page at `/login`.

Check out the complete source code on [GitHub](https://github.com/bibekpandey0521/staticdata1/tree/part2).

---

Feel free to explore, provide feedback, or contribute!
