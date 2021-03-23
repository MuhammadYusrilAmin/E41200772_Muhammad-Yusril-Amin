package tugas;

import java.util.Scanner;

public class tugas_mingguKe3_e {
   public static void main(String[] args) {
        // membuat variable dan Scaner
        String nama;
        int minuman;
        Scanner scan = new Scanner(System.in);
        
        //headet
        System.out.println("      CAFE CERIA");
        System.out.println("     ANEKA MINUMAN");
        System.out.println("------------------------");
        System.out.println("     SPESIAL MENU");
        System.out.println("   1. Soft drinks");
        System.out.println("   2. Mix juice");
        System.out.println("   3. Nescafe");
        System.out.println("   4. Soda milk");
        System.out.println("   5. Tea");
        System.out.println("------------------------");
        System.out.print("Masukkan nama pembeli : ");
        nama = scan.nextLine();
        
        System.out.println("");
        System.out.print("Silahkan masukkan pilihan Anda : ");
        minuman = scan.nextInt();  
        switch(minuman) {
            case 1:
                System.out.println("Minuman yang anda pesan adalah Soft drinks");
                break;
            case 2:
                System.out.println("Minuman yang anda pesan adalah Mix juice");
                break;
            case 3:
                System.out.println("Minuman yang anda pesan adalah Nescafe");
                break;
            case 4:
                System.out.println("Minuman yang anda pesan adalah Soda milk");
                break;
            case 5:
                System.out.println("Minuman yang anda pesan adalah Tea");
                break;
            default:
                System.out.println("Pilihan menu minuman tidak tersedia"); 
        }
        if (minuman == 1 && minuman <= 5   ){
            System.out.println("Pesanan akan segera kami antar");
        } else {
            System.out.println("Mohon pilih menu yang tersedia di menu");
        }
        System.out.println("Terima kasih "+ nama +" telah berkunjung di Cafe Ceria");
   } 
}
