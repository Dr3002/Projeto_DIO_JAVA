import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static boolean TerCheque = true;
    public static double Taxa = 20.0/100.0;
    public static double boleto = 0.0;

    public static void main(String[] args) {
        ContaBanco conta = null;


          int escolha = -1;


          while(escolha != 0){
              System.out.println("1 - Criar Conta");
              System.out.println("2 - Consultar Saldo");
              System.out.println("3 - Consultar Cheque Especial");
              System.out.println("4 - Depositar Dinheiro");
              System.out.println("5 - Sacar Dinheiro");
              System.out.println("6 - Pagar Boleto");
              System.out.println("7 - Verificar Cheque Especial");
              System.out.println("0 - SAIR");

              escolha = sc.nextInt();

              switch (escolha){
                 case 1:
                     conta = CriarConta();
                     break;
                 case 2:
                     ConsultarSaldo(conta);
                     break;
                 case 3:
                     ConsultarChequeEsp(conta);
                     break;
                 case 4:
                     DepositarDinheiro(conta);
                     break;
                 case 5:
                     SacarDinheiro(conta);
                     break;
                 case 6:
                     PagarBoleto(conta);
                     break;
                 case 7:
                     VerificarChequeEsp(conta);
             }
          }
    }

    public static ContaBanco CriarConta(){
        ContaBanco conta = new ContaBanco("",0,0);
        System.out.println("Digite o número da sua Conta:");
        conta.setNum_conta(sc.next());
        System.out.println("Digite o saldo da sua conta:");
        conta.setSaldo(sc.nextDouble());
        System.out.println("Deseja ter Cheque especial? - (SIM/NÃO)");
        String b = sc.next();

        if (b.equalsIgnoreCase("SIM")){
            TerCheque = true;

            if (conta.getSaldo() > 500) {
                conta.setCheque_especial(conta.getSaldo() / 2);
            } else {
                conta.setCheque_especial(conta.getSaldo() / 10);
            }

        }else if (b.equalsIgnoreCase("NÃO")){
            TerCheque = false;
        }else{
            System.out.println("Opção Inválida!");
        }

        System.out.println(conta.getNum_conta());
        System.out.println(conta.getCheque_especial());

        return conta;
    }

    public static void ConsultarSaldo(ContaBanco conta){

        if(conta == null){
            System.out.println("Nenhuma Conta Cadastrada!");
            return;
        }

        System.out.println("Seu saldo: R$"+conta.getSaldo());

    }

    public static void ConsultarChequeEsp(ContaBanco conta){

        if(conta == null){
            System.out.println("Nenhuma Conta Cadastrada!!");
            return;
        } else if (TerCheque == false) {
            System.out.println("Sua conta não possui Cheque Especial");
            return;
        }

        System.out.println("Seu cheque especial: R$"+conta.getCheque_especial());

    }

    public static ContaBanco DepositarDinheiro(ContaBanco conta){

         if(conta == null){
            System.out.println("Nenhuma Conta Cadastrada!!!");
            return conta;
        } else if (conta.getSaldo() <= 0) {
            System.out.println("Sua conta não possui saldo");
            return conta;
        }

        System.out.println("Digite o valor a ser adicionado:");
        conta.setSaldo((sc.nextDouble())+conta.getSaldo());

        return conta;
    }

    public static ContaBanco SacarDinheiro(ContaBanco conta){

        if (conta == null) {
            System.out.println("Nenhuma Conta Cadastrada!!!");
            return conta;
        }else if(conta.getSaldo() <= 0){
            System.out.println("Você está usando o cheque especial!");
        }

        System.out.println("Digite o valor a ser sacado:");
        double valor = sc.nextDouble();

        double saldoDisponivel = conta.getSaldo() + conta.getCheque_especial();

        if (valor > saldoDisponivel) {
            System.out.println("Saldo insuficiente, nem o cheque especial cobre este valor.");
            return conta;
        }

        if (conta.getSaldo() <= 0) {
            conta.setCheque_especial(conta.getCheque_especial() - valor);
            return conta;
        }else{
            conta.setSaldo(conta.getSaldo() - valor);
        }

        return conta;
    }


    public static ContaBanco PagarBoleto(ContaBanco conta){
        if (conta == null) {
        System.out.println("Nenhuma Conta Cadastrada!");
        return conta;
        }

        System.out.println("Digite o valor do boleto:");
        double valorBoleto = sc.nextDouble();
        double valorTotal = valorBoleto;

        // Verifica se precisa usar o cheque especial
        if (valorBoleto > conta.getSaldo()) {
            double falta = valorBoleto - conta.getSaldo();

            if (falta > conta.getCheque_especial()) {
                System.out.println("Nem o cheque especial cobre o boleto!");
                return conta;
            }

            // Aplica taxa de 20% sobre o valor usado do cheque especial
            double juros = falta * Taxa;
            valorTotal = valorBoleto + juros;

            // Atualiza saldo e cheque especial
            conta.setSaldo(0);
            conta.setCheque_especial(conta.getCheque_especial() - falta);

            System.out.println("Usou R$" + falta + " do cheque especial. Taxa: R$" + juros);
        } else {
            // Paga com saldo normal
            conta.setSaldo(conta.getSaldo() - valorBoleto);
        }

        System.out.println("Boleto pago! Valor total com taxas: R$" + valorTotal);
        
        return conta;
    }

    public static void VerificarChequeEsp(ContaBanco conta){
        //Verificar se tem cheque especial
        if(TerCheque == true){
            System.out.println("Possui Cheque especial!");
        }else{
            System.out.println("Não possui Cheque especial!");
        }
        
        return;
    }

}
