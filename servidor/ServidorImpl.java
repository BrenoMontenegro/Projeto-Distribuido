package servidor;

import common.Mensageiro;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ServidorImpl extends UnicastRemoteObject implements Mensageiro {
    private final HashMap<String, Mensageiro> clientes = new HashMap<>();

    public ServidorImpl() throws RemoteException {
        super();
    }

    @Override
    public void registrarCliente(String nome, Mensageiro cliente) throws RemoteException {
        clientes.put(nome, cliente);
        System.out.println("[SERVIDOR] Cliente registrado: " + nome);
    }

    @Override
    public void enviarMensagem(String destinatario, String mensagem) throws RemoteException {
        Mensageiro cliente = clientes.get(destinatario);
        if (cliente != null) {
            try {
                cliente.receberMensagem(mensagem);
            } catch (RemoteException e) {
                System.out.println("[SERVIDOR] O destinatário " + destinatario + " está offline. Removendo...");
                clientes.remove(destinatario);
                throw new RemoteException("Destinatário offline");
            }
        } else {
            System.out.println("[SERVIDOR] Cliente " + destinatario + " não encontrado.");
            throw new RemoteException("Cliente não encontrado");
        }
    }


    @Override
    public void receberMensagem(String mensagem) throws RemoteException {
    }
}