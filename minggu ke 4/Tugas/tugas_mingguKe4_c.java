package Tugas;
import java.util.Scanner;

public class tugas_mingguKe4_c {
   public static void main(String[] args) {
        // Membuat variable dan Scanner
        Scanner input = new Scanner(System.in);
        int banyak_data, avg;
        int number, sum = 0;
        
        // kode untuk input banyak data
        System.out.print("Masukkan banyaknya data nilai = ");
        banyak_data = input.nextInt();
      
        // membuat variable tipe data array dengan panjang data array = value variable banyak_data
        int[] angka = new int[banyak_data];
        
        // kode perulangan untuk input data array
        for(int i = 0; i < banyak_data; i++){ 
            number = i + 1;
            System.out.print("Masukkan nilai ke-"+ number + " = ");
            angka[i] = input.nextInt();
        }
        
        System.out.println("");
        // membuat variable tipe data array untuk perhitungan min dan max
        int max = angka[0];
        int min = angka[0];
        for(int i = 0 ;i < angka.length ; i++){
            // kode untuk menambahkan setiap data
            sum += angka[i];  
            // kode menampilkan nilai max dan min data
            if(angka[i] > max) {
                max = angka[i];
            } else if(angka[i] < min) {
                min = angka[i];
            }
        }
        // kode untuk mencari rata-rata data
        avg = sum/angka.length;
        
        // kode untuk menampilkan data min, max dan rata-rata
        System.out.println("Nilai minimum = "+ min);
        System.out.println("Nilai maximum = "+ max);
        System.out.println("Nilai rata ratanya adalah = "+ avg);
    }  
}
