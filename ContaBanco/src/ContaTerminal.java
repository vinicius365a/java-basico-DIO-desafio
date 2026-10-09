import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
                //TODO: Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuário
        System.out.println("Por favor digite o numero da conta: ");
        System.out.println("Em seguida pressione enter para continuar");
        int conta = sc.nextInt();
        System.out.println("........................................................................");
        System.out.println("........................................................................");

        System.out.println("Por favor digite a agencia com o digito: ");
        System.out.println("Ex: xxxx-x ");
        System.out.println("Em seguida pressione enter para continuar");
        String agencia = sc.next();
        System.out.println("........................................................................");
        System.out.println("........................................................................");


        System.out.println("Por favor digite seu nome: ");
        System.out.println("Em seguida pressione enter para continuar");
        String nomeCliente = sc.next();
        System.out.println("........................................................................");
        System.out.println("........................................................................");


        System.out.println("Por favor digite seu saldo: ");
        System.out.println("Em seguida pressione enter para continuar");
        double saldo = sc.nextDouble();
        System.out.println("........................................................................");
        System.out.println("........................................................................");



        //Obter pelo scanner os valores digitados no terminal

        //Exibir a mensagem conta criada

        System.out.println("........................................................................");

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , conta " + conta + " e seu saldo R$" + saldo + " já está disponível para saque. ");
    
    };

}
