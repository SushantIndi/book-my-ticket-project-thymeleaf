🎬 Book My Ticket – Online Movie Ticket Booking System

🚀 Book My Ticket is a full-stack movie ticket booking web application built using Spring Boot and Thymeleaf.
The system provides separate Admin and User modules for managing movies, theaters, shows, and ticket bookings.

Users can browse movies, select seats, make secure online payments, and receive QR-coded tickets, while admins manage the entire movie booking ecosystem.

🎥 Project Overview
This project demonstrates a complete movie ticket booking workflow, including:
🎟 Movie browsing
🪑 Seat selection
💳 Online payment
📧 Email verification using OTP
📷 Image storage in cloud
🔐 Role-based authentication

The system is built using Spring Boot MVC architecture with database integration and third-party service integrations.

⚙️ Tech Stack
💻 Backend
☕ Java
🌱 Spring Boot
🌱 Spring MVC
📦 Spring Data JPA
🔗 Hibernate
🎨 Frontend
Thymeleaf
HTML5
CSS3
Bootstrap
🗄 Database
MySQL
🔌 Integrations
💳 Razorpay Payment Gateway
☁ Cloudinary (Image Storage)
📧 JavaMailSender (OTP Email Verification)
🔳 QR Code Generator

✨ Key Features
👤 User Module

User Registration & Login
OTP Email Verification
Browse Movies and Shows
Real-time Seat Selection
Online Ticket Booking
Razorpay Payment Integration
QR Code Ticket Generation

🛠 Admin Module
Manage Movies
Manage Theaters
Manage Screens
Manage Seat Layouts
Manage Shows
Block / Unblock Users

🧠 Core Functionalities
✔ Role-based authentication (Admin & User)
✔ OTP verification using email
✔ Secure online payments with Razorpay
✔ Cloud-based image storage using Cloudinary
✔ QR code generation for tickets
✔ Real-time seat availability management
✔ Admin control panel for movie management

🏗 Architecture
The project follows a layered Spring Boot architecture.
Controller Layer
     ↓
Service Layer
     ↓
Repository Layer
     ↓
Database (MySQL)

Layers Explained

Controller Layer
Handles HTTP requests and responses.

Service Layer
Contains business logic for ticket booking, payments, and user management.

Repository Layer
Interacts with the database using Spring Data JPA.

Frontend
Thymeleaf templates render dynamic data from the backend.

📂 Project Structure
book-my-ticket-project-thymeleaf
│
├── src/main/java
│   └── com.Movie_Project.Movie_Tickets
│       ├── DTO
│       ├── Entity
│       ├── Exception
│       ├── Repository
│       ├── Service
│       ├── Util
│       ├── config
│       └── mycontroller
│
├── src/main/resources
│   ├── templates
│   ├── static
│   └── application.yaml
│
├── uploads
│
├── pom.xml

🔐 Authentication System
The system supports two roles:

👨‍💼 Admin
Manage movies
Manage theaters
Manage screens
Manage shows
Manage users

👤 User
Register with OTP verification
Browse movies
Select shows
Book seats
Make payments
Receive QR ticket

💳 Razorpay Payment Flow
1️⃣ User selects seats
2️⃣ Order is created on server
3️⃣ Razorpay payment page opens
4️⃣ User completes payment
5️⃣ Payment signature is verified
6️⃣ Booking is confirmed
7️⃣ QR code ticket is generated

📷 Cloudinary Integration
Cloudinary is used for storing:
Movie posters
Theater images

This helps to:
✔ Reduce server storage
✔ Improve performance
✔ Deliver images faster

🔳 QR Code Ticket System

After successful payment:
A QR code ticket is generated
It contains booking details
Can be used for entry validation

🚀 How to Run the Project

1️⃣ Clone the Repository : git clone https://github.com/SushantIndi/book-my-ticket-project-thymeleaf.git

2️⃣ Open in IDE
Open the project using:
IntelliJ IDEA
Eclipse
VS Code

3️⃣ Configure Database
Create a MySQL database.
Example:
CREATE DATABASE movie_tickets;

Update application.yaml:
spring.datasource.url=jdbc:mysql://localhost:3306/movie_tickets
spring.datasource.username=root
spring.datasource.password=yourpassword

4️⃣ Run the Application
Run the MovieTicketsApplication.java
Open browser:
http://localhost:8080

📚 Learning Outcomes
This project helped in learning:
Spring Boot application architecture
MVC design pattern
Spring Data JPA and Hibernate
Payment gateway integration
Email services with JavaMailSender
Cloud storage using Cloudinary
QR code generation
Secure user authentication

👨‍💻 Author
Sushant Indi
Electronics & Communication Engineering
VTU Student | Java Full Stack Developer

🔗 GitHub
https://github.com/SushantIndi

⭐ Support
If you like this project:
⭐ Star the repository
🍴 Fork the project
💻 Contribute

🎬 Book My Ticket – Your Gateway to Movies! 🍿
