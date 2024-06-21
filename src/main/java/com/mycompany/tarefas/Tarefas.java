/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarefas;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Tarefas {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        int nm1;
        
        System.out.println("digite as estações de 1 a 4 sendo \n1 verão  \n2 inverno  \n3 outono \n4 primavera");
        
        nm1 = teclado.nextInt();   
        
        switch (nm1) {
        
        case 1: System.out.println (" estação : verão ");
        break;
        
        case 2: System.out.println(" estação : inverno");
        break;
        
        case 3: System.out.println("estação : primavera");
        break;
        
        case 4: System.out.println("estação : outono");
        break;
        
        default: 
            System.out.println(" INVALIDO !");
                
                
            
        
                
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
}