# 🐪 The Cocky Camel Hospital Nurse Application API

**Group Name:** The Cocky Camel 🐪

A robust and scalable backend solution built with **Spring Boot** to support modern hospital nurse operations, focusing on efficient data management and continuous patient monitoring.

The application is an API that facilitates the management and tracking of **patient vital signs and constants during nurse visits**. It serves as the single source of truth, relying on a powerful, centralized **MySQL Cloud Database**.

-----

## 🎯 Project Overview

This API exposes several REST endpoints to perform core functions on the Nurse entity and support the overall application goals:

### Key Features:

  * **Nurse Management (CRUD):** Securely manage all nurse employee records (Create, Retrieve, Update, Delete).
  * **Login Validation:** A login system for nurses using a username and password.
  * **Integration with BBDD:** Use of **Hibernate** for Object-Relational Mapping (ORM) and data persistence in **MySQL**.
  * **Quality Assurance:** Enforced via a **Continuous Integration (CI) pipeline** using **GitHub Actions**.

-----

## ⚙️ Technical Stack

| Category | Technology | Notes |
| :--- | :--- | :--- |
| **Backend Framework** | Spring Boot | Primary framework for the API development. |
| **Database** | MySQL | The core relational database. |
| **ORM** | Hibernate | Tool for object-relational mapping. |
| **Hosting** | Cloud DB (`filess.io`) | Centralized database for group collaboration. |
| **Testing/QA** | Postman | Used for checking endpoint functionality. |
| **CI/CD** | GitHub Actions | Automated workflow for running unit tests. |

-----

## 🚀 Installation & Setup

Follow these steps to clone the repository, install dependencies, and configure the cloud database environment.

### 1\. Prerequisites

Ensure the following tools are installed on your system:

  * Java Development Kit (JDK)
  * Apache Maven (or Gradle)
  * MySQL Server (for design/local testing)
  * Git

### 2\. Clone the Repository

Clone the global repository:

```bash
git clone [URL_OF_YOUR_GLOBAL_REPOSITORY]
cd hospital-nurse-application
```

### 3\. Database Configuration

The project is designed to work with a centralized MySQL database (e.g., hosted on `filess.io`).

1.  **Design:** The expected database model was designed in **MySQL WorkBench**.

2.  **Configuration:** Update the SpringBoot configuration file (`application.properties` or similar) to use the centralized database:

    ```properties
    # Example for Spring Boot:
    spring.datasource.url=jdbc:mysql://[filess_io_host]:3306/[db_name]
    spring.datasource.username=[your_username]
    spring.datasource.password=[your_password]
    spring.jpa.hibernate.ddl-auto=update
    ```

### 4\. Install Dependencies

Install the necessary dependencies:

```bash
# Example if using Maven
mvn clean install
```

-----

## 💻 Usage and API Endpoints

The API is executed using Spring Boot and all functionalities must be checked using **Postman**.

### 1\. Run the Application

Start the Spring Boot application:

```bash
mvn spring-boot:run
```

The service will typically start on `http://localhost:8080`.

### 2\. Core REST Endpoints

The API includes functionalities for authentication, reading static data (initial version), and full CRUD operations (final version).

| Functionality | HTTP Method | Endpoint Path | Source & Description |
| :--- | :--- | :--- | :--- |
| **Nurse Login** | `POST` | `/nurse/login` | Validates nurse credentials (`user`, `pw`). |
| **Retrieve All** | `GET` | `/nurse/index` | Gets a list of all registered nurses. |
| **Search by Name** | `GET` | `/nurse/name/{name}` | Finds a nurse by name. |
| **Create Nurse** | `POST` | `/nurse` | Creates a new nurse record (Returns **201 OK** or **400** on error). |
| **Retrieve by ID** | `GET` | `/nurse/{id}` | Finds a nurse by their ID (Returns **200 OK** or **404 KO**). |
| **Update Nurse** | `PUT` | `/nurse/{id}` | Updates a nurse record by ID (Handles **200 OK, 404 KO, 400 KO**). |
| **Delete Nurse** | `DELETE` | `/nurse/{id}` | Deletes a nurse record by ID (Returns **200 OK** or **404 KO**). |

-----

## 🛠️ Continuous Integration (CI)

A CI pipeline is set up using **GitHub Actions** to ensure unit tests are executed automatically whenever code changes are committed.

### CI Workflow Goals

  * **Test Coverage:** Basic unit tests cover the most critical functions, including all methods of the `NurseController`.
  * **Automatic Checks:** The pipeline runs automatically on **Pull Requests**.
  * **Error Detection:** It verifies that all unit tests complete successfully, detecting errors early if a simulated failure is introduced.
