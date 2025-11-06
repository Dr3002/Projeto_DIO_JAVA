import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static boolean TerCheque = true;

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
                     ConsultarChequeEsp(conta,TerCheque);
                     break;
                 case 4:
                     DepositarDinheiro(conta);
                     break;
                 case 5:
                     SacarDinheiro(conta);
                     break;
                 case 6:
                     //PagarBoleto();
                 case 7:
                     //VerificarChequeEsp();
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

            AtualizarChequeEspecial(conta);

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

    public static void ConsultarChequeEsp(ContaBanco conta, boolean TerCheque){

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
        
        AtualizarChequeEspecial(conta);

        return conta;
    }

     public static ContaBanco SacarDinheiro(ContaBanco conta){

         if(conta == null){
            System.out.println("Nenhuma Conta Cadastrada!!!");
            return conta;
        } else if (conta.getSaldo() <= 0) {
            System.out.println("Sua conta não possui saldo");
            return conta;
        }

        System.out.println("Digite o valor a ser sacado:");
        conta.setSaldo((conta.getSaldo() - sc.nextDouble()));

        AtualizarChequeEspecial(conta);

        return conta;
    }

    public static ContaBanco AtualizarChequeEspecial(ContaBanco conta){

         if (conta.getSaldo() > 500) {
                conta.setCheque_especial(((conta.getSaldo())/2));
                return conta;
            }else{
                conta.setCheque_especial(((conta.getSaldo())/10));
                return conta;
            }

    }

}
