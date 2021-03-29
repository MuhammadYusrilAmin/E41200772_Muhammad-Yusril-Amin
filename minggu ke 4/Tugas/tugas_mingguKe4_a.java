package Tugas;
import java.util.Scanner;

public class tugas_mingguKe4_a {
    public static void main(String[] args) {
        // Membuat variable dan Scanner
        Scanner input = new Scanner(System.in);
        int awal, akhir;
        
        // kode untuk input nilai awal
        System.out.print("Masukkan nilai awal = ");
        awal = input.nextInt();
        // kode untuk input nilai Akhir
        System.out.print("Masukkan nilai akhir = ");
        akhir = input.nextInt();
        
        // kode perulangan untuk menampilkan data
        for(int i = awal;i <= akhir ; i++){
            //kode untuk hanya menampilkan bilangan genap
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    } 
}
