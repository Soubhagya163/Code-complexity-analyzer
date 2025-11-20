# 🚀 Code Complexity Analyzer (Ongoing Project)

A full-stack web tool that analyzes source code and automatically detects **time complexity**, **space complexity**, **syntax errors**, and **inefficient patterns**.  
It also provides **fix recommendations** and suggests **optimized code versions**.

This project is currently under active development.

---

## 🔍 Features

- 📥 **Paste / Upload Code** (Java, C, C++, Python support coming soon)
- ⚡ **Automatic Time Complexity Detection**
- 🧠 **Space Complexity Estimation**
- 🛠️ **Syntax Error Detection + Suggested Fixes**
- 🔁 **Recursion & Loop Pattern Identification**
- 💾 **Stores Code & Results in MySQL Database**
- 🚀 **Instant Output for Previously Analyzed Code**
- 🌐 **Full-Stack Architecture (Frontend + Backend + Database)**

---

## 🛠️ Tech Stack

### **Frontend**
- HTML  
- CSS  
- JavaScript

### **Backend**
- Java  
- JDBC

### **Database**
- MySQL

### **Tools & Libraries**
- VS Code  
- Java Compiler  
- Static Analysis Logic  
- Custom Parsing + Heuristic Complexity Engine

---

## 🧩 System Architecture

Frontend (HTML, CSS, JS)
↓
Backend (Java + JDBC)
↓
MySQL Database

---

## ⚙️ How It Works

1. User pastes or uploads code  
2. Backend receives code as a string  
3. The engine parses lines to detect:
   - Loops  
   - Nested loops  
   - Recursion  
   - Conditionals  
   - Syntax issues  
4. Time and space complexity are estimated  
5. Optimized code and suggestions are generated  
6. Results get saved in MySQL  
7. Frontend displays complexity, errors, and suggestions  

---

## 🎯 Target Users

- Students learning DSA  
- Beginners writing initial code  
- Developers wanting quick complexity checks  
- Educators and mentors reviewing code quality  

---

## 🔮 Future Enhancements

- Support for Python, C, and C++  
- Full AST parsing using ANTLR  
- Login + User Dashboard  
- AI-based code optimization suggestions  
- Syntax highlighting and inline error markers  
- Public API Integration  

---
