package common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Mensageiro extends Remote {
    void registrarCliente(String nome, Mensageiro cliente) throws RemoteException;
    void enviarMensagem(String destinatario, String mensagem) throws RemoteException;
    void receberMensagem(String mensagem) throws RemoteException;
}