package cliente;

import common.Mensageiro;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ClienteImpl extends UnicastRemoteObject implements Mensageiro {
    private final String nome;

    public ClienteImpl(String nome) throws RemoteException {
        super();
        this.nome = nome;
    }

    @Override
    public void receberMensagem(String mensagem) throws RemoteException {
        System.out.println("\n[MENSAGEM RECEBIDA] " + mensagem);
        System.out.print("\nDestinatário: ");
    }

    @Override
    public void registrarCliente(String nome, Mensageiro cliente) {}

    @Override
    public void enviarMensagem(String destinatario, String mensagem) {}
}