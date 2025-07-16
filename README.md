# Sistema de Mensagens Distribuído com Java RMI
Um projeto básico para a disciplina de Sistemas Distribuídos que demonstra a troca de mensagens entre clientes e servidor utilizando Java RMI (Remote Method Invocation).

## 🚀 Funcionalidades
✔️ Comunicação remota entre cliente e servidor

✔️ Troca de mensagens simples

✔️ Demonstração do paradigma RMI

✔️ Exemplo didático para aprendizado de sistemas distribuídos

## 🛠️ Tecnologias Utilizadas
Java RMI - Para invocação remota de métodos

Java - Linguagem de programação principal

Maven - Gerenciamento de dependências (opcional)

## 📋 Pré-requisitos
JDK 8 ou superior

IDE Java (Eclipse, IntelliJ, VSCode, etc.) ou conhecimento para compilar via terminal

## 🔧 Como Executar


Compile o projeto:
javac common/*.java servidor/*.java cliente/*.java

### Inicie o registry RMI (em um terminal separado):
rmiregistry

### Inicie o servidor:
java servidor.ServidorMensageiro

### Execute o cliente (em outro terminal):
java cliente.ClienteMensageiro
* Pode abrir diversos terminais, cada um sendo um cliente diferente
