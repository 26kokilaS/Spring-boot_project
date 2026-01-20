🌿 Spring Boot CRUD API

This is a simple Spring Boot project that provides REST APIs to create, read, update, and delete items.

---

🛠 Technologies Used

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database (in-memory)

---

🔗 API Endpoints

| Method | Endpoint            | Description         |
|--------|---------------------|---------------------|
| POST   | /api/items          | Create new item     |
| GET    | /api/items          | Get all items       |
| GET    | /api/items/{id}     | Get item by ID      |
| PUT    | /api/items/{id}     | Update item         |
| DELETE | /api/items/{id}     | Delete item         |

---

▶️ How to Run

1. Clone the repository:
   git clone https://github.com/your-username/project-name.git
   cd project-name
   
2.Build and run the project:
   ./mvnw spring-boot:run

3.Access the application:
  http://localhost:8080/api/items

