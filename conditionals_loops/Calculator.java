package conditionals_loops;
import java.util.*;

public class Calculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.println("Enter the operator (+, -, *, %, x to exit):");
            char op = in.next().trim().charAt(0);

            
            if (op == 'x' || op == 'X') {
                break;
            }

           
            if (op == '+' || op == '-' || op == '*' || op == '%') {

                System.out.println("Enter two numbers:");
                int a = in.nextInt();
                int b = in.nextInt();

                if (op == '+') {
                    ans = a + b;
                } else if (op == '-') {
                    ans = a - b;
                } else if (op == '*') {
                    ans = a * b;
                } else if (op == '%') {
                    if (b != 0) {
                        ans = a % b;
                    } else {
                        System.out.println("Cannot divide by zero");
                        continue;
                    }
                }

                System.out.println("Answer: " + ans);

            } else {
                System.out.println("Invalid Operation");
            }
        }
    }
}
