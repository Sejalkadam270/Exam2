package Assign1;
// Server.java
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            CalculatorServiceImpl service = new CalculatorServiceImpl();
            Registry registry = LocateRegistry.createRegistry(2000);
            registry.rebind("CalculatorService", service);
            System.out.println("Calculator Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
