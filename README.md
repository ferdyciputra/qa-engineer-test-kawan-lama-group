# Katalon Web Automation Sample - Healthcare

This project is a sample web automation project using [Katalon Studio](https://www.katalon.com/) for a healthcare web application. The project demonstrates how to automate testing scenarios such as user registration, login, appointment booking, and logout functionalities.

## Prerequisites

1. **Katalon Studio**
   - Download and install Katalon Studio from [here](https://www.katalon.com/download/).

2. **Web Browser**
   - Install a supported web browser (e.g., Google Chrome, Mozilla Firefox).
   - Ensure the corresponding browser driver is installed and configured in Katalon Studio.

3. **Sample Web Application**
   - Use the healthcare demo application provided by Katalon Studio:
     [Healthcare Demo App](https://katalon-demo-cura.herokuapp.com/)

## Getting Started

### Clone or Download the Project

1. Clone this repository or download it as a ZIP file.
2. Extract the ZIP file if downloaded.
3. Open the project in Katalon Studio.

```bash
git clone https://github.com/ferdyciputra/katalon-healthcare-sample.git
```

### Project Structure

- **Test Cases**
  - Contains individual test case scripts for specific functionalities (e.g., login, registration, appointment booking).
- **Test Suites**
  - Groups of related test cases for execution (e.g., Smoke Test, Regression Test).
- **Object Repository**
  - Stores the web elements used in the test cases.
- **Data Files**
  - Contains test data for parameterized testing.

### Key Features

- **Login and Logout Testing**
- **Appointment Booking**

## Execution Instructions

1. Open Katalon Studio and load the project.
2. Navigate to the **Test Suites** folder.
3. Select a test suite (e.g., `Healthcare_Smoke_Test` or `Healthcare_Regression_Test`).
4. Click the **Run** button and choose your preferred browser for execution.

## Reporting

Katalon Studio generates test execution reports in the `Reports` folder. You can access detailed execution logs and screenshots of failed steps.

