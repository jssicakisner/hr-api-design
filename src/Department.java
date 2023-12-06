public class Department {
    private String name;
    private Employee[] employees;
    private int employeeCount;
    private static final int MAX_EMPLOYEES = 10;

    public Department(String name) {
        this.name = name;
        this.employees = new Employee[MAX_EMPLOYEES];
        this.employeeCount = 0;
    }

    public String getName() {
        return name;
    }

    public void addEmployee(Employee employee) {
        if (employeeCount < MAX_EMPLOYEES) {
            employees[employeeCount] = employee;
            employeeCount++;
        } else {
            System.out.println("Department is at full capacity. Cannot add more employees.");
        }
    }

    public Employee[] getEmployees() {
        Employee[] result = new Employee[employeeCount];
        System.arraycopy(employees, 0, result, 0, employeeCount);
        return result;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public double getTotalSalary() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public double getAverageSalary() {
        if (employeeCount == 0) {
            return 0;
        }
        return getTotalSalary() / employeeCount;
    }

    @Override
    public String toString() {
        return "Department: " + name;
    }
}
