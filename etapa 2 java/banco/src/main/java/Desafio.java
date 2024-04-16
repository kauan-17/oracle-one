import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        String tipoConta;
        int op = 0;
        double saldo = 0, tranferencia = 0,deposito = 0;

        System.out.println("Seu nome: ");
        nome = sc.nextLine();
        System.out.println("Tipo de conta: ");
        tipoConta = sc.nextLine();
        System.out.println("Saldo inicial: ");
        saldo = sc.nextDouble();


        System.out.println("***************************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("***************************");

        String menu = """
                ** Digite o sua opção **
                1- Cunsulta saldo
                2- Transferir valor
                3- Receber valor
                4- Sair do programa
                """;
        while (op != 4) {
            System.out.println(menu);
            op = sc.nextInt();

            if (op == 1) {
                System.out.println("O saldo atual e e de: " + saldo);
            }

            if (op == 2) {
                System.out.println("Valor tranferido:");
                tranferencia = sc.nextDouble();
                if (tranferencia > saldo) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo = saldo - tranferencia;
                    System.out.println("O valor atal da sou conta e de: " + tranferencia);
                }
            }
            if (op == 3) {
                System.out.println("o valor para de deposito: ");
                deposito = sc.nextDouble();
                saldo = saldo + deposito;
            }
            if (op == 4) {
                System.out.println("Saindo ............");
            } else if (op !=4) {
                System.out.println("Operaçãp invalida!");
                
            }
        }
    }
}






