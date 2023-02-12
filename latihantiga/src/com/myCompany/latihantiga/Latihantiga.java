package com.myCompany.latihantiga;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author Asus
 */
public class Latihantiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        
        
        String nis;
        String nama;
        String rombel ;
        
        try{
            System.out.println("Masukkan NIS "); //untuk input
            nis = br.readLine();
            System.out.println("Masukkan NAMA "); //input lgi
            nama = br.readLine();
            System.out.println("Masukkan rombel "); //input lgi
            rombel = br.readLine();
            
            System.out.println("====================");
            System.out.println("NIS : " + nis); //outpus pesan nis
            System.out.println("Nama : " + nama); //output nama
            System.out.println("Rayon : " + rombel); //output nama
        }catch(IOException eox) { //menangkap kesalahan
            System.out.println(eox);   
        }
    }
    
}
