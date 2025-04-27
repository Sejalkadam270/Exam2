package Assign1;
// CalculatorServiceImpl.java
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class CalculatorServiceImpl extends UnicastRemoteObject implements CalculatorService {

    public CalculatorServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        int result = a + b;
        logThread("Add", a, b, result);
        return result;
    }

    @Override
    public int sub(int a, int b) throws RemoteException {
        int result = a - b;
        logThread("Sub", a, b, result);
        return result;
    }

    @Override
    public int mul(int a, int b) throws RemoteException {
        int result = a * b;
        logThread("Mul", a, b, result);
        return result;
    }

    private void logThread(String op, int a, int b, int result) {
        new Thread(() -> {
            System.out.println(op + " thread: Processing " + a + " and " + b + " = " + result);
            try {
                Thread.sleep(1000); // Simulate delay
                System.out.println(op + " thread completed.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
