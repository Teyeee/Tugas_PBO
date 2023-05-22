/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package w04_exapculation;

import java.util.Scanner;

/**
 *
 * @author Ines Rahayu Tyas
 *Teknik Informatika - 2210410049
 */
public class Warung {


    public String makanan,minuman;

    public String getMakanan() {
        return makanan;
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }

    public String getMinuman() {
        return minuman;
    }

    public void setMinuman(String minuman) {
        this.minuman = minuman;
    }
    
    
    
    public static void main(String[] agrs) {
        System.out.println("masukan makanan:");
        Warung warung = new Warung();
        Scanner varMakan = new Scanner(System.in);
        warung.setMakanan( varMakan.next());
//        warung.setMakanan("Bakso Urat");
//        warung.setMinuman("Joshua");
        
        System.out.println( warung.getMakanan());
//        System.out.println(warung.getMinuman());
    }
}
