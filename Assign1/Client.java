package Assign1;

// Client.java
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 2000);
            CalculatorService stub = (CalculatorService) registry.lookup("CalculatorService");

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("\nChoose operation (add/sub/mul/exit): ");
                String op = scanner.next();

                if (op.equalsIgnoreCase("exit")) break;

                System.out.print("Enter first number: ");
                int a = scanner.nextInt();
                System.out.print("Enter second number: ");
                int b = scanner.nextInt();

                switch (op.toLowerCase()) {
                    case "add":
                        System.out.println("Result: " + stub.add(a, b));
                        break;
                    case "sub":
                        System.out.println("Result: " + stub.sub(a, b));
                        break;
                    case "mul":
                        System.out.println("Result: " + stub.mul(a, b));
                        break;
                    default:
                        System.out.println("Invalid operation.");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
