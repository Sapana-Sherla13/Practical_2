public class AllOperators {
    public static void main(String[] args) {

        int a = 10, b = 5;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // Logical Operators
        System.out.println("\nLogical Operators:");
        System.out.println("(a > b) && (a != b) : " + ((a > b) && (a != b)));
        System.out.println("(a < b) || (a != b) : " + ((a < b) || (a != b)));
        System.out.println("!(a > b) : " + (!(a > b)));

        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = a;
        System.out.println("c = " + c);

        c += b;
        System.out.println("c += b : " + c);

        c -= b;
        System.out.println("c -= b : " + c);

        c *= b;
        System.out.println("c *= b : " + c);

        c /= b;
        System.out.println("c /= b : " + c);

        c %= b;
        System.out.println("c %= b : " + c);

        // Unary Operators
        System.out.println("\nUnary Operators:");
        int x = 10;
        System.out.println("x++ : " + (x++));
        System.out.println("++x : " + (++x));
        System.out.println("x-- : " + (x--));
        System.out.println("--x : " + (--x));

        // Bitwise Operators
        System.out.println("\nBitwise Operators:");
        System.out.println("a & b : " + (a & b));
        System.out.println("a | b : " + (a | b));
        System.out.println("a ^ b : " + (a ^ b));
        System.out.println("~a : " + (~a));

        // Shift Operators
        System.out.println("\nShift Operators:");
        System.out.println("a << 1 : " + (a << 1));
        System.out.println("a >> 1 : " + (a >> 1));
        System.out.println("a >>> 1 : " + (a >>> 1));

        // Ternary Operator
        System.out.println("\nTernary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Greater number = " + max);
    }
}