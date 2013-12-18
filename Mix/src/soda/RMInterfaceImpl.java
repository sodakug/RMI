package soda;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class RMInterfaceImpl extends UnicastRemoteObject implements RNInterface {
	
	private static final long serialVersionUID = 1L;
	public RMInterfaceImpl() throws RemoteException{
	
	}	
	public String Calculationgrade(int score) throws RemoteException {
			
			if(score>=80)
			{
				return "A";
			}
			else if(score>=70){
				return "B";
			}
			else if(score>=60){
				return "C";
			}
			else if(score>=50){
				return "D";
			}
			else{
				return "E";
			
			}
	}
		
	public double Taxcalculation(int price) throws RemoteException {
		
			
			double sum = price*7/100;
			return sum;
			
	}
	
	public String Weightcalculator(int weight,int Height) throws RemoteException {
	
			
				int obesity = weight/Height;
				int sum = obesity*obesity;
				if(sum>=40)
				{
					return "Obesity";
				}
				else if(sum>=35){
					return "Step 2 Obesity";
				}
				else if(sum>=28){
					return "Step 1 Obesity";
				}
				else if(sum>=18){
					return "Overweight";
				}
				else{
					return "normal weight";	
					}
			
	}
	}
	
	
	
