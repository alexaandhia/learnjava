/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihansatu;

/**
 *
 * @author Asus
 */
public class UseBreak {
    public static void main(String[] args){
        for (int i = 5; i < 10; i++){
            if (i == 7){
                break;
            }
            System.out.println(i);
        }
        
        System.out.println("----------------------------------------");
        
        for(int i = 5; i < 10; i++){
            if (i == 7){
                continue;
            }
            System.out.print(i);
        }
    }
}
