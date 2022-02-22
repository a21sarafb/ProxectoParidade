/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Paridade;

import java.util.Scanner;

/**
 *
 * @author saraf
 */
public class ParMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numeroProba = in.nextInt();
        if(numeroProba%2==0){
            System.out.println("O número é par");
        }else{
            System.out.println("O número é impar");
        }
    }
    
}
