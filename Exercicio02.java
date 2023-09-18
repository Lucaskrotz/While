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
public class Exercicio02 {
    
    public static void main(String[] args) {
        
        Scanner entrada =  new Scanner(System.in);
        
        double paisA = 80000;
        double paisB = 200000;
        
        int anos = 0;
        
        while(paisA < paisB){
           paisA = paisA  * 1.03;
           paisB = paisB * 1.015;
           anos++;
            
        }
        System.out.println("Anos - "+ anos);
        System.out.println("Pais A - " + paisA);
        System.out.println("Pais B - " + paisB);
    }
    
}
