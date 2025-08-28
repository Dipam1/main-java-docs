import java.util.*;

public class Assignment1 {
    public static void as1() {
        int a = 10, b = 20, temp;
        System.out.println("Before Swap: a=" + a + " b=" + b);
        temp = a; a = b; b = temp;
        System.out.println("After Swap: a=" + a + " b=" + b);
    }

    public static void as2() {
        int a = 10, b = 20;
        System.out.println("Before Swap: a=" + a + " b=" + b);
        a = a + b; b = a - b; a = a - b;
        System.out.println("After Swap: a=" + a + " b=" + b);
    }

    public static void as3() {
        int a = 1, b = 2, c = 3, temp;
        System.out.println("Before Swap: a=" + a + " b=" + b + " c=" + c);
        temp = a; a = b; b = c; c = temp;
        System.out.println("After Swap: a=" + a + " b=" + b + " c=" + c);
    }

    public static void as4() {
        int a = 1, b = 2, c = 3;
        System.out.println("Before Swap: a=" + a + " b=" + b + " c=" + c);
        a = a + b + c;
        b = a - (b + c);
        c = a - (b + c);
        a = a - (b + c);
        System.out.println("After Swap: a=" + a + " b=" + b + " c=" + c);
    }

    public static void as5() {
        int a = 1, b = 2, c = 3, d = 4, temp;
        System.out.println("Before Swap: a=" + a + " b=" + b + " c=" + c + " d=" + d);
        temp = a; a = b; b = c; c = d; d = temp;
        System.out.println("After Swap: a=" + a + " b=" + b + " c=" + c + " d=" + d);
    }

    public static void as6() {
        int a = 1, b = 2, c = 3, d = 4;
        System.out.println("Before Swap: a=" + a + " b=" + b + " c=" + c + " d=" + d);
        a = a + b + c + d;
        b = a - (b + c + d);
        c = a - (b + c + d);
        d = a - (b + c + d);
        a = a - (b + c + d);
        System.out.println("After Swap: a=" + a + " b=" + b + " c=" + c + " d=" + d);
    }

    public static void as7() {
        double cost = 699;
        double gst = 18; 
        double finalCost = cost + (cost * gst / 100);
        System.out.println("Final Plan Cost = " + finalCost);
    }

    public static void as8() {
        double pizzaPrice = 399.0;
        int quantity = 2;
        double discount = 20; 
        double bill = pizzaPrice * quantity;
        double finalBill = bill - (bill * discount / 100);
        System.out.println("Final Bill Amount = " + finalBill);
    }

    public static void as9() {
        double salary = 85000;
        double taxPercent = 20;
        double taxAmount = salary * taxPercent / 100;
        System.out.println("Tax Amount = " + taxAmount);
        System.out.println("After Tax Salary = " + (salary - taxAmount));
    }

    public static void as10() {
        double p = 500000, t = 5, r = 6.8;
        double interestAmount = (p * t * r) / 100;
        double finalAmount = p + interestAmount;
        System.out.println("Interest Amount = " + interestAmount);
        System.out.println("Final Amount = " + finalAmount);
    }

    public static void as11() {
        double basicSalary = 85000;
        double ta = basicSalary * 15 / 100;
        double da = basicSalary * 20 / 100;
        double hra = basicSalary * 18 / 100;
        double pf = basicSalary * 20 / 100;
        double tax = basicSalary * 25 / 100;
        double grossAmount = basicSalary + ta + da + hra;
        double netAmount = grossAmount - (pf + tax);
        System.out.println("Gross Amount = " + grossAmount);
        System.out.println("Net Amount = " + netAmount);
    }

    public static void main(String[] args) {
    	
    	//add a while loop to keep asking for input until user enters 12 to exit
    	
    	Scanner scanner = new Scanner(System.in);
    	int choice = 0;
    	while (choice != 12) {
            System.out.println("Enter assignment number (1-11) to execute or 12 to exit:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: as1(); break;
                case 2: as2(); break;
                case 3: as3(); break;
                case 4: as4(); break;
                case 5: as5(); break;
                case 6: as6(); break;
                case 7: as7(); break;
                case 8: as8(); break;
                case 9: as9(); break;
                case 10: as10(); break;
                case 11: as11(); break;
                case 12: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice. Please enter a number between 1 and 12.");
            }
    	}
    	scanner.close();
    	
    	
        
}}
