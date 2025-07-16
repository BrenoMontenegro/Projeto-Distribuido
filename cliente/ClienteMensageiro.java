package cliente;

import common.Mensageiro;

import java.rmi.Naming;
import java.util.Scanner;

public class ClienteMensageiro {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();

            ClienteImpl cliente = new ClienteImpl(nome);
            Mensageiro servidor = (Mensageiro) Naming.lookup("rmi://localhost:1099/Mensageiro");

            servidor.registrarCliente(nome, cliente);
            System.out.println("[CLIENTE] Registrado com sucesso!");

            while (true) {
                System.out.print("\nDestinatário: ");
                String dest = scanner.nextLine();
                System.out.print("Mensagem: ");
                String msg = scanner.nextLine();

                try {
                    servidor.enviarMensagem(dest, "[" + nome + "]: " + msg);
                } catch (Exception e) {
                    System.out.println("[CLIENTE] Erro ao enviar mensagem. O servidor ou o distinatário foi desconectado.");
                }
            }

        } catch (Exception e) {
            System.out.println("[CLIENTE] Não foi possível se conectar ao servidor.");
            e.printStackTrace();
        }
    }
}