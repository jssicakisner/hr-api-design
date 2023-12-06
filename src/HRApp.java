public class HRApp {
    public static void main(String[] args) {
        System.out.println("HR App Starts");

        Department educationDepartment = new Department("Education");

        System.out.println(educationDepartment);

        Employee employee1 = new Employee(101, "Ann", 1234.56);
        Employee employee2 = new Employee(102, "Bob", 1200.34);
        Employee employee3 = new Employee(103, "Ray", 1122.33);

        educationDepartment.addEmployee(employee1);
        educationDepartment.addEmployee(employee2);
        educationDepartment.addEmployee(employee3);

        Employee foundEmployee = educationDepartment.getEmployeeById(102);
        if (foundEmployee != null) {
            System.out.println(foundEmployee);
        } else {
            System.out.println("Employee not found");
        }

        for (Employee employee : educationDepartment.getEmployees()) {
            System.out.println(employee);
        }

        System.out.println("Total Salary: " + educationDepartment.getTotalSalary());

        System.out.println("Average Salary: " + educationDepartment.getAverageSalary());
    }
}