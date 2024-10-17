# Library Management System

## Overview
The Library Management System is a Java-based application designed to manage the operations of a library, including book inventory management, patron management, lending, and recommendations. This project follows Object-Oriented Programming (OOP) principles and adheres to SOLID design principles.

## Features
- **Book Management**: Add, update, and remove books from the inventory.
- **Patron Management**: Register and manage library patrons.
- **Lending System**: Lend books to patrons and manage returns.
- **Recommendations**: Recommend books based on available titles.
- **Notifications**: Send email notifications to patrons.

## Technologies Used
- Java
- OOP principles
- SOLID design principles
- [Optional: Any other libraries or frameworks]

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Git
- [Optional: Any other dependencies or tools]

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/abhinay141/library.git
   cd library

class diagram:
          +---------------------+
          |  LibraryManagement  |
          +---------------------+
          | - bookService       |
          | - patronService     |
          | - lendingService    |
          | - inventoryService   |
          | - recommendationService|
          | - notificationSystem |
          +---------------------+
                     |
         +-----------+-----------+
         |                       |
         |                       |
+----------------+      +-------------------+
|   Book         |      |    Patron         |
+----------------+      +-------------------+
| - title        |      | - id              |
| - author       |      | - name            |
| - isbn         |      | - email           |
+----------------+      +-------------------+
         |                       |
         |                       |
         |                       |
         |                       |
         |                       |
+----------------+      +-------------------+
|   Lending      |      |   Notification     |
+----------------+      +-------------------+
| - lendBook()   |      | - sendEmail()     |
| - returnBook() |      +-------------------+
+----------------+

Usage
Add books to the inventory.
Register patrons to the system.
Lend books to patrons and manage returns.
View recommended books.
Receive notifications for due books

