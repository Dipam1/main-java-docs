
public class Employee {

    // static variable: Shared by all objects of this class
    static String companyName;

    // non-static variables: Each object gets its own copy
    String empName;
    int empId;
    public static void main(String[] args) {
        // Set an initial company name on the class
        Employee.companyName = "Tech Solutions Inc.";

        // Create 3 employee objects
        Employee e1 = new Employee();
        e1.empName = "Alice";
        e1.empId = 101;

        Employee e2 = new Employee();
        e2.empName = "David";
        e2.empId = 102;

        Employee e3 = new Employee();
        e3.empName = "Chen";
        e3.empId = 103;
        
        System.out.println("--- Initial Employee Details ---");
        System.out.println("Employee 1 Company: " + e1.companyName);
        System.out.println("Employee 2 Company: " + e2.companyName);
        System.out.println("Employee 3 Company: " + e3.companyName);
        System.out.println("-------------------------------------\n");

        // Change the company name once using one of the objects
        System.out.println("...Changing company name...\n");
        e1.companyName = "Global Innovations Ltd.";

        // Check if the change is reflected for all employees
        System.out.println("--- Details After Company Name Change ---");
        System.out.println("Employee 1 Company: " + e1.companyName);
        System.out.println("Employee 2 Company: " + e2.companyName);
        System.out.println("Employee 3 Company: " + e3.companyName);
    }
}