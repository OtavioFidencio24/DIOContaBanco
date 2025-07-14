import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaTerminal conta1 = new ContaTerminal();
        System.out.println("Bem Vindo ao Banco Limerick.");
        System.out.println("Por favor, digite o numero da Agência." +
                " Após digitar pressione Enter");
        conta1.setNumero(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Por favor, digite a agência desejada");
        conta1.setAgencia(scanner.nextLine());
        System.out.println("Por favor, digite o seu nome");
        conta1.setNome_cliente(scanner.nextLine());
        System.out.println("Por favor, digite o seu saldo");
        conta1.setSaldo(scanner.nextDouble());
        System.out.println("Olá " + conta1.getNome_cliente() + ", Obrigado por criar uma conta" +
                " em nosso banco, sua agência é " + conta1.getAgencia() + ", conta " + conta1.getNumero() +
                " e seu saldo de " + conta1.getSaldo() + " já está disponível para saque!");
        scanner.close();
    }
}
