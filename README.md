

* **Task Management System (Java)** *

A console-based Task Management application that allows users to register, login, and manage personal tasks with advanced logic for deletion and global tracking.

## 🚀 Key Features

* **User Management**: Register new users and login using unique numeric IDs.
* **CRUD Operations**: Full support to Add, List, Update, and Delete tasks.
* **Swap-to-Delete Logic**: Implements an efficient deletion algorithm where the target task is swapped with the last element before removal to optimize list performance.
* **Global Tracking**: Uses `static` variables to track the total number of tasks created across all users during a session.
* **Status Tracking**: Tasks include status labels (e.g., "Pending", "In Progress", "Completed") to monitor progress.

## 🛠️ Technical Concepts Used

* **Interfaces**: decoupled logic using `UserManagerInterface` and `TaskManagerInterface`.
* **Static Members**: Utilized `totalTasksCreated` in the `Task` class for global state management.
* **Collections Framework**: Leveraged `ArrayList` for dynamic data storage and `Collections.swap()` for the deletion logic.
* **Exception Handling**: Implemented `InputMismatchException` handling to prevent crashes when users enter non-numeric data.

## 📂 Project Structure

```text
src/
└── Task/
    ├── Main.java                 # Entry point & Menu Logic
    ├── Task.java                 # Task Model (Static & Status)
    ├── User.java                 # User Model
    ├── TaskManager.java          # Task Logic (Swap-Delete)
    ├── UserManager.java          # User Storage Logic
    ├── TaskManagerInterface.java  # Interface for Task Operations
    └── UserManagerInterface.java  # Interface for User Operations

```
