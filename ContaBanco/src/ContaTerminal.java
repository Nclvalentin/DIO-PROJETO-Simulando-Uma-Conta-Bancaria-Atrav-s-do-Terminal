import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Numero da Conta:  ");
        int numeroConta = scanner.nextInt();

        System.out.print("Agência:  ");
        String agencia = scanner.next();

        System.out.print("Nome:  "); 
        scanner.nextLine(); // Consome a quebra de linha deixada por nextInt()
        String nomeCliente = scanner.nextLine(); 

        System.out.print("Saldo:  ");
        double saldo = scanner.nextDouble();
        
        

        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta no nosso banco. Sua agência é: " +agencia+ ", conta numero "+ numeroConta+ " e seu saldo de R$ "+saldo+ " já está disponivel para saque." );

    }
}
