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
public class Desafio {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        
        double massa = 99999999999999999999999.0;
        System.out.println("Massa inicial" + massa);
        
        int segundos = 0;
        
        while(massa>0.5){
        
        massa = massa/2;
        segundos +=50;
        }
        
        int horas =  segundos/3600;
        int minutos = (segundos - (horas*3600))/60;
        
        segundos = segundos % 60;
        
        System.out.println("Massa final" + massa);
        System.out.println(horas + ":" + minutos +":"+ segundos + ":");
        
    }
    
}
