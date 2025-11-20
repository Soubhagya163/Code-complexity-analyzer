🚀 Code Complexity Analyzer (Ongoing Project)

A full-stack Java-based tool that analyzes user-submitted code to detect syntax errors, generate corrected code suggestions, and estimate time & space complexity using heuristic analysis and AST parsing.
This project aims to help beginners and developers understand and optimize their code efficiently.

📌 Project Overview

This system allows users to upload or paste code through a web interface. The code is then processed on the backend using Java, parsed into an Abstract Syntax Tree (AST), and analyzed to calculate approximate computational complexity. All results and user code are stored using MySQL (JDBC).

🧱 System Architecture
Frontend (HTML/CSS/JS)  →  Java Backend (Servlet/JDBC)  →  MySQL Database

🖥️ 1. Frontend

The frontend provides a simple, user-friendly interface where users can:

Upload code files OR paste code directly in a text editor

Submit code for analysis

View syntax errors, corrected code, and complexity results

Technologies Used

HTML

CSS

JavaScript

The frontend sends requests to the backend using:

Servlet endpoints

REST API calls (planned extension)

⚙️ 2. Backend (Java + JDBC)

The backend is responsible for:

✔ Handling Requests

Built using:

Java Servlets

(Optional Extension) Spring Boot

✔ Storing Uploaded Code

Stored in a MySQL database using JDBC.

✔ Code Parsing & Analysis

The backend:

Parses code using pattern matching

(Future scope) Uses ANTLR or JavaCC for advanced parsing

Builds an Abstract Syntax Tree (AST)

Checks for:

Syntax errors

Missing braces

Unmatched parentheses

Illegal symbols

✔ Complexity Estimation

Based on AST structure, loop depth, recursion, and operations, the system heuristically estimates:

Time Complexity → O(n), O(n²), O(log n), etc.

Space Complexity → Based on memory usage & variable count

🗄️ 3. Database (MySQL)

The database stores user code, analysis results, and logs.

Main Tables

users (optional if login is added)

code_uploads — stores uploaded/pasted code

analysis_results — stores:

time complexity

space complexity

syntax errors

corrected code suggestions

📤 4. Output (Results Displayed to User)

When analysis is complete, the system returns:

✔ Syntax Errors

Highlighted with line numbers

Suggestions for quick fixes

✔ Corrected Code

Provided for minor syntax issues (missing ;, }, etc.)

✔ Complexity Results

Displayed cleanly:

Time Complexity: O(n)

Space Complexity: O(1)

Explanation for why the complexity was assigned

🚧 Project Status: Ongoing

This project is currently in active development.

🔜 Upcoming Features:

AST visualization

Multi-language support (Python, C, JavaScript)

REST API version

Authentication (login/signup)

Code history & dashboard

Improved complexity detection using ML models

🛠️ Tech Stack
Layer	Technologies Used
Frontend	HTML, CSS, JavaScript
Backend	Java, Servlets, JDBC
Database	MySQL
Tools	VS Code, Git, GitHub
📁 Folder Structure
Code-Complexity-Analyzer/
│
├── Frontend/         # HTML, CSS, JS files
├── Backend/          # Java Servlets, JDBC code
└── README.md

🤝 Contributing

Contributions, issues, and feature requests are welcome!

⭐ Support

If you like this project, please ⭐ the repository to support development.