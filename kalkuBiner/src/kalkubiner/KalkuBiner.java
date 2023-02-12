

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


package kalkubiner;

/**
 *
 * @author Asus
 */
import java.util.Scanner;
public class KalkuBiner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
       
    System.out.println("##  Program Java Konversi Desimal ke Biner  ##");
    System.out.println("==============================================");
    System.out.println();
     
    int[] arr = new int[32];
    int n, i;
     
    System.out.print("Input angka desimal: ");
    n = input.nextInt();
     
    for(i=0; n>0; i++){
      arr[i] = n%2;
      n = n/2;
    }
   
    System.out.print("Angka binernya adalah: ");
     
    for(i=i-1 ;i>=0 ;i--) {
      System.out.print(arr[i]);
    }
    System.out.println();
    }
    
}
