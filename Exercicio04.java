/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Exercicio04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String codigo = "";
        String codMaisAlto = "0000";
        String codMaisBaixo = "0000";
        String codMaisGordo = "0000";
        String codMaisMagro = "0000";
        double altura = 0.0;
        double peso = 0.0;
        int parada = 1;
        double cAlto = 0;
        double cBaixo = 1000;
        double gordo = 0;
        double magro = 1000;

        double totalAltura = 0;
        double totalPeso = 0;
        int contador = 0;

        while (parada != 0) {
            
            contador++;
            
            System.out.println("Informe seu codigo");
            codigo = entrada.next();

            System.out.println("Informe sua altura");
            altura = entrada.nextDouble();

            totalAltura += altura;

            if (cAlto < altura) {

                cAlto = altura;
                codMaisAlto = codigo;

            }

            if (cBaixo > altura) {
                cBaixo = altura;
                codMaisBaixo = codigo;

            }

            System.out.println("Informe seu peso");
            peso = entrada.nextDouble();

            totalPeso += peso;

            if (gordo < peso) {
                gordo = peso;
                codMaisGordo = codigo;

            }

            if (magro > peso) {
                magro = peso;
                codMaisMagro = codigo;

            }

            System.out.println("Deseja castrar 1 novo usuario ?");
            System.out.println("Digite 1 para continuar");
            System.out.println("Digite 0 para parar");
            parada = entrada.nextInt();

        }

        System.out.println("Voce é alto " + codMaisAlto + " -" + cAlto);
        System.out.println("Voce é baixo " + codMaisBaixo + " - :" + cBaixo);

        System.out.println("Voce é gordo " + codMaisGordo + " - :" + gordo);
        System.out.println("Voce é magro" + codMaisMagro + " - :" + magro);
        

        System.out.println("A media das alturas é de :" + (totalAltura/contador));
        System.out.println("A media dos pesos é de :" + (totalPeso/contador));

    }

}
