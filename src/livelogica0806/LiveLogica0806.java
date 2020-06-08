package livelogica0806;

import java.util.Scanner;

/**
 *
 * @author Jeferson Leon
 */
public class LiveLogica0806 {

    /*
    Faça um algoritmo que some os números fornecidos pelo usuário até que o
    número lido seja igual a zero.
    Loops: while() - do..while() - for()
     */
    public static void main(String[] args) {
        int numero, acSomaNumeros;
        acSomaNumeros = 0;
        Scanner ler = new Scanner(System.in);
        do{
            System.out.println("Informe qualquer numero ou zero para sair:");
            numero = ler.nextInt();
            acSomaNumeros = acSomaNumeros + numero;
            
        }while(numero != 0);
        System.out.println("A soma dos valores informados:"+acSomaNumeros);
    }

}
