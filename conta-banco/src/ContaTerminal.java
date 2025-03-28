import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       //TODO: Conhecer e importar a classe Scanner

       //Exibir as mensagens a nosso usuário

       //Obter pelo scannner os valores informados pelo usuário

Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

System.out.println("Por favor, digite o número de sua Agência no formtao XXXX-X");
String numeroAgencia = scanner.next();

System.out.println("Digite o número de sua Conta: ");
int numeroConta = scanner.nextInt();

System.out.println("Digite seu nome: ");
String nome = scanner.next();

System.out.println("Digite seu saldo");
double saldo = scanner.nextDouble();

//Imprimindo dados fornecidos pelo usuário

       System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua Agência é " + numeroAgencia + " Conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
