package soda;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


public class RMIClient {
	public static void main(String[] args) throws MalformedURLException,
	RemoteException, NotBoundException {
		RNInterface obj = (RNInterface)Naming.lookup("RMIServer");
		try{
			System.out.println('\n'+"Client call to : "+obj+'\n');
			
			String parimeter1 = obj.Calculationgrade(Integer.parseInt(args[0]));
			double parimeter2 = obj.Taxcalculation(Integer.parseInt(args[1])); 
			String parimeter3 = obj.Weightcalculator(Integer.parseInt(args[2]), Integer.parseInt(args[3]));
			
	
			System.out.println("Enter your score  :"+args[0]+"GPA : "+parimeter1);
			System.out.println("Enter your price  :"+args[1]+"Tax : "+parimeter2);
			System.out.println("Enter your weight :"+args[2]+"Enter your Height : "+args[3]+"Obesity = "+parimeter3);
		
		}catch(Exception e){
			System.out.println("ERROR Na Ja");
		}
		
	}
}
		
	



