/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4uprojects;

import java.util.Scanner;

/**
 *
 * @author bartm6529
 */
public class A0Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input scanner
        Scanner input = new Scanner(System.in);
        
        //ask for a number
        System.out.println("Please enter a number between 1 and 10.");
        int number = input.nextInt();
        
        //check if between 1 and 10
        while(number < 1 || number > 10){
            System.out.println("Try again. Please enter a number BETWEEN 1 and 10.");
            number = input.nextInt();
        }
        
        //make a space
        System.out.println("");
        
        //loop that prints asterisks
        for (int i = 0; i < number; i++) {
            System.out.print("*"); 
        }
    }
    
}