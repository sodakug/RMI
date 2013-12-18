package testRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIInterface extends Remote {
	public String Calculationgrade(int score) throws RemoteException;
	public double Taxcalculation(int price) throws RemoteException;
	public String Weightcalculator(int weight,int Height) throws RemoteException;
}
