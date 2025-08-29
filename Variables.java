public class Variables {
    public static void main(String[] args) {
        System.out.println("Assignment 1: " + LocalVarPractice.add(5, 10));

        Employee e1 = new Employee(101, "Alice", 50000);
        e1.displayDetails();

        Student s1 = new Student("John");
        Student s2 = new Student("Emma");
        s1.display();
        s2.display();

        BankAccount acc = new BankAccount(12345, "David", 1000);
        acc.deposit(500);

        Car c1 = new Car("Tesla", 60000);
        Car c2 = new Car("BMW", 55000);
        System.out.println("Total Cars: " + Car.carCount);

        Product p1 = new Product(1, "Laptop", 1000);
        p1.calculateDiscount(10);

        CollegeStudent st1 = new CollegeStudent(1, "Mike");
        CollegeStudent st2 = new CollegeStudent(2, "Sophia");
        st1.display();
        st2.display();

        Book b1 = new Book("Java Basics", "James");
        b1.printBookInfo();
        Book b2 = new Book("Python Guide", "Guido");
        b2.printBookInfo();

        LibraryMember lm = new LibraryMember(101, "Anna", 2);
        lm.borrowBooks(2);

        EmployeeSalaryTracker emp1 = new EmployeeSalaryTracker(201, "Sam", 40000);
        EmployeeSalaryTracker emp2 = new EmployeeSalaryTracker(202, "Lily", 50000);
        emp1.display();
        emp2.display();
        EmployeeSalaryTracker.displayTotalExpense();

        Circle circle = new Circle(7);
        circle.printArea();
        circle.printCircumference();

        MovieTicket t1 = new MovieTicket();
        MovieTicket t2 = new MovieTicket();
        MovieTicket t3 = new MovieTicket();

        StudentMarks sm = new StudentMarks("Kevin", 80, 90, 70);
        sm.calculateAverage();
    }
}

class LocalVarPractice {
    static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}

class Employee {
    int empId;
    String name;
    double salary;

    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println(empId + " " + name + " " + salary);
    }
}

class Student {
    String name;
    static String schoolName = "Greenwood High";

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name + " studies at " + schoolName);
    }
}

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        double newBalance = balance + amount;
        balance = newBalance;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }
}

class Car {
    String model;
    double price;
    static int carCount = 0;

    Car(String model, double price) {
        this.model = model;
        this.price = price;
        carCount++;
    }
}

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void calculateDiscount(double discountPercent) {
        double discountAmount = (price * discountPercent) / 100;
        double finalPrice = price - discountAmount;
        System.out.println("Discounted Price: " + finalPrice);
    }
}

class CollegeStudent {
    int studentId;
    String studentName;
    static String collegeName = "City College";

    CollegeStudent(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    void display() {
        System.out.println(studentName + " from " + collegeName);
    }
}

class Book {
    String title;
    String author;
    static int bookCount = 0;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        bookCount++;
    }

    void printBookInfo() {
        int serialNumber = bookCount;
        System.out.println("Book " + serialNumber + ": " + title + " by " + author);
    }
}

class LibraryMember {
    int memberId;
    String memberName;
    int booksBorrowed;

    LibraryMember(int memberId, String memberName, int booksBorrowed) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.booksBorrowed = booksBorrowed;
    }

    void borrowBooks(int count) {
        int maxAllowed = 5;
        if (booksBorrowed + count <= maxAllowed) {
            booksBorrowed += count;
            System.out.println(memberName + " borrowed " + count + " books. Total: " + booksBorrowed);
        } else {
            System.out.println("Cannot borrow more than " + maxAllowed + " books.");
        }
    }
}

class EmployeeSalaryTracker {
    int empId;
    String name;
    double salary;
    static int totalEmployees = 0;
    static double totalSalaryExpense = 0;

    EmployeeSalaryTracker(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        totalEmployees++;
        totalSalaryExpense += salary;
    }

    void display() {
        System.out.println(empId + " " + name + " " + salary);
    }

    static void displayTotalExpense() {
        System.out.println("Total Employees: " + totalEmployees);
        System.out.println("Total Salary Expense: " + totalSalaryExpense);
    }
}

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void printArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area: " + area);
    }

    void printCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference: " + circumference);
    }
}

class MovieTicket {
    static int totalTicketsSold = 0;

    MovieTicket() {
        totalTicketsSold++;
        System.out.println("Ticket booked! Total Tickets Sold: " + totalTicketsSold);
    }
}

class StudentMarks {
    String name;
    int mark1, mark2, mark3;

    StudentMarks(String name, int mark1, int mark2, int mark3) {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    void calculateAverage() {
        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;
        System.out.println(name + "'s Average: " + average);
    }
}
