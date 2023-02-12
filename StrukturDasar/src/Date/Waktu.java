/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Date;

import java.util.Date;

/**
 *
 * @author Asus
 */
public class Waktu {
    public static void date(){
    Date today = new Date();
System.out.println("Hari ini = " + today);
Date tomorrow = DateUtils.addDays(today, 1);
System.out.println("Besok = " + tomorrow);
    }
}
