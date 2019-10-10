/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118062.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PBOIF210118062Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukan kalimat : ");
        Scanner scanner = new Scanner(System.in);
        String huruf = scanner.nextLine();
        
        String besar = huruf.toUpperCase();
        String kecil = huruf.toLowerCase();
        
        System.out.println("=======Hasil Formatting=======");
        System.out.println("Huruf Besar   : " + besar);
        System.out.println("Huruf Kecil   : " + kecil);
    }
    
}
