import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuário
        //Obter os valores digitados no terminal
        System.out.print("Conta:");
        int numero = scanner.nextInt();
        System.out.print("Agencia: ");
        int agencia = scanner.nextInt();
        System.out.println("Nome do Cliente: ");
        String nome = scanner.next();
        System.out.println("Saldo");
        double saldo = scanner.nextDouble();


        //Exibir a mensagem conta criada
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
