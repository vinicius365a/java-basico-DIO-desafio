import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
                //TODO: Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuário
        System.out.println("Por favor Digite o numero da conta: ");
        int conta = sc.nextInt();
        System.out.println("Presione enter para continuar");

        System.out.println("Por favor Digite a agencia com o digito: ");
        String agencia = sc.next();
        System.out.println("Presione enter para continuar");

        System.out.println("Por favor digite seu nome e sobrenome: ");
        String nomeCliente = sc.next();
        System.out.println("Presione enter para continuar");

        System.out.println("Por favor digite seu saldo: ");
        double saldo = sc.nextDouble();
        System.out.println("Presione enter para continuar");


        //Obter pelo scanner os valores digitados no terminal

        //Exibir a mensagem conta criada

        System.out.println("........................................................................");

        System.out.println("Olá " + nomeCliente +" , obrigado por criar uma conta em nosso banco, sua agência é" + agencia + " , conta" + conta + " e seu saldo " + saldo + " já está disponível para saque. ");
    
    };

}
