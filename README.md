# Employee Management System

## Overview

This Java project demonstrates a basic Employee Management System with classes to model employees and departments. The program allows for the creation, management, and processing of employee data within a department.

## Classes

### 1. Employee Class

- Represents an individual employee.
- Fields:
  - `id` (int): Identification number of the employee.
  - `name` (String): Name of the employee.
  - `salary` (double): Salary of the employee.
- Methods:
  - Constructors to initialize the fields.
  - Getter and setter methods for each field.
  - `toString()` method to print employee information.

### 2. Department Class

- Represents a department that contains employees.
- Fields:
  - `name` (String): Name of the department.
  - `employees` (Employee[]): Array to store employees (with a capacity of 10 employees).
  - `employeeCount` (int): Number of employees currently in the department.
- Methods:
  - Constructor to initialize the department with a name and an empty employee array.
  - `addEmployee(Employee employee)`: Adds an employee to the department.
  - `getEmployees()`: Returns an array of all employees in the department.
  - `getEmployeeCount()`: Returns the number of employees in the department.
  - `getEmployeeById(int id)`: Returns an employee based on their identification number.
  - `getTotalSalary()`: Returns the total salary of all employees in the department.
  - `getAverageSalary()`: Returns the average salary of employees in the department.
  - `toString()`: Prints information about the department.

### 3. HRApp Class

- Contains the main method to test the Employee and Department classes.
- Creates a department, adds employees, and performs various operations to test the functionality.

## Usage

1. Clone the repository.
2. Open the project in NetBeans or your preferred Java IDE.
3. Run the `HRApp` class.

## Example Output

```plaintext
HR App Starts
Department: Education
Employee: 101 Ann 1234.56
Employee: 102 Bob 1200.34
Employee: 103 Ray 1122.33
Total Salary: 3557.23
Average Salary: 1185.74

## License 

This project is licensed under the Oracle License - see the [ORACLE LEARNING EXPLORER](https://mylearn.oracle.com) Java course for details.