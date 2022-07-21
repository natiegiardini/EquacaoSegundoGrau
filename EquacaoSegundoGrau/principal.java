package EquacaoSegundoGrau;

import java.util.Scanner;


public class principal extends Equacao {
    public static void main(String[] args) {
        
        Delta delta = new Delta();
        EqXn xwXt = new EqXn();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o valor de a?");
        delta.setA(entrada.nextDouble());
       
        System.out.println("Qual o valor de b?");
        delta.setB(entrada.nextDouble());
       
        System.out.println("Qual o valor de c?");
        delta.setC(entrada.nextDouble());

        delta.calculaDelta();
    
        if (delta.getDelta() < 0) {
            System.out.println("A equação é inexistente");
        } else {
            System.out.println("xw :" + xwXt.calculaXw(delta));
            System.out.println("xt :" + xwXt.calculaXt(delta));
        }

    }
}
