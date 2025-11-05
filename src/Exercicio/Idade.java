package Exercicio;

import java.util.Scanner;

import static java.lang.Math.round;

public class Idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu Nome:");
        String nome = sc.nextLine();
        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();
        System.out.println("Digite o tamanho do lado da sua casa:");
        double lado = sc.nextDouble();
        double area = (lado * lado);

        System.out.println("Digite o tamanho do base do seu terreno:");
        double base = sc.nextDouble();
        System.out.println("Digite o a altura da seu terreno:");
        double altura = sc.nextDouble();
        double perimetro = (base * altura);

        System.out.printf("Olá %s você tem %d anos!\n",nome,idade);
        System.out.println("A área da sua casa é de "+round(area)+"m².");
        System.out.println("A área da seu terreno é de "+round(perimetro)+"m².");

        System.out.println("Digite sua idade:");
        int idade2 = sc.nextInt();
        System.out.println("Digite seu Nome:");
        String nome2 = sc.next();
        int diferenca;

        if(idade > idade2){
            diferenca = idade - idade2;
        }else{
            diferenca = idade2 - idade;
        }

        System.out.println("A diferença da idade de "+nome+" para a idade de "+nome2+" é de "+diferenca+" anos.");

    }
}
