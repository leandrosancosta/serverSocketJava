/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this templatqwee file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorcalculadora;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;// necessito do UnicastRemoteObject – Objeto Remoto Unicast

public class InterfaceImpl extends UnicastRemoteObject implements InterfaceServidor {

    public InterfaceImpl() throws RemoteException {
        super();
    }

    @Override
    public String Operacao(float num1, float num2, String operador) throws RemoteException {

        String res;
        switch (operador) {
            case "+":
                res = Adicao(num1, num2);
                return "Soma Concluida, " + res;
            case "-":
                res = Subtracao(num1, num2);
                return "Subtração Concluida, " + res;
            case "*":
                res = Multiplicacao(num1, num2);
                return "Multiplicação Concluida, " + res;
            case "/":
                res = Divisao(num1, num2);
                if (res.charAt(res.length() - 1) == '1') {
                    return "Divisao Concluida, " + res.substring(0, res.length() - 2);
                } else {
                    return "Não é possivel dividir por 0";
                }
            default:
                return "Operador invalido";
        }
    }

    private String Adicao(float num1, float num2) throws RemoteException {
        String resposta;
        float resp = num1 + num2;
        resposta = "resultado: " + resp;
        return resposta;
    }

    private String Subtracao(float num1, float num2) throws RemoteException {
        String resposta;
        float resp = num1 - num2;
        resposta = "resultado: " + resp;
        return resposta;
    }

    private String Multiplicacao(float num1, float num2) throws RemoteException {
        String resposta;
        float resp = num1 * num2;
        resposta = "resultado: " + resp;
        return resposta;
    }

    private String Divisao(float num1, float num2) throws RemoteException {
        String resposta = "";
        String concat;
        if (num2 == 0) {
            concat = resposta.concat("0");
        } else {
            float resp = num1 / num2;
            resposta = "resultado: " + resp;
            concat = resposta.concat("1");
        }

        return concat;
    }

}
