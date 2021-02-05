/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorcalculadora;

/**
 *
 * @author lab1504p2
 */
import java.rmi.*; // importa pacotes do RMI

public interface InterfaceServidor extends Remote // necessita herdar para obter invocação remota
{
    public String Operacao(float num1, float num2, String operador) throws RemoteException;
    
}
