/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorcalculadora;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ServidorCalculadora {

    public static void main(String[] args) {
    	try {
        	InterfaceServidor m = new InterfaceImpl();
        	LocateRegistry.createRegistry(1099);
        	// crio uma instancia do obj e registro no Binder
            Naming.rebind("rmi://localhost:1099/InterfaceServidor", m);
        } catch( MalformedURLException | RemoteException e ) {
        	System.out.println( "Trouble: " + e.getMessage() );
        }
    }
}