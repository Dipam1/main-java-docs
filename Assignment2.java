
public class Assignment2 {
    public static void arithmeticOperations(int a, int b) {
        System.out.println("1. Arithmetic Operations:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
    }

    public static void incrementDecrementOperations(int n) {
        System.out.println("\n2. Increment/Decrement Operations:");
        System.out.println("Original n: " + n);
        System.out.println("Pre-increment: " + (++n));
        System.out.println("Post-increment: " + (n++));
        System.out.println("After post-increment: " + n);
        System.out.println("Pre-decrement: " + (--n));
        System.out.println("Post-decrement: " + (n--));
        System.out.println("After post-decrement: " + n);
    }

    public static void compoundAssignmentOperations(int x) {
        System.out.println("\n3. Compound Assignment Operations:");
        System.out.println("Original x: " + x);
        System.out.println("After +=5: " + (x += 5));
        System.out.println("After -=2: " + (x -= 2));
        System.out.println("After *=3: " + (x *= 3));
        System.out.println("After /=2: " + (x /= 2));
        System.out.println("After %=3: " + (x %= 3));
    }

    public static void relationalOperations(int a, int b) {
        System.out.println("\n4. Relational Operations:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
    }

    public static void logicalOperations(boolean x, boolean y) {
        System.out.println("\n5. Logical Operations:");
        System.out.println("x AND y: " + (x && y));
        System.out.println("x OR y: " + (x || y));
        System.out.println("NOT x: " + (!x));
    }

    public static void bitwiseOperations(int a, int b) {
        System.out.println("\n6. Bitwise Operations:");
        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("~a: " + (~a));
        System.out.println("a << 1: " + (a << 1));
        System.out.println("a >> 1: " + (a >> 1));
    }

    public static void ternaryOperation(int num) {
        System.out.println("\n7. Ternary Operation:");
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is " + result);
    }

    public static void mixedOperations(int a, int b, int c) {
        System.out.println("\n8. Mixed Operations:");
        boolean result = (a + b > c) && (b != 0);
        System.out.println("(a + b > c) && (b != 0) is: " + result);
    }

    public static void main(String[] args) {
        arithmeticOperations(10, 5);
        incrementDecrementOperations(5);
        compoundAssignmentOperations(10);
        relationalOperations(10, 5);
        logicalOperations(true, false);
        bitwiseOperations(5, 3);
        ternaryOperation(7);
        mixedOperations(5, 3, 7);
    }
}
