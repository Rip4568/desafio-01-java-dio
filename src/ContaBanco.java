import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, informe o numero: ");
        Integer numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, informe a agencia: ");
        String agencia = scanner.nextLine();
        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Informe o Saldo: ");
        Integer saldo = scanner.nextInt();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
        scanner.close();
    }
}
