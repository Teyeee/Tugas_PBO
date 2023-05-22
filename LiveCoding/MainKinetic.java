/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package LiveCoding;

import java.util.Scanner;

/**
 *
 * @author Ines Rahayu Tyas
 *Teknik Informatika - 2210410049
 */
public class MainKinetic {
    public double masa, kecepatan;
    
    

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    public double EK(){
        double hasil = 0.5*Math.pow(kecepatan, 2);
        return hasil;
    }
    
    public static void main(String[] args){
        MainKinetic ek = new MainKinetic();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan masa : ");
        ek.setMasa(scanner.nextDouble());
        System.out.print("Masukan kecepatan :");
        ek.setKecepatan(scanner.nextDouble());
        ek.getMasa();
        ek.getKecepatan();
        System.out.println("Masa adalah : "+ek.getMasa());
        System.out.println("Kecepatan adalah : "+ek.getKecepatan());
        System.out.println("hasil adalah "+ek.EK());
        
    }

}
