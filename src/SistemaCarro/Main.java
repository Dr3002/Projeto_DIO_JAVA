package SistemaCarro;

import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Carro carro =  new Carro(false,false,1);

        int escolha = -1;

        while (escolha != 0) {
            
            System.out.println("1 - Para Ligar");
            System.out.println("2 - Para Desligar");
            System.out.println("3 - Para Acelerar");
            System.out.println("4 - Para Frear");
            System.out.println("5 - Para Virar");
            System.out.println("6 - Para Trocar Marcha");
            System.out.println("7 - Para Verificar Velocidade");
            System.out.println("0 - SAIR");

            switch (escolha) {
                case 1:
                    Ligar();
                    break;
                case 2:
                    Desligar();
                    break;
                case 3:
                    Acelerar();
                    break;   
                case 4:
                    Frear();
                    break;
                case 5:
                    Virar();
                    break;    
                case 6:
                    TrocarMarcha();
                    break;
                case 7:
                    VerificarVelocidade();
            } 

        }

    }

    public static void Ligar(){

    }

    public static void Desligar(){

    }

    public static void Acelerar(){

    }

    public static void Frear(){

    }

    public static void Virar(){

    }

    public static void VerificarVelocidade(){
        
    }

    public static void TrocarMarcha(){

    }

}
