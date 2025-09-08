import java.util.Scanner;

public class Assignment6 {

    // 1. Java program to print all natural numbers from 1 to n.
    public void printNaturalNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.println("Natural numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 2. Java program to print all even numbers between 1 to 100.
    public void printEvenNumbers1to100() {
        System.out.println("Even numbers between 1 and 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // 3. Java program to print all odd numbers between 1 to 100.
    public void printOddNumbers1to100() {
        System.out.println("Odd numbers between 1 and 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // 4. Java program to print sum of all even numbers between 1 to n.
    public void sumOfEvenNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of even numbers from 1 to " + n + " is: " + sum);
    }

    // 5. Java program to print sum of all odd numbers between 1 to n.
    public void sumOfOddNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Sum of odd numbers from 1 to " + n + " is: " + sum);
    }

    // 6. Java program to print multiplication of any number.
    public void printMultiplicationTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

    // 7. Java program to count the digits of a given number.
    public void countDigits() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int count = 0;
        for (int temp = num; temp != 0; temp /= 10) {
            count++;
        }
        System.out.println("Number of digits in " + num + " is: " + count);
    }

    // 8. Java program to print the sum of digits of a given number.
    public void sumOfDigits() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int sum = 0;
        for (int temp = num; temp != 0; temp /= 10) {
            sum += temp % 10;
        }
        System.out.println("Sum of digits in " + num + " is: " + sum);
    }

    // 9. Java program to print all natural numbers in reverse order.
    public void printNaturalNumbersReverse() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.println("Natural numbers from " + n + " to 1:");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    // 10. Java program to check whether a given number is Prime or not.
    public void checkPrime() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    // 11. Java program to print all Prime numbers between 1 to n.
    public void printPrimesUpToN() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.println("Prime numbers between 1 and " + n + ":");
        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    
    // 12. Java program to find sum of all prime numbers between 1 to n.
    public void sumOfPrimesUpToN() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        long sum = 0;
        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += num;
            }
        }
        System.out.println("Sum of prime numbers between 1 and " + n + " is: " + sum);
    }

    // 13. Java program to check a given number is Armstrong or not.
    public void checkArmstrong() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int originalNum = num;
        int digits = 0;
        int result = 0;

        for (int temp = num; temp != 0; temp /= 10) {
            digits++;
        }

        for (int temp = num; temp != 0; temp /= 10) {
            int remainder = temp % 10;
            int power = 1;
            for(int i = 0; i < digits; i++) {
                power *= remainder;
            }
            result += power;
        }

        if (result == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
    
    // 14. Java program to print all Armstrong numbers between 1 to n.
    public void printArmstrongUpToN() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.println("Armstrong numbers between 1 and " + n + ":");

        for (int num = 1; num <= n; num++) {
            int originalNum = num;
            int digits = 0;
            int result = 0;

            for (int temp = num; temp != 0; temp /= 10) {
                digits++;
            }

            for (int temp = num; temp != 0; temp /= 10) {
                int remainder = temp % 10;
                int power = 1;
                for(int i = 0; i < digits; i++) {
                    power *= remainder;
                }
                result += power;
            }

            if (result == originalNum) {
                System.out.print(originalNum + " ");
            }
        }
        System.out.println();
    }
    
    // 15. Java program to check a given number is Perfect or not.
    public void checkPerfectNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.println(num + " is a Perfect number.");
        } else {
            System.out.println(num + " is not a Perfect number.");
        }
    }

    // 16. Java program to check all Perfect numbers between 1 to n.
    public void printPerfectNumbersUpToN() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.println("Perfect numbers between 1 and " + n + ":");
        for (int num = 1; num <= n; num++) {
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    
    // 17. Java program to check a given number is Strong number or not.
    public void checkStrongNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int originalNum = num;
        int sum = 0;

        for (int temp = num; temp > 0; temp /= 10) {
            int digit = temp % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is a Strong number.");
        } else {
            System.out.println(originalNum + " is not a Strong number.");
        }
    }

    // 18. Java program to print all Strong numbers between 1 to n.
    public void printStrongNumbersUpToN() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.println("Strong numbers between 1 and " + n + ":");

        for (int num = 1; num <= n; num++) {
            int originalNum = num;
            int sum = 0;

            for (int temp = num; temp > 0; temp /= 10) {
                int digit = temp % 10;
                int fact = 1;
                for (int i = 1; i <= digit; i++) {
                    fact *= i;
                }
                sum += fact;
            }

            if (sum == originalNum) {
                System.out.print(originalNum + " ");
            }
        }
        System.out.println();
    }

    // 19. Write a program in Java to swap first and last digit of a number.
    public void swapFirstAndLastDigit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int lastDigit = num % 10;
        int firstDigit = num;
        int power = 1;

        for (; firstDigit >= 10; firstDigit /= 10) {
             power *= 10;
        }

        int middleDigits = num % power;
        middleDigits = middleDigits / 10;

        int swappedNum = lastDigit * power + middleDigits * 10 + firstDigit;
        System.out.println("Original number: " + num);
        System.out.println("Number after swapping first and last digit: " + swappedNum);
    }
    
    // 20. Java program to swap values using a third variable.
    public void swapWithThirdVariable() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();
        
        System.out.println("Before swap: a = " + a + ", b = " + b);
        for(int i = 0; i < 1; i++) { // Loop runs once to satisfy prompt
            int temp = a;
            a = b;
            b = temp;
        }
        System.out.println("After swap: a = " + a + ", b = " + b);
    }

    // 21. Java program to swap values without using a third variable.
    public void swapWithoutThirdVariable() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();

        System.out.println("Before swap: a = " + a + ", b = " + b);
        for(int i = 0; i < 1; i++) { // Loop runs once to satisfy prompt
             a = a + b;
             b = a - b;
             a = a - b;
        }
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
    
    // 22 & 23. Java program to find power of a number without using pow method.
    public void calculatePowerWithoutPow() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base: ");
        long base = scanner.nextLong();
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();
        long result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        System.out.println(base + " ^ " + exponent + " = " + result);
    }
    
    // 24. Java program to calculate power of a number using pow method.
    public void calculatePowerWithPow() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();
        double result = 0;
        for(int i = 0; i < 1; i++) { // Loop runs once to satisfy prompt
            result = Math.pow(base, exponent);
        }
        System.out.println(base + " ^ " + exponent + " = " + result);
    }
    
    // 25. Java program to check number is palindrome or not.
    public void checkPalindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int originalNum = num;
        int reversedNum = 0;
        for (; num != 0; num /= 10) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
        }
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
    
    // 26. Java program to print Fibonacci series of a given number.
    public void printFibonacciSeries() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        int t1 = 0, t2 = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        System.out.println();
    }
    
    // 27. Java program to print Fibonacci series using recursion.
    private int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
    
    public void printFibonacciWithRecursion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        System.out.print("Fibonacci Series (using recursion): ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        System.out.println();
    }

    // 28. Java program to print the frequency of digits in given number.
    public void printDigitFrequency() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = scanner.nextLong();
        int[] freq = new int[10];
        
        for (long temp = num; temp > 0; temp /= 10) {
            int digit = (int) (temp % 10);
            freq[digit]++;
        }
        
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " occurs " + freq[i] + " times.");
            }
        }
    }
    
    // 29. Write a program in Java to print ASCII character with values.
    public void printAsciiValues() {
        System.out.println("ASCII Table:");
        for (int i = 0; i <= 255; i++) {
            System.out.println("Value: " + i + "  Character: " + (char) i);
        }
    }
    
    // 30 & 32. Java program to print all alphabets from a to z.
    public void printLowercaseAlphabets() {
        System.out.println("Lowercase Alphabets (a-z):");
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    // 31. Java program to print all uppercase alphabets.
    public void printUppercaseAlphabets() {
        System.out.println("Uppercase Alphabets (A-Z):");
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
    
    // 33. Java program to print all factors of a number.
    public void printFactors() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.print("Factors of " + num + " are: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
    // 34. Java program to print HCF (GCD) of two numbers.
    public void findHCF() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int hcf = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println("HCF (GCD) of " + num1 + " and " + num2 + " is: " + hcf);
    }
    
    // 35. Java program to print LCM of two numbers.
    public void findLCM() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int hcf = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        int lcm = (num1 * num2) / hcf;
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
    
    // 36. Write a Java program to find all prime factors of a number.
    public void findPrimeFactors() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.print("Prime factors of " + num + " are: ");
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Assignment6 assignment = new Assignment6();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Java 'For Loop' Assignments Menu ---");
            System.out.println("1. Print Natural Numbers 1 to n");
            System.out.println("2. Print Even Numbers 1 to 100");
            System.out.println("3. Print Odd Numbers 1 to 100");
            System.out.println("4. Sum of Even Numbers 1 to n");
            System.out.println("5. Sum of Odd Numbers 1 to n");
            System.out.println("6. Print Multiplication Table");
            System.out.println("7. Count Digits of a Number");
            System.out.println("8. Sum of Digits of a Number");
            System.out.println("9. Print Natural Numbers in Reverse");
            System.out.println("10. Check if a Number is Prime");
            System.out.println("11. Print Prime Numbers 1 to n");
            System.out.println("12. Sum of Prime Numbers 1 to n");
            System.out.println("13. Check if a Number is Armstrong");
            System.out.println("14. Print Armstrong Numbers 1 to n");
            System.out.println("15. Check if a Number is Perfect");
            System.out.println("16. Print Perfect Numbers 1 to n");
            System.out.println("17. Check if a Number is Strong");
            System.out.println("18. Print Strong Numbers 1 to n");
            System.out.println("19. Swap First and Last Digits of a Number");
            System.out.println("20. Swap two numbers (with 3rd variable)");
            System.out.println("21. Swap two numbers (without 3rd variable)");
            System.out.println("22. Calculate Power of a Number (without pow())");
            System.out.println("24. Calculate Power of a Number (with pow())");
            System.out.println("25. Check if a Number is Palindrome");
            System.out.println("26. Print Fibonacci Series");
            System.out.println("27. Print Fibonacci Series (with recursion)");
            System.out.println("28. Print Frequency of Digits");
            System.out.println("29. Print ASCII values and characters");
            System.out.println("30. Print Lowercase Alphabets");
            System.out.println("31. Print Uppercase Alphabets");
            System.out.println("33. Print Factors of a Number");
            System.out.println("34. Find HCF (GCD) of two numbers");
            System.out.println("35. Find LCM of two numbers");
            System.out.println("36. Find Prime Factors of a Number");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: assignment.printNaturalNumbers(); break;
                case 2: assignment.printEvenNumbers1to100(); break;
                case 3: assignment.printOddNumbers1to100(); break;
                case 4: assignment.sumOfEvenNumbers(); break;
                case 5: assignment.sumOfOddNumbers(); break;
                case 6: assignment.printMultiplicationTable(); break;
                case 7: assignment.countDigits(); break;
                case 8: assignment.sumOfDigits(); break;
                case 9: assignment.printNaturalNumbersReverse(); break;
                case 10: assignment.checkPrime(); break;
                case 11: assignment.printPrimesUpToN(); break;
                case 12: assignment.sumOfPrimesUpToN(); break;
                case 13: assignment.checkArmstrong(); break;
                case 14: assignment.printArmstrongUpToN(); break;
                case 15: assignment.checkPerfectNumber(); break;
                case 16: assignment.printPerfectNumbersUpToN(); break;
                case 17: assignment.checkStrongNumber(); break;
                case 18: assignment.printStrongNumbersUpToN(); break;
                case 19: assignment.swapFirstAndLastDigit(); break;
                case 20: assignment.swapWithThirdVariable(); break;
                case 21: assignment.swapWithoutThirdVariable(); break;
                case 22: case 23: assignment.calculatePowerWithoutPow(); break;
                case 24: assignment.calculatePowerWithPow(); break;
                case 25: assignment.checkPalindrome(); break;
                case 26: assignment.printFibonacciSeries(); break;
                case 27: assignment.printFibonacciWithRecursion(); break;
                case 28: assignment.printDigitFrequency(); break;
                case 29: assignment.printAsciiValues(); break;
                case 30: case 32: assignment.printLowercaseAlphabets(); break;
                case 31: assignment.printUppercaseAlphabets(); break;
                case 33: assignment.printFactors(); break;
                case 34: assignment.findHCF(); break;
                case 35: assignment.findLCM(); break;
                case 36: assignment.findPrimeFactors(); break;
                case 0: System.out.println("Exiting program."); break;
                default: System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
