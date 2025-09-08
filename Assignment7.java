import java.util.Scanner;

public class Assignment7 {

    // 1. Java Program to print maximum among two numbers using if-else.
    public void maxOfTwo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is the maximum.");
        } else {
            System.out.println(num2 + " is the maximum.");
        }
    }

    // 2. Java Program to print maximum among three numbers using if-else.
    public void maxOfThree() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();
        System.out.println("Enter third number:");
        int num3 = scanner.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the maximum.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the maximum.");
        } else {
            System.out.println(num3 + " is the maximum.");
        }
    }

    // 3. Java Program to check whether a given number is divisible by 3 or not.
    public void checkDivisibleBy3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        if (num % 3 == 0) {
            System.out.println(num + " is divisible by 3.");
        } else {
            System.out.println(num + " is not divisible by 3.");
        }
    }

    // 4. Java Program to check whether a given number is divisible by 5 or not.
    public void checkDivisibleBy5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        if (num % 5 == 0) {
            System.out.println(num + " is divisible by 5.");
        } else {
            System.out.println(num + " is not divisible by 5.");
        }
    }
    
    // 5. Java Program to check whether a given number is divisible by 11 or not.
    public void checkDivisibleBy11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        if (num % 11 == 0) {
            System.out.println(num + " is divisible by 11.");
        } else {
            System.out.println(num + " is not divisible by 11.");
        }
    }

    // 6. Java Program to check whether a given number is even or odd.
    public void checkEvenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }

    // 7. Java Program to check whether a year is leap year or not.
    public void checkLeapYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    // 8. Java Program to check whether a given input is digit or not.
    public void checkIsDigit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character:");
        char input = scanner.next().charAt(0);
        if (input >= '0' && input <= '9') {
            System.out.println("'" + input + "' is a digit.");
        } else {
            System.out.println("'" + input + "' is not a digit.");
        }
    }
    
    // 9. Java Program to check whether a given input is alphabet or not.
    public void checkIsAlphabet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character:");
        char input = scanner.next().charAt(0);
        if ((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z')) {
            System.out.println("'" + input + "' is an alphabet.");
        } else {
            System.out.println("'" + input + "' is not an alphabet.");
        }
    }

    // 10. Java Program to check if a given input is a Digit or Alphabet or Special Character.
    public void checkInputType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character:");
        char input = scanner.next().charAt(0);
        if ((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z')) {
            System.out.println("'" + input + "' is an alphabet.");
        } else if (input >= '0' && input <= '9') {
            System.out.println("'" + input + "' is a digit.");
        } else {
            System.out.println("'" + input + "' is a special character.");
        }
    }

    // 11. Java Program to check whether a given number is a positive or negative number.
    public void checkPositiveOrNegative() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println(num + " is a positive number.");
        } else if (num < 0) {
            System.out.println(num + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
    }

    // 12. Java Program to convert temperature from Celsius to Fahrenheit.
    public void convertCelsiusToFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius:");
        float celsius = scanner.nextFloat();
        float fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F.");
    }
    
    // 13. Java Program to convert temperature from Fahrenheit to Celsius.
    public void convertFahrenheitToCelsius() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit:");
        float fahrenheit = scanner.nextFloat();
        float celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + "°F is equal to " + celsius + "°C.");
    }

    // 14. Java Program to check whether a character is a vowel or consonant.
    public void checkVowelOrConsonant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = scanner.next().toLowerCase().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        } else if ((ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is a consonant.");
        } else {
             System.out.println(ch + " is not an alphabet.");
        }
    }
    
    // 15. Java Program to check whether a given character is uppercase or lowercase.
    public void checkUpperOrLowerCase() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = scanner.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase character.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase character.");
        } else {
            System.out.println(ch + " is not an alphabet character.");
        }
    }

    // 16. Java Program to print week day for a given input week number.
    public void printWeekDay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter week number (1-7):");
        int weekNumber = scanner.nextInt();
        if (weekNumber == 1) {
            System.out.println("Sunday");
        } else if (weekNumber == 2) {
            System.out.println("Monday");
        } else if (weekNumber == 3) {
            System.out.println("Tuesday");
        } else if (weekNumber == 4) {
            System.out.println("Wednesday");
        } else if (weekNumber == 5) {
            System.out.println("Thursday");
        } else if (weekNumber == 6) {
            System.out.println("Friday");
        } else if (weekNumber == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid week number.");
        }
    }

    // 17. Java Program to print number of days for a given input month.
    public void printDaysInMonth() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month number (1-12):");
        int month = scanner.nextInt();
        System.out.println("Enter year:");
        int year = scanner.nextInt();

        if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("29 days"); // Leap year
            } else {
                System.out.println("28 days");
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 days");
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("31 days");
        } else {
            System.out.println("Invalid month.");
        }
    }

    // 18. Java Program to check whether a triangle is an equilateral, isosceles, or scalene.
    public void checkTriangleType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of side 1:");
        int side1 = scanner.nextInt();
        System.out.println("Enter length of side 2:");
        int side2 = scanner.nextInt();
        System.out.println("Enter length of side 3:");
        int side3 = scanner.nextInt();

        if (side1 == side2 && side2 == side3) {
            System.out.println("It is an equilateral triangle.");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("It is an isosceles triangle.");
        } else {
            System.out.println("It is a scalene triangle.");
        }
    }
    
    // 19. Java Program to check whether a person is valid for vote or not.
    public void checkVotingEligibility() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("The person is eligible to vote.");
        } else {
            System.out.println("The person is not eligible to vote.");
        }
    }

    // 20. Java Program to check Division on the basis of marks obtained by students.
    public void getStudentDivision() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter percentage:");
        float percentage = scanner.nextFloat();
        if (percentage >= 60) {
            System.out.println("Division 1");
        } else if (percentage >= 45) {
            System.out.println("Division 2");
        } else if (percentage >= 30) {
            System.out.println("Division 3");
        } else {
            System.out.println("Fail");
        }
    }
    
    // 21. Java Program to Calculate percentage and grade of students on the basis of marks obtained in 5 subjects.
    public void calculateStudentGrade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks for Maths:");
        int maths = scanner.nextInt();
        System.out.println("Enter marks for Physics:");
        int physics = scanner.nextInt();
        System.out.println("Enter marks for Chemistry:");
        int chemistry = scanner.nextInt();
        System.out.println("Enter marks for English:");
        int english = scanner.nextInt();
        System.out.println("Enter marks for Hindi:");
        int hindi = scanner.nextInt();

        float total = maths + physics + chemistry + english + hindi;
        float percentage = (total / 500) * 100;

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade A");
        } else if (percentage >= 80) {
            System.out.println("Grade B");
        } else if (percentage >= 70) {
            System.out.println("Grade C");
        } else if (percentage >= 60) {
            System.out.println("Grade D");
        } else if (percentage >= 40) {
            System.out.println("Grade E");
        } else {
            System.out.println("Grade F");
        }
    }

    public static void main(String[] args) {
        Assignment7 assignments = new Assignment7();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Java Assignments Menu ---");
            System.out.println("1. Max of Two Numbers");
            System.out.println("2. Max of Three Numbers");
            System.out.println("3. Check Divisible by 3");
            System.out.println("4. Check Divisible by 5");
            System.out.println("5. Check Divisible by 11");
            System.out.println("6. Check Even or Odd");
            System.out.println("7. Check Leap Year");
            System.out.println("8. Check if Input is a Digit");
            System.out.println("9. Check if Input is an Alphabet");
            System.out.println("10. Check Input Type (Digit, Alphabet, Special)");
            System.out.println("11. Check Positive or Negative");
            System.out.println("12. Convert Celsius to Fahrenheit");
            System.out.println("13. Convert Fahrenheit to Celsius");
            System.out.println("14. Check Vowel or Consonant");
            System.out.println("15. Check Uppercase or Lowercase");
            System.out.println("16. Print Week Day");
            System.out.println("17. Print Days in Month");
            System.out.println("18. Check Triangle Type");
            System.out.println("19. Check Voting Eligibility");
            System.out.println("20. Get Student Division by Percentage");
            System.out.println("21. Calculate Student Percentage and Grade");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: assignments.maxOfTwo(); break;
                case 2: assignments.maxOfThree(); break;
                case 3: assignments.checkDivisibleBy3(); break;
                case 4: assignments.checkDivisibleBy5(); break;
                case 5: assignments.checkDivisibleBy11(); break;
                case 6: assignments.checkEvenOrOdd(); break;
                case 7: assignments.checkLeapYear(); break;
                case 8: assignments.checkIsDigit(); break;
                case 9: assignments.checkIsAlphabet(); break;
                case 10: assignments.checkInputType(); break;
                case 11: assignments.checkPositiveOrNegative(); break;
                case 12: assignments.convertCelsiusToFahrenheit(); break;
                case 13: assignments.convertFahrenheitToCelsius(); break;
                case 14: assignments.checkVowelOrConsonant(); break;
                case 15: assignments.checkUpperOrLowerCase(); break;
                case 16: assignments.printWeekDay(); break;
                case 17: assignments.printDaysInMonth(); break;
                case 18: assignments.checkTriangleType(); break;
                case 19: assignments.checkVotingEligibility(); break;
                case 20: assignments.getStudentDivision(); break;
                case 21: assignments.calculateStudentGrade(); break;
                case 0: System.out.println("Exiting program."); break;
                default: System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
