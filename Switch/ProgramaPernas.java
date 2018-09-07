/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in); // criando objeto teclado
       String tipo; // criando variavel "tipo" 
       
        System.out.println("Quantas Pernas o animal possui?"); // demonstrando na tela
        int pernas = teclado.nextInt(); //chamando o objeto teclado
        System.out.println("Isso é um: "); // demonstrando na tela
        switch(pernas) // utilizando o switch para escolher um dos caso
        {
            case 1:
              tipo = "saci";  
              break;
            case 2:
                tipo = "bipedes";
                break;
            case 3:
                tipo = "tripé";
                break;
            case 4:
                tipo = "quadrupe";     // podemos pular do case 4 parao case 6 sem problemas
                break;
            case 6:
                tipo = "aranha";
                break;
            default:
                tipo = "ET";
                          
        }
        System.out.println(tipo);
    }
    
}
