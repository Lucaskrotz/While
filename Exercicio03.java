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
public class Exercicio03 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int valor1 = 1;
        int valor2 = 1;
        
        
        while(valor1 <500){
            
            valor1 = valor1 + valor2;
            valor2 = valor2 + valor1;
        
            
            System.out.println(valor1 + "," + valor2);
            
        }
        
    }
    
}
