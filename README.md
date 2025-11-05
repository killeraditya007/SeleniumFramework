# Design and Implementation of a Scalable Web Automation Framework using Selenium

## Overview
This project focuses on the **design and implementation of a scalable, modular, and data-driven web automation framework** using **Selenium WebDriver**, integrated with **TestNG**, **Extent Reports**, and **Jenkins** for CI/CD.  
The framework is developed as part of the M.Tech Dissertation at **Birla Institute of Technology and Science (BITS), Pilani**.

---

## Objectives
- Develop a **reusable, maintainable, and scalable** Selenium automation framework.
- Integrate **Data-Driven Testing (DDT)** using Excel/CSV files.
- Implement **custom reporting** with Extent Reports.
- Integrate the framework with **Jenkins** for continuous integration.
- Demonstrate test automation across multiple modules on [DemoQA](https://demoqa.com/).

---

## Tools and Technologies
| Category | Tools/Technologies |
|-----------|--------------------|
| Language | Java 17 |
| Build Tool | Maven |
| Test Framework | TestNG |
| Web Automation | Selenium WebDriver |
| CI/CD | Jenkins |
| Reporting | Extent Reports |
| Data Source | Excel (Apache POI) |
| Logging | SLF4J & Log4j2 |
| Browser Driver Management | WebDriverManager |

---

## Framework Architecture
The framework follows the **Page Object Model (POM)** design pattern with support for:
- **Reusable components** (Driver setup, utilities, configuration)
- **Test data management** (Excel-driven)
- **Test execution layers** (via TestNG)
- **Reporting & logging** (Extent + Log4j)
- **CI/CD compatibility** (Jenkins)

---------------------------------------------------------------------------------------------------------------------------------------------------

Jenking Report CSS issue fix: System.setProperty("hudson.model.DirectoryBrowserSupport.CSP", "") 

