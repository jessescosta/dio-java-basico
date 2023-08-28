import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o numero da Conta: ");
        int numero = scanner.nextInt();

        System.out.println("Informe o numedo da Agencia: ");
        String agencia = scanner.next();

        scanner.nextLine();

        System.out.println("Informe seu Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Informe o Saldo da conta:");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque."
                .formatted(nome, agencia, numero, saldo));
    }
}