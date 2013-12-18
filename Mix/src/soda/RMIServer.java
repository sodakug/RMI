package soda;

import java.rmi.Naming;

public class RMIServer {
	public static void main(String args[]){
		
		try{
			RNInterface obj = new RMInterfaceImpl();
			Naming.rebind("//localhost:1099/RMIServer", obj);
			System.out.print("Waiting client...");
			
		}catch (Exception e){
			System.out.println(e);
			
			
		}
	}

}

