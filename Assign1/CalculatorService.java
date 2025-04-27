package Assign1;
// CalculatorService.java
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculatorService extends Remote {
    int add(int a, int b) throws RemoteException;
    int sub(int a, int b) throws RemoteException;
    int mul(int a, int b) throws RemoteException;
}


// Import java.rmi.Remote
// Import java.rmi.RemoteException

// Public Interface CalculatorService extends Remote{

// Int add(int a,int b) throws RemoteException;
// Int sub(int a,int b) throws RemoteException;
// Int Mul(int a,int b) throws RemoteException;


// }
