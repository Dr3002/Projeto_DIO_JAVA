package Exercicio;

import java.util.Scanner;

public class Repeticao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Exercicio 1

        System.out.println("Digite um número:");
        int num_ex = sc.nextInt();

        System.out.println("Tabuada do "+num_ex+":");
        System.out.println("-------------------------------------------------------------------");
        for(int i=0;i<10;i++){
            int tabuada = (num_ex * (i+1));
            System.out.println(num_ex+" x "+(i+1)+"= "+tabuada);
        }
        System.out.println("-------------------------------------------------------------------");

        //Exercicio 2

        int escolha1 = 1;

        while(escolha1!=0){

            System.out.println("Digite sua altura:");
            double altura = sc.nextInt();
            System.out.println("Digite seu peso:");
            double peso = sc.nextInt();

            double calculoIMC = (peso/(altura*altura)*10000);
            System.out.println("IMC: "+calculoIMC);

            if (calculoIMC < 18.5){
                System.out.println("Abaixo do Peso!");
            } else if (calculoIMC >18.6 && calculoIMC <= 24.9) {
                System.out.println("Peso ideal!");
            } else if (calculoIMC > 24.9 && calculoIMC < 29.9) {
                System.out.println("Levemente acima do peso");
            }else if (calculoIMC > 30.0 && calculoIMC < 34.9) {
                System.out.println("Obesidade Grau I");
            }else if (calculoIMC > 35.0 && calculoIMC < 39.9) {
                System.out.println("Obesidade Grau II (Severa)");
            }else if (calculoIMC >= 40.0) {
                System.out.println("Obesidade III (Mórbida)");
            }

            System.out.println("Sair (0) / Continuar(1)");
            escolha1 = sc.nextInt();
        }

        //Exercicio 3

        int escolha = 0;

        while(escolha != 1){

            System.out.println("Digite o primeiro número:");
            int num = sc.nextInt();
            System.out.println("Digite o segundo número:");
            int num2 = sc.nextInt();
            if(num2 <= num){
                System.out.println("Valor inválido! O segundo número deve ser maior que o primeiro!");
                System.out.println("Digite o segundo número:");
                num2 = sc.nextInt();
            }

            System.out.println("Digite se quer número par ou impar:");
            String _num = sc.next();

            if(_num.equals("par")){
                System.out.println("Números Pares:");
                System.out.println("-------------------------------------------------------------------");
                for (int i = num2;i >= num;i--){
                    if(i % 2 == 0) {
                        System.out.println(i);
                    }
                }
                System.out.println("-------------------------------------------------------------------");
            } else if (_num.equals("impar")) {
                System.out.println("Números Impares:");
                System.out.println("-------------------------------------------------------------------");
                for (int i = num2;i >= num;i--){
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                }
                System.out.println("-------------------------------------------------------------------");
            }else{
                System.out.println("Valor inválido! Digite 'par' ou 'impar'");
            }

            System.out.println("Sair (1) / Continuar (0)");
            escolha = sc.nextInt();
        }

        //Exercicio 4

        System.out.println("Informe um número:");
        int numb_ini = sc.nextInt();
        boolean a = true;

        while(a){

            System.out.println("Informe um número (N) para verificação:");
            int Num_N = sc.nextInt();
            int result = Num_N % numb_ini;
               if(numb_ini < Num_N){
                   if ( result == 0){
                       System.out.println("Resto igual a zero;");
                   }else {
                       System.out.println("Resto diferente de zero;");
                       a = false;
                   }
               }else{
                   System.out.println("Número inválido!"+"O número da verificação deve ser maior que o primeiro número!");
               }

        }



    }
}
