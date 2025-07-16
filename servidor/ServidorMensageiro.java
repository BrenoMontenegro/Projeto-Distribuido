package servidor;

import common.Mensageiro;

import java.rmi.Naming;

public class ServidorMensageiro {
    public static void main(String[] args) {
        try {
            ServidorImpl servidor = new ServidorImpl();
            Naming.rebind("rmi://localhost:1099/Mensageiro", servidor);
            System.out.println("[SERVIDOR] Servidor pronto.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}