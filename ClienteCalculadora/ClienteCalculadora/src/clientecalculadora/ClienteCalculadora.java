/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientecalculadora;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

/**
 *
 * @author lab1504p2
 */
public class ClienteCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            float primeiroFator;
            float segundoFator;
            String operador;
            // acesso o Binder pelo nome que fora registrado
            InterfaceServidor m = (InterfaceServidor) Naming.lookup("rmi://localhost:1099/InterfaceServidor");
            // método utilizado normalmente
            System.out.println("Digite o Primeiro Numero!");
            primeiroFator = s.nextFloat();
            System.out.println("Digite o Operador");
            operador = s.next();
            System.out.println("Digite o Segundo Numero!");
            segundoFator = s.nextFloat();
//            primeiroFator = 1;
//            segundoFator = 0;
//            operador = "/";
            m.Operacao(primeiroFator, segundoFator, operador);
        } catch (MalformedURLException | NotBoundException | RemoteException e) {
            System.out.println("GenericException: " + e.toString());
        }
        // TODO code application logic here
    }

}
