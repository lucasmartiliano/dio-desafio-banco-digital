import java.util.Locale;
import java.util.Scanner;

public class ContaBanco{
    public static void main(String[] args) throws Exception {

         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("-----------Seja bem vindo ao sistema do BancoBrasil :D-----------");
        System.out.println("Para validação e confirmação de dados, serão feitas algumas perguntas");

        System.out.println("Digite seu nome: ");
            String nomeCliente = scanner.next();

        System.out.println("Certo, Digite o número da sua agência: (sem o digito)");
            int agencia = scanner.nextInt();
        
        System.out.println("agora o dígito da sua agência: ");
            int digito = scanner.nextInt();

        System.out.println("Digite o numero da conta: ");
            int numero = scanner.nextInt();

        System.out.println("Digite seu saldo: ");
            double saldo = scanner.nextDouble();

        System.out.println(
            "------CONCLUÍDO------- Olá, " + nomeCliente + " Obrigado pelas confirmações de segurança, sua agência é " + agencia + "-" + digito + " , conta " + numero + " e seu saldo é: " + saldo + " que se encontra já disponível para movimentar!");
    }
}
