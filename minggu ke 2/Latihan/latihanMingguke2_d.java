/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;
/**
 *
 * @author MUHAMMAD YUSRIL
 */
public class latihanMingguke2_d {
    public static void main(String[] args) {
        Scanner Lat_b =new Scanner(System.in);

        System.out.print("Masukkan Nilai 1 = ");
        int nilai1 = Lat_b.nextInt();
        System.out.print("Masukkan Nilai 2 = ");
        int nilai2 = Lat_b.nextInt();
        
        int jumlah = nilai1 + nilai2;
        System.out.println ("Jumlah Nilai = " + jumlah);
    }
}
