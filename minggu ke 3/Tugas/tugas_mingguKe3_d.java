package tugas;
import java.util.Scanner;

public class tugas_mingguKe3_d {
    public static void main(String[] args) {
        // membuat variable dan Scaner
        int[] harga= new int[5];
        String nama;
        String hadiah;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        
        //headet
        System.out.println("        Kharizma Agung Plaza <KAP>");
        System.out.println("          Promo Belanja Berhadiah");
        System.out.println("      Khusus Pembelian Barang 5 Pertama");
        System.out.println("     Dengan harga minimum Rp 10000,00");
        System.out.println("--------------------------------------------");
        System.out.print("Masukkan nama pembeli : ");
        nama = scan.nextLine();
        
        //body
        System.out.println("");
        System.out.print("Masukkan harga barang ke-1 : ");
        harga[0] = scan.nextInt();       
        System.out.print("Masukkan harga barang ke-2 : ");
        harga[1] = scan.nextInt();
        System.out.print("Masukkan harga barang ke-3 : ");
        harga[2] = scan.nextInt();
        System.out.print("Masukkan harga barang ke-4 : ");
        harga[3] = scan.nextInt();
        System.out.print("Masukkan harga barang ke-5 : ");
        harga[4] = scan.nextInt();

        for (int i =0; i < harga.length; i++){
            sum = sum + harga[i];
        }
        System.out.println("Total harga pembelian atas nama "+ nama +" adalah Rp " + sum);
        
         if(sum >= 100000 && harga[0] != 0 && harga[1] != 0 && harga[2] != 0 && harga[3] != 0 && harga[4] != 0){
            hadiah = "Anda Mendapatkan hadiah 1 Buah Mug Cantik";
        } else if(sum >= 75000 && harga[0] != 0 && harga[1] != 0 && harga[2] != 0 && harga[3] != 0 && harga[4] != 0){
            hadiah = "Anda Mendapatkan hadiah 1 Buah Piring Kaca";
        } else if(sum >= 50000 && harga[0] != 0 && harga[1] != 0 && harga[2] != 0 && harga[3] != 0 && harga[4] != 0){
            hadiah = "Anda Mendapatkan hadiah 1 Buah Rinso 250 gram";
        } else if(sum >= 25000 && harga[0] != 0 && harga[1] != 0 && harga[2] != 0 && harga[3] != 0 && harga[4] != 0){
            hadiah = "Anda Mendapatkan hadiah 1 Buah Tanggo";
        } else if(sum >= 20000 && harga[0] != 0 && harga[1] != 0 && harga[2] != 0 && harga[3] != 0 && harga[4] != 0){
            hadiah = "Anda Mendapatkan hadiah 1 Buah Tictac";
        } else if(sum >= 10000 && harga[0] != 0 && harga[1] != 0 && harga[2] != 0 && harga[3] != 0 && harga[4] != 0){
            hadiah = "Anda Mendapatkan hadiah 1 Buah Sachet Nescafe";
        } else {
            hadiah = "Anda tidak mendapatkan hadiah karena tidak memenuhi kriteria pembelian";
        }     
        System.out.println("");
        if (harga[0] != 0 && harga[1] != 0 && harga[2] != 0 && harga[3] != 0 && harga[4] != 0) {
            System.out.println("Selamat.....");
        } else {
            System.out.println("Maaf.....");
        }
        System.out.println(hadiah);
        
        //footer
        System.out.println("--------------------------------------------");
        System.out.println("                Terima Kasih");
        System.out.println(" Anda sudah belanja di Kharizma Agung Plaza");
    } 
}
