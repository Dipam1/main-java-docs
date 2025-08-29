
public class Employeeee {

    // static variable: Shared by all objects of this class
    static String companyName;

    // non-static variables: Each object gets its own copy
    String empName;
    int empId;
    public static void main(String[] args) {
        // Set an initial company name on the class
        Employeeee.companyName = "Tech Solutions Inc.";

        // Create 3 Employeeee objects
        Employeeee e1 = new Employeeee();
        e1.empName = "Alice";
        e1.empId = 101;

        Employeeee e2 = new Employeeee();
        e2.empName = "David";
        e2.empId = 102;

        Employeeee e3 = new Employeeee();
        e3.empName = "Chen";
        e3.empId = 103;
        
        System.out.println("--- Initial Employeeee Details ---");
        System.out.println("Employeeee 1 Company: " + Employeeee.companyName);
        System.out.println("Employeeee 2 Company: " + Employeeee.companyName);
        System.out.println("Employeeee 3 Company: " + Employeeee.companyName);
        System.out.println("-------------------------------------\n");

        // Change the company name once using one of the objects
        System.out.println("...Changing company name...\n");
        Employeeee.companyName = "Global Innovations Ltd.";

        // Check if the change is reflected for all Employeeees
        System.out.println("--- Details After Company Name Change ---");
        System.out.println("Employeeee 1 Company: " + Employeeee.companyName);
        System.out.println("Employeeee 2 Company: " + Employeeee.companyName);
        System.out.println("Employeeee 3 Company: " + Employeeee.companyName);
    }
}