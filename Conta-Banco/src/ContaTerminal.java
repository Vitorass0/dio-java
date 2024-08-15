import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        int numeroConta;
        String agencia, nome;
        double saldo;
        Scanner teclado = new Scanner(System.in);
     
        System.out.println("Por favor, digite o número sua Conta !");
        numeroConta = teclado.nextInt();
        teclado.nextLine(); //força a leitura da quebra de linha, para não ser lida na próxima entrada de dados,
                            //assim não interfere na próxima leitura.
        System.out.println("Por favor, digite o número da Agência !");
        agencia = teclado.nextLine();

        System.out.println("Por favor, digite seu nome e sobrenome !");
        nome = teclado.nextLine();

        System.out.println("Por favor, digite o seu saldo disponível para saque !");
        saldo = teclado.nextDouble();

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroConta+ " e seu saldo "+saldo+ " já está disponível para saque.");
      
    }
}
